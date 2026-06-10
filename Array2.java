public class Array2 {

    public static void main(String[] args) {
        
        // Problem 11: Remove Duplicates from Sorted Array
        // This gives I think n^3 time complexity
//         int arr[] = {1,1,2,2,3,3,4,5,5,6,7};
// int size =arr.length;
        // for(int i=0; i<size;i++){
        //     for(int j=i+1; j<size; j++){
        //         if(arr[i]==arr[j]){
        //           for(int k =j; k<size-1; k++){
        //             arr[k]= arr[k+1];
        //           }
        //             size--;
        //             j--;
        //         for(int x=0; x<size; x++){
        //             System.out.print(arr[x]);
                   
        //         } System.out.println("");
        //         }
                
        //     }
        // }
        // for(int i=0; i<size; i++){
        //     System.out.println(arr[i]);
        // }


        // Let's try optimal solution of O(n)
         int arr[] = {1,1,2,2,3,3,4,5,5,6,7};
         int size =arr.length;
         int j=0; 
        //  j is just a pointer that may 

        for(int i=1; i<size; i++){

            if(arr[j]!=arr[i]){
                j++;
                arr[j] =arr[i];
            }

        }
        for(int x=0; x<=j; x++){
            System.out.println(arr[x]);
        }
// 
    }
}



// public class Array2 {

//     public static void main(String[] args) {

//         int[] arr = {1,1,2,2,3,3,4,5,5};

//         int size = arr.length;

//         for (int i = 0; i < size; i++) {

//             for (int j = i + 1; j < size; j++) {

//                 if (arr[i] == arr[j]) {

//                     // Shift elements left
//                     for (int k = j; k < size - 1; k++) {
//                         arr[k] = arr[k + 1];
//                     }

//                     size--;

//                     j--; // Check the new element that shifted into position j
//                 }
//             }
//         }

//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }