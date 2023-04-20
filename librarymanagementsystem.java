import java.time.*;
import java.time.format.*;
import java.util.*;
class main{
public static void main(String args[]){
      try{
	Scanner sc=new Scanner(System.in);
	System.out.println("|===============================================================|");
	System.out.println("|                      LOGIN CREDENTIALS                                ");
	System.out.println("|===============================================================|");
	System.out.println("|   Enter your Registration number -                               ");
	System.out.println("|   Enter your Password -                            ");
	System.out.println("|===============================================================|");
	int regno=sc.nextInt();
	int psword=sc.nextInt();
           
	if(regno== 12106348&&psword==123|| regno==12106349&&psword==123||regno==12106347&&psword==123){
		LocalDate idp=LocalDate.now();
		LocalTime idi=LocalTime.now();
		DateTimeFormatter u=DateTimeFormatter.ofPattern("HH:mm a");
	System.out.println("|--------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("|                                         LIBRARY MANAGEMENT SYSTEM                        ");
	System.out.println("|---------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("|                                                                                                            Date-"+idp);
	System.out.println("|                                                                                                            Time:"+u.format(idi));
	System.out.println("|   Registration no-"+regno);
	System.out.println("|--------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("|                    1- Book Discussion Room                                        ");
	System.out.println("|                    2 -Category Wise Books  Available                                     ");
	System.out.println("|                    3- Books to get Issue                                             ");
	System.out.println("|                    4-Arrangement of Books  in Library                             ");
	System.out.println("|------------------------------------------------|");
	System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("|             Library Timmings                   |");
	System.out.println("|      Mon-Frid: 9:00 am to 10:00 pm             |");
	System.out.println("|      Sat-Sun:12:00 pm to 8:00pm                |");
	System.out.println("|------------------------------------------------|");
	System.out.println("|                                                                   |----------------------------------------------------|");
	System.out.println("|                                                                   |                   Quote of the day                 |");
	System.out.println("|                                                                   |             When in doubt go to Library            | ");
	System.out.println("|                                                                   |----------------------------------------------------|");
	System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("|                                     PLEASE MAINTAIN DECORUM OF LIBRARY!                                                 |");
	System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
	System.out.println("|                                             Please Select Your Code!                                                                     ");
	System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
    int no=sc.nextInt();
	String nc;
	     switch(no){
		 case 1 :
		System.out.println("|----------------------------------------------------------------------|");
		System.out.println("|Enter your name-");
		System.out.println("|----------------------------------------------------------------------|");
		sc.nextLine();
		nc=sc.nextLine();
		System.out.println("|----------------------------------------------------------------------|");
		System.out.println("|Enter your Regno-");
		System.out.println("|----------------------------------------------------------------------|");
		int rgno=sc.nextInt();
		System.out.println("|----------------------------------------------------------------------|");
		System.out.println("|                        Book Discussion Room                                ");
		System.out.println("|----------------------------------------------------------------------|");
		System.out.println("|                        1 - Please Select -Room type                      ");
		System.out.println("|                        2-  Please Select -Timmimgs                       ");
		System.out.println("|----------------------------------------------------------------------|");
		System.out.println("|                      Please Select Your Code                                 ");
		System.out.println("|----------------------------------------------------------------------|");
	

		int n=sc.nextInt();
		      
	             if(n==1){
			   System.out.println("|-------------------------------------------------------------------------|");
	 		  System.out.println("|                   Rooms Avaiable                                                     ");
			   System.out.println("|-------------------------------------------------------------------------|");
			   System.out.println("|                     1- 4-seater                                                             ");
	 		   System.out.println("|                     2- 8-seater                                                            ");
	  		   System.out.println("|                     3-16-seater                                                            ");
	   		   System.out.println("|-------------------------------------------------------------------------|");
	
                                       }
			          int a=sc.nextInt();
	            
	
                     n=sc.nextInt();
                     if(n==2){
	          System.out.println("|----------------------------------------------------------------------------------------|");
	          System.out.println("|                         Timmings Avaiable-                                                              ");
	          System.out.println("|----------------------------------------------------------------------------------------|");
	          System.out.println("|                          1-from-8:00 to 10:00pm                                                    ");
	          System.out.println("|                          2-from-10:00 to 12:00pm                                                  ");
	          System.out.println("|----------------------------------------------------------------------------------------|");

         }
			int b=sc.nextInt();
			
				LocalDate idd=LocalDate.now();
				LocalTime idt=LocalTime.now();
				DateTimeFormatter f=DateTimeFormatter.ofPattern("H:mm");
               System.out.println("|------------------------------------------------------------------------------------------------------|");
			  System.out.println("|                                      DISCUSSION ROOM SLIP                                 ");
			  System.out.println("|------------------------------------------------------------------------------------------------------|");
			  System.out.println("|                                                                  Date-"+idd+"             ");
              System.out.println("|                                                                  Time-"+f.format(idt));
			  System.out.println("|Student name-"+nc+"                                                                                                      " );
			  System.out.println("|Registration no-"+rgno+"                                                                                                   ");
			  if(a==1){
				 System.out.println("|Seater booked- 4");
								  }
			   if(a==2){
			  System.out.println("| Seater booked- 8                                                            ");
								  }
		      if(a==3){
		      System.out.println("|Seater booked- 16                              ");
									 }		
				  if(b==1){
				System.out.println("|Time-Slot Allocted-   8:00-10:00 pm                                       ");
	
							  }
				if(b==2){
				System.out.println("|Time-Slot Allocted-   10:00-12:00pm                                     ");
	
										 }
			  System.out.println("|--------------------------------------------------------------------------------------------------------|");
			  System.out.println("|                         YOUR DISCUSSION ROOM BOOKED SUCCESSFULLY                          ");
			  System.out.println("|--------------------------------------------------------------------------------------------------------|");
			  System.out.println("|                                  KINDLY VACATE ROOM ON TIME!                         ");
			  System.out.println("|--------------------------------------------------------------------------------------------------------|");
	            break;
	
	 case 2:
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("|                                 Types of Books                                                             ");
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("|                               1-  Course related Books                                                           ");
		System.out.println("|                               2-  General Knowledge                                                  ");		
		System.out.println("|                               3-    Novels                                                                      ");		
       System.out.println("|                               4-  Story Books                                               ");		
       System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("|                            Please Select Your Code!                                                      ");
	   System.out.println("|-----------------------------------------------------------------------------------------|");
		
	

			int d=sc.nextInt();
			if(d==1){
			System.out.println("|---------------------------------------------------------------------------------------|");
			System.out.println("|                                   TYPES OF COURSES AVAILABLE                                 "  );
			System.out.println("|----------------------------------------------------------------------------------------|");
			System.out.println("|                             1- Computer Science Engineering                         ");
			System.out.println("|                             2- Electricals Commuinction Engineering            ");
			System.out.println("|                              3- Mechinical Engineering                                       ");
			System.out.println("|                              4- Civil Engineering                                                  ");
			System.out.println("|----------------------------------------------------------------------------------------|");
			System.out.println("|                               PICK YOUR COURSE !                                         |");
			System.out.println("|---------------------------------------------------------------------------------------|");

			
				int e=sc.nextInt();
				if(e==1){
			System.out.println("|---------------------------------------------------------------------------------------------|");
			System.out.println("|                    1-  1st Year                                                                                            ");
			System.out.println("|                    2-  2nd Year                                                                                            ");
			System.out.println("|                    3-  3rd Year                                                                                            ");
			System.out.println("|                    4-  4th Year                                                                                            ");
			System.out.println("|---------------------------------------------------------------------------------------------|");
			System.out.println("|                  Select  your year !                                                                                         ");
			System.out.println("|---------------------------------------------------------------------------------------------|");
			
			int year=sc.nextInt();
			
			
			System.out.println("|-------------------------------------------------------------------------------------|");
			System.out.println("|                       1-  SEM-1                                                                             ");
			System.out.println("|                       2-  SEM-2                                                                            ");
			System.out.println("|-------------------------------------------------------------------------------------|");
			System.out.println("|                   Select your  Sem!                                                                  ");
			System.out.println("|--------------------------------------------------------------------------------------|");
				//}

			
				int sem=sc.nextInt();
				if(year==1&&sem==1){
					System.out.println("|-----------------------------------------------------------------------------------------|");
					System.out.println("|              Course Codes for 1nd year- 1nd sem students                                             ");
					 System.out.println("|-----------------------------------------------------------------------------------------|");
					System.out.println("|              1-Cse-101 (C-language)                                                  ");
					System.out.println("|              2-ECE-131   (Basic Electronics Engineering)                                                                              ");
					System.out.println("|              3-ECE-132     (Basic Electronics Engineering Lab)                                          ");
					System.out.println("|              4-MEC-103   (Engineering Graphs)                                                                      ");
					System.out.println("|              5-MTH-165   (Mathematics For Enginners)                                          ");
					System.out.println("|              6-PHY-109   (Engineering Physics)                                                          ");
					System.out.println("|              7-PES-318    (Soft-Skills-1)                                                                    ");
					System.out.println("|-----------------------------------------------------------------------------------------|");
					System.out.println("|                 Please Select your Course Code!                                      ");
					System.out.println("|-----------------------------------------------------------------------------------------|");
				
				
				    int h=sc.nextInt();
					if(h==1){
					
					String  ai[]=new String[5];
					ai[1]=("Introduction to C                               author-pavansai                               10th edition|");
					ai[2]=("Basics of C                                          author-pavansai                                11th edition| ");
					ai[3]=("programming with C                        author-pavansai                                12th edition|");
					ai[4]=("Advanced C                                        author-pavansai                                9th edition");
					System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
						System.out.println("    		TEXT BOOKS AVAILABLE FOR CSE-101                       ");
									for(int i=1;i<ai.length;i++){
									System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
									System.out.println("| "+i  +"-"+ai[i]);
                                   }
						System.out.println("|------------------------------------------------------------------------------------------------------------------|");
						
}
                     if(h==2){
					
	                String  bi[]=new String[5];
	               bi[1]=("Introduction to c++");
					bi[2]=("Basics of JAVA");
					bi[3]=("programming with JAVA");
					bi[4]=("Advanced JAVA");
					System.out.println("|-----------------------------------------------------|");
					System.out.println("    		TEXT BOOKS AVAILABLE FOR ECE-131                        ");
							for(int i=1;i<bi.length;i++){
							System.out.println("|-----------------------------------------------------|");
							System.out.println("| "+i  +"-"+bi[i]);
						 }
					System.out.println("|-----------------------------------------------------|");
				      }
					  if(h==3){
					
						String  ci[]=new String[5];
					    ci[1]=("Introduction to Electronics Lab");
						ci[2]=("Basics of Electronics Lab");
						ci[3]=("programming in Electronics");
						ci[4]=("Advanced Electronics");
						System.out.println("|-----------------------------------------------------|");
						System.out.println("    		TEXT BOOKS AVAILABLE FOR ECE-132                      ");
								for(int i=1;i<ci.length;i++){
								System.out.println("|-----------------------------------------------------|");
								System.out.println("| "+i  +"-"+ci[i]);
							 }
						System.out.println("|-----------------------------------------------------|");
						  }
						  if(h==4){
					
							String di[]=new String[5];
							di[1]=("Introduction to Graphics");
							di[2]=("Basics of Drawing");
							di[3]=("Multilevel Graphics");
							di[4]=("Advanced Graphs");
							System.out.println("|-----------------------------------------------------|");
							System.out.println("    		TEXT BOOKS AVAILABLE FOR MEC-103                    ");
									for(int i=1;i<di.length;i++){
									System.out.println("|-----------------------------------------------------|");
									System.out.println("| "+i  +"-"+di[i]);
								 }
							System.out.println("|-----------------------------------------------------|");
							  }
						//}
					}
					if(year==1&&sem==2){
						System.out.println("|-----------------------------------------------------------------------------------------|");
						System.out.println("|              Course Codes for 1nd year- 2nd sem students                                             ");
						 System.out.println("|-----------------------------------------------------------------------------------------|");
						System.out.println("|              1-CSE-202 (C++ -language)                                                  ");
						System.out.println("|              2-ECE-213   (Digital Electronics)                                                                              ");
						System.out.println("|              3-ECE-216    (Digital Electronics Laboratory)                                          ");
						System.out.println("|              4-MEC-107   (Basic Engineering Mechanics)                                                                      ");
						System.out.println("|              6-MTH-166   (Vector Calculus)                                          ");
						System.out.println("|              5-CHE-110   (Environmental Chemistry)                                                          ");
						System.out.println("|              5-PEL-121    (Communication Skills-1)                                                                    ");
						System.out.println("|-----------------------------------------------------------------------------------------|");
						System.out.println("|                 Please Select your Subject!                                       ");
						System.out.println("|-----------------------------------------------------------------------------------------|");
					
					//}
						int h=sc.nextInt();
						if(h==1){
						
						String  ai[]=new String[5];
						ai[1]=("Introduction to C++");
						ai[2]=("Basics of C++");
						ai[3]=("programming with C++");
						ai[4]=("Advanced C++");
						System.out.println("|-----------------------------------------------------|");
							System.out.println("    		TEXT BOOKS AVAILABLE FOR CSE-202                       ");
										for(int i=1;i<ai.length;i++){
										System.out.println("|-----------------------------------------------------|");
										System.out.println("| "+i  +"-"+ai[i]);
									   }
							System.out.println("|-----------------------------------------------------|");
							
	}
						 if(h==2){
						
						String  bi[]=new String[5];
					   bi[1]=("Introduction to Electronics");
						bi[2]=("Basics of Electrical Engineering");
						bi[3]=("Models and Evelution of Electronics");
						bi[4]=("Electronics with Pratical");
						System.out.println("|-----------------------------------------------------|");
						System.out.println("    		TEXT BOOKS AVAILABLE FOR ECE-213                        ");
								for(int i=1;i<bi.length;i++){
								System.out.println("|-----------------------------------------------------|");
								System.out.println("| "+i  +"-"+bi[i]);
							 }
						System.out.println("|-----------------------------------------------------|");
						  }
							//}
						}

						
				if(year==2 && sem==1){
					System.out.println("|Course code for 2nd Year-1st sem students");
				  }
				if(year==2&&sem==2){
				System.out.println("|-----------------------------------------------------------------------------------------|");
				System.out.println("|              Course Codes for 2nd year- 2nd sem students                                             ");
 				System.out.println("|-----------------------------------------------------------------------------------------|");
				System.out.println("|              1-Int-404 (Artificial Intellegience)                                                  ");
				System.out.println("|              2-Cse-310   (Java)                                                                              ");
				System.out.println("|              3-Cse-211     (Computer Organization)                                          ");
				System.out.println("|              4-Cse-325   (Lab linux)                                                                      ");
				System.out.println("|              5-Mth-302   (Probability and statictics)                                          ");
				System.out.println("|              6-Pea-305   (Analytical-Skills)                                                          ");
				System.out.println("|              7-Pes-301    (Soft-Skills)                                                                    ");
				System.out.println("|-----------------------------------------------------------------------------------------|");
				System.out.println("|                 Please Select your Subject!                                      ");
				System.out.println("|-----------------------------------------------------------------------------------------|");

				//}
				 int g=sc.nextInt();
					if(g==1){
					
					String  ai[]=new String[5];
					ai[1]=("Introduction to AI");
					ai[2]=("Basics of AI");
					ai[3]=("programming with AI");
					ai[4]=("Advanced AI");
					System.out.println("|-----------------------------------------------------|");
						System.out.println("    		TEXT BOOKS AVAILABLE FOR INT-404                        ");
									for(int i=1;i<ai.length;i++){
									System.out.println("|-----------------------------------------------------|");
									System.out.println("| "+i  +"-"+ai[i]);
                                   }
						System.out.println("|-----------------------------------------------------|");
 }
                     if(g==2){
					
	                String  bi[]=new String[6];
	               bi[1]=("IProgramming with JAVA              by        Balagurusamy             ");
				   bi[2]=("IProgramming with Java               by           McGraw Hill            ");
					bi[3]=("Introduction to JAVA                    by           Y.Daniel                     ");
					bi[4]=("programming with JAV A             by        Pearson                 ");
					bi[5]=("JAVA The Complete                      by        Herbert Schildt      ");
					System.out.println("|------------------------------------------------------------------------------------------------------------|");
					System.out.println("    		TEXT BOOKS AVAILABLE FOR CSE-310                        ");
							for(int i=1;i<bi.length;i++){
							System.out.println("|------------------------------------------------------------------------------------------------------|");
							System.out.println("| "+i  +"-"+bi[i]);
						 }
					System.out.println("|------------------------------------------------------------------------------------------------------------|");
						}
						if(g==3){
					
							String  ci[]=new String[5];
							ci[1]=("Compurt system architecture                         by     Morris menu                         10th edition");
							ci[2]=("Computer system organization                     by    Pearson Mano                       13th edition");
							ci[3]=("Computer organization and architecture      by    William Stallings                  10th edition ");
							ci[4]=("Computer organization and architecture      by Pearson                                   13th edition");
							System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
							System.out.println("    		TEXT BOOKS AVAILABLE FOR CSE-211                      ");
									for(int i=1;i<ci.length;i++){
									System.out.println("|-----------------------------------------------------------------------------------------------------------------------|");
									System.out.println("| "+i  +"-"+ci[i]);
								 }
							System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
							  }
							  if(g==4){
					
								String di[]=new String[5];
								di[1]=("Introduction to linux commands");
								di[2]=("Basics of Programming commands");
								di[3]=("Programming with linux ");
								di[4]=("Advanced Linux");
								System.out.println("|-----------------------------------------------------|");
								System.out.println("    		TEXT BOOKS AVAILABLE FOR CSE-305                   ");
										for(int i=1;i<di.length;i++){
										System.out.println("|-----------------------------------------------------|");
										System.out.println("| "+i  +"-"+di[i]);
									 }
								System.out.println("|-----------------------------------------------------|");
								  }
					}
}
	}	
	if(d==2){
		System.out.println("|-------------------------------------------------------------------------------------------|");
		System.out.println("|                      GENERAL KNOWLEDGE BOOKS AVALIABLE                                 ");
		String hi[] ={"  abc  ","General Knowledge2023","Static Book","Current Affairs2023","Lucent's General Knowledge"};
		for(int i=1;i<hi.length;i++){
			System.out.println("|----------------------------------------------------------------------------------------|");
		System.out.println("|"+i+"-"+hi[i]);
		}
		System.out.println("|-------------------------------------------------------------------------------------------|");
	}			
	if(d==3){
		System.out.println("|-------------------------------------------------------------------------------------------|");
		System.out.println("|                              NOVEL BOOKS AVALIABLE                                 ");
		String fi[] ={"  abc  ","The Turn of Screw","The Journal of Ceurious Letter","Sensor Sensibility","Pride and prejudice"};
		for(int i=1;i<fi.length;i++){
			System.out.println("|----------------------------------------------------------------------------------------|");
		System.out.println("|"+i+"-"+fi[i]);
		}
		System.out.println("|-------------------------------------------------------------------------------------------|");
	}			
	if(d==4){
		System.out.println("|-------------------------------------------------------------------------------------------|");
		System.out.println("|                      STORY  BOOKS AVALIABLE                                 ");
		String gi[] ={"  abc  ","Ail baba 40 thiefs","Honesty is the best policy","Panchatantra","The Green tree"};
		
		for(int i=1;i<gi.length;i++){
			System.out.println("|----------------------------------------------------------------------------------------|");
		System.out.println("|"+i+"-"+gi[i]);
		}
		System.out.println("|-------------------------------------------------------------------------------------------|");
	}			
            break;
	case 3:		
	System.out.println("|-------------------------------------------------------------------------|");
	System.out.println("|                         Select Your  Type                                        ");
	System.out.println("|-------------------------------------------------------------------------|");
	System.out.println("|                   1-    Books To Be Borrowed                                 ");
	System.out.println("|                   2-    Books To Be Returned                                  ");
	System.out.println("|-------------------------------------------------------------------------|");
		int o=sc.nextInt();
		if(o==1){
			System.out.println("|---------------------------------------------------------------------------------------|");
            System.out.println("|             1-Enter your Name"                                                              );
            System.out.println("|            2 -Enter your Reg no"                                                              );
            System.out.println("|             3-Enter your Current Year"                                                              );
			System.out.println("|             4-Enter your Current Sem"                                                              );
			System.out.println("|             5- Enter Your Details of Book                                                           ");
			System.out.println("|-----------------------------------------------------------------------------------------|");
			sc.nextLine();
			String  peru=sc.nextLine();
			int studentregno=sc.nextInt();
			int Year=sc.nextInt();
			int Sem=sc.nextInt();
			sc.nextLine();
			String Details=sc.nextLine();
			LocalDate idq=LocalDate.now();
			LocalTime idh=LocalTime.now();
			DateTimeFormatter x=DateTimeFormatter.ofPattern("H:mm");
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
			System.out.println("|                                            LIBRARY ISSUE CARD TO BORROW BOOK                                         ");
			System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");
			System.out.println("|                                                                                  Borrow Date:"+idq);
			System.out.println("|                                                                                  Time:"+x.format(idh));

			System.out.println("|Student Name-"+peru);
			System.out.println("|Student RegNo-"+studentregno);
			System.out.println("|Current Year-"+Year );
			System.out.println("|Current Sem-"+Sem);
			System.out.println("|Details of Book-"+Details);
			System.out.println("|                                                                                  ReturnDate-"+idq.plusDays(7));
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
			System.out.println("|                                   BOOK HAS BEEN ISSUED SUCCESSFULLY                                       ");
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
			System.out.println("|                              KINDLY RETURN THE BOOK ON THE RETURN DATE                             ");
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
}
if(o==2){
	System.out.println("|---------------------------------------------------------------------------------------|");
	System.out.println("|                      1-Enter your Name"                                                              );
	System.out.println("|                     2 -Enter your Reg no"                                                              );
	System.out.println("|                   3-Enter your Current Year"                                                              );
	System.out.println("|                   4-Enter your Current Sem"                                                              );
	System.out.println("|                    5- Enter Your Details of Book                                                           ");
	System.out.println("|-----------------------------------------------------------------------------------------|");
	sc.nextLine();
	String  peru=sc.nextLine();
	int studentregno=sc.nextInt();
	int Year=sc.nextInt();
	int Sem=sc.nextInt();
	sc.nextLine();
	String Details=sc.nextLine();
			LocalDate ido=LocalDate.of(2023,04,19);
			LocalTime idu=LocalTime.now();
			LocalDate idy=LocalDate.now();
			DateTimeFormatter r=DateTimeFormatter.ofPattern("H:mm");
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
			System.out.println("|                                          LIBRARY ISSUE CARD  TO RETURN BOOKS                                 ");
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
			System.out.println("|                                                                                         IssuedDate:"+ido);
			System.out.println("|                                                                                         ReturningDate:"+idy);
			System.out.println("|                                                                                         Time:"+r.format(idu));
			System.out.println("|Student Name-"+peru);
			System.out.println("|Student RegNo-"+studentregno);
			System.out.println("|Current Year-"+Year );
			System.out.println("|Current Sem-"+Sem);
			System.out.println("|Details of Book-"+Details);
			System.out.println("|                                                                                  ReturnDate-"+ido.plusDays(7));
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
			System.out.println("|                                   BOOK HAS BEEN RETURNED SUCCESSFULLY                                       ");
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
			System.out.println("|                                THANKS FOR RETURNING THE BOOK ON THE DATE                             ");
			System.out.println("|-----------------------------------------------------------------------------------------------------------------------------|");
	}
break;
case 4:
       System.out.println("|----------------------------------------------------------------------------------------|");  
       System.out.println("|                                 Types of Books                                                             ");
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("|                               1-  Course related Books                                              ");
		System.out.println("|                               2-  General Knowledge                                                  ");		
		System.out.println("|                               3-    Novels                                                                      ");		
       System.out.println("|                               4-  Story Books                                                               ");		
		System.out.println("|---------------------------------------------------------------------------------------|");
		System.out.println("|                            Please Select Your Code!                                                 ");
	   System.out.println("|-----------------------------------------------------------------------------------------|");
	   int k=sc.nextInt();
	   if(k==1){
		System.out.println("|-------------------------------------------------------------------------------------------|");
		System.out.println("|                      ENTER YOUR COURSE NAME                                |");
		System.out.println("|--------------------------------------------------------------------------------------------|");
		String co=sc.next();
		if(co.equals("cse")){
			System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
			System.out.println("|                      YOUR COURSE-"+co.toUpperCase()+" RELATED BOOKS AVAILABLE AT 3rd FLOOR");
			System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
		}
		if(co.equals("ece")){
			System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
			System.out.println("|                      YOUR COURSE-"+co.toUpperCase()+" RELATED BOOKS AVAILABLE AT 2nd FLOOR");
			System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
		}
		if(co.equals("mec")){
			System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
			System.out.println("|                      YOUR COURSE-"+co.toUpperCase()+" RELATED BOOKS AVAILABLE AT 4th FLOOR");
			System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
		}
	   }
	   if(k==2){
		System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
		System.out.println("|       ENTER YOUR BOOK NAME          ");
		System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
		sc.nextLine();
		String gk=sc.nextLine();
	    System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
		System.out.println("|                  "+gk+"-GENERAL KNOWLEDGE RELATED BOOKS AVAILABLE AT 1st FLOOR");
		System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
	   }
	   if(k==3){
		System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
		System.out.println("|       ENTER YOUR BOOK NAME          ");
		System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
		sc.nextLine();
		String novel=sc.nextLine();
	    System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
		System.out.println("|                      "+novel+"-NOVEL RELATED BOOKS AVAILABLE AT 4th FLOOR");
		System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
	   }
	   if(k==4){
		System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
		System.out.println("|       ENTER YOUR BOOK NAME          ");
		System.out.println("|--------------------------------------------------------------------------------------------------------------------|");
       sc.nextLine();
		String str=sc.nextLine();
	    System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
		System.out.println("|                     "+str+"- STORY  RELATED BOOKS AVAILABLE AT 4th FLOOR");
		System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
	   }
	   break;
	   default:
	   System.out.println("             ENTER ONLY THE ABOVE CODES                    ");
	}


}
else{
	System.out.println("|==============================================================|");
	System.out.println("|                 PLEASE ENTER VALID LOGIN DETAILS                  ");
	System.out.println("|==============================================================|");


}

      }
    catch(Exception exception){
        System.out.println("|=============================================================================");
        System.out.println("|                      SORRY YOU HAVE ENTERED WRONG CODE                                         ");
        System.out.println("|=============================================================================");
      }
	  
}
}
