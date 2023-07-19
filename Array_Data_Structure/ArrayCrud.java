package Array_Data_Structure;

import java.util.Scanner;

public class ArrayCrud {
    // CRUD create read update delete
    int arr[];
    static int currentsize;

    ArrayCrud(int n) {
        this.arr = new int[n];
        this.currentsize = 0;
    }

    // int x[]=new int[5]
    // int []z,int z[]
    void insert(int index, int item) {
        if (index > currentsize) {
            System.out.println("not");
            return;
        }
        for (int i = currentsize - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = item;
        currentsize++;

    }

    public void delete(int index) {
        if (currentsize == 0) {
            System.out.println("empty array");
            return;
        }
        for (int i = index; i < currentsize - i; i++) {
            arr[i] = arr[i + 1];

        }
        arr[currentsize - 1] = 0;
        currentsize--;
    }

    void update(int valuetosearch, int valuetoupdate) {
        int index = search(valuetosearch);
        if (index == -1) {
            return;
        } else {
            arr[index] = valuetoupdate;
            System.out.println("value updated");
            print();

        }
    }

    public int search(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        System.out.println("element not found");
        return -1;
    }

    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ,");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayCrud ar = new ArrayCrud(6);
        while (true) {
            System.out.println("Enter choice: ");
            System.out.println("1: insert  2: Delete  3: Search  4: update 5: Print \n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ar.insert(0, 10);
                    ar.insert(1, 11);
                    ar.insert(2, 12);
                    ar.insert(3, 13);
                    ar.insert(4, 14);
                    ar.insert(5, 15);
                    ar.print();
                    break;
                case 2:
                    ar.delete(2);
                    ar.print();
                    break;
                case 3:
                    ar.search(15);
                    break;
                case 4:
                    System.out.println("update Array elements: ");
                    ar.update(10, 9);
                    ar.print();
                    break;

                case 5:
                    System.out.println("Print element:  ");
                    ar.print();
                    break;
                default:
                    System.out.println("Wrong choice selected");

            }
        }

    }
}
