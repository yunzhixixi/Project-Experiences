import java.util.Scanner;
public class ATMMachine {
	public static int X(int selection, int money) {
		if(selection==1) {
			System.out.print("Please enter the amount = ");
			Scanner scan = new Scanner(System.in);
 		   int deposit = scan.nextInt();
 		   //prompt user  to enter money value and collects it into int deposit
 		   money+=deposit;
 		   deposit = 0;
 		   System.out.print("your balance is = "+money);
		}
		else if(selection==2) {
			System.out.print("How much you want to take away= ");
			Scanner scan = new Scanner(System.in);
 		   int withdraw = scan.nextInt();
 		   if (money<withdraw) {
 			   System.out.println("Your balance is low, can't make transection! ");
 			   System.out.println("Your balance is = "+money);
 		   }
 			  if (money >= withdraw) {
	    		   money-=withdraw;
	    		   System.out.println("withdraw complete");
	    		   withdraw = 0;
	    		   System.out.println("Your balance is = "+money);
 		   }
 		  }
 		   else if(selection==3) {
 			  System.out.print("Transfer to = ");
 			  Scanner scan = new Scanner(System.in);
   		   String name = scan.nextLine();
   		   System.out.print("How much did you want to transfer = ");
   		   int transfer = scan.nextInt();
   		   if (money<transfer) {
   		   System.out.println("Your balance is low, can't make transection!");
   		   System.out.println("Your balance is = "+money);
   		   transfer=0;
   		   }
   		   else if (money>=transfer) {
   			   money-=transfer;
   			   System.out.println("Transfer complete, " + transfer +" transferred to "+ name);
   			   System.out.println("Your balance is = "+money);
   			   transfer = 0;
   		   }
 			   
		}
 		   else if(selection==4) {
 			  System.out.println("Your account balance is = "+money);
 		   }  
 		   else if(selection==5) {
 			  System.out.println("Thanks for using, have a great day!");
   		   
 			   
   		   
		
		}
		return money;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	       int money = 0;
	       int selection = 0; 
	    	   
	       do {
	            System.out.println("");
	            System.out.println("ATM Menu:");
	            System.out.println("");
	            System.out.println("1.Deposit Money");
	            System.out.println("2.Withdraw Money");
	            System.out.println("3.Transfer Funds");
	            System.out.println("4.Check Account Balance");
	            System.out.println("5.End Session");
	            System.out.println("");
	            System.out.print("Enter selection: ");
	            selection = scanner.nextInt();
	             
	            money = X(selection, money);

	            System.out.println("");
	            if (selection > 5 || selection < 1) {
	                System.out.println("Please enter a number between 1 and 5");
	            }
	        } while (selection != 5);
	    }
	}	

	