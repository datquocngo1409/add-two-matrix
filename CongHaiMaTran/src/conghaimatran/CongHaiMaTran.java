package conghaimatran;

import java.util.Scanner;

public class CongHaiMaTran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        int[][] array1 = new int[size][size];
        
        int[][] arraySum = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter value of array1["+i+"]: ");
                array1[i][j]=sc.nextInt();
            }
        }     
        
        System.out.println("Enter array 2");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter value of array2["+i+"]: ");
                int x = sc.nextInt();
                arraySum[i][j]=array1[i][j]+x;
            }
        }    
        
        for(int[] a : arraySum){
            for(int x : a){
                System.out.print(x+"\t");
            }
            System.out.println("");
        }
    }
    
}
