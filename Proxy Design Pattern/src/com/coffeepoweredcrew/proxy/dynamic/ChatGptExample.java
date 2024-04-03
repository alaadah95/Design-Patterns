package com.coffeepoweredcrew.proxy.dynamic;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class ChatGptExample {
	
	// Interface representing a simple service
	interface Service {
	    void doSomething();
	}

	// Implementation of the Service interface
	static class ServiceImpl implements Service {
	    @Override
	    public void doSomething() {
	        System.out.println("Doing something in the service implementation.");
	    }
	}

	// Invocation handler for logging proxy
	static class LoggingHandler implements InvocationHandler {
	    private Object target;

	    public LoggingHandler(Object target) {
	        this.target = target;
	    }

	    @Override
	    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	        System.out.println("Logging: Before invoking method: " + method.getName());
	        Object result = method.invoke(target, args);
	        System.out.println("Logging: After invoking method: " + method.getName());
	        return result;
	    }
	}

	// Invocation handler for security proxy
	static class SecurityHandler implements InvocationHandler {
	    private Object target;

	    public SecurityHandler(Object target) {
	        this.target = target;
	    }

	    @Override
	    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	        // Simulating security check
	        if (method.getName().equals("doSomething")) {
	            System.out.println("Security: Permission granted.");
	            return method.invoke(target, args);
	        } else {
	            System.out.println("Security: Permission denied.");
	            return null;
	        }
	    }
	}

	    public static void main(String[] args) {
	        // Create an instance of the real service
	        Service realService = new ServiceImpl();

	        // Create a logging proxy
	        Service loggingProxy = (Service) Proxy.newProxyInstance(
	                Service.class.getClassLoader(),
	                new Class[]{Service.class},
	                new LoggingHandler(realService)
	        );
	        
	        // Create a security proxy on top of logging proxy
	        Service securityProxy = (Service) Proxy.newProxyInstance(
	                Service.class.getClassLoader(),
	                new Class[]{Service.class},
	                new SecurityHandler(loggingProxy)
	        );

	        // Call the method through the security proxy
	        securityProxy.doSomething();
	    }

	 

}
