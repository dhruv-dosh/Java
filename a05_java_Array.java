package Java;//practice set array
import java.util.Scanner;
public class a05_java_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //////////////////////practice problem 1//////////////////////
        /*
        float []arr = new float[5];
        float sum = 0;
        System.out.println("Enster the numbers of an array :");
        for (int i = 0; i < arr.length; i++){
            arr[i] = s.nextFloat();
            sum += arr[i];
        }
        System.out.println("Sum of Given Numbers of Array is : "+sum);
        */

        //////////////////////practice problem 2//////////////////////
        /*
        int []arr ={1,2,3,4,5,6};
        int search = s.nextInt();
        boolean flag = false;
        int i;
        for (i = 0 ; i < arr.length ; i++){
            if ( arr[i]==search){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Given number is found at index "+ (i+1));
        }
        else {
            System.out.println("Given number not found");
        }
        */

        //////////////////////practice problem 3//////////////////////
        /*
        int []arr = {89,87,77,94,79};
        int sum=0;
        for (int element: arr) {
            sum += element;

        }
        System.out.println("average of number is "+ sum/arr.length);
        */

        ////////////////////////////////practice problem 4//////////////////
        /*
        int [][]arr1= {{1,2,3},{1,2,3}};
        int [][]arr2= {{1,2,3},{1,2,3}};
        int [][]sum= new int[2][3];

        for (int i=0;i< sum.length ;i++){
            for (int j = 0; j< sum[i].length ;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("sum of given two array is :");
        for (int i=0;i< sum.length ;i++){
            for (int j = 0; j< sum[i].length ;j++){
                System.out.print(sum[i][j]+ " ");
            }
            System.out.print("\n");
        }
        */



        //////////////////////practice problem 5/////////////////////

        int []arr = {1,2,3,4,5,6};
        int temp;
        for (int i = 0;i <= arr.length/2 ; i++){
            temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        //////////////////////practice problem 6/////////////////////
        /*
        int []arr = {89,87,77,94,79};
        int max = 0;
        for(int i =0 ; i< arr.length ;i++){
            if (arr[i]>max){
               max = arr[i];
            }
        }
        System.out.println("maximum number of array is "+max);
         */

        //////////////////////practice problem 7/////////////////////
        /*
        int []arr = {67,87,77,94,79};
        int min = arr[0];
        for(int i = 1 ; i< arr.length ;i++){
          if (arr[i]<min){
              min = arr[i];
          }
        }
        System.out.println("minimum number of array is "+min);
        */

        //////////////////////practice problem 8/////////////////////
        /*
        int []arr = {1,2,3,4,5};
        boolean flag = false;
        for(int i = 0 ; i< arr.length-1 ;i++){
          if (arr[i]>arr[i+1]){
              flag = true;
          }
        }

        if (flag){
            System.out.println("array is not sorted");
        }
        else {
            System.out.println("array is sorted");
        }
        */
    }
}
