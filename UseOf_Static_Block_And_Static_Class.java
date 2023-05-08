class Abcd {
	void dis() {
		System.out.println("normal method");
	}
	static {
		System.out.println("static method of outer class");
	}
}
public class UseOf_Static_Block_And_Static_Class {
	static {
		System.out.println("static method of main class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static method of main method in main class");
		Abcd ob = new Abcd();
		ob.dis();

	}

}

/*
output :- 

static method of main class
static method of main method in main class
static method of outer class
normal method

*/