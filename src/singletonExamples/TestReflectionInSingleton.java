package singletonExamples;

import java.lang.reflect.Constructor;

public class TestReflectionInSingleton {
	    public static void main(String[] args) {
	    	TestEagerInitialize instanceOne = TestEagerInitialize.getInstanceMethod();
	    	TestEagerInitialize instanceTwo = null;
	        try {
	            Constructor[] constructors = TestEagerInitialize.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	            	//instanceTwo = (TestEagerInitialize) constructor.newInstance();
	                constructor.setAccessible(true);
	                instanceTwo = (TestEagerInitialize) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println(instanceOne.hashCode());
	        System.out.println(instanceTwo.hashCode());
	    }
	 
	}
