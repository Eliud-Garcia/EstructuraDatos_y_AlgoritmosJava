
import java.util.*;
import java.io.*;

public class Template {

    static FastReader en = new FastReader();
    static final Random random = new Random();
    static long mod = 1000000007L;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String args[]) throws IOException {
        int casos = en.nextInt();
        StringBuilder res = new StringBuilder();
        int n = 1;
        loop:
        while (casos-- > 0) {
                
            
        }
        print(res);

    }

    static int max(int a, int b) {
        if (a < b) {
            return b;
        }
        return a;
    }

    static void ruffleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int oi = random.nextInt(n), temp = a[oi];
            a[oi] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }

    static < E> void print(E res) {
        System.out.println(res);
    }

    static int MCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return MCD(b, a % b);
    }

    static int MCM(int a, int b) {
        return (a / MCD(a, b)) * b;
    }

    static int abs(int a) {
        if (a < 0) {
            return -1 * a;
        }
        return a;
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
