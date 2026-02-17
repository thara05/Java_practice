package exp1;

public class triangle_star {

	public triangle_star() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	int n = 5;
		
		for(int i=0;i<n;i++){//5
		    for(int s=0;s<(n-(i+1));s++){
		        System.out.print("_ ");
		    }
		    for(int j=0;j<(i*2)+1;j++)
		    System.out.print("* ");
		    System.out.println();
		}
		for(int i=n-2;i>=0;i--){//5
		    for(int s=0;s<(n-(i+1));s++){
		        System.out.print("_ ");
		    }
		    for(int j=0;j<(i*2)+1;j++)
		    System.out.print("* ");
		    System.out.println();
		}
	}
}
