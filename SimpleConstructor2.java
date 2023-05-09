package Constructor_Prob;

public class SimpleConstructor2 {
	static int a = 0;
	SimpleConstructor2() {
		a++;
	}
	void dis() {
		System.out.print(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleConstructor2 ob1 = new SimpleConstructor2();
		SimpleConstructor2 ob2 = new SimpleConstructor2();
		SimpleConstructor2 ob3 = new SimpleConstructor2();
		ob1.dis();

	}

}

/*
output :- 

3

*/