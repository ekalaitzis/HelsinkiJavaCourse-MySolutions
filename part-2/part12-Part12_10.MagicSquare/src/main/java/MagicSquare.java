
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }
        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> total = new ArrayList<>();

        for (int row = 0; row < square.length; row++) {
            int sum = 0;
            for (int col = 0; col < square[row].length; col++) {
                sum = sum + square[row][col];
            }
            total.add(row, sum);
        }
        return total;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> total = new ArrayList<>();

        for (int col = 0; col < square.length; col++) {
            int sum = 0;
            for (int row = 0; row < square[col].length; row++) {
                sum = sum + square[row][col];
            }
            total.add(col, sum);
        }
        return total;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList totalD = new ArrayList<>();

        int sum = 0;
        int sum2 = 0;
        for (int index = 0; index < square.length; index++) {
            sum += square[index][index];
        }
        totalD.add(sum);
//        for (int col = square.length - 1; col >= 0; col--) {
//            for (int row = 0; row < square[col].length; row++) {
//                if (col +row == square.length -1) {
//                    sum2 += square[col][row];
//                }
//            }
//        }
        for (int col = square.length - 1; col >= 0; col--) {
            int row = square.length - 1 - col;
//            sum2 += square[col][row];
        }
        totalD.add(sum2);
        return totalD;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
