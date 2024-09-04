package exercise3;

public class Largestnumber {
    public static void main(String[] args){
        //Initialize array
        int [] arr6 = new int [] {25, 11, 7, 75, 56};
        //Initialize min with first element of array.
        int max = arr6[0];
        //Loop through the array
        for (int i = 0; i < arr6.length; i++) {
            //Compare elements of array with min
            if(arr6[i] >max)
                max = arr6[i];
        }
        System.out.print("25,11,7,75,56");
        System.out.println("\n"+ "Largest number present in given array: " + max);
    }
}
