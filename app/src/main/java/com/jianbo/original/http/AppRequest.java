package com.jianbo.original.http;

import com.jianbo.toolkit.http.rxhttp.RxRequest;

/**
 * Created by Jianbo on 2018/4/12.
 */

public class AppRequest extends RxRequest {
    @Override
    public String baseUrl() {
        return "https://www.baidu.com";
    }
}
