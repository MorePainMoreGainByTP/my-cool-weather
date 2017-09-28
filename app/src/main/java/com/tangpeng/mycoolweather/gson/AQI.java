package com.tangpeng.mycoolweather.gson;

/**
 * Created by tangpeng on 2017/9/26.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
