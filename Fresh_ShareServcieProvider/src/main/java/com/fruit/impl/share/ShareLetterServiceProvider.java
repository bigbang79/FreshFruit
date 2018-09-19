package com.fruit.impl.share;

import com.fruit.common.result.R;
import com.fruit.common.util.ResultUtil;
import com.fruit.domain.share.ShareLetter;
import com.fruit.mapper.share.ShareLetterMapper;
import com.fruit.service.share.ShareLetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShareLetterServiceProvider implements ShareLetterService {
    @Autowired
    private ShareLetterMapper mapper;
    @Override
    public R save(ShareLetter shareLetter) {
        return ResultUtil.createResult(mapper.insert(shareLetter));
    }

    @Override
    public R delete(int id) {
        return ResultUtil.createResult(mapper.deleteByPrimaryKey(id));
    }
}
