package DSAVisualizerCLI.utils;

public class Visualizer {
    public static void printArray(int[] arr,int... Highlight) {
        for (int i = 0;i<arr.length;i++) {
            boolean highlight = false;
            for (int h: Highlight) {
                if (i == h) {
                    highlight = true;
                    break;
                }
            }
            if (highlight) {
                System.out.printf("[ "+ arr[i] + " ]");
            }
            else {
                System.out.printf(" "+ arr[i] + " ");
            }
        }
        System.out.println();
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
