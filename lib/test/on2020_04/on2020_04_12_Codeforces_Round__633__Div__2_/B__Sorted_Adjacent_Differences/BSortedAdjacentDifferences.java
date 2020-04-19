package on2020_04.on2020_04_12_Codeforces_Round__633__Div__2_.B__Sorted_Adjacent_Differences;



import net.egork.collections.Pair;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BSortedAdjacentDifferences {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        final int tests = in.readInt();
        for (int i = 0; i < tests; i++) {

            final int t = in.readInt();
            long[] numeros = in.readLongArray(t);
            Arrays.sort(numeros);
            boolean impar = t % 2 != 0;
            final int half = Math.floorDiv(t, 2);
            Stack<Pair<Long, Long>> l = new Stack<>();
            for (int i2 = 0; i2 < half; i2++) {
                l.push(Pair.makePair(numeros[i2], numeros[numeros.length - i2 - 1]));
            }
            List<Long> lResult = new ArrayList<>();
            boolean invertir = false;
            if (impar) {
                Pair<Long, Long> e;
                long v = numeros[half];
                e = l.pop();
                lResult.add(v);
                invertir = Math.abs(v - e.first) > Math.abs(v - e.second);
                lResult.add(invertir ? e.second : e.first);
                lResult.add(invertir ? e.first : e.second);
            }
            while (!l.empty()) {
                Pair<Long, Long> e = l.pop();
                if (invertir) {
                    lResult.add(e.second);
                    lResult.add(e.first);
                } else {
                    lResult.add(e.first);
                    lResult.add(e.second);
                }
            }
            out.printLine(lResult.toArray(new Long[0]));
        }
    }
}
