package com.example.peter.coolweather.gson;

/**
 * Created by Administrator on 2017/9/8 0008.
 */

public class Forecast {

    public String date;

    public Temperature temperature;

    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        public String info;
    }


}
