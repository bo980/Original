package com.jianbo.toolkit.http.callback;


import com.jianbo.toolkit.http.HttpResult;
import com.jianbo.toolkit.http.base.ICallBack;
import com.jianbo.toolkit.http.rxhttp.RxFactory;

import java.io.File;

import okhttp3.ResponseBody;

/**
 * Created by Jianbo on 2018/4/18.
 */

public abstract class FileCallback extends ICallBack<String> {

    public String fileDir() {
        return "";
    }

    public String fileName() {
        return "";
    }

    @Override
    public HttpResult<String> convertSuccess(ResponseBody responseBody) throws Exception {
        RxFactory.transformFile(responseBody, fileDir(), fileName(), this);
        return null;
    }
}
