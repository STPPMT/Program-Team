import java.util.Scanner;

class program {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String number = scn.nextLine();
		for (;;) {
			if (number.length() == 13) {
				String num[] = mt1(number);
				int num2[] = mt2(num);
				int sum = mt34(num2);
				sub(sum, num);
				break;
			} else {
				System.out.println("Plaese enter the 13 digit");
			}
		}
	}

	static String[] mt1(String n) {
		String x = n.replace(" ", "");
		x = x.replace("-", "");
		String j[] = new String[x.length()];
		System.out.print("Number :");
		for (int i = 0; i < x.length(); i++) {
			char a = x.charAt(i);
			j[i] = Character.toString(a);
			System.out.print(j[i] + " ");
		}
		return j;
	}

	static int[] mt2(String str[]) {
		int num[] = new int[str.length - 1];
		System.out.print("\n\nNumber\t\t");
		for (int i = 0; i < str.length; i++) {
			System.out.print("|" + str[i] + "  ");
		}
		System.out.print("\nMain number\t");
		for (int i = 13; i >= 2; i--) {
			if (i < 10) {
				System.out.print("|" + i + "  ");
			} else {
				System.out.print("|" + i + " ");
			}
		}
		System.out.print("|-\nResult\t\t");
		for (int i = 0, j = 13; i < str.length - 1; i++, j--) {
			int sum = Integer.valueOf(str[i]);
			num[i] = j * sum;
			if (num[i] < 10) {
				System.out.print("|" + num[i] + "  ");
			} else {
				System.out.print("|" + num[i] + " ");
			}
		}
		System.out.print("|-");
		return num;
	}

	static int mt34(int[] num) {
		int plus = 0, sum;
		System.out.print("\n\t\t");
		for (int i = 0; i < num.length; i++) {
			plus = plus + num[i];
			System.out.print(num[i] + "+");
		}
		System.out.print("\b=" + plus);
		sum = plus % 11;
		System.out.println("\n\t\t" + plus + "%11=" + sum);
		return sum;
	}

	static void sub(int i, String[] last) {
		int sum = 11 - i;
		if (i == 1) {
			sum = 0;
		}
		if (sum == Integer.valueOf(last[last.length - 1])) {
			System.out.println("Real Number");
		} else {
			System.out.println("False");
		}
	}
}