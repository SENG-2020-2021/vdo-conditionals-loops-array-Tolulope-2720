class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
   byte daysDefaulted[]={1,17,19,24,30};
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
   final byte amountPerday=118;
   final float paid=1800;
  
   // declare all the variables needed for your calculations
    float toPay=0f,totalAmount=0f,extraAmount,leftToPay;
    byte daysPaid,daysNotPaid;
    byte i=0;//for iteration
   
   // calculate and print total amount the debtor is to pay using for each loop
    for(byte x : daysDefaulted)
    totalAmount+=amountPerday;
    System.out.println("Total amount to pay is "+totalAmount);
   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
    daysPaid=(int)(paid/amountPerday);
    System.out.print("days debtor paid for ");
    for(i=0;i<5 &&i<daysPaid;i++){
      System.out.print(daysDefaulted[i]+",");
    }
    if(daysPaid==0)
    System.out.print("None");
    System.out.println("");
    if (paid%amountPerday>0&&i<5 ){
      leftToPay=amountPerday-(paid%amountPerday);
    System.out.println("You did not complete day "+daysDefaulted[i]+ " amount left to pay is "+leftToPay);
    }
   // calculate amount the debtor is left to  pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
   if(totalAmount>paid){
     toPay=totalAmount-paid;
     daysNotPaid=(5-(byte)(paid/amountPerday));
   System.out.println("Amount left to pay is "+toPay +" you did not pay for "+daysNotPaid+" day(s)");
   }
   else if(totalAmount==paid){
     System.out.println("You paid the exact amount");
   }
   else{
     extraAmount=paid-totalAmount;
     System.out.println("You paid extra by "+extraAmount);
   }
  }
}