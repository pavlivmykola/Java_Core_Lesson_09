package ua.lviv.lgs.task2;

public class Methods {
	private int a,b;

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void check() throws MyException {
		if ((a<0) & (b<0)) {
			throw new IllegalArgumentException();
		}
		if ((a==0) & (b!=0)) {
			throw new ArithmeticException();
		}
		if ((a!=0) & (b==0)) {
			throw new ArithmeticException();
		}
		if ((a==0) & (b==0)) {
			throw new IllegalArgumentException();
		}
		if ((a>0) & (b>0)) {
			throw new MyException();
		}
	}
	
	public void methods() {
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
	}
}
