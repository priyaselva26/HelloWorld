/**
 * Created by user on 11/20/15.
 */

import java.util.Scanner;


public class BubbleSort {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int list[] = new int[5];
        //int list[] = {7,9,6,3,2};
        //System.out.println("Enter 5 Numbers : ");

        for (int nn = 1 ; nn <= list.length; nn++ ) {
            System.out.println("Enter Number "+  nn + " : ");
            try{
            list[nn-1] = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("Enter Interger Values");
            }

        }





       // bSort(list);

        int n = list.length;

        boolean swapped = false;
        while (!swapped) {
            for (int i = 0; i < n - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        }



        System.out.println("Sorted :  ");

        for (int m = 0 ; m < list.length; m++ ) {
            System.out.print(list[m] + " ");
        }



    }

  /*  public static void bSort(int[] list){
        int n = list.length;
        boolean swapped = false;
        do{
            for(int i=0; i<n-1; i++){
                if(list[i]> list[i+1]){
                    int temp = list[i+1];
                    list[i+1] = list[i];
                    list[i] = temp;
                    swapped = true;
                }
            }
        }
        while(swapped = true);

        System.out.println("Sorted :  ");

        for (int m = 0 ; m < list.length; m++ ) {
            System.out.print(list[m] + " ");
        }
    }
    */


}

