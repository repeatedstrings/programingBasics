public class ProgrammingBasics {


    public static void main(String args[]) {
        String msg = "Hello MINECRAFT World!";
        msg+=":  "+5;
        printMsg(msg);

        // let's add two numbers and print them!
         int sum = addTwoNums(5, 7);

         //error trying to pass an int when the function is expecting a String
         printMsg("\"\"+sum = "+""+sum);

         //or we can
        printMsg("String.valueOf(sum) = " + String.valueOf(sum));

        //how about
        printMsg("Integer.toString(sum) = " + Integer.toString(sum));

//        String.valueOf took an average of 0.140 us and ""+ took an average of 0.243 us
//        String.valueOf took an average of 0.063 us and ""+ took an average of 0.058 us
//        String.valueOf took an average of 0.044 us and ""+ took an average of 0.058 us
//        This suggest that using String.valueOf will save 0.014 micro-seconds. However, using "" + will save you, the developer far, far more than that in time. (possibly a million times over)
//        As I have mentioned in previous article, if performance is really critical, you are better off writing the number as text to the direct ByteBuffer which will be written to the device where the text will be going. This creates no objects at all and is clearly OTT for 99% of use cases.
    }
    private static void printMsg(String message) {
        System.out.println(message);
    }

    private static int addTwoNums(int num1, int num2){
        return num1 + num2;
    }
}
