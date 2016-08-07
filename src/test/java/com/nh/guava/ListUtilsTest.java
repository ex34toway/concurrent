package com.nh.guava;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.List;

/**
 * Created by liliang on 2016/7/21.
 */
public class ListUtilsTest {

    @Test
    public void testSplitList()
    {
        String ids = "1,2,3,4,5";
        List<String> idList = Splitter.on(",").trimResults().splitToList(ids);
        idList.forEach((x)-> System.out.println(x));
    }
}
