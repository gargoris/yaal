package sk.gargoris;

import java.util.ArrayList;
import java.util.List;

public class ThreeNeighbors {

    public String[] construct (int N){
        String[] dev=null;

        if (N==0){
            dev = new String[]{"."};
        }else {
            int rest = N%48;
            int rows = Integer.divideUnsigned(N, 48);
            List<String> t  = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                t.addAll(getStrings(48, i%2==0));
            }
            if (rest!=0){
                t.addAll(getStrings(rest, rows%2==0));
            }
            dev = t.toArray(new String[0]);
        }

        return dev;
    }

    protected List<String> getStrings(int N, boolean par) {
        List<String> dev = new ArrayList<>();
        char[] up = new char[N+2];
        char[] down = new char[N+2];
        for (int i = 0; i < N + 2; i++) {
            up[i] = par?'X':'.';
            down[i]=par?'.':'X';
        }
        dev.add(new String(up));
        dev.add(new String(down));
        return dev;
    }

    public static void main(String[] args) {

        ThreeNeighbors t = new ThreeNeighbors();
        for (String s : t.construct(4)) {
            System.out.println(s);
        }
    }
}
