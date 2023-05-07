class abc {
	static int a = 5;
	int b = 20;
	void dis() {
		a++;
	}
	static void print() {
	//	b = 10;   we didn't take non static class var here because it doesn't pass the ref of that var   
		int b = 20;  // it is not a class var 
		System.out.println(a);  // here we print static var of the class
		System.out.println(b); // it is a method var
		
	}
}
public class UseOf_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc ob = new abc();
		ob.dis();
		abc.print(); // here i use class name to execute static method

	}

}
/*

output :-
6
20

*/