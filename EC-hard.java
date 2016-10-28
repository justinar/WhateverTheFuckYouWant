package whateverthifuckyouwant;
public class Whateverthefuckyouwant {
    int piece[][] = new int[3][3];
        int board[][]= new int[6][3];
        System.out.println("give me what your piece looks like mate!");
        populateArray(piece);
        System.out.println("give me what board we're working with please!");
        populateArray(board);
        

    }

    static void populateArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 3;
                while (array[i][j] == 3) {
                    switch (input.next()) {
                        case "_":
                            array[i][j] = 0;
                            break;
                        case "x":
                            array[i][j] = 1;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}
