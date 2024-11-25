// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations

		System.out.println(div(15,7));   // 25 / 7
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		int num1 = x1;
		if (x2<0){
			for (int i = 0; i > x2; i--) {
				num1--;
			}	

		}
		if (x2>0){
			for (int i = 0; i < x2; i++) {
				num1++;
			}	

		}
		return num1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		int num1 = x1;
		if (x2<0){
			for (int i = 0; i < x2; i--) {
				num1++;
			}	

		}
		if (x2>0){
			for (int i = 0; i < x2; i++) {
				num1--;
			}	

		}
		return num1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		int num1 = x1;
		if (x2>0){
			for (int i = 1; i < x2; i++) {
				x1 = plus(x1, num1);
			}
		}
		if (x2<0){
			for (int i = -1; i > x2; i--) {
				x1 = plus(x1, num1);
			}
			x1 = -x1;
		}
		return x1;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int result = 1;
		int calc = x;
		if (n == 0){
			return result;
		}
		for (int i = 1; i < n; i++) {
			calc = times(calc, x);
		}
		return calc;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		int resultpos = 1;
		int resultneg = -1;
		int calc = 0;
		int num1 = x1;
		int num2 = x2;

		if ((x1<0) && (x2>0)){
			while (times(num1, -1)>=plus(plus(calc, x2), x2)){
				resultneg--;
				calc = plus(calc, num2);
			}
			return resultneg;
		}
		else if ((x1>0) && (x2>0)){
			while (num1>=plus(plus(calc, x2), x2)){
				resultpos++;
				calc = plus(calc, num2);
			}
			return resultpos;
		}
		else if ((x1>0) && (x2<0)){
			while (times(num1, -1)<=plus(plus(calc, x2), x2)){
				resultneg--;
				calc = plus(calc, num2);
			}
			return resultneg;
		}
		else if ((x1<0) && (x2<0)){
			while (num1<=plus(plus(calc, x2), x2)){
				resultpos++;
				calc = plus(calc, num2);
			}
			return resultpos;
		}
		return 0;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		int num1 = x1;
		int num2 = x2;
		int calc = div(num1, num2);
		int result= minus(num1,times(calc, num2));
		return result;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		int beforenum =1;
		int afternum = 2;
		int sqrt = x;

		while (x>pow(beforenum, 2)){
			if ((pow(beforenum, 2)<sqrt) && (pow(afternum, 2)>sqrt)){
				return beforenum;
			}
			beforenum++;
			afternum++;
		}
		return sqrt;
	}	
	
}