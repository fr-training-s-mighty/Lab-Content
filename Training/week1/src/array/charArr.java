package array;

public class charArr {
	
	public static char[] reateArray() {
		char[] ch;
		
		ch = new char[26];
	
		for(int i = 0 ; i < 26 ; i++) {
			ch[i] = (char) ('A' + i);
		}
		
		return ch;
		
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello can you hear me I've been in california dreaming about who we used to be ");
		System.out.println(reateArray());
		
		
	}

}
