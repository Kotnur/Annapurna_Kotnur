import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args){
	System.out.println("Enter a 3 digit number");
	Scanner sc = new Scanner(System.in);
	int number= sc.nextInt();
	int x,y,z=0;
	x=number;
	while(x!=0){
	y=x%10;
	z += Math.pow(y,3);
	x/=10;
	}
	if(z==number){
	System.out.println(number+" is an Armstrong number");
	}
	else{
	System.out.println(number+" is not an Armstrong number");
	}
	}
	}
	
