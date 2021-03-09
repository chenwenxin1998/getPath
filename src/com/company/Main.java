package com.company;


//import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hcq on 2017/4/28.
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {8, 14};
        int[] b = {10, 15};
        List<String> records = new ArrayList<String>();
        walk(a, b, records);
        System.out.println("方法数:" + count);

    }

    public static int count = 0;

    public static void walk(int[] a, int[] b, List<String> records) {
        if (a[0] == b[0] && a[1] == b[1]) {
            count++;
            System.out.print("第" + count + "种方法:  ");
            for (String record : records) {
                System.out.print(" "+record);
            }
            System.out.println();
        } else {
            xWalk(a, b, records);
            yWalk(a, b, records);

        }
    }
    //X轴走
    public static void xWalk(int[] a, int[] b, List<String> records) {

        int xHave = b[0] - a[0];
        if (xHave == 0) {
            return;
        } else {
            int[] temp = new int[2];
            temp[1] = a[1];
            temp[0] = a[0] + 1;
            walk(temp, b, makeRecords("X轴走了一步", records));
            if (xHave > 1) {
                temp[0] = a[0] + 2;
                walk(temp, b, makeRecords("X轴走了二步", records));
            }
        }
    }
    //y轴走
    public static void yWalk(int[] a, int[] b, List<String> records) {
        if (b[1] == a[1]) {
            return;
        } else {
            int[] temp = new int[2];
            temp[0] = a[0];
            temp[1] = a[1] + 1;
            walk(temp, b, makeRecords("y轴走了一步", records));
        }
    }

    //制作行走记录
    public static List<String> makeRecords(String str, List<String> old) {
        List<String> listNew = new ArrayList<String>();
        listNew.addAll(old);
        listNew.add(str);
        return listNew;
    }
}