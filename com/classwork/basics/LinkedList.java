package com.classwork.basics;

import java.util.Iterator;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<AccountDetails> list = new java.util.LinkedList<AccountDetails>();

		AccountDetails ad1 = new AccountDetails(5288, "Sithik", 48.12);
		AccountDetails ad2 = new AccountDetails(4799, "Karthik", 56.91);
		AccountDetails ad3 = new AccountDetails(5623, "Elavarasi", 84.56);

		list.add(ad1);
		list.add(ad2);
		list.add(ad3);

		System.out.println("Account holder details:");
		Iterator i = list.iterator();
		while (i.hasNext()) {
			AccountDetails accountDetails = (AccountDetails) i.next();

			System.out.println(accountDetails.accHolderName + " - " + accountDetails.accNO +" - " + accountDetails.balance);

		}

	}
}
