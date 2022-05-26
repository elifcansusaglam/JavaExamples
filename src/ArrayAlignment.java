import java.util.Scanner;
import java.util.Arrays;

public class ArrayAlignment {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=input.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+1+". element: ");
            int number=input.nextInt();
            array[i] = number;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
