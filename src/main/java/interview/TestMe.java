package interview;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMe {

    public static void main(String[] args) {
        TestMe testMe = new TestMe();
        testMe.t1();
        testMe.t2();
        testMe.t3();

    }
    public void t1() {
        // case 1
        HashMap hashMap = new HashMap();
        hashMap.put("a", "1");
        hashMap.put("b", 2);
        hashMap.put("c", true);
        printMap(hashMap);

    }

    private void printMap(Map map) {
        // implement me...

    }

    public void t2() {
        //case 2
        String[] array = new String[3];
        // populate the array

        printArray(array);
    }

    private void printArray(String[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public void t3() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("test.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}