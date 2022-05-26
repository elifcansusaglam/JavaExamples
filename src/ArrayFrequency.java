import java.util.Arrays;

public class ArrayFrequency {

    public static void main(String[] args) {
        //Dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program
        int[] array={10, 20, 20, 10, 10, 20, 50,50, 20};
        int count = 0;
        int newArray[ ] = new int [ array.length ];
        for (int i = 0; i < array.length; i++) {
            int a = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i]==newArray[j])
                {
                    a++;
                }
            }
            if(a == 0 )
            {
                int frequency = 0;
                for (int t = 0; t < array.length; t++) {
                    if(array[i]== array[t])
                    {
                        frequency ++;
                    }
                }
                newArray[count] = array[i];
                count ++;
                if(frequency>1) {
                    System.out.println(array[i] + " is repeated " + frequency + " times!");
                }
            }
        }
    }
}
