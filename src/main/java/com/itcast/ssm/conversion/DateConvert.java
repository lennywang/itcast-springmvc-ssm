package com.itcast.ssm.conversion;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 **/
public class DateConvert implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
       try {
           if (null!=source)
           {
               DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
               return df.parse(source);
           }
       }catch (Exception e)
       {

       }
       return null;
    }
}
