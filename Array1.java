public class Array1 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,6,4,7};

        // To Print all elements of an Array. 
        // for(int num : arr){
        //     System.out.println(num);
        // }
        

        // TO Calculate Sum of all elements of array
        // int sum =0;
        // for(int i=0; i<arr.length; i++){
        //     // System.out.println();
        //     sum = sum+arr[i];
        // }
        // System.out.println(sum);


        // To get the largest element of array.
        // int max = arr[0];
        // for(int num : arr){
        //     if(max < num){
        // max = num;
        // }}
        // System.out.println(max);


        // To get the smallest element from an array.
        // int min = arr[0];
        // for(int num : arr){
        //     if (min>num){
        //         min=num;
        //     }
        // }
        // System.out.println(min);


        // To search an element in an array.
        // int target = 2;
        // for(int i=0 ; i<arr.length; i++){
        //     if(arr[i] ==target){
        //         System.out.println("Found at index "+i);
        //         break;
        //     }
        //     else{
        //         System.out.println("Element not found");
        //     }
        // }


        // To get a count of even and odd numbers of an array.
        // int evenCount=0;
        // int oddCount = 0;

        // for(int num : arr){
        //     if(num%2==0){
        //         evenCount +=1;
        //     }
        //     else{
        //         oddCount++;
        //     }
            
        // }
        // System.out.println("Even = "+evenCount);
        // System.out.println("Odd = "+oddCount);


        // To reverse and array
        // System.out.print("Reversed array = [");
        // for( int i = arr.length-1; i>=0; i--){
        //     if(i==0)
        //     {
        //         System.out.print(arr[i]);
        //     }
        //     else
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.print("]");
        // System.out.println();


        // To get second largest element from an array
        // int max1 =arr[0];
        // int max2 = arr[1];
        // for(int i=0 ; i<arr.length; i++){
        //     for(int j= 1; j<arr.length; j++){
        //         if(arr[i]>max1){
        //             max1= arr[i];
        //         }
        //         if(arr[j]>max2 && arr[j]<max1){
        //             max2= arr[j];
        //         }
        //     }
        // }
        // System.out.println("Max Number = "+max1);
        // System.out.println("Second Largest = "+max2);


        // To check if array is sorted
        // boolean isSorted=true;
        // for(int i=0; i<arr.length-1; i++){
          
        //     if(arr[i]>arr[i+1])
        //     {
        //         isSorted= false;
        //         break;
        //     }
            
        // }
        
        // System.out.println(isSorted);


        // To move all zeroes to end
        int nums[]={1,0,2,0,3,0,4};
       for(int i=0;i<nums.length-1; i++){
        for(int j=i+1; j<nums.length; j++)
        if(nums[i]==0){
            int temp =nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
       }

// System.out.println();
for(int num : nums){
System.out.println(num);
}

    }
    
}