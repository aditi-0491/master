package singletonExamples;

public class TestLazyIntialization {

	//instaNCE is created in the public method
	//only when method will be called
	//but not thread safe when multi-threads are there
	private static TestLazyIntialization instance1;

	private TestLazyIntialization() {

	}

	public static TestLazyIntialization getInstanceMethod() {
		if (instance1 == null) {
			instance1 = new TestLazyIntialization();
		}
		return instance1;
	}

}
