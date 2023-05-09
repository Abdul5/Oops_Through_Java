package Constructor_Prob;

public class SimpleConstructor {
	int a, b;
	SimpleConstructor() {
		a = 10;
		b = 5;
	}
	void dis() {
		int sum = a + b;
		System.out.print(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleConstructor ob = new SimpleConstructor();
		ob.dis();

	}

}
