// Cyclic Sort Algorithm
// O(n)

// It should be O(2n) but in Big O notation constants are consider insignificant values, that's because big O is considering the worst input case (could be n = 1,000,000). 

class Result {
    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        // First border case: 
        // Find out if the given ArrayList is empty.
        // If that happens, means that missing positive integer will be 1.
        if (orderNumbers.isEmpty()) {
            return 1;
        }
        
        
        // Case in which the given ArrayList isn't ordered.
        // Declaring and initializing variables:
        // Array size.
        int arraySize = orderNumbers.size();
        // Current index.
        int currentIndex = 0;
        
        // Check and swap values to its correct index.
        // There will be used a while loop until every value is in its correct index.
        while (currentIndex < arraySize) {
            // Current value.
            int currentValue = orderNumbers.get(currentIndex);
            // Correct index.
            int correctIndex = currentValue - 1; 
            
            // Checking for correct index and swaping if not.
            // First condition: Check for correct index.
            // Second condition: Check if the current value is a positive integer (negatives and zero   are not useful for this case).
            // Third condition: While every value must be in its correct index it'll not be correct if the current value is bigger than the array size.
            // Fourth condition: Prevent duplicates from swaping.
            if (currentValue > 0 && currentValue <= arraySize && orderNumbers.get(correctIndex) != currentValue) {
                Collections.swap(orderNumbers, currentIndex, correctIndex);
                // [1, 4, 3, 1]
                
            // For negative values.
            } else {
                currentIndex++;
            }
            
            
        } 
        // Finishing the while loop means that everything is in its correct index.
        
        for (int index = 0; index < arraySize; index++) {
            if (orderNumbers.get(index) != index + 1) {
                return index + 1;
            } 
        }
        
        // Second border case: 
        // Find out if every element inside the given ArrayList is in its correct position.
        // If that happens, means that missing positive integer will be the size of the ArrayList + 1.
        return arraySize + 1;
    }
}
