package com.fruit.impl.share;

import com.fruit.common.result.R;
import com.fruit.common.util.ResultUtil;
import com.fruit.domain.share.ShareDetail;
import com.fruit.mapper.share.ShareDetailMapper;
import com.fruit.service.share.ShareDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShareDetailServiceProvider implements ShareDetailService {
    @Autowired
    private ShareDetailMapper mapper;
    @Override
    public R save(ShareDetail shareDetail) {
        return ResultUtil.createResult(mapper.insert(shareDetail));
    }

    @Override
    public R queryById(int id) {
        return new R(1,"文章详情",mapper.selectByPrimaryKey(id));
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
