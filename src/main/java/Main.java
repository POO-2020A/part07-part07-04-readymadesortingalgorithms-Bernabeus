
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};

    }

    public static void sort(int[] array) {
        int j = 0;
        while (true) {
            int pos = j;
            int a = array[j];
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < a) {
                    a = array[i];
                    pos = i;
                }
            }
            int aux = array[j];
            array[j] = array[pos];
            array[pos] = aux;
            j++;
            if (j == array.length) {
                break;
            }
        }
    }

    public static void sort(String[] array) {
        int j = 0;
        while (true) {
            int pos = j;
            String c = array[j];
            int a = 0;
            for (int i = 0; i < c.length(); i++) {
                a = a + (int) c.charAt(i);
            }
            for (int i = j + 1; i < array.length; i++) {
                String d = array[i];
                int e = 0;
                for (int m = 0; m < d.length(); m++) {
                    e = e + (int) d.charAt(m);
                }
                if (e < a) {
                    a = e;
                    c = array[i];
                    pos = i;
                }
            }

            String aux = array[j];
            array[j] = array[pos];
            array[pos] = aux;
            j++;
            if (j == array.length) {
                break;
            }
        }
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        int j = 0;
        while (true) {
            int pos = j;
            int a = integers.get(j);
            for (int i = j + 1; i < integers.size(); i++) {
                if (integers.get(i) < a) {
                    a = integers.get(i);
                    pos = i;
                }
            }
            int aux = integers.get(j);
            integers.set(j, integers.get(pos));
            integers.set(pos, aux);
            j++;
            if (j == integers.size()) {
                break;
            }
        }
    }

    public static void sortStrings(ArrayList<String> strings) {
        int j = 0;
        while (true) {
            int pos = j;
            String c = strings.get(j);
            int a = 0;
            for (int i = 0; i < c.length(); i++) {
                a = a + (int) c.charAt(i);
            }
            for (int i = j + 1; i < strings.size(); i++) {
                String d = strings.get(i);
                int e = 0;
                for (int m = 0; m < d.length(); m++) {
                    e = e + (int) d.charAt(m);
                }
                if (e < a) {
                    a = e;
                    c = strings.get(i);
                    pos = i;
                }
            }
            String aux = strings.get(j);
            strings.set(j, strings.get(pos));
            strings.set(pos, aux);
            j++;
            if (j == strings.size()) {
                break;
            }
        }
    }
}
