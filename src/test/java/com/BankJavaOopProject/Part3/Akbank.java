package com.BankJavaOopProject.Part3;

public class Akbank extends Bank{

//	private double currentBalance;


	public Akbank(double currentBalance, String accountType) {  //constractor
		super(currentBalance + 120, accountType);
		// final balance sıfırla
		
		switch (accountType.toLowerCase()) {   // intiliaze  
		case "gold":
			setDepositReturnValue(80);
			setWithdrawExpenceValue(70);
			setReturnRateValue(1.3);
			break;
		case "saving":
			setDepositReturnValue(90);
			setWithdrawExpenceValue(60);
			setReturnRateValue(1.2);
			break;
		case "interest":
			setDepositReturnValue(100);
			setWithdrawExpenceValue(50);
			setReturnRateValue(1.1);
			break;

		default:
			System.out.println("Invalid TYPE");
			break;
		}
		
	}


//	@Override
//	public void withdraw(double withdraw) {
//		//super.withdraw(withdraw);
//		if (withdraw < 0) {
//			System.out.println("Invalid DATA!");
//		} else if (withdraw < 1000) {
//			currentBalance -= withdraw;
//
//		} else { // 1000 ve üstü para çekilirse
//			//currentBalance += deposit + bonus ;
//			currentBalance -= (withdraw + withdrawExpenceValue);
//
//		}
//	}
}
