/* Name - Raj Kumar
 * Class - Comp2140 Section MWF
 * 
 */
public class MainClass
{
   public static void main(String[] args){
       
    int[] a = {10,3,5,7,1,4};
    insertionSort(a);
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


//=============================================================================================================================================    

}// MainClass
