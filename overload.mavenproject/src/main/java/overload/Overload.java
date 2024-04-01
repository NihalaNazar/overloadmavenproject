package overload;

public class Overload {
	static void area(float x) {
		System.out.println("the area of square is " + (x * x));
	}

	static void area(int x, int y) {
		System.out.println("the area of rectangle is " + (x * y));
	}

	static void area(int x) {
		System.out.println("the area of circle is " + (x * x) * 3.14);
	}

	public static void main(String args[]) {
		Overload.area(2, 3);
		Overload.area(10f);
		Overload.area(5);
	}
}
