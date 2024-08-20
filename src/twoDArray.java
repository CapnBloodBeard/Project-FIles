import java.util.Random;
import java.util.Scanner;


/*Write a program that defines two two dimension aarrays of numbers the program should display the sum ad differene of these matrixes. The Program  */
public class twodArray {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        Random rand  = new Random();
        int r=0,c=0;
        System.err.print("Enter no of rows: ");         r = scan.nextInt();
        System.err.print("\nEmter no of Columns: ");    c = scan.nextInt();

        int[][] ary = new int[r][c];
        int[][] ary2 = new int[r][c];
        
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                ary[i][j]=rand.nextInt(20);
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                ary2[i][j]=rand.nextInt(20);
            }
        }
        System.err.print("Array A: \n");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.err.print(ary[i][j] + "\t");
            }
            System.err.print("\n");
        }
        System.err.print("\nArray B: \n");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.err.print(ary2[i][j] + "\t");
            }
            System.err.print("\n");
        }
        

        System.err.println("\n ");

        addition(ary,ary2,r,c);

        System.err.println("\n ");

        transpose(ary,ary2,r,c);
        
        System.err.println("==============================================================================");
    }



    public static void addition(int[][] arr1, int[][] arr2 , int r,int c) {

        int[][] add1 = new int[r][c];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                add1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.err.print("\n Addition of Array-A and Array-B: \n");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.err.print(add1[i][j] + "\t");
            }
            System.err.print("\n");
        }
        System.err.println("==============================================================================");
    }
    

    public static void transpose(int[][] arr1, int[][] arr2 , int r,int c) {  
        int[][] trns_arr_A = new int[c][r];
        int[][] trns_arr_B = new int[c][r];

        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){

                trns_arr_A[i][j] = arr1[j][i];
                trns_arr_B[i][j] = arr2[j][i];        
            }
        }

        System.err.print("\n Transpose of Array-A: \n");
        for (int i=0; i<c; i++){
            for (int j=0;j<r;j++){
                System.err.print(trns_arr_A[i][j] + "\t");
            }
            System.err.print("\n");
        }

        System.err.print("\n Transpose of Array-B: \n");
        for (int i=0; i<c; i++){
            for (int j=0;j<r;j++){
                System.err.print(trns_arr_B[i][j] + "\t");
            }
            System.err.print("\n");
        }
    }

    

}