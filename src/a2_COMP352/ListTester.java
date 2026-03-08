package a2_COMP352;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nValues = {10, 100, 1000, 10000, 100000, 1000000};

        try {
            PrintWriter out = new PrintWriter("testrun.txt");

            for (int a = 0; a < nValues.length; a++) {
                int n = nValues[a];

                // insertion times
                long myArrayStartInsert = testInsertStartMyArrayList(n);
                long arrayStartInsert = testInsertStartArrayList(n);
                long myLinkedStartInsert = testInsertStartMyLinkedList(n);
                long linkedStartInsert = testInsertStartLinkedList(n);

                long myArrayEndInsert = testInsertEndMyArrayList(n);
                long arrayEndInsert = testInsertEndArrayList(n);
                long myLinkedEndInsert = testInsertEndMyLinkedList(n);
                long linkedEndInsert = testInsertEndLinkedList(n);

                long myArrayRandomInsert = testInsertRandomMyArrayList(n);
                long arrayRandomInsert = testInsertRandomArrayList(n);
                long myLinkedRandomInsert = testInsertRandomMyLinkedList(n);
                long linkedRandomInsert = testInsertRandomLinkedList(n);

                out.println("N = " + n + " Insert@start(ms) Insert@end(ms) Insert@random(ms)");
                out.println("MyArrayList " + myArrayStartInsert + " " + myArrayEndInsert + " " + myArrayRandomInsert);
                out.println("ArrayList " + arrayStartInsert + " " + arrayEndInsert + " " + arrayRandomInsert);
                out.println("MyLinkedList " + myLinkedStartInsert + " " + myLinkedEndInsert + " " + myLinkedRandomInsert);
                out.println("LinkedList " + linkedStartInsert + " " + linkedEndInsert + " " + linkedRandomInsert);
                out.println();

                // removal t
                long myArrayStartRemove = testRemoveStartMyArrayList(n);
                long arrayStartRemove = testRemoveStartArrayList(n);
                long myLinkedStartRemove = testRemoveStartMyLinkedList(n);
                long linkedStartRemove = testRemoveStartLinkedList(n);

                long myArrayEndRemove = testRemoveEndMyArrayList(n);
                long arrayEndRemove = testRemoveEndArrayList(n);
                long myLinkedEndRemove = testRemoveEndMyLinkedList(n);
                long linkedEndRemove = testRemoveEndLinkedList(n);

                long myArrayRandomRemove = testRemoveRandomMyArrayList(n);
                long arrayRandomRemove = testRemoveRandomArrayList(n);
                long myLinkedRandomRemove = testRemoveRandomMyLinkedList(n);
                long linkedRandomRemove = testRemoveRandomLinkedList(n);

                long myArrayValueRemove = testRemoveValueMyArrayList(n);
                long arrayValueRemove = testRemoveValueArrayList(n);
                long myLinkedValueRemove = testRemoveValueMyLinkedList(n);
                long linkedValueRemove = testRemoveValueLinkedList(n);

                out.println("N = " + n + " Remove@start(ms) Remove@end(ms) Remove@random(ms) RemoveByValue(ms)");
                out.println("MyArrayList\t " + myArrayStartRemove + "\t" + myArrayEndRemove + "\t" + myArrayRandomRemove + "\t" + myArrayValueRemove);
                out.println("ArrayList\t" + arrayStartRemove + "\t" + arrayEndRemove + "\t" + arrayRandomRemove + "\t" + arrayValueRemove);
                out.println("MyLinkedList\t" + myLinkedStartRemove + "\t" + myLinkedEndRemove + "\t" + myLinkedRandomRemove + "\t" + myLinkedValueRemove);
                out.println("LinkedList\t" + linkedStartRemove + "\t" + linkedEndRemove + "\t" + linkedRandomRemove + "\t" + linkedValueRemove);
                out.println();
            }

            out.close();
            System.out.println("Results saved in testrun.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Error creating testrun.txt");
        }
    }


    //insert start using add
    public static long testInsertStartMyArrayList(int n) {
        MyArrayList<Integer> list = new MyArrayList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.add(0, value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertStartArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.add(0, value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertStartMyLinkedList(int n) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.add(0, value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertStartLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.add(0, value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    // insert at end, using add

    public static long testInsertEndMyArrayList(int n) {
        MyArrayList<Integer> list = new MyArrayList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.add(value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertEndArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.add(value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertEndMyLinkedList(int n) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.add(value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertEndLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.add(value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    // insert random
    public static long testInsertRandomMyArrayList(int n) {
        MyArrayList<Integer> list = new MyArrayList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            int index = random.nextInt(list.size() + 1);
            list.add(index, value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertRandomArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            int index = random.nextInt(list.size() + 1);
            list.add(index, value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertRandomMyLinkedList(int n) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            int index = random.nextInt(list.size() + 1);
            list.add(index, value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testInsertRandomLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            int index = random.nextInt(list.size() + 1);
            list.add(index, value);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    // remove from start
    public static long testRemoveStartMyArrayList(int n) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveStartArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveStartMyLinkedList(int n) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveStartLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(0);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    // remove from end
    public static long testRemoveEndMyArrayList(int n) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveEndArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveEndMyLinkedList(int n) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveEndLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.remove(list.size() - 1);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    // remove from random

    public static long testRemoveRandomMyArrayList(int n) {
        MyArrayList<Integer> list = new MyArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveRandomArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveRandomMyLinkedList(int n) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveRandomLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    // remove value
    public static long testRemoveValueMyArrayList(int n) {
        MyArrayList<Integer> list = new MyArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.remove(Integer.valueOf(value));
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveValueArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.remove(Integer.valueOf(value));
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveValueMyLinkedList(int n) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.remove(Integer.valueOf(value));
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long testRemoveValueLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int value = random.nextInt(2 * n + 1);
            list.remove(Integer.valueOf(value));
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

}


