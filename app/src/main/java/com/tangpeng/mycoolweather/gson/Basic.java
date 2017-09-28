package com.tangpeng.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tangpeng on 2017/9/26.
 */

public class Basic {

    //city为json中的字段名，这样若java对象的字段与json中的字段名称不一致，Gson也可以对应转换
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
