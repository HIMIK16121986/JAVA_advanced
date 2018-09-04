package less2;

public class LambM {

	public static void main(String[] args) {
		MyInt2 myInt2=new MyInt2() {

			@Override
			public void doSomething(int x, int y) {
				System.out.println(x+y);
				
			}
			
		};
		
		
		
//		MyInt myInt=new MyInt() {
//
//			@Override
//			public void doSomething() {
//				System.out.println("Hello from lambda");
//				
//			}};
//			myInt.doSomething();
		}

	}


