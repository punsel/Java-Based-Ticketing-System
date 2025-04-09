/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketing.system;

/**
 *
 * @author User
 */
import java.util.*;
public class TicketingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String[] genre={
            "[1]  LOVESTORY",
            "[2]  HORROR",
            "[3]  ACTION",
            "[4]  FANTASY",
            "[5]  COMEDY",
            "[6]  ANIME"};
    String[] lovestory = {
            "[1]  Titanic", 
            "[2]  The Notebook ", 
            "[3]  Romeo and Juliet", 
            "[4]  La La Land",
            "[5]  Casablanca",
            "[6]  Before Sunrise ",
            "[7]  Pride & Prejudice",
            "[8]  Eternal Sunshine of the Spotless Mind",
            "[9]  Brokeback Mountain ",
            "[10]  Silver Linings Playbook"};
    String[] horror = {
            "[1]  The Shining ", 
            "[2]  Psycho ", 
            "[3]  The Exorcist", 
            "[4]  Halloween",
            "[5]  A Nightmare on Elm Street",
            "[6]  A Nightmare on Elm Street ",
            "[7]  Get Out ",
            "[8]  The Conjuring ",
            "[9]  Hereditary",
            "[10] It"};
    String[] action = {
            "[1]  The Dark Knight  ", 
            "[2]  Die Hard ", 
            "[3]  Mad Max: Fury Road ", 
            "[4]  John Wick",
            "[5]  The Bourne Identity",
            "[6]  Mission: Impossible - Fallout  ",
            "[7]  The Raid: Redemption  ",
            "[8]  Raiders of the Lost Ark  ",
            "[9]  The Matrix",
            "[10] Avengers: Endgame"};
    String[] fantasy = {
            "[1]  The Lord of the Rings: The Fellowship of the Ring",
            "[2]  Harry Potter and the Philosopher's Stone",
            "[3]  Pan's Labyrinth",
            "[4]  The Chronicles of Narnia: The Lion, the Witch and the Wardrobe",
            "[5]  Spirited Away",
            "[6]  The Wizard of Oz",
            "[7]  Stardust",
            "[8]  The Princess Bride",
            "[9]  Alice in Wonderland",
            "[10] The Dark Crystal"
        };
    String[] comedy = {
            "[1]  Anchorman: The Legend of Ron Burgundy",
            "[2]  Superbad",
            "[3]  Bridesmaids",
            "[4]  Step Brothers",
            "[5]  The Hangover",
            "[6]  Airplane!",
            "[7]  Dumb and Dumber",
            "[8]  Napoleon Dynamite",
            "[9]  Shaun of the Dead",
            "[10] The Big Lebowski"
        };
    String[] anime = {
            "[1]  Spirited Away",
            "[2]  Your Name",
            "[3]  Princess Mononoke",
            "[4]  Akira",
            "[5]  Grave of the Fireflies",
            "[6]  My Neighbor Totoro",
            "[7]  Ghost in the Shell",
            "[8]  Howl's Moving Castle",
            "[9]  The Tale of the Princess Kaguya",
            "[10] Perfect Blue"
        };
    Scanner s=new Scanner(System.in);
    onlineticketbooking mymain=new onlineticketbooking();
		    
	     	System.out.println("\nto start log in your google account.");
		System.out.print("\n\nUSER NAME:");
                  String gmail=s.nextLine();
