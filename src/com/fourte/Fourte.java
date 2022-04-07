package com.fourte;

import java.util.LinkedList;
import java.util.Scanner;

public class Fourte {
	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = scanner.nextInt();

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		int arrayCopy[]= new int[4];

		for (int i = 0; i < 4; i++) {
			int j=i+1;
			System.out.println("Enter Number : "+(j) +" number");
			linkedList.add(scanner.nextInt());
		}
		for (int i = 0; i < arrayCopy.length; i++) {
			arrayCopy[i]=linkedList.get(i);
		}
		boolean shouldContinue = true;
		while(shouldContinue) {
			int condition=4;
			int answer =0;
			while(condition>0) {
				System.out.println("Your Number :" + number );
				System.out.println("Your Option :" + linkedList);
				boolean userOptionShouldContinue = true;
				int userOption = 0;
				while(userOptionShouldContinue) {
					System.out.println("Enter Number Given Below :");
					userOption = scanner.nextInt();
					if(linkedList.contains(userOption)==true) {
						userOptionShouldContinue=false;
					}else {
						System.out.println("!!__YouEnterWorongValue__!!");
					}
				}
				boolean conditionSwitch = true;
				while(conditionSwitch) {
					System.out.println("Enter Your Operator\n '+' '-' '*' '/' Or Press '0' -> concat");
					String operator = scanner.next();

					switch (operator) {
					case "+":
						answer=answer+userOption;
						conditionSwitch=false;
						break;
					case "-":
						answer=answer-userOption;
						conditionSwitch=false;
						break;
					case "*":
						if(answer==0)
						{
							answer=1;
						}
						answer=answer*userOption;
						conditionSwitch=false;
						break;
					case "/":
						if(answer==0)
						{
							answer=1;
						}

						answer=answer/userOption;
						conditionSwitch=false;
						break;
					case "0":
						answer=(answer*10)+userOption;
						conditionSwitch=false;
						break;

					default:
						//break;
					}
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
			if (answer==number) {
				String string = "****You Win****";
				for (int i = 0; i <string.length(); i++) {
					System.out.print(string.charAt(i));
					Thread.sleep(170);
				}
				shouldContinue=false;
			}
			else {
				String string ="~~ You Lose ~~\n*_*=> BetterLuckNextTime <=*_*";
				for (int i = 0; i < string.length(); i++) {
					System.out.print(string.charAt(i));
					Thread.sleep(170);
				}
				System.out.println("\nEnter '1' continue\nEnter '0' exit");
				int continueOrNot = scanner.nextInt();
				if (continueOrNot==1) {
					for (int i : arrayCopy) {
						linkedList.add(i);
					}
				}else if(continueOrNot==0){
					String string1 ="_-_-_->>>> Thank you <<<<-_-_-_\n";
					for (int i = 0; i <string1.length(); i++) {
						System.out.print(string1.charAt(i));
						Thread.sleep(170);
					}
					shouldContinue=false;
				}
			}
		}
		scanner.close();
	}
}
