package com.fruit.impl.share;

import com.fruit.common.result.PageVo;
import com.fruit.common.result.R;
import com.fruit.common.util.ResultUtil;
import com.fruit.domain.share.Share;
import com.fruit.mapper.share.ShareMapper;
import com.fruit.service.share.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShareServiceProvider implements ShareService {
    @Autowired
    private ShareMapper mapper;
    @Override
    public R save(Share share) {
        return ResultUtil.createResult(mapper.insert(share));
    }

    @Override
    public R delete(int id) {
       return ResultUtil.createResult(mapper.update(id));
    }

    @Override
    public R queryBage(int page, int count) {
        int index=(page-1)*count;
        List<Share> list=mapper.selectByPage(index,count);
        return new R(1,"分页信息",new PageVo<Share>(mapper.countAll(),list));
    }

    @Override
    public R queryByCollect(int uid) {
        return new R(1,"用户收藏",mapper.selectByCollect(uid));
    }
}
