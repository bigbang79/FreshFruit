package com.fruit.controller.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareCollect;
import com.fruit.service.share.ShareCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareCollectController {
    @Autowired
    private ShareCollectService service;
    @PostMapping("sharecollectsave.do")
    public R add(ShareCollect shareCollect){
        return service.save(shareCollect);
    }
    @GetMapping("sharecollectdel.do")
    public R delete(int id){
        return service.delete(id);
    }
}
