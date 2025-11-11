package gr.aueb.cf.ch6;

public class ArrayMinandMax {

    public static void main(String[] args) {


    }


    public static int getMinPosition(int[] arr) {

        if (arr == null || arr.length < 1) return -1;
        int minPosition = 0;
        int min = arr[minPosition];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];

            }
        return minPosition;
    }


//    public static int [] getMinPosition (int[] arr , int low , int high){
//        if (arr== null || arr.length<1 ) return  -1;
//        if (low <0 || high >arr.length-1) return -1;
//
//        int minPosition=low;
//        int min = arr[low];
//        for (int i=1; i<high; i++)
//            if (arr[i] < min ) {
//                min =arr[i];
//
//            }
//        return minPosition;
//    }

}



