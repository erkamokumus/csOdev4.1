package arrays;

import java.util.Scanner;

public class cs1 {
        public static void main(String[] args) {
        	//Write a function that checks whether an element occurs in a list.
        	//1.ödev
        	
        	int array[]= {10,20,30,40,50,60,70,80,90,100};
        	System.out.print("Lütfen bir sayý giriniz:");
        	Scanner scan = new Scanner(System.in);
        	int x = scan.nextInt();
        	
        	int a= fonk(x,array);
        	System.out.print(a);
        	
        }
        
        public static int fonk(int u, int[] array) {
        	int bayrak=0;
        	
        	for(int i=0;i<array.length;i++) {
        		if(u==array[i]) {
        			u=i;
        			bayrak=1;
        		}
        	}
        	if(bayrak==0) {
        		u=-1;
        	}
        	return u;
        }
}
