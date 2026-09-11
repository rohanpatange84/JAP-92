package p2;

import p1.A;
public class D extends A{
	public static void main(String[] args) {
		D a1 = new D();

		// System.out.println(a1.pri);

		// System.out.println("default "+a1.defa);

		System.out.println("protected "+a1.proc);

		System.out.println("public "+a1.pub);
		
		// a1.f1();

		// a1.f2();

		a1.f3();
		
		a1.f4();
	}
}
