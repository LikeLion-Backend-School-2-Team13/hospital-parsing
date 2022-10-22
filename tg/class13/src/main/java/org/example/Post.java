package org.example;

import java.util.ArrayList;

public class Post {
    private ArrayList<ArrayList<String>> arr1 = new ArrayList<ArrayList<String>>();
    private ArrayList<String> arr2 = new ArrayList<String>();

    public void postAdd(String w,String t,String l){

        arr2=new ArrayList<>();
        arr2.add(w);
        arr2.add(t);
        arr2.add(l);
        arr1.add(arr2);
    }

    public void postDel(int n){
        arr1.remove(n-1);
    }

    public String getPostwtl(int a){
        return arr1.get(arr1.size()-1).get(a);
    }

    public String getPostwtl(int a,int b){
        return arr1.get(a).get(b);
    }





    public int getSize() {
        return arr1.size();
    }

//    public static void main(String[] args) {
//
//        ArrayList<String> qqq = new ArrayList<>();
//        qqq.add("123");
//        System.out.println(qqq);
//
//
//    }
}
