package array;

public class MultiDim {


    public static void main(String[] args){
        
        int array[][] = new int[3][3];
        int temp = 1;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                array[i][j] = temp++;
            }
        }
        System.out.println("Og matrix : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<3; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum+=array[i][j];
            }
            System.out.println("Sum of row "+i+" is : "+sum);
        }
        for(int i=0; i<3; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                sum+=array[j][i];
            }
            System.out.println("Sum of column "+i+" is : "+sum);
        }
        System.out.println("Modified matrix : ");
        // transpose of array
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
        int array2[][] = new int[3][3];
        temp = 1;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                array2[i][j] = temp++;
            }
        }
        System.out.println("Matrix 2 : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        int array3[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    array3[i][j] += array[i][k]*array2[k][j];
                }
            }
        }
        System.out.println("Matrix multiplication : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
