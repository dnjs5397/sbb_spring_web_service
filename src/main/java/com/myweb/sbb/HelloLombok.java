package com.myweb.sbb;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class HelloLombok {
    private final String hello;
    private final Integer lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("응애", 7);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
