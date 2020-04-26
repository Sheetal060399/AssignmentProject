import java.util.ArrayList;
import java.util.Scanner;
 class Bank1 {
	int id ;
	String name;
	float balance;
	Bank1(int id,String name, float balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	  
	}
	int getId() {
		return id;
		
	}
	String getName()
	{
		return name;
	}
	float getBalance()
	{
		return balance;
	}
	public static int size() {
		return 0;
	}
 }
 class BankDetails{
	 public static void main(String[] args) {
         System.out.println("\t\tUser details");
         
		 ArrayList<Bank1> Bank = new ArrayList<>();
			for(int i =0;i<3;i++){
                Scanner sc = new Scanner(System.in);
				System.out.println("enter the id of the customer");
				int i1 = sc.nextInt();
				sc.nextLine();
				System.out.println("enter the name of the customer");
				String n = sc.nextLine();
				System.out.println("enter the balance of the customer");
                float b = sc.nextFloat();
                Bank1 bank = new Bank1  ( i1, n,  b);
				Bank.add(bank);
				
            }
				
						
			
            for(int i=0;i<Bank.size();i++) {
            	Bank1 Bank2 = Bank.get(i);
            	if(Bank2.balance>100)
            	{
                    System.out.println(Bank2.id +"  "+ Bank2.name +"  " +Bank2.balance);
                }
            }
        }}