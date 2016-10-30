package whateverthifuckyouwant;
import java.util.Scanner
public class Whateverthefuckyouwant {

        Scanner input = new Scanner(System.in);
        String arrayToHoldInputs[] = new String[3];
        int piece[][] = new int[3][3];
        int board[][] = new int[6][3];

        System.out.println("Show me what the peice looks like :3");
        arrayToHoldInputs[0] = input.next();
        arrayToHoldInputs[1] = input.next();
        arrayToHoldInputs[2] = input.next();
        populateArray(piece, arrayToHoldInputs);
        System.out.println("wanna show me what the board looks like??");
        arrayToHoldInputs[0] = input.next();
        arrayToHoldInputs[1] = input.next();
        arrayToHoldInputs[2] = input.next();
        populateArray(board, arrayToHoldInputs);
        int doesPieceTouchBottom=0;
        
        for (int j=0; j< piece.length; j++){
            if (piece[j][2] == 1){
                doesPieceTouchBottom= 1;    
        }
        if (doesPieceTouchBottom == 0){
            for (j=piece[0].length-1; j>-1;j--){
                for(int i=0;i<piece.length; i++){
                    if (j>0){
                    piece[i][j]=piece[i][j-1];
                }else if (j==0){
                    piece[i][j]=0;
                }
            }
        }
        }
        
    }
        
    }

    static void populateArray(int array[][], String arrayHoldingInputs[]) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                        if (arrayHoldingInputs[i].charAt(j) == 'x') {
                            array[j][i] = 1;
                        } else if (arrayHoldingInputs[i].charAt(j) == '_') {
                            array[j][i] = 0;
                        }
                    
                    }
                }
            }

        }

    
