public class MainBank{
		
    public static void main (String args[]){
    		BankAccount myAccount, yourAccount;
    		
    		myAccount = new BankAccount(new Person("Miguel","Ferreira"));
    		
    		yourAccount = new BankAccount(new Person("Pelle","Alonso"), 3000);
    		
    	
    	
    		myAccount.deposit(1000);
    	
    		yourAccount.withdraw(1000);
    		
    		System.out.println(myAccount);
    		System.out.println(yourAccount);
    }
    
}
