package com.fourte;

import java.util.LinkedList;
import java.util.Scanner;

public class Fourte {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = scanner.nextInt();

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 0; i < 4; i++) {
			int j=i+1;
			System.out.println("Enter Number : "+(j) +" number");
			linkedList.add(scanner.nextInt());
		}


		int condition=4;
		int answer =0;

		while(condition>0) {
			System.out.println("Your Number :" + number );
			System.out.println("Your Option :" + linkedList);
			System.out.println("Enter Number Given Below :");
			int userOption = scanner.nextInt();

			System.out.println("Enter Your Operator\n '+' '-' '*' '/' Or Press '0' -> concat");
			String operator = scanner.next();

			switch (operator) {
			case "+":
				answer=answer+userOption;
				break;
			case "-":
				answer=answer-userOption;
				break;
			case "*":
				answer=answer*userOption;
				break;
			case "/":
				answer=answer/userOption;
				break;
			case "0":
				answer=(answer*10)+userOption;
				break;

			default:
				break;
			}
			System.out.println("answer "+answer);

			int index = 0 ;
			for (int i = 0; i < linkedList.size(); i++) {
				if (linkedList.get(i)==userOption) {

					index=i;
				}
			}



			linkedList.remove(index);

			condition--;
		}


	}
}
