//package com.alta.Sesi6;

import java.util.*;

public class Task1_Sesi6 {
    public static void main(String[] args) {

        String [] Arr1 = {"lee", "jin"};
        String [] Arr2 = {"kazuya", "panda"};

        Set<String> hashSet = new LinkedHashSet<String>(List.of(Arr1));

        List<String> ArrList = List.of(Arr2);

        boolean result = hashSet.addAll(ArrList);

        System.out.println(hashSet);


    }
}
