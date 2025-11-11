package gr.aueb.cf.ch6;

public class ArrayMinMax {
    public static void main(String[] args) {



    }



    public static int getMinPosition(int [] arr){

        if (arr== null || arr.length<1 ) return  -1;
        int minPosition=0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++)
            if (arr[i] < min ) {
                min =arr[i];

            }
        return minPosition;
    }
}
