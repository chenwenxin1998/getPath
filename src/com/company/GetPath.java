package com.company;

import java.util.Stack;
import java.util.Vector;

public class GetPath {
    static Stack xstack = new Stack();
    static Stack ystack = new Stack();
    static int time = 0;
    public static void getPathes(Vector<Vector<Integer>> vec){

//        System.out.println(vec);
        xstack.push(0);
        ystack.push(0);
        int x = 0;
        int y = 0;
        while (!xstack.empty()){
//            System.out.println("time:"+time);
//            time= time+1;
//            System.out.println("size:"+xstack.size());
//            System.out.printf("(%d, %d):%n",x,y);

            x = (int) xstack.pop();
            y = (int) ystack.pop();

            if(x == 4&& y == 1){
                time++;
            }

            if(x+1<5){
                xstack.push(x+1);
                ystack.push(y);
            }
            if(y+1<2){
                xstack.push(x);
                ystack.push(y+1);
            }
        }
        System.out.println("time:"+time);

    }

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        Vector vec = new Vector();
        vec.add(vector);
        vec.add(vector);
        vec.add(vector);
        Vector v = new Vector();
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(0);
        vec.add(v);
        GetPath.getPathes(vec);
    }
}
//https://blog.csdn.net/agfagafsdfas/article/details/41390687?utm_medium=distribute.pc_relevant.none-task-blog-baidujs_title-0&spm=1001.2101.3001.4242