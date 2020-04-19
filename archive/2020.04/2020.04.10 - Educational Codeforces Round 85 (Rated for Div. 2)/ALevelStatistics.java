package sk.gargoris;

import net.egork.collections.Pair;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class ALevelStatistics {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int numberTests = in.readInt();
        for (int i = 0; i < numberTests; i++) {
            int moments = in.readInt();
            boolean ok = true;
            Pair<Integer, Integer> old = Pair.makePair(0,0);
            for (int i1 = 0; i1 < moments; i1++) {
                int[] aStat = in.readIntArray(2);
                if (i1==0){
                    old = Pair.makePair(aStat[0], aStat[1]);
                }
                ok =
                        ok && (aStat[0]>=old.first && aStat[1]>=old.second)
                                && ((aStat[0]==old.first && aStat[1]==old.second) || (aStat[0] > old.first && aStat[1]>= old.second))
                && (aStat[0]>=aStat[1]);
                old = Pair.makePair(aStat[0], aStat[1]);
            }
            if (ok) {
                out.printLine("YES");
            } else {
                out.printLine("NO");
            }
        }
    }
}
