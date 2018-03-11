public class MaxSliceSum {
    public static int solution(int[] A){
        if(A.length == 0){
            return 0;
        }
        if(A.length == 1){
            return A[0];
        }

        int maxEndHere = A[0];
        int maxSoFar = A[0];

        for(int i = 1; i<A.length;i++){
            maxEndHere = Math.max(A[i],(maxEndHere + A[i]));
            maxSoFar = Math.max(maxSoFar,maxEndHere);
        }

        return maxSoFar;
    }
}
