public class LinearSearch {

    public static void main(String[] args) {
        boolean found = false;
        int[] arr = {1,5,3,2,6,7};
        int target= 8;
        for(int i=0; i<arr.length; i++){
            System.out.println("Searching");
           if(arr[i]==target){
            found=true;
            System.out.println(target + " found at index " + i);
            // If we dont use break then it will keep searching even after found.
            break;
           }
           
        }if(!found) {

    System.out.println(target+" not found!");
}
    }
}