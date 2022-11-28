public class Main {
    public static void main(String[] args) {
        Reverser();
        Filler();
        Multiplier();
        DiagonalFiller();
        MassiveMaker();
    }

    public static void Reverser() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                array[i] = 0;
            else array[i] = 1;

            }
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i]));
        }
        System.out.println(' ');
      }
    public static void Filler() {
        int[] array = new int[100];
        for (int j = 0; j < array.length; j++) {
            array[j] = j + 1;
            System.out.print((array[j]));
          }
        System.out.println(' ');
        }
        public static void Multiplier() {
        int[] array = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
            System.out.print((array[i]));
          }
        System.out.println(' ');
        }
        public static void DiagonalFiller() {
        int[][] array = new int[5][5];
          for (int i = 0; i < array.length; i++) {
             for (int j = 0, x = array[i].length; j < array[i].length; j++, x--) {
                 if (i == j || i == x - 1) array[i][j] = 1;
                 System.out.print(array[i][j] + " ");
             }
             System.out.print("\n");
          }
    }
        public static void MassiveMaker() {
        int len = 5;
        int initialValue = 7;
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i]);
        }
        }
}



