package sorting;

public class leetcode274 {
    public static void main(String[] args) {
        
    }


    public int hIndex(int[] citations) {

    // Bubble Sort
    for (int i = 0; i < citations.length; i++) {
        for (int j = 1; j < citations.length - i; j++) {
            if (citations[j] < citations[j - 1]) {
                int temp = citations[j];
                citations[j] = citations[j - 1];
                citations[j - 1] = temp;
            }
        }
    }

    // Find maximum h
    for (int h = citations.length; h >= 0; h--) {

        int count = 0;

        for (int j = 0; j < citations.length; j++) {
            if (citations[j] >= h) {
                count++;
            }
        }

        if (count >= h) {
            return h;
        }
    }

    return 0;
}
    
    
}
