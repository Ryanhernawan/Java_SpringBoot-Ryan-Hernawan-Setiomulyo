//package com.alta.Sesi6;

import java.util.*;
import java.util.stream.Collectors;

public class Task2_Sesi6 {
    public static void main(String[] args) {

       String [] Arr1 = {"7","6","5","2","3","7","5","2"};
       String [] Arr2 = {"1","1","2","2"};


       for (int i=0; i< Arr1.length; i++){
           int count=0;
           for (int j=0; j< Arr1.length; j++){
               if (Arr1[i] == Arr1[j]){
                   count++;
               }
           }
           if (count == 1){
               System.out.println(Arr1[i]);
           }
       }
    }
}
