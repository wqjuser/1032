package com.wqj;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static String str = "";

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> secondName = new ArrayList<String>();
        ArrayList<String> firstName = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        int nameNum = s.nextInt();
        for (int i = 0; i < nameNum; i++) {

            String s1 = s.next();
            firstName.add(s1);
        }
        for (int i = 0; i < nameNum; i++) {
            String s2 = s.next();
            secondName.add(s2);
        }

        Collections.sort(firstName);
        Collections.sort(secondName);

//        System.out.println(secondName);
//        System.out.println(firstName);


        for (int i = 0; i < nameNum - 1; i++) {
            System.out.print(firstName.get(i) + " " + secondName.get(i) + "," + " ");
        }
        System.out.print(firstName.get(nameNum - 1) + " " + secondName.get(nameNum - 1));
    }
}

