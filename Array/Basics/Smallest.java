public class Smallest {
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int Smallest = arr[0];

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] < Smallest){
                Smallest = arr[i];
            }
        }

        System.out.println("Smallest element is: "+ Smallest);
    }
}
