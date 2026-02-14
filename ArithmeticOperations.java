public class ArithmeticOperations{
	int a=0,b=0;
	public ArithmeticOperations(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void addNumbers(){
		int result = a+b;
		System.out.println("a :"+ a+" b :"+b+ " is : "+result);
	}
}