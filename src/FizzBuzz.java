
public class FizzBuzz {

	public static void main(String[] args) {
		for(int x = 1;x <= 100; x++){
			if(x%3==0 && x%5==0){
				fizzBuzz(x);
			}else if(x%3==0){
				fizz(x);
			}else if(x%5==0){
				buzz(x);
			}else{
				System.out.println(x);
			}
		}
	}
	public static void fizzBuzz(int x){
		System.out.println(x+" FizzBuzz");
	}
	public static void fizz(int x){
		System.out.println(x+" Fizz");
	}
	public static void buzz(int x){
		System.out.println(x+" Buzz");

	}
}
