package interViewPractice;

import java.util.*;
public class ArraysAsArguments {

   //main method
   public static void main(String[] args){
   
      //Declare and initialize the array elements
      int[] a = {51, 16, 33, 2, 14, 21};
      int[] b = {33, 9, 56, 21, 39};

      //get length of an array and store it in c array 
      int[] c = new int[a.length];

      //check if length of both array are equal
      if(a.length==b.length){
         //logic implementation
         for (int i = 0 ,j=0,k=0; i < a.length; i++,j++,k++){
            c[k] = a[i] + b[j];
         }

         //Print the result
         System.out.println("Resultant array is:");
         System.out.println(Arrays.toString(c));
      } else {
    	  for (int i = 0 ,j=0,k=0; i <10; i++,j++,k++){
              c[k] = a[i] + b[j];
              System.out.println("Resultant array is:");
              System.out.println(Arrays.toString(c));
    	  }}
   }
}