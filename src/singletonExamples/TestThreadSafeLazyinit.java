package singletonExamples;

public class TestThreadSafeLazyinit {
	//instaNCE is created in the public method
	//only when method will be called
	//thread safe when multi-threads are there- used sycnhronized to allow only one thread
	//to access method at one time
	//cost is more 
		private static TestThreadSafeLazyinit instance1;

		private TestThreadSafeLazyinit() {

		}

		public static synchronized TestThreadSafeLazyinit getInstanceMethod() {
			if (instance1 == null) {
				instance1 = new TestThreadSafeLazyinit();
			}
			return instance1;
		}

}
