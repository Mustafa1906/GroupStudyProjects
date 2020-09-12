package com.BankJavaOopProject.Part3;

public class BankTEST {
	public static void main(String[] args) {
		
		
		Akbank Talha_AkHesap = new Akbank(2000, "GOLD"); //constractor calistir!!
		System.out.println("Current Balance: "+ Talha_AkHesap.getCurrentBalance() + "  //(After open the account)");
		
		Talha_AkHesap.deposit(2000);
		System.out.println("Current Balance: "+Talha_AkHesap.getCurrentBalance() + "  //(After Deposit)");
		
		Talha_AkHesap.withdraw(1000);
		System.out.println("Current Balance: "+Talha_AkHesap.getCurrentBalance() + "  //(After withdraw)");
		
		Talha_AkHesap.closeCurrentAccount();
		System.out.println("Current Balance: "+Talha_AkHesap.getCurrentBalance() + "  //(After close the account)");

		
		System.out.println("****************************************************************************");

		
		Talha_AkHesap = new Akbank (Talha_AkHesap.getFinalBalance(), "Saving");  // Aynı bank da yeni SAVING hesabı !
		System.out.println("Current Balance: "+Talha_AkHesap.getCurrentBalance() + "  //(After opening the new Saving account)");

		Talha_AkHesap.withdraw(500);
		System.out.println("Current Balance: "+Talha_AkHesap.getCurrentBalance() + "  //(After deposit)");

		Talha_AkHesap.closeCurrentAccount();   // Akbank Talha Saving hesabını kapatalım
		System.out.println("Current Balance: "+Talha_AkHesap.getCurrentBalance() + "  //(After close the account)");
		
		System.out.println("****************************************************************************");


		// KAra bank a Ak bank parasını aktarıp kullanmak için önce AKbank da settlement All account yapmak lazım!!
		double balance = Talha_AkHesap.settlementAllAccounts();  // Mevcut Eldeki Para !!
		Karabank Talha_KaraHesap = new Karabank (balance, "interest");
		System.out.println("Current Balance: "+Talha_KaraHesap.getCurrentBalance() + "  //(After opening new Interest account)");

		Talha_KaraHesap.deposit(1000);
		System.out.println("Current Balance: "+Talha_KaraHesap.getCurrentBalance() + "  //(After deposit)");


		Talha_AkHesap.settlementAllAccounts();
		Talha_KaraHesap.settlementAllAccounts();

		
		//System.out.println("TalhaAkbank Final : " + Talha.getFinalBalance());
		// finalBalance wallet a cevrilip static tutulması lazm.
		
		System.out.println();
		
		
		

	}

}
