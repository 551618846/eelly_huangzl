/** 
* @组件名：eelly_huangzl_component
* @包名：com.huangzl.collection
* @文件名：TestList.java
* @创建时间： 2015年1月27日 下午1:54:10
* @版权信息：Copyright © 2014 eelly Co.Ltd,衣联网版权所有。
*/

package com.huangzl.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.util.StopWatch;

/**
 * ArrayList的实现是数组,定位元素比较快,中间插入删除比较慢
 * LinkedList的实现是双向链表(Node[item,next,prev]),定位元素比较慢,中间插入删除比较慢
 */
public class TestList {
    
    public static void main(String[] args) {
        List<String> alist = new ArrayList<String>();//0.886//2.189
        test(alist);
        
        List<String> llist = new LinkedList<String>();//1.367//1.432
        test(llist);
        
        
    }
    
    
    public static void test(List<String> alist){//增删查
        StopWatch st = new StopWatch();
        st.start();
        for(int i=0;i<1000000;i++){
            alist.add(i+"");
        }
        st.stop();
        System.err.println("add:"+st.getTotalTimeSeconds());
        
        st.start();
        for(int i=8999;i<9999;i++){
            alist.get(i);
        }
        st.stop();
        System.err.println("get:"+st.getTotalTimeSeconds());
        
        st.start();
        for(int i=8999;i<9999;i++){
            alist.remove(i);
        }
        st.stop();
        System.err.println("remove index:"+st.getTotalTimeSeconds());
        
        st.start();
        for(int i=8999;i<9999;i++){
            alist.remove(i+"");
        }
        st.stop();
        System.err.println("remove object:"+st.getTotalTimeSeconds());
        
        
        /**
         * add:0.916
get:0.916
remove index:2.116
remove object:8.93
add:1.076
get:1.12
remove index:1.162
remove object:13.505


         */
        
    }

}

