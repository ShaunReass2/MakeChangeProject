package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		double twentyDollarBill = 2000; 
		double tenDollarBill = 1000; 
		double fiveDollarBill = 500; 
		double oneDollarBill = 100; 
		double quarter = 25; 
		double dime = 10; 
		double nickel = 5; 
		double penny = 1; 
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the asking price: "); 
		double askingPrice = (scanner.nextDouble())*100; 
		
		System.out.println("Please enter the amount tendered: ");
		double amountTendered = (scanner.nextDouble())*100; 
		
		double change = (amountTendered) - (askingPrice); 
		
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
				System.out.println("Thank you! Your change is $" + String.format("%.2f", (change/100)) + ".  " + "You will receive: ");
			}
		
		if (change >= tenDollarBill) {
			int changeTenDollarBill = (int)(change / tenDollarBill); 
			change = change % tenDollarBill; 
			System.out.println(changeTenDollarBill + (changeTenDollarBill == 1 ? " $10 bill" : " $10 bills"));
		}
		
		if (change >= fiveDollarBill) {
			int changeFiveDollarBill = (int)(change / fiveDollarBill); 
			change = change % fiveDollarBill; 
			System.out.println(changeFiveDollarBill + (changeFiveDollarBill == 1 ? " $5 bill" : " $5 bills"));
		}
		
		if (change >= oneDollarBill) {
			int changeOneDollarBill = (int)(change / oneDollarBill); 
			change = change % oneDollarBill; 
			System.out.println(changeOneDollarBill + (changeOneDollarBill == 1 ? " $1 bill" : " $1 bills"));
		
		}
		
		if (change >= quarter) {
			int amountQuarter = (int)(change / quarter); 
			change = ((change) % quarter); 
			System.out.println(amountQuarter + (amountQuarter == 1 ? " quarter" : " quarters"));
		}
		
		if (change >= dime) {
			int amountDime = (int)(change / dime); 
			change = ((change) % dime); 
			System.out.println(amountDime + (amountDime == 1 ? " dime" : " dimes"));
		}
		
		if (change >= nickel) {
			int amountNickel = (int)(change / nickel); 
			change = ((change) % nickel); 
			System.out.println(amountNickel + (amountNickel == 1 ? " nickel" : " nickels"));
		}
		
		if (change >= penny) {
			int amountPenny = (int)(change / penny); 
			change = ((change) % penny); 
			System.out.println(amountPenny + (amountPenny == 1 ? " penny" : " pennies"));
		}
		
		scanner.close(); 
	
	}


}
	

