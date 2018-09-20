package com.fruit.provider.car;

import com.fruit.common.result.R;
import com.fruit.mapper.car.CarInfoMapper;
import com.fruit.mapper.car.CarMapper;
import com.fruit.service.car.CarService;
import com.fruit.domain.car.CarInfo;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarProvider implements CarService {
    @Autowired
    CarMapper cMapper;

    @Autowired
    private CarInfoMapper mapper;

    @Override
    public R carInfoAdd(CarInfo record,Integer uid) {
        Integer cid = mapper.deleteByCid(uid);
        CarInfo carInfo = mapper.selectByCidGid(cid,record.getGid());
        if (null == carInfo){
            if( mapper.insert(record)>0) {
                return R.setOK();
            }
        } else {
            if (mapper.updateCount(carInfo.getId(), 1)>0) {
                return R.setOK();
            }
        }

        return R.setError();
    }

    @Override
    public R carClear(Integer uid) {
        Integer cid = cMapper.selectCid(uid);
        if (null != cid && cid > 0) {
            if ( mapper.deleteByCid(cid) > 0) {
                return R.setOK();
            }
        }
        return R.setError();
    }

    @Override
    public R carInfoUpdate(Integer id, Integer count, Integer flag) {
        if(flag < 0 && count < 2) {
            mapper.deleteById(id);
        } else {
            if (mapper.updateCount(id,flag) > 0) {
                return R.setOK();
            }
        }
        return R.setError();
    }


}
