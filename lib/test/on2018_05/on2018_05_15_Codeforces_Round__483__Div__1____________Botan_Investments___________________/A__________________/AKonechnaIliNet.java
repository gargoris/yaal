package on2018_05.on2018_05_15_Codeforces_Round__483__Div__1____________Botan_Investments___________________.A__________________;



import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import static net.egork.numbers.IntegerUtils.gcd;

public class AKonechnaIliNet {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long p = in.readLong();
        long q = in.readLong();
        long b = in.readLong();
        q /= gcd(p, q);
        while (true) {
            long g = gcd(q, b);
            if (g == 1) {
                break;
            }
            q /= g;
            b = g;
        }
        out.printLine(q == 1 ? "Finite" : "Infinite");
    }
}
