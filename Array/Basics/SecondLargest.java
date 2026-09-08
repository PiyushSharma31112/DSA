class SecondLargest {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 5, 40, 30};
        
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int num : arr) {
        
            if(num > largest) {
                secondLarge = largest;
                largest = num;
            } else if(num > secondLarge && num != largest) {
                secondLarge = num;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("SecondLargest = " + secondLarge);
    }
}