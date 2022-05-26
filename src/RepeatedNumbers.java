import java.util.Arrays;

public class RepeatedNumbers {
    public static void main(String[] args) {
        //Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program
        int[] list={2,5,6,6,7,8,34,67,2,-3,-65,4,5,31,4,1,1};
        int[] newList=new int[list.length];
        int index=0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if(i!=j && list[i]==list[j] ){
                    if(!isDuplicate(newList,list[i])){
                        newList[index]=list[i];
                        index++;
                    }
                    break;
                }
            }
        }
        //System.out.println(Arrays.toString(newList));
        isEven(newList);
    }
    static boolean isDuplicate(int[] arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    static void isEven(int[] arr){
        int[] newArr =new int[arr.length];
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                newArr[index]=arr[i];
                index++;
            }
        }
        //System.out.println(Arrays.toString(newArr));
        print(newArr);
    }
    static void print(int[] arr){
        for(int i:arr){
            if(i!=0){
                System.out.println(i);
            }
        }
    }
}
