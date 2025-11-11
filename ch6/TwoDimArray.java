package gr.aueb.cf.ch6;

public class TwoDimArray {
    public static void main(String[] args) {

        //kata grammes kai sthles
        int [] [] grid = new int [2] [3];

        grid [0] [0] =1;
        grid [0] [1] =2;
        grid [0] [2] =3;

        grid [0] [0] =4;
        grid [1] [1] =5;
        grid [2] [2] =6;


         for (int i=0; i<grid.length; i++) {
             for (int j=0; j<grid[i].length; j++) {
                 System.out.println(grid[i] [j]);
             }
         }


    }
}
