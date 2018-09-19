package com.fruit.service.share;

import com.fruit.common.result.R;
import com.fruit.domain.share.ShareImages;

import java.util.List;

public interface ShareImagesService {
    R save(ShareImages shareImages);
    R delete(int sid);
    R queryBySid(int sid);
    R save(List<String > images,int sid);
}
