class Arrays{

    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0]=1;


// 
        int arr1[] = {1,2,3,4};
        for(int i=0; i<4;i++){
            System.err.println(arr1[i]);
        }


// multidimensional array total 3 and each array has 2 elements
        int arr2[][]= new int[3][2];
        int arr4[][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                System.out.print(arr4[i][j]+" ");
            }
System.out.println("");
        }

        // Enhanced for loop
        for(int n[]: arr4){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        // Jagged array: Different number of elements per array
        int jaggedArray[][]= new int[3][];
        jaggedArray[0]= new int[4];
        jaggedArray[1] = new int[5];
        jaggedArray[2]= new int[10];
for(int i=0; i<3; i++){
            for(int j =0; j<jaggedArray[i].length;j++)
            {
                jaggedArray[i][j]= (int)(Math.random() *100);
            }
            // System.out.println();
        }
        for(int i=0; i<3; i++){
            for(int j =0; j<jaggedArray[i].length;j++)
            {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}