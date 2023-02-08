class Multi{
	
	public void output(){
	int value;
	for(value=1;value>=5;value++){	//=,>=,++ operators covered
	   System.out.println("value");
}
}
	public void evenOrOdd(){
	int value1=6;
	if(value1%2==0){		//== opertors covered
	     System.out.println("Even");
	}else{
	     System.out.println("Odd");
}
}
}
public class Operator{
	public static void main(String args[]){
	int input1 = 88;
	int input2 = 43;
	System.out.println(input1 + input2);	//Addition
	System.out.println(input1 - input2);	//Subtract	
	System.out.println(input1 * input2);	//Mulitiplication
	System.out.println(input1 % input2);	//Division
	System.out.println(input1 > input2);	//Greater or less
	System.out.println(input1 < input2);
	System.out.println(input1 / input2);
	System.out.println(input1 & input2);	// Bitwise And 
	System.out.println((input1 > input2) && (input1 < input2));	//Logical And	
	System.out.println((input1 > input2) || (input1 < input2));	//Logical Or
	System.out.println(!(input1 == input2));	//Equal to
	System.out.println(input1 <= input2);		//GreaterEqual to or LessEqual to
	System.out.println(input1 >= input2);
	System.out.println(~input1);			//Not
	System.out.println(input1 += 23);		//addequal,subtractequal,muliplyequal,divisionequal
	System.out.println(input2 -= 23);
	System.out.println(input1 *= 23);
	System.out.println(input2 %= 23);
	System.out.println((input1 > input2)?input1:input2);	//tenary
	input1 = 5;
	System.out.println(input1--);		//Decreament --
	System.out.println(input1);
	int input3 = 20,input4 = 5;
	System.out.println(input3 >> input4);	//Shift >> or <<
	System.out.println(input3 << input4);
	Multi obj = new Multi();
	obj.output();
	obj.evenOrOdd();
	
}
}