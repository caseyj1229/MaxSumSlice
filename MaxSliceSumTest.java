import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSliceSumTest {
    @Test
    void solution() {
        int[] A = {3,2,-6,4,0};
        assertEquals(5,MaxSliceSum.solution(A));

        int[] B = {2};
        assertEquals(2,MaxSliceSum.solution(B));

        int[] C = {};
        assertEquals(0,MaxSliceSum.solution(C));
    }
}