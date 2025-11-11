package gr.aueb.cf.ch7;

public class BUUBLESHORT {
    public static void main(String[] args) {

        int [] arr= {6,3,7,4};
        int [] sort =bubbleShort(arr);

        for (int el:sort){
            System.out.println(el);
        }



    }

    public static int [] bubbleShort(int[] arr){

        for(int i=arr.length-1; i > 0; i--) {
            for(int j=0; j<i ; j++) {
                if (arr[j] > arr[j+1]){
                    swap (arr, j , j+1);
                }
            }
        }
        return arr;
    }


    public static void swap (int [] arr , int i , int j ){
        int tmp= arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
