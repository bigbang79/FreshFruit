package com.fruit.impl.share;

import com.fruit.common.result.R;
import com.fruit.common.util.ResultUtil;
import com.fruit.domain.share.ShareCollect;
import com.fruit.mapper.share.ShareCollectMapper;
import com.fruit.service.share.ShareCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShareCollectServiceProvider implements ShareCollectService {
    @Autowired
    private ShareCollectMapper mapper;
    @Override
    public R save(ShareCollect shareCollect) {
        return ResultUtil.createResult(mapper.insert(shareCollect));
    }

    @Override
    public R delete(int id) {
        return ResultUtil.createResult(mapper.delete(id));
    }
}
