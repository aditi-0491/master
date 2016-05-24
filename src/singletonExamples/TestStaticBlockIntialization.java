package singletonExamples;

public class TestStaticBlockIntialization {
	
	//instance is  created before it is to be used
	//will be created if this instance is not even used in application
	//not a best practice
	//can use exception handling here for instance creation part
	private static TestStaticBlockIntialization instance1;

	private TestStaticBlockIntialization() {

	}

	static{
		try{
			if (instance1 == null) {
				instance1 = new TestStaticBlockIntialization();
				}
		}
			catch(Exception e){
			}
	}
	public static TestStaticBlockIntialization getInstanceMethod() {
		return instance1;
	}
}
