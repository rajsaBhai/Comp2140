/* Name - Raj Kumar
 * Class - Comp2140 Section MWF
 * 
 */
public class MainClass
{
   public static void main(String[] args){
       
    int[] a = {10,3,5,7,1,4};
    //insertionSort(a);
    System.out.println(findMin(a,1, 3));
    System.out.println("UNSorted");
    output(a);
    System.out.println("Sorted");
    selectionSort(a);
    output(a);
    }
    
//=============================================================================================================================================    
// 1.A   
    private static void insertionSort( int[] array, int start, int end){
    output(array); // just for reference 
       final int base = start; //
       for(int i= start+1; i< end+1; i++){
           int key = array[i]; // storing the first element in the key variable
           int j = i-1; // storing the previous index in int j variable 
           while(j>=base && array[j]>key){ // checking if the index j is positive and the key is smaller than current positoin
               array[j+1] = array[j]; // moving the a[j] in the next index
               j--; // decrementing j
            }// while
           array[j+1] = key; // after the end of while loop storing the key at j+1 index
    }//for
    output(array);
   }// insertion sort
   
//=============================================================================================================================================    
      
   public static void insertionSort(int [] array){
       
       insertionSort(array, 2, 4);
       
    }

//=============================================================================================================================================    
        
   public static void output(int[] a){  
   String str = "(";  
   for(int i=0;i<a.length;i++){
         str += a[i]+","; 
    }
   System.out.println(str+ ")");
}

//=============================================================================================================================================    
// 2.A

  public static int findMin(int[] array, int start, int end){
      int min = start ; // assigning the first element location to min
      for(int i= start; i< end; i++){ // iterating through the loop
          if(array[min]>array[i]) {// checking if the first element is bigger than any other element in the array.
             min = i; // if yes, assigning the index of that element to min
        }
    }
      return min; // returning min 
    }

//=============================================================================================================================================    
// 2.B  
  public static void selectionSort(int[] array){ 
     int temp = 0; // int variable to store the variable for swapping
     int x = 0 ; // just for my reference to check the changing values for better understanding
     int minNum = 0; // index of the minimum value in the array
     for(int i= 0; i< array.length; i++){ // iterating through the loop
        minNum = findMin(array, i, array.length); // calling the function findMin and storing the value in minNum
        if(minNum != i){ // if the new index found is different than the current one than swap the values
            temp = array[i]; // general swapping
            array[i] = array[minNum]; 
            //x= array[i] = array[minNum];  
            array[minNum] = temp;
        }// if
        System.out.println("After " + (i+1) +" Iterations -"); // printing out the values
        output(array);
        } // for
    }// selectionSort

//=============================================================================================================================================    
    

//=============================================================================================================================================    

//=============================================================================================================================================    


//=============================================================================================================================================    



    
}// MainClass
