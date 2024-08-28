import java.util.Arrays;

class mergingArrays{

    public static void main(String[] args){
        int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
        int[] arr2= {9,8,7,6,5,4,3};
        int[] arr_merge = new int[arr.length + arr2.length];

        for(int i=0,j=0;i<arr.length;i++){
            int x=arr[i];
            boolean found=Arrays.stream(arr2).anyMatch(value -> value == x);

            if(found==true){
                arr_merge[j++]=arr[i]; 
            }else{
                arr_merge[j]=arr[i];
                arr_merge[j++]=arr2[i];
            }
            for(int p=0; p<arr_merge.length;p++){
                System.err.print(arr_merge[p]);
            }
            System.err.println("\n");
        }
        for(int p=0; p<arr_merge.length;p++){
            System.err.println(arr_merge[p]);
        }
    }
}