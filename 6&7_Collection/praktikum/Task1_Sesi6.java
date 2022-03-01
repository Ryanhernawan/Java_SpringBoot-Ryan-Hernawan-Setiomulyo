//package com.alta.Sesi6;

import java.util.*;

public class Task1_Sesi6 {
    public static void main(String[] args) {
        //Adding 2 array
        String [] Arr1 = {"lee", "jin"};
        String [] Arr2 = {"kazuya", "panda"};
        //Using Hashset function and Adding array 1 into list of
        Set<String> hashSet = new LinkedHashSet<String>(List.of(Arr1));
        // Adding array 2 into a list of
        List<String> ArrList = List.of(Arr2);
        // Merge array 1 dan array 2 using addAll Function
        boolean result = hashSet.addAll(ArrList);
        // PrintOut Output
        System.out.println(hashSet);


    }
}
