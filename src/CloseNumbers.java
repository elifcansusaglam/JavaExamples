import java.util.Arrays;
import java.util.Scanner;

public class CloseNumbers {
    public static void main(String[] args) {
        //Kullanıcının girdiği sayıdan, dizideki elemanlardan  en küçük ve en büyük olan en yakın sayıyı bulan program
        int[] numbers={15,12,788,1,-1,-778,2,0};
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number :");
        int number=input.nextInt();
        int[] minList= new int[numbers.length];
        int[] maxList= new int[numbers.length];
        int a=0,b=0;
        for (int i=0;i< numbers.length;i++){
            if (numbers[i]>number){
                maxList[a]=numbers[i];
                a++;
            }else if (numbers[i]<number){
                minList[b]=numbers[i];
                b++;
            }
        }
        int min=maxList[0];
        int max=minList[0];
        for (int i:maxList){
            if (i<min && i>number){
                min=i;
            }
        }
        for (int i:minList){
            if (i>max && i<number){
                max=i;
            }
        }
        System.out.println("Nearest and smallest number is "+max);
        System.out.println("Nearest and biggest number is "+min);
    }
}
