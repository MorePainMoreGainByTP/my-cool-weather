package com.tangpeng.mycoolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by tangpeng on 2017/9/26.
 */

public class HttpUtil {
    /**
     * @param address 请求的URL
     * @param callback 回调，处理服务器响应
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
