import java.util.HashMap;

public class Array3 {

    public static void main(String[] args) {
        
        // 1. Left Rotate Array by One Position
        // Input: {1,2,3,4,5};
        // Output: {2,3,4,5,1};
// int arr[]= {1,2,3,4,5};
// int j=0;
// int temp =arr[0];
//         for(int i=0; i<arr.length-1; i++){
          

//             arr[i]= arr[i+1];
       
//            }
//             arr[arr.length-1]= temp;
     
//         for(int i=0; i< arr.length; i++){
//             System.out.println(arr[i]);
//         }



        // 2. Right Rotate Array by One Position
        // Input: {1,2,3,4,5};
        // Output: {5,1,2,3,4};

        // int arr[]= {1,2,3,4,5};

        // int temp = arr[arr.length-1];

        // for(int i=arr.length-1; i>0; i--){

        //     arr[i]= arr[i-1];
        // }

        // arr[0] = temp;

        // for(int num : arr){
        //     System.out.println(num);
        // }

        // 3. Count Frequency of Each Element
        // Input:{1,2,1,3,2,1};
        // Output: 1 -> 3
                // 2 -> 2
                // 3 -> 1

        // int arr[]={1,2,1,3,2,1};
        // int j= 0;
        // int count=0;

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<arr.length; i++){

        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i], map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i], 1);
        //     } 
        // } System.out.println(map);



        // 5. Find Single Occurring Element
        // Input:{1,2,1,3,2,1};
        // Output:3
        int arr[]={1,1,2,2,3,4,4};        
int xor = 0;

for(int num : arr){
    xor ^= num;
}

System.out.println(xor);
    }
}