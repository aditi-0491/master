package singletonExamples;

public class TestEagerInitialize {
	
	
	//instance is  created before it is to be used
	//will be created if this instance is not even used in application
	//not a best practice
	//cannot use exception handling here for instance creation part
	private static TestEagerInitialize instance1=new TestEagerInitialize();
	private TestEagerInitialize(){

	}
	public static TestEagerInitialize getInstanceMethod(){
		return instance1;
	}

}
