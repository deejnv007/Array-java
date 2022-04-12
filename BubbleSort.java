package array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt();
	    int classes[] = new int[n];
	    System.out.println("enter array elements");
	    for (int i=0;i<n;i++) {
	    	classes[i] = sc.nextInt();
	    	}
	    for (int i=0;i<n-1;i++) {
	    	for (int j=0;j<n-1-i;j++) {
	    		if(classes[j+1]<classes[j]) {
	    			int temp = classes[j+1];
	    			classes[j+1] = classes[j];
	    			classes[j] = temp;
	    		}
	    			
	    	}
	    }
            for (int item: classes) {
            	System.out.print(item +" ");
            }
	}

}
