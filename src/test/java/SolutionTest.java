import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numberOfWaysTest1() {
        int startPos = 1;
        int endPos = 2;
        int k = 3;
        int expected = 3;
        int actual = new Solution().numberOfWays(startPos, endPos, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfWaysTest2() {
        int startPos = 2;
        int endPos = 5;
        int k = 10;
        int expected = 0;
        int actual = new Solution().numberOfWays(startPos, endPos, k);

        Assert.assertEquals(expected, actual);
    }

}
