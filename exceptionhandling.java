package day2;

public class exceptionhandling {

	public exceptionhandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
		// TODO Auto-generated method stub

	
		
		   
		    {
		        try
		        {
		            int A[] = {10, 0, 8, 3, 5};
		            int r;
		            r = A[0] / A[1];
		            System.out.println(r);

		            System.out.println(A[10]);
		        }
		        catch (ArithmeticException e)
		        {
		            System.out.println(e);
		        }
		        catch (ArrayIndexOutOfBoundsException e)
		        {
		            System.out.println(e);
		        }
		        System.out.println("End of Program");
		    }
		
	}
	