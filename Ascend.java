// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a= (int) (Math.random() * lim);
		int b= (int) (Math.random() * lim);
		int c= (int) (Math.random() * lim);
		int minNumber1 = Math.min(a, b);
		int minNumber2= Math.min(b, c);
		int minNum= Math.min(minNumber1, minNumber2);
		int middleNum= Math.max(minNumber1, minNumber2);
		int maxNum1=Math.max(a, b);
		int maxNum2= Math.max(b, c);
		int maxNum= Math.max(maxNum2, maxNum1);
		System.out.println(minNum +" "+ middleNum +" "+ maxNum);
		System.out.println(maxNum+" "+ middleNum +" "+ minNum);

	}
}
