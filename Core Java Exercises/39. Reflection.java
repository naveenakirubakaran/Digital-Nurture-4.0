import java.lang.reflect.Method;

class MyClass {
    public void sayHello() {
        System.out.println("Hello from MyClass!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("MyClass");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("Method: " + method.getName());
            if (method.getName().equals("sayHello")) {
                method.invoke(obj);
            }
        }
    }
}

## Output
Loaded class: MyClass  
Method: sayHello  
Invoking method sayHello...  
Hello from MyClass!
