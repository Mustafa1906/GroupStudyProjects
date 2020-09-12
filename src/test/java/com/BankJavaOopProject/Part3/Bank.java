package com.BankJavaOopProject.Part3;

public abstract class Bank { // PARENT SUPER CLASS

	// BU OOP yapısı aynı anda tek hesap açma için!!

	private double currentBalance;  // ilk hesap açarken yatırılan para ve hesap kapanasıya paranın tutuldugu yer
	private String accountType;     // gold saving interest
	
	private double depositReturnValue;   // para yatırdığındaki gelen ek komisyon miktarı  +++
	private double withdrawExpenceValue; // para çekmede alına ek masraf gideri  ---
	private double returnRateValue;      // hesap kapatıldıgın ki kar oranı   1.3  yada 1.2 ada 1.1
	private double finalBalance; // bu hesap kapatıldığda güncellenecek --> cari hesap
								 // USER ın mevcut PARASI editlenebilir

	
	private boolean isAccountClosed= false;  // bayrak kontol noktası
	
	
	public Bank(double currentBalance, String accountType) { // constractor


		if (currentBalance<0){
			System.out.println("Balance can not be negative!");
			this.currentBalance=0;
			this.accountType = accountType.toLowerCase();
		} else {
			this.currentBalance = currentBalance; // buraya Welcome işlenmeli!!
			this.accountType = accountType.toLowerCase();
		}
		System.out.println("Welcome the " + getClass().getSimpleName() +" Bank!! New Account Type: " + accountType + "\n");
		isAccountClosed = false;  // sonra
	}

	
	public void deposit(double deposit) { // mevcut balancı guncelleyecek!

		if (deposit < 0) {
			System.out.println("Invalid DATA!");
		} else {
			currentBalance += deposit;
		}
//		if (deposit < 0) {
//			System.out.println("Invalid DATA!");
//		} else if (deposit < 2000) {
//			currentBalance += deposit;
//			// setCurrentBalance(getCurrentBalance() + deposit);
//		} else { // 2000 ve üstü para yatırılırsa
//			//currentBalance += deposit + bonus ;
//			currentBalance += (deposit + depositReturnValue);
//		}
	}
	
	
	public void withdraw(double withdraw) { // mevcut balancı guncelleyecek!
		if (withdraw < 0) {
			System.out.println("Invalid DATA!");
		} else if (withdraw < 1000) {
			currentBalance -= withdraw;

		} else { // 1000 ve üstü para çekilirse   with>1000
			//currentBalance += deposit + bonus ;
			currentBalance -= (withdraw + withdrawExpenceValue);

		}


	}
	
	
	public void closeCurrentAccount(){
		
		finalBalance = currentBalance * returnRateValue;
		currentBalance =0;
		isAccountClosed = true;
		System.out.println("Account Closed! \nFinal Balace: " + finalBalance + " in " + accountType + " account, at "  + this.getClass().getSimpleName() );
	}


	public double settlementAllAccounts(){
		double finalWithdrawMoney= 0;

		if (isAccountClosed) {
			System.out.println("All Accounts Closed in " + getClass().getSimpleName() + " and Final Balance withdrawned!\n" +
					"Withdrawal money: " + finalBalance);
			finalWithdrawMoney = finalBalance;
			this.finalBalance =0;
			isAccountClosed = false;
			return finalWithdrawMoney;

		} else {
			System.out.println("Please First Close your current account!! or The account is already settlement!!");
			return 0;
		}
	}
	
	
	
	
	public double getFinalBalance() {
		return finalBalance;
	}


	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	
	public double getDepositReturnValue() {
		return depositReturnValue;
	}

	public void setDepositReturnValue(double depositReturnValue) {
		this.depositReturnValue = depositReturnValue;
	}

	public double getWithdrawExpenceValue() {
		return withdrawExpenceValue;
	}

	public void setWithdrawExpenceValue(double withdrawExpenceValue) {
		this.withdrawExpenceValue = withdrawExpenceValue;
	}

	public double getReturnRateValue() {
		return returnRateValue;
	}

	public void setReturnRateValue(double returnRateValue) {
		this.returnRateValue = returnRateValue;
	}

}
