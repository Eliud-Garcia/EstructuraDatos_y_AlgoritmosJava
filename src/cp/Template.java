
import java.io.*;
import java.util.*;

/**
 *
 * @author Eliud
 */

public class Template {

    static FastReader en = new FastReader();
    static FastWriter sa = new FastWriter();

    static void solve() throws IOException {
       
        
    }

    public static void main(String[] args) throws IOException {
        long t;
        t = en.nextLong();
        while (t-- > 0) {
            solve();
        }
        sa.close();

    }

    public static double log2(int x) {
        return Math.log(x) / Math.log(2);
    }

    static class SegmentTreeMax {

        private final int[] tree;
        private final int n; // input array length

        public SegmentTreeMax(int[] ar) {
            n = ar.length;
            tree = new int[n * 2];
            // store into the right end of the array
            System.arraycopy(ar, 0, tree, n, n);
            for (int i = n - 1; i > 0; i--) {
                tree[i] = Math.max(tree[2 * i], tree[2 * i + 1]);
            }
        }

        /**
         * @param i     - index to original array, inclusive
         * @param value - new value to be saved off
         */
        public void update(int i, int value) {
            i += n;
            tree[i] = value;
            int newValue;
            while (i > 1) {
                i >>= 1; // shift right is the same as divide by 2
                newValue = Math.max(tree[2 * i], tree[2 * i + 1]);
                if (tree[i] != newValue) {
                    tree[i] = newValue;
                } else {
                    return; // since no update is made
                }
            }
        }

        /**
         * Starts at the bottom of the tree and works its way up until reaching
         * nodes that cover the requested range. Note how we always start from
         * the right end of the array. Then on each iteration of the loop, the
         * index variables 'from' and 'to' are halved. Thus, on each iteration
         * we go up one level on the tree.
         *
         * Note that we only invoke Math.max() function if the indexes 'from'
         * and 'to' are odd. Why is that? It's because if the index is even,
         * then it's the left child node. We don't need to bother reading it
         * since we'll get another chance at doing it on the next level up. Of
         * course, this same logic applies on the next level up.
         *
         * @param from - inclusive
         * @param to   - exclusive
         * @return
         */
        public int max(int from, int to) {
            from += n; // go to second half of the array
            to += n;
            int max = Integer.MIN_VALUE;

            while (from < to) {
                if ((from & 1) == 1) { // 'from' is odd, so it is the right child of its parent, then interval includes
                                       // node 'from' but doesn't include its parent
                    max = Math.max(max, tree[from]);
                    from++;
                }
                if ((to & 1) == 1) { // 'to' is odd, so it's the right child of its parent, then might as well use
                                     // the parent
                    to--;
                    max = Math.max(max, tree[to]);
                }
                from >>= 1; // shift right is the same as divide by 2 but a little faster
                to >>= 1;
            }

            return max;
        }
    }

    static class FastWriter {

        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] leerArray(int n) {
            int res[] = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        long[] leerLongArray(int n) {
            long res[] = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }
    }

}
