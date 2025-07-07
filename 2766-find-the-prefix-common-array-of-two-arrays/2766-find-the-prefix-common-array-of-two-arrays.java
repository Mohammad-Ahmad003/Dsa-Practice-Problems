class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int freq[] = new int[51];
        //int freqB[] = new int[51];
        
        //int indx = 0;
        int count = 0;

        // int c[] = new int[A.length];
        // for (int i = 0; i < A.length; i++) {
        //     freqA[A[i]]++;
        //     freqB[B[i]]++;

            
        //     count = 0;
        //     for (int j = 1; j <= 50; j++) {
        //         if (freqA[j] > 0 && freqB[j] > 0) {
        //             count++;
        //         }
        //     }

        //     c[indx] = count;
        //     indx++;
        // }

        for(int i=0; i<A.length; i++){
            if(++freq[A[i]]==2) count++;
            if(++freq[B[i]]==2) count++;
            A[i]=count;
        }

        return A;
    }
}
