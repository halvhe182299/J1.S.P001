
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //enter size of array
        int sizeOfArray=getInteger("Enter size of array:",
                "Size of array must be integer number", 1, Integer.MAX_VALUE);
        //Declare array
        int[] array = new int[sizeOfArray];
        //Generate random integer in number range for each array element
        BubbleSort.generateRandomNumberInRange(array);
        //Display array before
        BubbleSort.displayArray(array, "Unsorted array: ");
        //sort array
        BubbleSort.sortArray(array);
        //Display array after
        BubbleSort.displayArray(array, "Sorted array: ");
    }
    /**
     * This function is used to get an integer number from user input. If
     * user's input is wrong, tell error and  prompt user enter again
     * @param message:s
     * @param error:
     * @param min:
     * @param max:
     * @return 
     */
    public static int getInteger(String message, String error, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Khong duoc de trong");
                } else {
                    int number = Integer.parseInt(input);
                    if (number >=min && number <=max) {
                        return number;
                        //break;
                    } else {
                        System.err.println("Ban phai nhap trong khoang "+ min+"-"+max);
                    }
                }
            } catch (Exception e) {
                System.err.println(error);
            }

        }
    }
}
