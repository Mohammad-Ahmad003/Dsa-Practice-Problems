class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int freqA[] = new int[51];
        int freqB[] = new int[51];
        int c[] = new int[A.length];
        int indx = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            freqA[A[i]]++;
            freqB[B[i]]++;

            
            count = 0;
            for (int j = 1; j <= 50; j++) {
                if (freqA[j] > 0 && freqB[j] > 0) {
                    count++;
                }
            }

            c[indx] = count;
            indx++;
        }

        return c;
    }
}
