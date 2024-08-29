package com.doubts;

public class Emp {
    private  int i=7;
    private static  int k=8;
    public static  void foof(){
        System.out.println("foof static method");
    }
    static {
        k=88;
        System.out.println("static init block "+ k );
    }
    {
        i=77;
        System.out.println("init block "+ i);
    }

    public Emp(){
        System.out.println("ctr of emp");
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("finilized is called");
   // }
}
