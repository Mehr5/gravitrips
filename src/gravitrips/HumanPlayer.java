package gravitrips;

import java.util.Scanner;

class HumanPlayer extends Player {

    public HumanPlayer() {
        setChip(Chip.X);
    }

    @Override
    public int makeMove() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter column from 1 to 7: ");
        int column = scanner.nextInt();


        while (column < 1 || column > 7) {

            System.out.println("The number you have entered does not meet the requirements.");
            System.out.println(" Please choose number between 1 and 7");
            column = scanner.nextInt();

            if (column >= 1 && column <= 7) {
                break;
            }
        }
        column--;
        return column;
    }
}

