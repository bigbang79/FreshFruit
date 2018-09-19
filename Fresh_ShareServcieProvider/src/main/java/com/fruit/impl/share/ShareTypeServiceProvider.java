package com.fruit.impl.share;

import com.fruit.common.result.R;
import com.fruit.common.util.ResultUtil;
import com.fruit.domain.share.ShareType;
import com.fruit.mapper.share.ShareTypeMapper;
import com.fruit.service.share.ShareTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShareTypeServiceProvider implements ShareTypeService {
    @Autowired
    private ShareTypeMapper mapper;
    @Override
    public R save(ShareType shareType) {
        return ResultUtil.createResult(mapper.insert(shareType));
    }

    @Override
    public R delete(int id) {
        return ResultUtil.createResult(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public R queryAll() {
        return new R(1,"类型",mapper.queryAll());
    }
}
