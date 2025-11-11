package gr.aueb.cf.ch6;

import java.lang.reflect.Array;

public class ArrayCopyWITHOUTSHALLOW
{

    public static void main(String[] args) {


    }
        int [] source= {1,2,3,4,5};

        public static int[] arrDeepCopy(int[] source){

            int [] destination = new int [source.length];

            for(int i=0; i<source.length ; i++) {
                destination[i]=source[i];


        }
            System.arraycopy(source , 0 , destination , 0 , source.length);
            //destination= Array.copyOf(source, source.length);
           // Array.copyOfRange (source , 0 , source.length);

            return destination;

    }
}
