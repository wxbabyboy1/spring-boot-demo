package com.springBean;


/**
 * Created by Star on 2018/3/6.
 */
public class AA {
    private String name;

    AA(){
        System.out.println("================================construct...");
    }

    public void init2(){
        System.out.println("================================init...");
    }

    public void destory(){
        System.out.println("================================destory..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("================================setName..");
        this.name = name;
    }
}
