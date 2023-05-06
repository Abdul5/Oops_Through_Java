class Var_Test {
	static int a = 5;
	void display() {
		a++;
	}
	void print() {
		System.out.println(a);
	}
}
public class UseOf_Static_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var_Test ob = new Var_Test();
		Var_Test ob1 = new Var_Test();
		ob.display();
		ob.print();
		ob1.print();
		

	}

}
/*
output :-
6
6

*/