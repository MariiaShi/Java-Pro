package homework5;

public class MathUtils {

    // AVG methods
    public static double avg(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double avg(double a, double b) {
        return (a + b) / 2.0;
    }

    public static double avg(int a, double b) {
        return (a + b) / 2.0;
    }

    public static double avg(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static double avg(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // MAX methods
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static double max(int a, double b) {
        return Math.max(a, b);
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // MIN methods
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static double min(int a, double b) {
        return Math.min(a, b);
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println("AVG (int, int): " + avg(2, 4));
        System.out.println("AVG (double, double): " + avg(2.2, 4.4));
        System.out.println("AVG (int, double): " + avg(2, 4.4));
        System.out.println("AVG (int array): " + avg(intArray));
        System.out.println("AVG (double array): " + avg(doubleArray));

        System.out.println("MAX (int, int): " + max(2, 4));
        System.out.println("MAX (double, double): " + max(2.2, 4.4));
        System.out.println("MAX (int, double): " + max(2, 4.4));
        System.out.println("MAX (int array): " + max(intArray));
        System.out.println("MAX (double array): " + max(doubleArray));

        System.out.println("MIN (int, int): " + min(2, 4));
        System.out.println("MIN (double, double): " + min(2.2, 4.4));
        System.out.println("MIN (int, double): " + min(2, 4.4));
        System.out.println("MIN (int array): " + min(intArray));
        System.out.println("MIN (double array): " + min(doubleArray));
    }
}





