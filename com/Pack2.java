package com;
class Base
{
    int x,y;
    public void getdata(int a,int b)
    {
        x=a;
        y=b;

    }
}

public class Pack2 extends Base {
    public void add(){
        System.out.println(x+y);
    }
}
