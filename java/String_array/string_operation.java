package String_array;

public class string_operation {
    public static void main(String[] args) {
        String ss= "hello world";

        //length-give the length of the string
        System.out.println(ss.length());

        //charAt()-give the character with respective given index value
        System.out.println(ss.charAt(6));

        //indexOf() - give the position with respective given word or character.
        System.out.println(ss.indexOf("world"));

        //lastIndexOf()- give the position with the given word or character. but it start search from last position.
        System.out.println(ss.lastIndexOf("r"));

        //contains- it will check whether the word or character is there or not.
        System.out.println(ss.contains("o wo"));

        //startsWith() and endsWith() check the begining or ending specifically..
        System.out.println(ss.endsWith("word"));

        //toUpperCase(), toLowerCase() is used to convert the upper to lower or lower to upper case.
        System.out.println(ss.toUpperCase());
        System.out.println(ss.toLowerCase());

        //subString(start , end)- correctly pull the sub string from the parent string.
        System.out.println(ss.substring(0,6));
        System.out.println(ss.substring(6));//if you leave the end point it will fully cover from the given staring point.

        //replace(current word,replace word)- it replace the string but it no change the store string "hello word" because it is immutable.
        System.out.println(ss.replace("word" ,"java"));
        System.out.println("the originally it will not change it just change and display the photo copy not store string due to immutable");
        System.out.println(ss);

        //split(word)-split the white space by given any character or the special charater like "," ";" .
        System.out.println(ss.split(",")); 

        //equals() vs == -This is an important one. == checks if two variables point to the exact same object in memory. .equals() checks if the content is the same — which is what you almost always want for strings.
        System.out.println("helo word".equals(ss));

        //compareTo() - compare alphabetical order:return 0 if equal , -1 - if the calling string comes first alphabetically,1 - if it comes after.
        System.out.println(ss.compareTo("hello java"));

        //isEmpty()/isBlank() isEmpty() checks for zero length (""). isBlank() also treats whitespace-only strings ("   ") as empty.
        System.out.println(ss.isEmpty());

        //concat() is use to concatenate the two string.
        System.out.println(ss.concat(" java"));

        System.out.println(ss + " it not change because it is imumtable");
        }
    
}
