package array;

import java.util.*;
public class SingleDim {


    public static void main(String[] args){

        int array[] = new int[10];
        int maxInd = 0;int minInd = 0;
        int sum =0;
        for(int i=0; i<10; i++){
            array[i] = i;
            maxInd = array[i] > array[maxInd] ? i : maxInd;
            minInd = array[i] < array[minInd] ? i : minInd;
            sum+=array[i];
        }
        System.out.println("Max element is : "+array[maxInd]);
        System.out.println("Min element is : "+array[minInd]);
        System.out.println("Average is : "+sum/10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Element to search : ");
        int search = sc.nextInt();
        for(int i=0; i<10; i++){
            if(array[i] == search){
                System.out.println("Element found at index : "+i);
                break;
            }
        }
        Arrays.sort(array);
    }
}
