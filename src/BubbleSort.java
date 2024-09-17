
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */  
public class BubbleSort {
    /**
     * This function is used to generate random number in range of the array
     * @param array 
     */

    static void generateRandomNumberInRange(int[] array) {
        Random random = new Random();
        for(int i=0; i<array.length; i++){
            //generate random number
            int randomNumber=random.nextInt(array.length);
            //assign value to array's element
            array[i]=randomNumber;  
        }
    }

    static void displayArray(int[] array, String message) {
        System.out.print(message);
        System.out.print("[");
        for(int i =0; i<array.length-1; i++){
            System.out.print(array[i]+", ");
        }
        //display last element
        System.out.print(array[array.length-1]);
        System.out.println("]");
        
//        System.out.print(Arrays.toString(array));
        
    }

    static void sortArray(int[] array) {
        int temp=0;
        for(int i=0; i<array.length; i++){
            for(int j=1; j<(array.length-i); j++){
                //swap elements
                if(array[j-1]>array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;     
                }
            }
        }
    }
    
}
