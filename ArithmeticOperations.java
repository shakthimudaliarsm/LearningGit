public class ArithmeticOperations{
	int a=0,b=0;
	public ArithmeticOperations(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void addNumbers(){
		int result = a+b;
		System.out.println("The sum of a :"+ a+" b :"+b+ " is : "+result);
	}

	public void subNumbers(){
		int result = a-b;
		System.out.println("The sub of a :"+ a+" b :"+b+ " is : "+result);
	}

	public void multiplyNumbers(){
		int result = a*b;
		System.out.println("The multiplication of a :"+ a+" b :"+b+ " is : "+result);
	}
}