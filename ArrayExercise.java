package testProject;

import java.io.BufferedReader;
import java.util.Scanner;

public class ArrayExercise {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculateFirstProblem();
		identifyGroupCountwithMarks();
	}
	
	public static void calculateFirstProblem() {
		System.out.println("Enter maximum number of elements : ");
		int noofElements = sc.nextInt();
		int[] summationArray = new int[noofElements];
		int finalResult = 0;
		int tempVar;
		for(int i=0; i<noofElements; i++) {
			System.out.print("Enter value : ");
			tempVar = sc.nextInt();
			finalResult = finalResult + ( tempVar * tempVar);
		}
		System.out.println("Summation Result : "+finalResult);
		sc.close();
	}
	
	public static void identifyGroupCountwithMarks() {
		int option;
		int tempValue;
		int low, high;
		int counter = 0;
		int groupCounter = 11;
		int maxElements = 5;
		int[] groupCounterArr = new int[groupCounter];
		int[] valueArr = new int[maxElements];
		do{
		System.out.println("1. Read Value");
		System.out.println("2. Show number of students in Groups markwise");
		System.out.println("3. Exit");
		System.out.print("Enter option : ");
		option = sc.nextInt();
		switch(option) {
		case 1:
			if(counter < maxElements) {
			System.out.print("Enter value : ");
			tempValue = sc.nextInt();
			valueArr[counter] = tempValue;
			groupCounterArr[tempValue / 10] = groupCounterArr[tempValue / 10] + 1;
			counter++;}
			else {
				System.out.println("Array storage limit reached, no more data would be inserted");
			}
			break;
		case 2:
			System.out.println("Range Frequency Table");
			System.out.println("*********Range*********"+"*****Frequency******");
			for(int i=0; i<groupCounterArr.length; i++) {
				low = i * 10;
				if(i == 10) {
					high  = low;
				}else {
				high = low + 9;
				}
				System.out.println("   "+low +" to "+high +"                 "+groupCounterArr[i]+"     ");
			}
			break;
		}
		}while(option != 3);
		
	}
}
