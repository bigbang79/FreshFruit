package com.fruit.controller.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareDetail;
import com.fruit.service.share.ShareDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareDetailController {
    @Autowired
    private ShareDetailService service;
    @PostMapping("sharedatailsave.do")
    public R add(ShareDetail shareDetail){
        return service.save(shareDetail);
    }
    @GetMapping("sharedetaillist.do")
    public R selectBySid(int sid){
        return service.queryBySid(sid);
    }
    @GetMapping("sharedetailupdate.do")
    public R update(ShareDetail shareDetail){
        return service.update(shareDetail);
    }
    @GetMapping("sharedetaildel.do")
    public R delete(int sid){
        return service.delete(sid);
    }
}
