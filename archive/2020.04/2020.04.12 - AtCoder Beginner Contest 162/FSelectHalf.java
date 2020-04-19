package sk.gargoris;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.math.BigInteger;

public class FSelectHalf {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        final int n = in.readInt();
        double howMany = Math.floor(n / 2);
        final boolean impar = n%2!=0;

        long[] nums = in.readLongArray(n);
        int mod = impar ? 3 : 2;BigInteger[] sum = new BigInteger[mod];
        for (int i = 0; i < sum.length; i++) {
            sum[i]=BigInteger.ZERO;
        }
        for (int i = 0; i < nums.length; i++) {
            final BigInteger bigInteger = BigInteger.valueOf(nums[i]);
            sum[i%mod] = sum[i%mod].add(bigInteger);
        }

        BigInteger max = BigInteger.ZERO;
        for (BigInteger b2 : sum) {
            max = max.compareTo(b2)>0?max:b2;
        }
        out.printLine(max.toString());
    }
}
