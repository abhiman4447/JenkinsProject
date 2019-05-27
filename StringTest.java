package testProject;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc";
		String s4 = new String("abc");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		if(s2== s3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if(s2 instanceof Object) {
			System.out.println("is object");
		}
		if(s1 instanceof Object) {
			System.out.println("is object");
		}
		if(s3 instanceof Object) {
			System.out.println("is object");
		}
		
		
		
	}

}
