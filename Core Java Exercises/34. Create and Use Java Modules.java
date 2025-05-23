module-info.java in com.utils

java
Copy code
module com.utils {
    exports com.utils;
}
Utils.java

java
Copy code
package com.utils;
public class Utils {
    public static String greet() {
        return "Hello from Utils!";
    }
}
module-info.java in com.greetings

java
Copy code
module com.greetings {
    requires com.utils;
}
Main.java

java
Copy code
import com.utils.Utils;
public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.greet());
    }
}

## Output
  Hello from Utils!
