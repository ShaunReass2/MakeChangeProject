package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		double twentyDollarBill = 20.00; 
		double tenDollarBill = 10.00; 
		double fiveDollarBill = 5.00; 
		double oneDollarBill = 1.00; 
		double quarter = 0.25; 
		double dime = 0.10; 
		double nickel = 0.05; 
		double penny = 0.01; 
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the asking price: "); 
		double askingPrice = scanner.nextDouble(); 
		
		System.out.println("Please enter the amount tendered: ");
		double amountTendered = scanner.nextDouble(); 
		
		double change = (amountTendered - askingPrice); 
		
		if (amountTendered < askingPrice) {
			System.out.println("The amount tendered is insufficient.");
			}  
			
			else if (amountTendered > twentyDollarBill) {
				System.out.println("We only accept payments of up to $20.00!");
			}
		
			else if (askingPrice == amountTendered) {
				System.out.println("Thank you for your exact payment. Have a nice day!");
			}
		
			else if (amountTendered >= askingPrice) { 
				System.out.println("Thank you! Your change is $" + String.format("%.2f", change) + ".  " + "You will recieve: ");
			}
		

		if (change >= tenDollarBill) {
			int changeTenDollarBill = (int)(change / tenDollarBill); 
			change = change % tenDollarBill; 
			System.out.println(changeTenDollarBill + " $10 bill");
		}
		
		if (change >= fiveDollarBill) {
			int changeFiveDollarBill = (int)(change / fiveDollarBill); 
			change = change % fiveDollarBill; 
			System.out.println(changeFiveDollarBill + " $5 bill");
		}
		
		if (change >= oneDollarBill) {
			int changeOneDollarBill = (int)(change / oneDollarBill); 
			change = change % oneDollarBill; 
			System.out.println(changeOneDollarBill + " $1 bill");
		}
		
		if (change >= quarter) {
			int changeQuarter = (int)(change / quarter); 
			change = change % quarter; 
			System.out.println(changeQuarter + " quarter");
		}
		
		if (change >= dime) {
			int changeDime = (int)(change / dime); 
			change = change % dime * changeDime/10; 
			System.out.println(changeDime + " dime");
		}
		
		if (change >= nickel) {
			int changeNickel = (int)(change / nickel); 
			change = change - nickel * changeNickel/5; 
			System.out.println(changeNickel + " nickel");
		}
		
		if (change >= penny) {
			int changePenny = (int)(change / penny); 
			change = change - penny * changePenny/1; 
			System.out.println(changePenny + " penny");
		}
		
		scanner.close(); 
	
	}


}
	

