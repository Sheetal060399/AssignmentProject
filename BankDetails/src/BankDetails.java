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
 public class BankDetails{
	 public static void main(String[] args) {
		 System.out.println("\t\tUser details");
		 ArrayList<Bank1> Bank = new ArrayList<>();
			int i = 0 ;
            while(i<=2) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the id of the customer");
				int i1 = sc.nextInt();
				sc.nextLine();
				System.out.println("enter the name of the customer");
				String n = sc.nextLine();
				System.out.println("enter the balance of the customer");
				float b = sc.nextFloat();
				Bank.add(new Bank1  ( i1, n,  b));
				i++;1
				
						
			}
            for(int i1=0;i1<Bank.size();i1++) {
            	Bank1 Bank2 = Bank.get(i1);
            	if(Bank2.balance>100)
            	{
            		System.out.println(Bank2.id +""+ Bank2.name +"" +Bank2.balance);
            	
            	
           
            	
            }
            	
            }
	 }
 }
			
			
			