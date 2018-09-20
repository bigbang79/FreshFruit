package com.fruit.fastdfs;

import com.fruit.common.result.R;
import com.fruit.common.util.FDFSUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.R;

@RestController
public class FastDfsController {
    @Autowired
    private FDFSUtil fdfsUtil;
    private String url="http://47.98.186.179/";
    @PostMapping("fileup.do")
    public R fileup(@RequestParam("fruit")CommonsMultipartFile multipartFile) throws Exception {
        String filename=multipartFile.getOriginalFilename();
        String sub=filename.substring(filename.lastIndexOf("."+1));
        String filepath=fdfsUtil.upload_file(multipartFile.getBytes(),sub,null);
        System.out.println("FAST"+filepath);
        return new R(1001,url+filepath);
    }
    @PostMapping("filessup.do")
    public R filessup(@Param("fruits")CommonsMultipartFile[] multipartFiles) throws Exception {
        List<String > list=new ArrayList<>();
        for (int i=0;i<multipartFiles.length;i++){
            String filename=multipartFiles[0].getOriginalFilename();
            String sub=filename.substring(filename.lastIndexOf("."+1));
            String filepath=fdfsUtil.upload_file(multipartFiles[0].getBytes(),sub,null);
            System.out.println("FAST"+filepath);
            list.add(filepath);
        }
        return new R(1,"文件路径集合",list);
    }
}
