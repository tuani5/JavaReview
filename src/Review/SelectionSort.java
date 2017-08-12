/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

/**
 *
 * @author Bird
 */
public class SelectionSort {
    public void selectionSort(Comparable[] list)
    {
        Comparable temp;
        int min; //minimum
        //(length -1) if we don't put minus 1 we are comparing the same value with same value
        //also if we are at the last value the next j value does not exist
        for (int i=0;i<list.length-1;i++)
        {
            min=i;//assume the i is the minimum index
            for (int j=i+1;j<list.length;j++) //traverse the entire column
            {
                //if list[min] value is larger than list[j] 
                if (list[min].compareTo(list[j]) > 0)
                    min=j; //store the the minimum index
            }
            
            //swap two elements
            /*
            temp=list[i]; //copy list[i]
            list[i]=list[min]; //overwrite list[i]
            list[min]=temp; //overwrite list[min]*/

            
            swap(list,i,min);
        }
        
    }
    private void swap(Comparable[] source, int index1, int index2)
    {
        Comparable temp;
        temp=source[index1];
        source[index1]=source[index2];
        source[index2]=temp;
        
        
    }
    
}
