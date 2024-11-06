// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue= Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int years= Integer.parseInt(args[2]);
		double futureValue = (double) currentValue * Math.pow(((double)rate +1.0),(double)years) ;
		System.out.println("After "+years +" years, a "+currentValue+ "$ saved at "+(double)rate+ "% will yield "+ (int)(futureValue/100 ) +"$");
	}
}