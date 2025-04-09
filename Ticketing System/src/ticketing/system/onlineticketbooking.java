/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketing.system;

import java.util.*;
/**
 *
 * @author User
 */
public class onlineticketbooking {
     Scanner s=new Scanner(System.in);
     Random random = new Random();
     
     int randomNumber = random.nextInt(999);

     
    public void movies(){
    System.out.println("                              [150 PER TICKET ONLY]");
    System.out.println("                if you buy 5 tickets or above theres 20% discount else only 5% ");
 
      System.out.print("ENTER NUMBER TICKET:");
      int ticket = s.nextInt();
      int[] seat_num = new int [ticket];
      for (int i = 0; i < seat_num.length; i++)
      {
       System.out.println("=================");
       System.out.println("TICKET NO."+(i+1));    
       System.out.print("Enter seat number: ");
       seat_num[i] = s.nextInt();
       System.out.println("=================");
      }
      
      
      
     int pay=ticket*150;
     System.out.println("======================");
     System.out.println("AMOUNT PAYABLE:"+pay);
     double dis,disc;
     if(ticket>=5){
      dis=pay*.20;
      disc=pay-dis;
        System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
      else{
      dis=pay*.05;
      disc=pay-dis;
        System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
       System.out.println("======================");
       System.out.println("CHOOSE PAYMENT METHOD:");
       System.out.println("[1]  GCASH");
       System.out.println("[2]  BDO");
       System.out.println("[3]  PAYMAYA");
       System.out.print("SELECT[1-3]:");     
     int select=s.nextInt();
       System.out.println("======================");
     switch(select){
         case 1:
             System.out.print("ENTER GCASH NUMBER:");
             String gcash=s.next();
             System.out.print("ENTER PASSWORD:");
           int pass=s.nextInt();
           break;
         case 2:
             System.out.print("ENTER BDO NUMBER:");
             String bdo=s.next();
             System.out.print("ENTER PASSWORD:");   
           int passb=s.nextInt();
             
           break;
         case 3:
             System.out.print("ENTER PAYMAYA NUMBER:");
             String paymaya=s.next();
             System.out.print("ENTER PASSWORD:");
           int passp=s.nextInt();
           break;    
         default:
             {
             System.out.println("INVALID KEYWORD:");
             }
     }   
     System.out.println("======================");
     System.out.println("SUCCESFULLY PAID......");
     System.out.println(disc+" "+"has been deducted to your account");
     System.out.println("======================");
     System.out.println("                   [TICKET INFO]");
     int m = 1;
     for (int j = 0; j < seat_num.length; j++)
     {
     System.out.println("=================");
     System.out.println("TICKET NUMBER: " +(j+1));
     System.out.println("SEAT NUMBER: " +seat_num[j]);
     System.out.println("REFERENCE NUMBER: " + randomNumber);
     randomNumber++;
     System.out.println("=================");
     }     
     System.out.println("YOUR TICKET HAS BEEN SUCCESFULLY SENT TO YOUR GMAIL...THANK YOU BOOKING");
    }
    
    
public void concert(){
   System.out.println("              [TICKET VARIATION]");  
   System.out.println("             [1]  VIP TICKET");
   System.out.println("             [2]  ELITE TICKET"); 
   System.out.println("             [3]  REGULAR TICKET"); 
   System.out.print("select ticket[1-3]:");
   int sele=s.nextInt();
   
   
   if(sele==1){
       System.out.println("                              [5000 PER VIP TICKET]");
       System.out.println("                if you buy 2 tickets or above theres 20% discount else only 5% ");
       System.out.print("ENTER NUMBER OF TICKET:");
        int ticket = s.nextInt();
        int pay=ticket*5000;
       System.out.println("======================");
       System.out.println("AMOUNT PAYABLE:"+pay);
        double dis,disc;
        if(ticket>=2){
        dis=pay*.20;
        disc=pay-dis;
       System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
       }
        else{
        dis=pay*.05;
        disc=pay-dis;
     System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
     System.out.println("======================");
     System.out.println("CHOOSE PAYMENT METHOD:");
     System.out.println("[1]  GCASH");
     System.out.println("[2]  BDO");
     System.out.println("[3]  PAYMAYA");
     System.out.print("SELECT[1-3]:");     
      int select=s.nextInt();
     System.out.println("======================");
      switch(select){
         case 1:
             System.out.print("ENTER GCASH NUMBER:");
             String gcash=s.next();
             System.out.print("ENTER PASSWORD:");
              int pass=s.nextInt();
              break;
         case 2:
             System.out.print("ENTER BDO NUMBER:");
             String bdo=s.next();
             System.out.print("ENTER PASSWORD:");   
              int passb=s.nextInt();
              break;
         case 3:
             System.out.print("ENTER PAYMAYA NUMBER:");
             String paymaya=s.next();
             System.out.print("ENTER PASSWORD:");
              int passp=s.nextInt();
              break;    
         default:
             {
             System.out.println("INVALID KEYWORD:");
             }
     }   
     System.out.println("======================");
     System.out.println("SUCCESFULLY PAID......");
     System.out.println(disc+" "+"has been deducted to your account");
     System.out.println("======================");
     System.out.println("                   [TICKET INFO]");
  for(int i = 0; i <= ticket; i++)
     {
     System.out.println("=====================");
     System.out.println("VIP TICKET NUMBER: " +(i+1));
     System.out.println("REFERENCE NUMBER: " + randomNumber);
     randomNumber++;
      System.out.println("=====================");
     }
     
     System.out.println("YOUR TICKET HAS BEEN SUCCESFULLY SENT TO YOUR GMAIL...THANK YOU BOOKING");   
     }
   
   
  if(sele==2){
     System.out.println("                              [2000 PER ELITE TICKET]");
     System.out.println("                if you buy 5 tickets or above theres 20% discount else only 5% ");
     System.out.print("ENTER NUMBER OF TICKET:");
     int ticket = s.nextInt();  
     int pay=ticket*2000;
     System.out.println("======================");
     System.out.println("AMOUNT PAYABLE:"+pay);
     double dis,disc;
     if(ticket>=5){
     dis=pay*.20;
     disc=pay-dis;
     System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
     else{
     dis=pay*.05;
     disc=pay-dis;
     System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
     System.out.println("======================");
     System.out.println("CHOOSE PAYMENT METHOD:");
     System.out.println("[1]  GCASH");
     System.out.println("[2]  BDO");
     System.out.println("[3]  PAYMAYA");
     System.out.print("SELECT[1-3]:");     
     int select=s.nextInt();
     System.out.println("======================");
    switch(select){
         case 1:
             System.out.print("ENTER GCASH NUMBER:");
             String gcash=s.next();
             System.out.print("ENTER PASSWORD:");
             int pass=s.nextInt();
             break;
         case 2:
             System.out.print("ENTER BDO NUMBER:");
             String bdo=s.next();
             System.out.print("ENTER PASSWORD:");   
             int passb=s.nextInt();
             
             break;
         case 3:
             System.out.print("ENTER PAYMAYA NUMBER:");
             String paymaya=s.next();
             System.out.print("ENTER PASSWORD:");
             int passp=s.nextInt();
             break;    
         default:
             {
             System.out.println("INVALID KEYWORD:");
             }
     }   
     System.out.println("======================");
     System.out.println("SUCCESFULLY PAID......");
     System.out.println(disc+" "+"has been deducted to your account");
     System.out.println("======================");
     System.out.println("                   [TICKET INFO]");
     for(int i = 0; i <= ticket; i++)
     {
     System.out.println("=====================");
     System.out.println("VIP TICKET NUMBER: " +(i+1));
     System.out.println("REFERENCE NUMBER: " + randomNumber);
     randomNumber++;
      System.out.println("=====================");
     }
     
     System.out.println("YOUR TICKET HAS BEEN SUCCESFULLY SENT TO YOUR GMAIL...THANK YOU BOOKING");      
     }
  
  
  if(sele==3){
     System.out.println("                              [1000 PER ELITE TICKET]");
     System.out.println("                if you buy 10 tickets or above theres 20% discount else only 5% ");
     System.out.print("ENTER NUMBER OF TICKET:");
     int ticket = s.nextInt(); 
     int pay=ticket*1000;
     System.out.println("======================");
     System.out.println("AMOUNT PAYABLE:"+pay);
     double dis,disc;
     if(ticket>=10){
     dis=pay*.20;
     disc=pay-dis;
     System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
     else{
     dis=pay*.05;
     disc=pay-dis;
     System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
     System.out.println("======================");
     System.out.println("CHOOSE PAYMENT METHOD:");
     System.out.println("[1]  GCASH");
     System.out.println("[2]  BDO");
     System.out.println("[3]  PAYMAYA");
     System.out.print("SELECT[1-3]:");     
     int select=s.nextInt();
     System.out.println("======================");
     switch(select){
         case 1:
             System.out.print("ENTER GCASH NUMBER:");
             String gcash=s.next();
             System.out.print("ENTER PASSWORD:");
             int pass=s.nextInt();
             break;
         case 2:
             System.out.print("ENTER BDO NUMBER:");
             String bdo=s.next();
             System.out.print("ENTER PASSWORD:");   
             int passb=s.nextInt();
             
             break;
         case 3:
             System.out.print("ENTER PAYMAYA NUMBER:");
             String paymaya=s.next();
             System.out.print("ENTER PASSWORD:");
             int passp=s.nextInt();
             break;    
         default:
             {
             System.out.println("INVALID KEYWORD:");
             }
     }   
     System.out.println("======================");
     System.out.println("SUCCESFULLY PAID......");
     System.out.println(disc+" "+"has been deducted to your account");
     System.out.println("======================");
     System.out.println("                   [TICKET INFO]");
     for(int i = 0; i <= ticket; i++)
     {
     System.out.println("=====================");
     System.out.println("VIP TICKET NUMBER: " +(i+1));
     System.out.println("REFERENCE NUMBER: " + randomNumber);
     randomNumber++;
      System.out.println("=====================");
     }
     
     System.out.println("YOUR TICKET HAS BEEN SUCCESFULLY SENT TO YOUR GMAIL...THANK YOU BOOKING");      
   }
  
} 
private int n1;
public void sett(int tickt){
    n1=tickt;
}

public int gett(){
    return n1;
}

public void display(){
    double dis,disc;
    int ticket=gett();
    int[] seat_num = new int [ticket];  
    for(int i=0;i<seat_num.length;i++){
    System.out.println("======================");
    System.out.println("TICKET NUMBER:"+(i+1));
    System.out.print("ENTER NAME:");
    String name=s.next();
    System.out.print("ENTER AGE:");
    int age=s.nextInt();
    }
    
    int total=gett()*50000;
    System.out.println("======================");
    System.out.println("AMOUNT PAYABLE:"+total);
     
     if(gett()>=2){
        dis=total*.05;
        disc=total-dis;
        System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
        }
     
     else{
     dis=total*.02;
     disc=total-dis;
     System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
     System.out.println("======================");
     System.out.println("CHOOSE PAYMENT METHOD:");
     System.out.println("[1]  GCASH");
     System.out.println("[2]  BDO");
     System.out.println("[3]  PAYMAYA");
     System.out.print("SELECT[1-3]:");     
     int select=s.nextInt();
     System.out.println("======================");
     switch(select){
         case 1:
             System.out.print("ENTER GCASH NUMBER:");
             String gcash=s.next();
             System.out.print("ENTER PASSWORD:");
             int pass=s.nextInt();
             break;
         case 2:
             System.out.print("ENTER BDO NUMBER:");
             String bdo=s.next();
             System.out.print("ENTER PASSWORD:");   
             int passb=s.nextInt();
             
             break;
         case 3:
             System.out.print("ENTER PAYMAYA NUMBER:");
             String paymaya=s.next();
             System.out.print("ENTER PASSWORD:");
             int passp=s.nextInt();
             break;    
         default:
             {
             System.out.println("INVALID KEYWORD:");
             }
     }   
     System.out.println("======================");
     System.out.println("SUCCESFULLY PAID......");
     System.out.println(disc+" "+"has been deducted to your account");
     System.out.println("======================");
     System.out.println("                   [TICKET INFO]");
     for (int j = 0; j < seat_num.length; j++)
     {
     System.out.println("=================");
     System.out.println("TICKET NUMBER: " +(j+1));
     System.out.println("REFERENCE NUMBER: " + randomNumber);
     randomNumber++;
     System.out.println("=================");
     }     
     System.out.println("YOUR TICKET HAS BEEN SUCCESFULLY SENT TO YOUR GMAIL...THANK YOU BOOKING");
    
     }



public void displayy(){
    double dis,disc;
    int ticket=gett();
    int[] seat_num = new int [ticket];  
    for(int i=0;i<seat_num.length;i++){
    System.out.println("======================");
    System.out.println("TICKET NUMBER:"+(i+1));
    System.out.print("ENTER NAME:");
    String name=s.next();
    System.out.print("ENTER AGE:");
    int age=s.nextInt();
    }
    
    int total=gett()*20000;
    System.out.println("======================");
    System.out.println("AMOUNT PAYABLE:"+total);
     
     if(gett()>=3){
        dis=total*.1;
        disc=total-dis;
        System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
        }
     
     else{
     dis=total*.05;
     disc=total-dis;
     System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
     System.out.println("======================");
     System.out.println("CHOOSE PAYMENT METHOD:");
     System.out.println("[1]  GCASH");
     System.out.println("[2]  BDO");
     System.out.println("[3]  PAYMAYA");
     System.out.print("SELECT[1-3]:");     
     int select=s.nextInt();
     System.out.println("======================");
     switch(select){
         case 1:
             System.out.print("ENTER GCASH NUMBER:");
             String gcash=s.next();
             System.out.print("ENTER PASSWORD:");
             int pass=s.nextInt();
             break;
         case 2:
             System.out.print("ENTER BDO NUMBER:");
             String bdo=s.next();
             System.out.print("ENTER PASSWORD:");   
             int passb=s.nextInt();
             
             break;
         case 3:
             System.out.print("ENTER PAYMAYA NUMBER:");
             String paymaya=s.next();
             System.out.print("ENTER PASSWORD:");
             int passp=s.nextInt();
             break;    
         default:
             {
             System.out.println("INVALID KEYWORD:");
             }
     }   
     System.out.println("======================");
     System.out.println("SUCCESFULLY PAID......");
     System.out.println(disc+" "+"has been deducted to your account");
     System.out.println("======================"); 
     System.out.println("                   [TICKET INFO]");
     for (int j = 0; j < seat_num.length; j++)
     {
     System.out.println("=================");
     System.out.println("TICKET NUMBER: " +(j+1));
     System.out.println("REFERENCE NUMBER: " + randomNumber);
     randomNumber++;
     System.out.println("=================");
     }     
     System.out.println("YOUR TICKET HAS BEEN SUCCESFULLY SENT TO YOUR GMAIL...THANK YOU BOOKING");
    
     }



public void displayyy(){
    double dis,disc;
    int ticket=gett();
    int[] seat_num = new int [ticket];  
    for(int i=0;i<seat_num.length;i++){
    System.out.println("======================");
    System.out.println("TICKET NUMBER:"+(i+1));
    System.out.print("ENTER NAME:");
    String name=s.next();
    System.out.print("ENTER AGE:");
    int age=s.nextInt();
    }
    
    int total=gett()*10000;
    System.out.println("======================");
    System.out.println("AMOUNT PAYABLE:"+total);
     
     if(gett()>=5){
        dis=total*.15;
        disc=total-dis;
        System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
        }
     
     else{
     dis=total*.08;
     disc=total-dis;
     System.out.println("DISCOUNTED AMOUNT  PAYABLE:"+disc);
     }
     System.out.println("======================");
     System.out.println("CHOOSE PAYMENT METHOD:");
     System.out.println("[1]  GCASH");
     System.out.println("[2]  BDO");
     System.out.println("[3]  PAYMAYA");
     System.out.print("SELECT[1-3]:");     
     int select=s.nextInt();
     System.out.println("======================");
     switch(select){
         case 1:
             System.out.print("ENTER GCASH NUMBER:");
             String gcash=s.next();
             System.out.print("ENTER PASSWORD:");
             int pass=s.nextInt();
             break;
         case 2:
             System.out.print("ENTER BDO NUMBER:");
             String bdo=s.next();
             System.out.print("ENTER PASSWORD:");   
             int passb=s.nextInt();
             
             break;
         case 3:
             System.out.print("ENTER PAYMAYA NUMBER:");
             String paymaya=s.next();
             System.out.print("ENTER PASSWORD:");
             int passp=s.nextInt();
             break;    
         default:
             {
             System.out.println("INVALID KEYWORD:");
             }
     }   
     System.out.println("======================");
     System.out.println("SUCCESFULLY PAID......");
     System.out.println(disc+" "+"has been deducted to your account");
     System.out.println("======================");
     System.out.println("                   [TICKET INFO]");
     for (int j = 0; j < seat_num.length; j++)
     {
     System.out.println("=================");
     System.out.println("TICKET NUMBER: " +(j+1));
     System.out.println("REFERENCE NUMBER: " + randomNumber);
     randomNumber++;
     System.out.println("=================");
     }     
     System.out.println("YOUR TICKET HAS BEEN SUCCESFULLY SENT TO YOUR GMAIL...THANK YOU BOOKING");
    
     }
}
