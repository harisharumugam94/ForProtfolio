package String_array;


//the stringbuffer is like the string but it is mutable(mean we can change the original string)
public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("harish");
        s1.append(" arumugam");        // adds to the end -> "Hello World"
        System.out.println(s1);
        s1.insert(5, ",");          // inserts at index -> "Hello, World"
        System.out.println(s1);
        s1.replace(0, 5, "Hi");      // replaces range -> "Hi, World"
        System.out.println(s1);
        s1.delete(0, 2);             // removes range -> ", World"
        System.out.println(s1);
        s1.reverse();                 // reverses the whole thing
        System.out.println(s1);
        s1.length();                  // current length
        System.out.println(s1);
        s1.charAt(0);                  // character at index
        System.out.println(s1);
        s1.toString();                 // converts back to a normal String
        System.out.println(s1 +" it convert from string buffer to string");
        StringBuffer s = new StringBuffer(s1);                 //converting string to string buffer.
        System.out.println(s + " it convert back to string buffer");
    }
    
}
