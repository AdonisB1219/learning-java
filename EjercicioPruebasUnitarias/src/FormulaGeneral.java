
public class FormulaGeneral {
	//signo=1 -> x1
	//signo=2 -> x2
	public double resolver(int a, int b, int c, int signo) {
		return (signo == 1)?((-b+Math.sqrt((double)b*b-(4*a*c)))/(2*a)):((-b-Math.sqrt((double)b*b-(4*a*c)))/(2*a));
	}
	
}
