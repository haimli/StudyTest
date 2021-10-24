package org.example.doc;


import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lihaiming
 * @version 1.0.0
 * @since 2020/12/25 18:01
 **/
public class DocUtil {

    public static void main(String[] args) {
        String str = "30404038.00";
        System.out.println(str.split("\\.")[0]);
        if (str != null && str.contains(".") && str.split("\\.")[0].length() > 0 ){
            System.out.println("ddddddddd");
        }
    }

    public List<String> getList(){
        List<String> strList = new ArrayList<String>();
        strList.add("lihaiming");
        strList.add("zhangsan");
        strList.add("liyingzhe");


        DocUtil docUtil = new DocUtil();
        List<String> stringList = docUtil.getList();
        stringList = stringList.stream().filter(e -> e.startsWith("l")).collect(Collectors.toList());
        System.out.println(stringList);
        return strList;
    }
}
