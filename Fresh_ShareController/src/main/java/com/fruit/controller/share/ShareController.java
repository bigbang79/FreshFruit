package com.fruit.controller.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.Share;
import com.fruit.domain.share.ShareType;
import com.fruit.service.share.ShareDetailService;
import com.fruit.service.share.ShareImagesService;
import com.fruit.service.share.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class ShareController {
    @Autowired
    private ShareService service;
    @Autowired
    private ShareImagesService service1;
    @Autowired
    private ShareDetailService service2;
    @PostMapping("sharesave.do")
    public R add(Share share){
        return service.save(share);
    }
    @GetMapping("sharedelete.do")
    public R delete(int id){
        service1.delete(id);
        service2.delete(id);
        return service.delete(id);
    }
    @GetMapping("sharepage.do")
    public R queryByPage(int page,int limit){
        return  service.queryBage(page,limit);
    }
    @GetMapping("shareByUid.do")
    public R queryByCollect(int uid){
        return service.queryByCollect(uid);
    }

}
