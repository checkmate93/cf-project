package gr.aueb.cf.ch7;

import static gr.aueb.cf.ch6.SwapApp.swap;

public class BubbleShort {
    public static void main(String[] args) {


    }
    public static int [] selectionShort(int [] arr) {
        for (int i=0; i<arr.length -1 ; i++) {

            int minPosition = i ;
            int minValue = arr[minPosition];

            for(int j=1;  j< arr.length; j++){
                if(arr[j] < minValue) {
                    minValue= arr[j];
                    minPosition = j ;

                }

            }






            swap ( arr , minPosition , i);



        }
        return arr;


        }

    public static void swap (int [] arr , int i , int j ){
        int tmp= arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
