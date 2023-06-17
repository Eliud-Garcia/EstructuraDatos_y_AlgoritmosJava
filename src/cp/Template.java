
import java.io.*;
import java.util.*;

public class Template {

    // static FastReader en = new FastReader();
    static FastWriter sa = new FastWriter();
    static InputReader en = new InputReader();

    
    static void solve() throws IOException {
        

    }

    public static void main(String[] args) throws IOException {
        long t;
        t = 1;
        while (t-- > 0) {
            solve();
        }
        sa.close();

    }

    public static double log2(int x) {
        return Math.log(x) / Math.log(2);
    }

    static int lower_bound(List<Integer> a, long x) {
        int l = -1, r = a.size();
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a.get(m) >= x)
                r = m;
            else
                l = m;
        }
        return r;
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

    static int upper_bound(List<Integer> a, int x) {
        int l = -1, r = a.size();
        while (l + 1 < r) {
            int m = (l + r) >>> 1;
            if (a.get(m) <= x)
                l = m;
            else
                r = m;
        }
        return l + 1;
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

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader() {
            this.stream = System.in;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

}
