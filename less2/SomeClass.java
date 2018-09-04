package less02;

public class SomeClass {
	int a=5;
	int b=1;
	public void someMethod(MyInt myInt) {
		myInt.doSomething();
	}
	
	public void someAnotherMethod(MyInt2 myInt2) {
		myInt2.doSomething(a,b);
	}
}
