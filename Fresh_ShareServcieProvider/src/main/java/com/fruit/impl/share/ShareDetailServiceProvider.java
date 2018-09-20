package com.fruit.impl.share;

import com.fruit.common.result.R;
import com.fruit.common.util.ResultUtil;
import com.fruit.domain.share.ShareDetail;
import com.fruit.mapper.share.ShareDetailMapper;
import com.fruit.service.share.ShareDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD

@Service
=======
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
>>>>>>> 4d190be8d39e1891e41d502a15a34637b7106ca5
public class ShareDetailServiceProvider implements ShareDetailService {
    @Autowired
    private ShareDetailMapper mapper;
    @Override
    public R save(ShareDetail shareDetail) {
<<<<<<< HEAD
        return ResultUtil.createResult(mapper.insert(shareDetail));
    }

    @Override
    public R queryById(int id) {
        return new R(1,"文章详情",mapper.selectByPrimaryKey(id));
=======
        if(mapper.insert(shareDetail)>0){
            return new R(1,"文章id",shareDetail.getId());
        }else {
            return new R(2,"上传失败",null);
        }
    }

    @Override
    public R queryBySid(int sid) {
        return new R(1,"文章详情",mapper.selectBySid(sid));
>>>>>>> 4d190be8d39e1891e41d502a15a34637b7106ca5
    }

    @Override
    public R update(ShareDetail shareDetail) {
        return ResultUtil.createResult(mapper.updateByPrimaryKey(shareDetail));
    }

    @Override
    public R delete(int sid) {
        return ResultUtil.createResult(mapper.deleteBySid(sid));
    }
}
