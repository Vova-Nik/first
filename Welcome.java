import java.io.IOException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import Chapt9.Chapter9;

public class Welcome
{
	public static void main(String[] args) throws IOException {
		String greeting = "Welcome to my Core Java!";
		System.out.println(greeting);
		for(int i = 0; i < greeting.length(); i++)
			System.out.print("=");
		System.out.println();

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat dateOnly = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println(dateOnly.format(cal.getTime()));

		SimpleDateFormat timeOnly = new SimpleDateFormat("HH:mm:ss");
		System.out.println(timeOnly.format(cal.getTime()));

		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		System.out.println("11 Gallons to liters");
		System.out.println("21 Distance by sound");
		System.out.println("22 logical operations");
		System.out.println("23 Prime numbers 0...100");
		System.out.println("31 Array");
		System.out.println("41 Switch-Case");
		System.out.println("71 factorial");
		System.out.println("81 Classes");
		System.out.println("91 Package");


		int num = in.nextInt();
		switch (num) {
			case 0:
				System.out.print("Case: 0");
				break;
			case 11 :
				System.out.print("Case: 11");
				Shildt1_1 shildt1_1;
				shildt1_1 = new Shildt1_1();
				shildt1_1.displayInfo();
				break;
			case 21 :
				System.out.println("Case: 21");
				Shildt2_1 shildt2_1;
				shildt2_1 = new Shildt2_1();
				shildt2_1.displayInfo();
				break;
			case 22 :
				System.out.println("Case: 22");
				Shildt2_2 shildt2_2;
				shildt2_2 = new Shildt2_2();
				shildt2_2.run();
				break;
			case 23 :
				System.out.println("Case: 23");
				Shildt2_3 shildt2_3;
				shildt2_3 = new Shildt2_3();
				shildt2_3.run();
				break;
			case 31 :
				System.out.println("Case: 31");
				Shildt3_1 shildt3_1;
				shildt3_1 = new Shildt3_1();
				shildt3_1.run();
				break;
			case 41 :
				System.out.println("Case: 41");
				Shildt4_1 shildt4_1 = new Shildt4_1();
				shildt4_1.run();
				break;

			case 71 :
				System.out.println("Case: 71");
				Shildt7_1 shildt7_1 = new Shildt7_1();
				shildt7_1.run();
				break;

			case 81 :
				System.out.println("Case: 81");
				Shildt8_1 shildt8_1 = new Shildt8_1();
				shildt8_1.run();
				break;

				case 91 :
				System.out.println("Case: 91");
					Chapter9 chapter9 = new Chapter9();
					chapter9.run();
				break;



			default :
				System.out.print("Case: default");
		}


		in.close();
	}
}

