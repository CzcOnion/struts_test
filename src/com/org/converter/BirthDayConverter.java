package com.org.converter;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class BirthDayConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        System.out.println("正在转换" );
        SimpleDateFormat[] sdfs = { new SimpleDateFormat("yyyyMMdd"),
                new SimpleDateFormat("yyyy/MM/dd"),
                new SimpleDateFormat("yyyy,MM,dd")};
        //转换类型不是日期类型
        if(toClass != Date.class){
            return null;
        }
        //转换值是空或者长度为0
        if(values == null || values.length==0){
            return null;
        }
        String strDate = values[0];
        Date birthday = null;
        for(int i=0;i<sdfs.length; i++){

            try {
                birthday = sdfs[i].parse(strDate);
                return birthday;
            } catch (ParseException e) {
                continue;
            }

        }
        return birthday;
    }

    @Override
    public String convertToString(Map context, Object o) {
        // TODO Auto-generated method stub
        return null;
    }
}
