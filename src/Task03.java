public class Task03 {
    public static void main(String[] args) {
        char[] myArray = new char[5];
        myArray [0] = 'a';
        myArray [1] = 'b';
        myArray [2] = 'c';
        myArray [3] = 'd';
        myArray [4] = 'e';

        String text = String.copyValueOf(myArray);
        System.out.println(text);

        myArray [3] = 'h';

        text = String.copyValueOf(myArray);
        System.out.println(text);
    }
}
