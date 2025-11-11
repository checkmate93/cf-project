package gr.aueb.cf.ch6;

public class ReplaceElementApp {
    public static void main(String[] args) {


    }

    public static void replace (int [] arr , int oldVal , int newVal) {
           int postitionToUpdate =getPosition(arr,oldVal);
           if(postitionToUpdate == -1 ) return;

           arr[postitionToUpdate] = newVal ;

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
