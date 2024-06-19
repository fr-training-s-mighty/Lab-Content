package exception;

public class TestArguments {
	
	public static void main(String[] args) {
		int sum = 0;
		for(String ele:args) {
			System.out.println(ele);
			sum+= Integer.parseInt(ele);
		}
		
	}
}
