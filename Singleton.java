package SingletonDP;
class Singleton1 {
	static Singleton1 single=null;
	private Singleton1() {
		
	}
	public static Singleton1 getSingleton() {
		if (single==null)
			single=new Singleton1();
		return single;
	}
	
}
public class Singleton{
	public static void error(){
		System.out.println("H from");
		System.out.println("Hlo from");
	}
	public static void main(String[] args) {
//		Singleton1 s1=new Singleton1();
		Singleton1 s1=Singleton1.getSingleton();
		Singleton1 s2=Singleton1.getSingleton();
		if(s1==s2) {
			System.out.println("OBJECTS ARE OCUPPIED IN SAME MEMORY SPACE"+s1+" "+s2);
		}
		Pattern p=new Pattern();
		p.print();

		}
}
	
	class Pattern{
		void print() {
			Singleton1 s3=Singleton1.getSingleton();
			System.out.println("I AM IN PATTERN CLASS BUT OBJECT MEMORY SPACE IS"+" "+s3);
		}
	}

