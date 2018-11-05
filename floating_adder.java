
public class floating_adder {
	public static  int a;
	public static int b;
	public static void main(String args[]) {
		a = 0b01000010111111010000000000000000;
		b = 0b11000001101111000000000000000000;
		//für negative in der Methode invert benutzen
		
	}
	public static void addFloat(int f1,int f2) {
		
	float fl1 = Float.intBitsToFloat(f1);
	float fl2 = Float.intBitsToFloat(f2);
	float sum = fl1 + fl2;
	System.out.printf("%.20f", fl1);
	System.out.print(" + ");
	System.out.printf("%.20f", fl2);
	System.out.print(" = ");
	System.out.printf("%.20f", sum);
	System.out.println("");
	
	}
	public static float invertf(float f) {
		f *= -1;
		return f;
	}
	public static void multFloat(int f1 , int f2) {
		float fl1 = Float.intBitsToFloat(f1);
		float fl2 = Float.intBitsToFloat(f2);
		float product = fl1 * fl2;
		System.out.printf("%.20f", fl1);
		System.out.print(" x ");
		System.out.printf("%.20f", fl2);
		System.out.print(" = ");
		System.out.printf("%.20f", product);
		System.out.println("");
	}
}
