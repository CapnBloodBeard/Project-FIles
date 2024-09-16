import java.util.Scanner;


public class MathUtil {



    public static boolean isPrime(int number_check) {
        if(number_check%2==0 || number_check%3==0 || (number_check <= 1 && number_check>=0)){
            return false;
        }else if(number_check<=3){
            return true;
        }
        
        for(int i=5;i*i<=number_check;i+=6){
            if (number_check % i == 0 || number_check % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }





    public static boolean isVowel(char charEnt) {
        charEnt = Character.toLowerCase(charEnt);
        return charEnt == 'a' || charEnt=='e' || charEnt=='i' || charEnt=='o' || charEnt=='u';
    }




public static int sumOfDigits(int numEnt) {
    int sumOfDg=0;
    while (numEnt>0) {
        sumOfDg+=numEnt%10;
        numEnt/=10;
    }
    return sumOfDg;
}

public static int prodOfDigits(int numEnt) {
    int prodOfDg=1;
    while (numEnt>0) {
        prodOfDg*=numEnt%10;
        numEnt/=10;
    }
    return prodOfDg;
}



public static void patternPrint(int patNum) {
    for (int i =0; i<=patNum;i++) {
        int tempVar=1;
        while (tempVar<i){
            System.err.print(tempVar + "\t");
            tempVar++;
        }
        
        System.err.println( "\n");
    }
}

public static void patternPrintStr(String patString) {
    for (int i =0; i<=patString.length();i++) {
        int tempVar=0;
        while (tempVar<i){
            System.err.print(patString.charAt(tempVar));
            tempVar++;
        }
        
        System.err.println( "\n");
    }
}


public static void doubleToBinary(double dbint) {
    int[] binArr=new int[100];
    int[] binArrDEC=new int[100];
    int dbintNUM = (int) dbint;
    float dbintDEC = (float) (dbint - dbintNUM);
    System.out.println(dbintDEC);

    int p=0;
    for(int i=dbintNUM;i>0;p++){
        binArr[p]=(int)(i%2);
        i/=2;

    }

    binArrDEC= decimalArr(dbintDEC);
    for (int f = p; p>=0; f--) { //check this . .. 
        if (f==-1) {break;}
        System.out.print(binArr[f] + " ");
    }
    System.out.print(" . ");


    if (dbintDEC!=0) {
        for (int f =0; 20 >= 0; f++) {
            if (f==20) {break;}
            System.out.print(binArrDEC[f] + " ");
        }
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


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.err.print("Enter a number: ");
    int numEntered = scan.nextInt();

    System.err.print("Enter a String : ");
    String value_ok = scan.nextLine();
    String enter_value = scan.nextLine();

    System.err.print("Enter a Double Interger : ");
    double doubleInt = scan.nextDouble();




    System.err.println("The Given Number is Prime : " +isPrime(numEntered));
    System.err.println(isVowel((enter_value).charAt(0)));
    System.err.println("Sum of Digits is : " + sumOfDigits(numEntered));
    System.err.println("Product of Digits is : " + prodOfDigits(numEntered));
    patternPrint(numEntered);
    patternPrintStr(enter_value);
    doubleToBinary(doubleInt);




}
}

