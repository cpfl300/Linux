public class Recursive {

	
	
	public static void main(String[] args) {
		Recursive a = new Recursive();
		long result = a.fibo(9);
		System.out.println(result);
	}

	private long fibo(long i) {
		if(i <= 0){
			return 0; //;;;;;;;
		}
		
		
		if(i == 1){
			return 2;
		}
		if(i == 2){
			return 3;
		}
		
		return fibo(i-1)*fibo(i-2);
		
	}
	
}
