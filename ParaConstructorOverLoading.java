package Constructor_Prob;

public class ParaConstructorOverLoading {
	int len , wid;
	ParaConstructorOverLoading(int x, int y) {
		len = x;
		wid = y;
	}
	int dis() {
		return len * wid;
	}
	ParaConstructorOverLoading() {
		len = 10;
		wid = 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructorOverLoading ob1 = new ParaConstructorOverLoading();
		ParaConstructorOverLoading ob2 = new ParaConstructorOverLoading(20 , 20);
		int a = ob1.dis();
		System.out.println(a);
		int b = ob2.dis();
		System.out.println(b);

	}

}

/*
 output :-
 200
 400
 */
