package com.fruit.service.car;


import com.fruit.common.result.R;
import com.fruit.domain.car.CarInfo;

public interface CarService {
   R carInfoAdd (CarInfo record,Integer uid);

   R carClear(Integer uid);

   R carInfoUpdate(Integer id,Integer count,Integer flag);
}
