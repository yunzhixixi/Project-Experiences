
import java.util.Scanner;
public class calandar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week = 0;
		int start=0;
		int count=0;
	       System.out.print("Enter a year: ");
	       Scanner scanner = new Scanner(System.in);
	       int year = scanner.nextInt();
	       System.out.print("Enter the first day of the year(0 for sunday,6 for sunday: ");
	       int dayself = scanner.nextInt();
	       week = dayself;
		int month = 1;
		for (;month<=12;month++) {
		switch (month){
		 case 1:System.out.println("          "+"January"+" "+year);break;
		 case 2:System.out.println("          "+"February"+" "+year);break;
		 case 3:System.out.println("          "+"March"+" "+year);break;
		 case 4:System.out.println("          "+"April"+" "+year);break;
		 case 5:System.out.println("          "+"May"+" "+year);break;
		 case 6:System.out.println("          "+"June"+" "+year);break;
		 case 7:System.out.println("          "+"July"+" "+year);break;
		 case 8:System.out.println("          "+"August"+" "+year);break;
		 case 9:System.out.println("          "+"September"+" "+year);break;
		 case 10:System.out.println("          "+"October"+" "+year);break;
		 case 11:System.out.println("          "+"November"+" "+year);break;
		 case 12:System.out.println("          "+"December"+" "+year);break;
	   }
		
		
    	   if (month == 1||month==3||month==5||month==7||month==8||month==10 || month==12) {
    		   System.out.println("-----------------------------------");
        	   System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
        	   //starting days
        	   for (int startspace =0;startspace<week;startspace++) {
        		   System.out.print("     ");
        	   }
        	   for (int days = 1;days<=31;days++) {
        		   week++;
        		 if (days<10) {
        			 System.out.print("  "+days+"  ");
        		 }
        		 if (days>=10) {
        			 System.out.print(" "+days+"  ");
        		 }
        		 if (week==7) {
        			 System.out.println("");
        			 week=0;
        		 }
        	 }
    	   
    	   System.out.println("");
		}
		if (month==4||month==6||month==9||month==11) {
			System.out.println("-----------------------------------");
			System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
			for(int startspace2=0;startspace2<week;startspace2++) {
				System.out.print("     ");
			}
			for(int days2=1;days2<=30;days2++) {
				week++;
				if(days2<10) {
					System.out.print("  "+days2+"  ");
				}
				if (days2>=10) {
					System.out.print(" "+days2+"  ");
				}
				if (week==7) {
					System.out.println("");
					week=0;
				}
			}
			System.out.println("");
		}
		for(count=0;count<1;count++) {
		if(month==2 && year%4==0) {
			System.out.println("-----------------------------------");
			System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
			for(int startspace3=0;startspace3<week;startspace3++) {
				System.out.print("     ");
			}
			for(int days3=1;days3<=29;days3++) {
				week++;
				if(days3<10) {
					System.out.print("  "+days3+"  ");
				}
				if (days3>=10) {
					System.out.print(" "+days3+"  ");
				}
				if (week==7) {
					System.out.println("");
					week=0;
		}
		}
			System.out.println("");	
}if (month==2 && year%4!=0) {
	System.out.println("-----------------------------------");
	System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
	for(int startspace2=0;startspace2<week;startspace2++) {
		System.out.print("     ");
	}
	for(int days3=1;days3<=28;days3++) {
		week++;
		if(days3<10) {
			System.out.print("  "+days3+"  ");
		}
		if (days3>=10) {
			System.out.print(" "+days3+"  ");
		}
		if (week==7) {
			System.out.println("");
			week=0;
	
}
		}
	}
		System.out.println("");
}
	}
}
}