int x=10;
while(x>0){
	      	System.out.print("\nPASSWORD:");
                int pass=s.nextInt();
		
if(pass==2004){
		       System.out.println("\t[WELCOME TO ONLINE TICKET BOOKING]");
                       System.out.println("");
		       System.out.println("\t\tTICKET CATEGORIES:");
		       System.out.println("\t\t[1]  MOVIES");
	 	       System.out.println("\t\t[2]  CONCERT");
		       System.out.println("\t\t[3]  AIRPLANE");
                        System.out.println("\t\t[4]  EXIT");
                       System.out.print("\nSelect ticket [1-4]:");
               int ticket=s.nextInt();
   	       switch(ticket){
	       case 1:
		      System.out.println("\t\t\tMOVIES GENRE:");
		      for(int r=0;r<genre.length;r++){                  
                      System.out.println("\t\t"+genre[r]);
                      }
                      System.out.print("select a genre [1-6]:");
	              int select=s.nextInt();
                  
	          if(select==1){
                           System.out.println("\t\t\tAVAILABLE MOVIES:");
                           for (String lovestory1 : lovestory) {
                           System.out.println("\t\t" + lovestory1);
                           }
	                   System.out.print("select a movie [1-10]:");
	                   int movie=s.nextInt();
                           mymain.movies();
	          }
                  
                  if(select==2){
                           System.out.println("\t\t\tAVAILABLE MOVIES:");
                           for (String horror1 : horror) {
                           System.out.println("\t\t" + horror1);
                           }
	                   System.out.print("select a movie [1-10]:");
	                   int  movie=s.nextInt();
                           mymain.movies();
                  }   
                  
                   if(select==3){
                           System.out.println("\t\t\tAVAILABLE MOVIES:");
                           for (String action1 : action) {
                           System.out.println("\t\t" + action1);
                           }
	                   System.out.print("select a movie [1-10]:");
	                   int movie=s.nextInt();
                           mymain.movies();
                  }      
                   
                   if(select==4){
                           System.out.println("\t\t\tAVAILABLE MOVIES:");
                           for (String fantasy1 : fantasy) {
                           System.out.println("\t\t" + fantasy1);
                           }
	                   System.out.print("select a movie [1-10]:");
	                   int movie=s.nextInt();
                           mymain.movies();
                  } 
                   
                   if(select==5){
                           System.out.println("\t\t\tAVAILABLE MOVIES:");               
                           for (String comedy1 : comedy) {
                           System.out.println("\t\t" + comedy1);
                           }
	                   System.out.print("select a movie [1-10]:");
	                   int movie=s.nextInt();
                           mymain.movies();
                  } 
                   
                   if(select==6){
                          System.out.println("\t\t\tAVAILABLE MOVIES:");
                          for (String anime1 : anime) {
                          System.out.println("\t\t" + anime1);
                          }
	                  System.out.print("select a movie [1-10]:");
	                  int movie=s.nextInt();
                          mymain.movies();
                   
                   }
               
               break;
               case 2:
                    String[] concert={
            "Concert 1: SECONDHAND SERENADE",
            "Concert 2: FM STATIC",
            "Concert 3: THE SCRIPT",
            "Concert 4: WE THE KINGS",
            "Concert 5: A ROCKET TO THE MOON",
            "Concert 6: COLD PLAY"
                    }; 
                    
                     System.out.println("\t\t\tAVAILABLE CONCERT:");
                     for (String concert1 : concert) {
                     System.out.println("\t\t" + concert1);
                     }
                     System.out.print("select a concert [1-6]:");
	             int sel=s.nextInt();
                if(sel==1){
                   mymain.concert(); 
                   }
                if(sel==2){
                   mymain.concert(); 
                   }
                if(sel==3){
                   mymain.concert(); 
                   }
                if(sel==4){
                   mymain.concert(); 
                   }
                if(sel==5){
                   mymain.concert(); 
                   }
                if(sel==6){
                   mymain.concert(); 
                   }
               break;
                   
                   
               case 3:
                     System.out.println("             [WELCOME TO AIRPLANE TICKET BOOKING]");
                     System.out.println("                   AIRLINES CATEGORY:");
                     System.out.println("\n[1]  PAL EXPRESS");
                     System.out.println("[2]  PHILIPINNE AIRLINES");
                     System.out.print("\nselect a airlines [1-2]:");
                     int selec=s.nextInt();
                   switch(selec){
                       case 1:
                             System.out.println("==================================================");  
                             System.out.println("\t\t WELCOME TO PAL EXPRESS AIRLINES");
                             System.out.println("\t\t   [CHOOSE FLIGHT CATEGORY]"); 
                             System.out.println("    \n[1]  INTERNATIONAL FLIGHT");
                             System.out.println("[2]  DOMESTIC FLIGHT");
                             System.out.print("\nchoose category[1-2]:");
                             int cat=s.nextInt();
                             if(cat==1){
                               System.out.println("==================================================");  
                                System.out.println("\t\t[AVAILABLE FLIGHT]");
                                System.out.println("            \n[1]  MANILA to JAPAN(vice versa)");
                                System.out.println("[2]  MANILA to CANADA(vice versa)");
                                System.out.println("[3]  MANILA to NEWYORK(vice versa)");
                                System.out.print("\nchoose flight[1-3]:");
                                int choose=s.nextInt();
                                if(choose==1){
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                     int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                     }
                                       if(selectc==2){
                                            System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();  
                                     }
                                       if(selectc==3){
                                            System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();                                 
                                     }
                             }
                              if(choose==2){                      
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                       int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                        
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                 
                                     } 
                             }
                               if(choose==3){
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                     int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();                                       
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                            System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                     }  
                             }
                             }
                             if(cat==2){
                             System.out.println("              AVAILABLE FLIGHT");
                             System.out.println("              [1]  CEBU TO MANILA(vice versa)");
                             System.out.println("              [2]  DAVAO TO MANILA(vice versa)");
                             System.out.println("              [3]  BOHOL TO MANILA(vice versa)");
                             System.out.print("\nchoose flight[1-3]:");
                             int choose=s.nextInt();
                             if(choose==1){
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                     int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                        
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                     }
                             }
                              if(choose==2){
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                       int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                        
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                 
                                     } 
                             }
                              if(choose==3){ 
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                       int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();  
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                     }                                
                             }                
                   }
                    break;
                    case 2:
                             System.out.println("==================================================");  
                             System.out.println("\t\t WELCOME TO  PHILIPINNE AIRLINES");
                             System.out.println("\t\t   [CHOOSE FLIGHT CATEGORY]"); 
                             System.out.println("    \n[1]  INTERNATIONAL FLIGHT");
                             System.out.println("[2]  DOMESTIC FLIGHT");
                             System.out.print("\nchoose category[1-2]:");
                             int catt=s.nextInt();
                             if(catt==1){
                               System.out.println("==================================================");  
                                System.out.println("\t\t[AVAILABLE FLIGHT]");
                                System.out.println("            \n[1]  MANILA to JAPAN(vice versa)");
                                System.out.println("[2]  MANILA to CANADA(vice versa)");
                                System.out.println("[3]  MANILA to NEWYORK(vice versa)");
                                System.out.print("\nchoose flight[1-3]:");
                                int choose=s.nextInt();
                                  if(choose==1){
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                     int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                        
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();                                 
                                     }
                             }
                              if(choose==2){ 
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                     int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                        
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                     }  
                             }
                               if(choose==3){ 
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                     int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                     } 
                             }
                             }
                             if(catt==2){
                             System.out.println("              AVAILABLE FLIGHT");
                             System.out.println("              [1]  CEBU TO MANILA(vice versa)");
                             System.out.println("              [2]  DAVAO TO MANILA(vice versa)");
                             System.out.println("              [3]  BOHOL TO MANILA(vice versa)");
                             System.out.print("\nchoose flight[1-3]:");
                             int choose=s.nextInt();
                             if(choose==1){
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                     int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                        
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                     }
                             }
                              if(choose==2){   
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                       int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                        
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                 
                                     }
                                       if(selectc==3){
                                          System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();                          
                                     } 
                             }
                              if(choose==3){
                                     System.out.println("==================================================");  
                                     System.out.println("\t\tTICKET CATEGORY");
                                     System.out.println("\n[1]  FIRST CLASS");
                                     System.out.println("[2]  BUSINESS CLASS");
                                     System.out.println("[3]  ECONOMY CLASS");
                                     System.out.print("\nselect class[1-3]:");
                                     int selectc=s.nextInt();
                                       if(selectc==1){
                                          System.out.println("                              [50000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 2 tickets or above theres 5% discount else only 2% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.display();
                                     }
                                       if(selectc==2){
                                          System.out.println("                              [20000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 3 tickets or above theres 10% discount else only 5% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayy();
                                     }
                                       if(selectc==3){
                                            System.out.println("                              [10000 PER FIRST CLASS TICKET]");
                                          System.out.println("                if you buy 5 tickets or above theres 15% discount else only 8% ");       
                                          System.out.print("\nENTER NUMBER OF TICKET:");
                                          int tickt = s.nextInt();
                                          mymain.sett(tickt);
                                          mymain.displayyy();
                                     }    
                             }     
                   }
   	   }
break;
           }    
           }
else{
		    System.out.print("\n\nWRONG PASSWORD");
	   }
break;
}  
}
    }
    

