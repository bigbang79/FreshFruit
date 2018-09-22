package com.fruit.impl.share;

import com.fruit.common.result.R;
import com.fruit.common.util.ResultUtil;
import com.fruit.domain.share.ShareImages;
import com.fruit.mapper.share.ShareImagesMapper;
import com.fruit.service.share.ShareImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShareImagesServiceProvider implements ShareImagesService {
    @Autowired
    private ShareImagesMapper mapper;
    @Override
    public R save(ShareImages shareImages) {
        return ResultUtil.createResult(mapper.insert(shareImages));
    }

    @Override
    public R delete(int sid) {
        return ResultUtil.createResult(mapper.deleteBySid(sid));
    }

    @Override
    public R queryBySid(int sid) {
        return new R(1,"文章图片",mapper.queryBySid(sid));
    }

    @Override
    public R save(List<String> images, int sid) {
        return ResultUtil.createResult(mapper.save(images,sid));
    }
}
