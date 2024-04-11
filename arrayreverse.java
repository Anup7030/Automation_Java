package Java_Practice;

public class arrayreverse {

	public static void main(String[] args) {
		
		int[] array= {10,20,30,40,50};
		
		System.out.println("The original Array Elements");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println("The reverse array Element are");
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i] + " ");
		}
	}

}
