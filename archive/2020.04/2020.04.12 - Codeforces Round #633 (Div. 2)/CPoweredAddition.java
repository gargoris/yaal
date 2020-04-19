package sk.gargoris;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.math.BigInteger;

public class CPoweredAddition {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        final int numberTests = in.readInt();
        for (int i = 0; i < numberTests; i++) {
            final int cases = in.readInt();
            long[] data = in.readLongArray(cases);
            int seconds = 0;
            BigInteger acc = BigInteger.ZERO;
            for (int i1 = 1; i1 < data.length; i1++) {
                BigInteger dataT = acc.add(BigInteger.valueOf(data[i1]));
                final BigInteger b2 = BigInteger.valueOf(data[i1 - 1]);
                while (dataT.compareTo(b2) < 0) {
                    final BigInteger pow = BigInteger.valueOf(2).pow(++seconds);
                    if (b2.subtract(dataT).compareTo(pow)<=0) {
                        acc = acc.add(pow);
                        dataT = acc.add(BigInteger.valueOf(data[i1]));
                    }
                }
            }
            out.printLine(seconds != 0 ? seconds + 1 : 0);
        }
    }
}
