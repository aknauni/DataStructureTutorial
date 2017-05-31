package com.nauni.tutorial.hashTable;

import java.util.Scanner;

public class HashMain {

	public static void main(String[] args) {
        

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int numberOfWorkers = sc.nextInt();
        int arr[][] = new int[numberOfWorkers][2];
        
        int ceoProd = sc.nextInt();;
        int workProd = sc.nextInt();;
        int index = -1;
        int totalProductivity = ceoProd;
        for(int i=0; i<numberOfWorkers-1; i++){
        	int productivity = sc.nextInt();
        	index = sc.nextInt();
        	if(productivity>ceoProd){
        			workProd=ceoProd;
        		} else{
        			workProd=productivity;
        		}
        		totalProductivity +=workProd;
        	
        		        	
    }
    
    System.out.println(totalProductivity);
	

}

}
