package Constructor_Prob;

public class ParaConstructor {
	int len , wid;
	ParaConstructor(int x, int y) {
		len = x;
		wid = y;
	}
	void dis() {
		int area = len * wid;
		System.out.print(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructor ob = new ParaConstructor(10,20);
		ob.dis();

	}

}
