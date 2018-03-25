package homeWork1;

public class Triangle {
	public boolean lengthTest(int a , int b, int c){
		if ( a + b > c && a + c > b && b + c > a){
			return true;
		}else{
			return false;
		}
	}
	public boolean isPositive(int a , int b , int c){
		boolean ans = true;
		if (a <= 0 || b <= 0 || c <=0 ){
			ans = false;
			//System.out.println("The number of edge must be a positive number");
		}
		return ans;
	}
	public boolean isTriangle(int a, int b , int c){
		if(isPositive(a,b,c)){
			if(lengthTest(a,b,c)){
				
				return true;
			}else{
				//System.out.println("It can't be a triangle.");
				return false;
			}
		}else{
			return false;
		}
		
		
	}
	public String function(int a, int b, int c){
		if(isTriangle(a,b,c)){
			if (a == b && b == c){
				
				return "equilateral";
			}else if(a == b || b == c || a == c){
				
				return "isosceles";
			}else{
				
				return "scalene";
			}
		}else{
			return "noTriangle";
		}
	}
	

}
