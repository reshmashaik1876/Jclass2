package com.exceptionhandle.programs;

import java.util.HashMap;
import java.util.Scanner;

public class TransactionService {
	public static void main(String[] args) throws AccountNotFound, MinBalanceException, InsufficientBalanceException {
		Bank b = new Bank(101, 100);
		Bank b1 = new Bank(102, 200);
		Bank b2 = new Bank(103, 300);
		Bank b3 = new Bank(104, 400);
		HashMap<Integer, Bank> map = new HashMap<Integer, Bank>();
		map.put(b.getAccountId(), b);
		map.put(b1.getAccountId(), b1);
		map.put(b2.getAccountId(), b2);
		map.put(b3.getAccountId(), b3);
		for (Integer s : map.keySet()) {
			System.out.println("Bank Account ID:" + s + " is " + map.get(s).getBalance() + " dollars");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account ID from: ");
		Integer from = sc.nextInt();
		System.out.println("Enter Account ID to: ");
		Integer to = sc.nextInt();
		System.out.println("Enter how much to transfer: ");
		Integer amt = sc.nextInt();

		//transaction(from, to, amt, map);
		trasact(from, to, amt, map);

	}

	public static void transaction(Integer from, Integer to, Integer amt, HashMap<Integer, Bank> map) {
		
		try {

			if (map.containsKey(from) && map.containsKey(to)) {

				if (map.get(from).getBalance() > 100) {
					if (map.get(from).getBalance() > amt) {
						map.get(to).setBalance(map.get(to).getBalance() + amt);
						map.get(from).setBalance(map.get(from).getBalance() - amt);
						System.out.println("success");
					} else {
						throw new InsufficientBalanceException("Insufficient balance to transfer: " + from);
					}
				} else {
					throw new MinBalanceException("Min Balance should be $100");
				}
			} else {
				throw new AccountNotFound("To Account is not Found " + to);
			}

		} catch (AccountNotFound a) {
			System.out.println("From Account is not found ");
		} catch (MinBalanceException b) {
			System.out.println("Min Balance should be $100");
		} catch (InsufficientBalanceException c) {
			System.out.println("Insufficient balance to transfer: " + from);
		}
	}

	public static void trasact(Integer from, Integer to, Integer amt, HashMap<Integer, Bank> map) {
		try {
			map.get(from).setBalance(map.get(from).getBalance() - amt);
			throw new AccountNotFound("No such accound");
		} catch (AccountNotFound ex) {
			map.get(from).setBalance(map.get(from).getBalance() + amt);
			System.out.println("roll back dont to " + from+" and balance is "+map.get(from).getBalance());
		}
	}
}
