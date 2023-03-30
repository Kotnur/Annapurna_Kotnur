import java.util.Scanner;
public class InvertedPyramid{
	public static void main(String[] args){
	System.out.println("Enter a number of rows");
	Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
	for (int i = x; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
	}
}
