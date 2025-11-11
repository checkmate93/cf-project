package gr.aueb.cf.ch6;

public class ArraySearchWithMethod {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
                int postion;
        postion = getPosition(arr, 5);

        if(postion == -1 ){
            System.out.println("den vrethike");
        } else {
            System.out.printf("value : %d position %d " , arr[postion], (postion+1));
        }

    }


    public static int getPosition (int [] arr , int value){
        int postitionReturn = -1 ;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == value ){
                postitionReturn = i;
                break;
            }
        }
        return postitionReturn;
    }


}
