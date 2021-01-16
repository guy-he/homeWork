package com.company;

import java.lang.module.FindException;
import java.util.Random;
import java.util.Scanner;

public class Main {
  static   Scanner s = new Scanner(System.in);
  static   Random r = new Random();
  private static boolean arrayEqual (int[]one, int[]two){
      int c = 0;
      int w = 0;
      for (int index = 0; index < one.length; index++){
          c =  c + one[index];
      }
      for (int index = 0; index < two.length; index++){
          w = w +two[index];
      }
      if (c == w && one.length == two.length){
          System.out.println(true);
          return true;
      }
      else {
          System.out.println(false);
          return false;
      }
  }
    private static boolean isLonger(float[] arr, int len){
        if (arr.length > len){
            return true;

        }
        else {
            return false;
        }
    }
     private static boolean isLonger(int[] arr, int len){
            if (arr.length > len){
              return true;

            }
            else {
                return false;
            }
         }

     private static int howManyDigits(int a){
         //int numberOfDigits = String.valueOf(n).length();
         a = String.valueOf(a).length();
         System.out.println(String.format("the length of digits is: %d", a));
         return a;
     }
    private static String getString(String msg){
        System.out.println(msg);
        String nn = s.next();

        return nn;
    }
    public static void main(String[] args) {

                String v =  getString("whats your message");

                 int aq = howManyDigits(54855454);
                 howManyDigits(2525);
        System.out.println(aq);
        int[] bla = {4,5,6};


        boolean nvf = isLonger(bla, 2);
        System.out.println(isLonger(bla, 2));

             int[] test = {4, 5, 8, 9};
             int[] test2 = {4, 5, 5, 9};
        arrayEqual(test, test2);
                      }
            }
