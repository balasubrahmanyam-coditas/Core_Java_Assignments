class Simple{
	int result;
	int number1 = 45;
	int number2 = 32;
        public void add(){
		result=number1+number2;
		System.out.println("Addition is"+ result);
	}
	public void subtract(){
		result=number1-number2;
		System.out.println("Subtract is"+ result);
	}
	public void multiply(){
		result=number1*number2;
		System.out.println("Multiply is"+ result);
	}
	public void division(){
		result=number1/number2;
		System.out.println("Division is"+ result);
	}
}
public class Simplecalculator{
	public static void main(String args[]){
	Simple calculator=new Simple();
	calculator.add();
	calculator.subtract();
	calculator.multiply();
	calculator.division();
	}
}
