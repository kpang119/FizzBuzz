
public class FizzBuzz {

	public static void main(String[] args) {
		for(int x = 1;x <= 100; x++){
			if(fizzBuzz(x)){
				System.out.println(x+" FizzBuzz");
			}else if(fizz(x)){
				System.out.println(x+" Fizz");
			}else if(buzz(x)){
				System.out.println(x+" Buzz");
			}else{
				System.out.println(x);
			}
		}
	}
	public static boolean fizzBuzz(int x){
		return(x%3==0 && x%5==0);
	}
	public static boolean fizz(int x){
		return(x%3==0);
	}
	public static boolean buzz(int x){
		return(x%5==0);
	}
}
