class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
   int days_defaulted[]={1,17,19,24,30};
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
   int amount_perday=348;
   final float paid=1700;
  
   // declare all the variables needed for your calculations
    float to_pay=0f,total_amount=0f,extra_amount;
    int days_paid,days_notpaid,left_topay;
    int i=0;//for iteration
   
   // calculate and print total amount the debtor is to pay using for each loop
    for(int x : days_defaulted)
    total_amount+=amount_perday;
    System.out.println("Total amount to pay is "+total_amount);
   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
    days_paid=(int)(paid/amount_perday);
    System.out.print("days debtor paid for ");
    for(i=0;i<5 &&i<days_paid;i++){
      System.out.print(days_defaulted[i]+",");
    }
    System.out.println("");
    if (paid%amount_perday>0&&i<5 ){
      left_topay=amount_perday-(int)(paid%amount_perday);
    System.out.println("You did not complete day "+days_defaulted[i]+ " amount left to pay is "+left_topay);
    }
   // calculate amount the debtor is left to  pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
   if(total_amount>paid){
     to_pay=total_amount-paid;
     days_notpaid=(5-(int)(paid/amount_perday));
   System.out.println("Amount left to pay is "+to_pay +" you did not pay for "+days_notpaid+" day(s)");
   }
   else if(total_amount==paid){
     System.out.println("You paid the exact amount");
   }
   else{
     extra_amount=paid-total_amount;
     System.out.println("You paid extra by "+extra_amount);
   }
  }
}