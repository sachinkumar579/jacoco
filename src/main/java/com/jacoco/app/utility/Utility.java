package com.jacoco.app.utility;

import org.springframework.stereotype.Component;

@Component
public class Utility {

       public int doNothing(int a, int b){
           int sum = a + b;
           return sum;
       }
}
