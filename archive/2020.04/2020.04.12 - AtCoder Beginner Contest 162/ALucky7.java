package sk.gargoris;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class ALucky7 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        char[] a = in.readCharArray(3);
        boolean yes7 = a[0] == '7' || a[1] == '7' || a[2] == '7';
        if (yes7) out.printLine("Yes"); else out.printLine("No");
    }
}
