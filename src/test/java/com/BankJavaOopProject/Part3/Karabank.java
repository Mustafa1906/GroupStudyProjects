package com.BankJavaOopProject.Part3;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Karabank extends Bank {

	public Karabank(double currentBalance, String accountType) {  //constractor
		super(currentBalance + 100, accountType);


		// final balance sıfırla
		
		switch (accountType.toLowerCase()) {   // intiliaze  
		case "gold":
			setDepositReturnValue(80);
			setWithdrawExpenceValue(90);
			setReturnRateValue(1.4);
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

	@Override
	public void deposit(double deposit) {
		if (deposit>=3000){    // eğer bu 2000 değil 3000 olsaydı
			super.deposit(deposit+ super.getDepositReturnValue() );
		} else {
			super.deposit(deposit);
		}
	}
	

	

}
