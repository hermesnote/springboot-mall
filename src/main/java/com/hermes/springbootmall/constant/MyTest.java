package com.hermes.springbootmall.constant;

import org.springframework.boot.autoconfigure.gson.GsonProperties;
import org.springframework.http.converter.json.GsonBuilderUtils;

public class MyTest {
     public static void main(String[] args) {
          for(int j=1;j<=5;j++) {
               for(int i=j;i>0;i--) {
                    System.out.print("*");
               }
               System.out.println();
          }
     }
}