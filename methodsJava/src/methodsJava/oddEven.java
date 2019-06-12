package methodsJava;

public class oddEven {

	public static void main(String[] args) {
		//Invoke method here
		System.out.println(isEven(0));
		

	}
	public static boolean isEven(int number){
		boolean result;
	    // if the number is even, set variable to true
		if(number % 2 ==0) {
			result = true;
		}
	    // otherwise, set variable to false
		else {	
			result = false;
		}
	    // return the variable
		return result;
	}

}
