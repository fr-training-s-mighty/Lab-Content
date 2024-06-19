package array;

public class PointTest {

	public static void main(String []args) {
		PointArray abc = new PointArray();
		Point[] arr = abc.createArray();
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
