 public class StringReverser {

        public static void main(String[] args) {
            String original = "Hello World";
            String reversed = "";

            System.out.println("Reversing string using a loop...");

            // --- START OF BLOCK TO REPLACE ---

            reversed = reverseStringRecursive(original);

            // --- END OF BLOCK TO REPLACE ---

            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }

        public static String reverseStringRecursive(String str){
            if(str == null || str.length() <= 1)return str;

            return reverseStringRecursive(str.substring(1)) + str.substring(0,1) ;
        }
    }

