package week1.day1;



public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int num = 153, sum =0;
		int num2 = num;
		while (num>0) {
		  int reminder = num % 10;
			int quotient = num / 10;
			sum = sum + reminder * reminder * reminder;
			//or sum = sum + Math.pow(reminder,3);
			num = quotient;
			
	}
		if (sum==num2) {
			System.out.println("sum= " +sum);
			System.out.println("The number " + num2 + " is a Armstrong number");
		
			
		}
		else {
			System.out.println("sum= " +sum);
			System.out.println("The number " + num2 + " is not a Armstrong number");
		}
	
}
}
