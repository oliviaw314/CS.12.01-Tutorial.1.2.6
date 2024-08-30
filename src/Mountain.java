import java.util.Arrays;

public class Mountain {
    public static boolean isIncreasing(int[] array, int stop) {
        System.out.println(array);
        for (int i = 0; i < stop - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] array, int start) {
        System.out.println(start);
        for (int i = start; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isMountain(int[] array) {

        int peakIndex = getPeakIndex(array);
        if (peakIndex <= 0 || peakIndex >= array.length - 1) {
            // have to make sure that peak is not at 0 or last index OR that there is no peak (getPeakIndex returns -1)
            return false;
        } else return isIncreasing(array, peakIndex) && isDecreasing(array, peakIndex);


    }
}