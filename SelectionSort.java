package array;

import java.util.Scanner;

public class SelectionSort {

         public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         int age[] = new int[n];
          for (int i=0;i<n;i++) {
        	  age[i] = sc.nextInt();
          }
           for(int i=0;i<n-1;i++) {
        	  int minInd = i;
        	    for(int j=i;j<n;j++) {
        	    	if (age[j]< age[minInd]) {
        	    		minInd = j;
        	    }
           }
		
		int temp = age[i];
		age[i] = age[minInd];
		age[minInd] = temp;
      }
		 
		   for(int item: age) {
			   System.out.print(item+ " ");
		   }
       System.out.println();
	}

}
