package week4.day1;

public class Java {
	
	public void reportStepMethod(String message,String status) {
		System.out.println(message+status);
		
	}

	public void reportStepMethod(String message,String status,boolean snap) {
		System.out.println(message+status+snap);
	}
	
	public static void main(String[] args) {
		Java option = new Java();
		option.reportStepMethod("Hi", "Message ");
		option.reportStepMethod("Hello", "status sample", true);

	}

}
