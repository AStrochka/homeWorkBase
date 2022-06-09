public class Task01 {
    public static void main(String[] args) {
String hi = "                Hello ";
String world = " World!";
char newLine = '\n';

String hiTrimmed = hi.trim();

String result = hiTrimmed + world + newLine ;
String repeated = result.repeat(3);
System.out.println(repeated);
    }
}
