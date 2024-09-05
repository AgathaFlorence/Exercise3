package exercise3;
import java.io.*;
import java.util.*;

public class Secondsmallest {
    public static void main(String args[]) {
        int arr[] = {11, 13, 65, 19, 4, 1};
        int n = arr.length;


        Arrays.sort(arr);


        System.out.println("second smallest element is "
                + arr[1]);
    }
}
