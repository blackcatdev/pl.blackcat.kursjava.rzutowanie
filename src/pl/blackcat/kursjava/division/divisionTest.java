package pl.blackcat.kursjava.division;

public class divisionTest {

	public static void main(String[] args) {
		int integerValue1 = 19;
		int integerValue2 = 9;

		double doubleValue1 = 19;
		double doubleValue2 = 9;

		System.out.println("Integer/integer: " + integerValue1/integerValue2);
		System.out.println("Double/double: " + doubleValue1/doubleValue2);
		System.out.println("Integer/double: " + integerValue1/doubleValue2);
		System.out.println("Double/integer: " + doubleValue1/integerValue2);
	}
}
