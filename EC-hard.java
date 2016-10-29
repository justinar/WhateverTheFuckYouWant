package whateverthifuckyouwant;
public class Whateverthefuckyouwant {
Scanner input = new Scanner(System.in);
        String arrayToHoldInputs[] = new String[3];
        int peice[][] = new int[3][3];
        int board[][] = new int[6][3];

        System.out.println("Show me what the peice looks like :3");
        arrayToHoldInputs[0] = input.next();
        arrayToHoldInputs[1] = input.next();
        arrayToHoldInputs[2] = input.next();
        populateArray(peice, arrayToHoldInputs);
        System.out.println("wanna show me what the board looks like??");
        arrayToHoldInputs[0] = input.next();
        arrayToHoldInputs[1] = input.next();
        arrayToHoldInputs[2] = input.next();
        populateArray(board, arrayToHoldInputs);

    }

    static void populateArray(int array[][], String arrayHoldingInputs[]) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (arrayHoldingInputs[i].length() == 3) {
                    if (j == 0) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    } else if (j == 1) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    } else if (j == 2) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    }
                }else if (arrayHoldingInputs[i].length() == 3){
                    if (j == 0) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    } else if (j == 1) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    } else if (j == 2) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    }else if (j == 3) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    } else if (j == 4) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    } else if (j == 5) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    }
                }
            }

        }

    }
}
