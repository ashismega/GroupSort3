package groupsort3;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 073903999
 */
public class Main {
    
    public static void main(String[] args) {
        Comparable arry[] = {3, 2, 5, 6,4,3,6,5,7,9,7,6,32,2,3,4,1,31,3,434,1, 4, 7, 4, 6};
        Comparable arr[] = {1,2,3,4,5,6,8};
        
        insertion(arry);
        for (Comparable arry1 : arry) {
            System.out.println(arry1);
        }
        
    }

    public static void bubble(Comparable[] a, int b) {
        b =+ 1;
        boolean swapped;
        Comparable temp;
        do {
            swapped = false;

            for (int i = 0; i < a.length; i++) {
                try {
                    if (a[i].compareTo(a[i + 1]) > 0) {
                        temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        swapped = true;
                    }
                } catch (ArrayIndexOutOfBoundsException ex) {
                }
            }
        } while (swapped);

    }
    
    
    public void selection(Comparable[] array){
        Comparable lowest = 0;
        for (int i = 0; i<array.length;i++){
             
        }
    }
    public int indexOfSmallest (Comparable[] array, int low, int high){
        int lowestIndex = low;
        for (int j = 0; j<array.length;j++){
            if (array[j].compareTo(array[lowestIndex])<0){
                lowestIndex = j;
                break;
            }
        }
        return lowestIndex;
    }
    
    // ashers
    public static void insertion( Comparable[] arr){
        
        for(int i = arr.length-1; i>=1;i--){
            
            Comparable pos = i;
            Comparable nexpos = i-1;
            
            if(( nexpos.compareTo(pos) ) <0){
                arr[i] =  nexpos;
                arr[i-1] =  pos;
            }
            else if(( arr[i-1].compareTo(arr[i]) ) >0){
                arr[i] =  pos;
                arr[i-1] =  nexpos;
            }
            
        }
        
    } 
    
}
