public class Main {
    public static void main(String[] args) {
        homework_5();
    }

    public static void homework_5() {
//task1

        int[] firstArr = new int[3];
        firstArr[0] = 1;
        firstArr[1] = 2;
        firstArr[2] = 3;

        double[] secondArr = {1.57, 7.654, 9.986};

        char[] thirdArr = {'a', 'b', 'c'};


//task 2

        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i]);
            if (i < firstArr.length - 1) {
                System.out.print(", ");
            } else System.out.println();
        }

        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i]);
            if (i < secondArr.length - 1) {
                System.out.print(", ");
            } else System.out.println();
        }

        for (int i = 0; i < thirdArr.length; i++) {
            System.out.print(thirdArr[i]);
            if (i < thirdArr.length - 1) {
                System.out.print(", ");
            } else System.out.println();
        }

        System.out.println();

//task3
        int arrLength;

        for (arrLength = firstArr.length; arrLength > 0; arrLength--) {
            System.out.print(firstArr[arrLength - 1]);
            if (arrLength > 1) {
                System.out.print(", ");
            } else System.out.println();
        }

        for (arrLength = secondArr.length; arrLength > 0; arrLength--) {
            System.out.print(secondArr[arrLength - 1]);
            if (arrLength > 1) {
                System.out.print(", ");
            } else System.out.println();
        }

        for (arrLength = thirdArr.length; arrLength > 0; arrLength--) {
            System.out.print(thirdArr[arrLength - 1]);
            if (arrLength > 1) {
                System.out.print(", ");
            } else System.out.println();
        }

        System.out.println();

//task4

        for (int i = 0; i < firstArr.length; i++) {
            if ((firstArr[i] % 2) != 0) {
                firstArr[i] = firstArr[i] + 1;
            }

            System.out.print(firstArr[i]);
            if (i < 2) {
                System.out.print(", ");
            } else System.out.println();
        }
    }
}