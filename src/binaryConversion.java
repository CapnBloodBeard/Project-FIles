import java.util.Scanner;

public class binaryConversion {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int input_number = scan.nextInt();
        Conversion(input_number);
        
    }

    public static int Conversion(int intnumber) {
        System.err.println("hello");
        int copy_var=intnumber; int binary_num=0; int binary_len=0; int binary_ans;
        int[] reverse_binary;

        while (copy_var>0){
            binary_num += copy_var%2;
            copy_var/=2;
            reverse_binary[binary_len]=binary_num;
            binary_len+=1;
        }

        while (binary_len>0){
            binary_ans= reverse_binary[binary_len];
            binary_ans*=10;
            binary_len-=1;
            intnumber= binary_ans;
        }
        
        return intnumber;
    }
}
