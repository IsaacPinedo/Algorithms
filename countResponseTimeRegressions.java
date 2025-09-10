// Given an array of positive integers, return the number of elements that are strictly greater than the average of all previous elements. Skip the first element.
// Input         responseTimes = [100, 200, 150, 300];
// Output        2

class Result {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        // Parameters.
        int previousAverageCounter = 0;
        double previousIntegersSum = 0;
        double previousAverage = 0;
        
        // Selection algorithm.
        for (int index = 1; index < responseTimes.size(); index++) {
            // Calculating previous numbers sum.
            previousIntegersSum += responseTimes.get(index - 1);
            // Calculating its average.
            previousAverage = previousIntegersSum / index;
            //Selecting if it's greater or not.
            if (responseTimes.get(index) > previousAverage) {
                previousAverageCounter ++;
            }
        }
        return previousAverageCounter;
    }
}
