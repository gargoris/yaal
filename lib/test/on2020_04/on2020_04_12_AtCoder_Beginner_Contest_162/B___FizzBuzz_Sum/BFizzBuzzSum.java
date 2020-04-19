package on2020_04.on2020_04_12_AtCoder_Beginner_Contest_162.B___FizzBuzz_Sum;



import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.math.BigInteger;

public class BFizzBuzzSum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        final long n = in.readLong();
        BigInteger sum = BigInteger.ZERO;
        for (long i = 1; i <= n; i++) {
            if (Long.remainderUnsigned(i, 3) != 0 &&
                    Long.remainderUnsigned(i, 5) != 0) {
                sum = sum.add(BigInteger.valueOf(i));
            }
        }
        out.printLine(sum.toString());
    }
}
