package exp1;

public class threelargestnum {

	public threelargestnum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int num1 = 85;
		int num2 = 67;
		int num3 = 60;
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.print("num1 is larger than num2 and num3");
	}
		else if(num2>=num1 && num2>=num3)
		{
			System.out.print("num2 is larger than num1 and num2");
		}
		else
		{
			System.out.print("num3 is larger than num1 and num2");
		}

}
}