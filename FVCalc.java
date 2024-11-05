// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue= Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) /100 ;
		int years= Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow((rate +1),years) ;
		System.out.println("After "+years +" years,"+currentValue+ "$ saved at "+ (rate*100)+ "% will yield "+ (int)futureValue +"$");
	}
}