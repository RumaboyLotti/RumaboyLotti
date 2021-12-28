import java.util.Scanner;

public class TimeCounter {
	public void main (String[] args) {
        int rice;
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		//your code goes here==
		int hours = days *24;
		int minutes = hours*60;
		int s = minutes*60;

        rice = s;

        System.out.println(rice);

		scanner.close();
		
	}


}			