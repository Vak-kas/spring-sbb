package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class HelloLombok {
//    private String Hello;
//    private int lombok;

    private final String hello;
    private final String Hello;
    private final int lombok;

    public static void main(String[] args){
        HelloLombok helloLombok = new HelloLombok("헬로", "할로", 5);
//        helloLombok.setHello("헬로");
//        helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getHello());

        System.out.println(helloLombok.getLombok());
    }
}
