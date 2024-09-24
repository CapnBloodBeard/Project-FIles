import java.util.Scanner;

class Double_to_Binary{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.err.print("Enter a Double Interger : ");
        double doubleInt = scan.nextDouble();
        doubleToBinary(doubleInt);
    }


    public static void doubleToBinary(double dbint) {
        int[] binArr=new int[100];
        int[] binArrDEC=new int[100];
        int dbintNUM = (int) dbint;
        float dbintDEC = (float) (dbint - dbintNUM);

        int p=0;
        for(int i=dbintNUM;i>0;p++){
            binArr[p]=(int)(i%2);
            i/=2;

        }
    System.err.print("\n Converted to Decimal: ");
        binArrDEC= decimalArr(dbintDEC);
        for (int f = p; p>=0; f--) { //check this . .. 
            if (f==-1) {break;}
            System.out.print(binArr[f] + " ");
        }
        System.out.print(" . ");


        if (dbintDEC!=0) {
            for (int f =0; 21 >= f; f++) {
                System.out.print(binArrDEC[f] + " ");
            }
            System.err.println('\n');
        }
    }

    public static int[] decimalArr(float x) {
        int[] binArrDecReturn=new int[100];
        if (x==0){
            binArrDecReturn[0]= 1;
            return binArrDecReturn;
        }
        int y=0;
        for(float i=x; y<25;y++){
            i*=2;
            if (i==1) {
                binArrDecReturn[y]=1;
                return binArrDecReturn;
            }else if (i>1) {
                binArrDecReturn[y]=1;
                i--;
            }
        }
        return binArrDecReturn;
    }
}