package Demo;

public class B {

	public static void main(String[] args) {
		int ab = 50;
		char m = 'a';
		float j = 0.2f;
		boolean b = true;
		double x = 0.09;
		String name = "vamsi";

		A obj = new A();

		obj.i = 10;
		obj.name = "sai";
		obj.abc = 'm';
		obj.bb = false;
		obj.d = 0.6;
		obj.f = 1.89f;
		
		System.out.println(ab + j + x);
		System.out.println(m);
		System.out.println(j);
		System.out.println(b);
		System.out.println(x);
		System.out.println(name);
		System.out.println(obj.i +"  "+obj.name);
		System.out.println(obj.name);
		System.out.println(obj.abc);
		System.out.println(obj.bb);
		System.out.println(obj.d);
		System.out.println(obj.f);

	}

}
