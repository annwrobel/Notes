//package game;
//
//import Zajecia7.IllegalFieldException;
//
//import java.util.Arrays;
//import java.util.IllegalFormatCodePointException;
//
///**
// * Created by RENT on 2016-12-08.
// */
//public class GameBoard {
//    public static final int WIDTH = 3;
//    public static final int HEIGHT = 3;
//    private Mark[][] board;
//
//    public GameBoard() {
//        board = new Mark[HEIGHT][WIDTH];
//    }
//
//
//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append("\t  A\t  B\t  C");
//        for (int i = 0; i < HEIGHT; i++) {
//            stringBuilder.append("\n");
//            stringBuilder.append((i + 1) + ":\t");
//            for (int j = 0; j < WIDTH; j++) {
//                Mark mark = board[i][j];
//                stringBuilder.append("[");
//                stringBuilder.append(mark == null ? " " : mark);
//                stringBuilder.append(" ]");
//
//            }
//        }
//
//        return stringBuilder.toString();
//    }
//
//    public boolean setMark(String field, Mark mark) throws IllegalFieldException {
//        String columnField = field.substring(0, 1);
//        String rowField = field.substring(1, 2);
//
//        int row = transformRowField(rowField);
//        int column = transformColumnField(columnField);
//
//        if (board[row][column] == null) {
//            board[row][column] = mark;
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//
//    private int transformRowField(String rowField) throws IllegalFieldException {
//        switch (rowField) {
//            case "1":
//                return 0;
//            case "2":
//                return 1;
//            case "3":
//                return 2;
//            default:
//                throw new IllegalFieldException("Illegal row field " + rowField);
//        }
//    }
//
//    private int transformColumnField(String columnField) throws IllegalFieldException {
//        switch (columnField) {
//            case "A":
//                return 0;
//            case "B":
//                return 1;
//            case "C":
//                return 2;
//            default:
//                throw new IllegalFieldException("");
//        }
//    }
//
//    public Mark[][] getBoard() {
//        return board;
//    }
//
//}
//
//
//
//
//    private int transformRowField (String rowField) throws IllegalFieldException{
//        switch (rowField){
//            case "1";
//               return 0;
//            case "2";
//                return 1;
//            case "3";
//                return 2;
//            default:
//                return -1;
//        }
//    }
//        private void transformColumnField (String columnField) throws IllegalFieldException{
//            switch (columnField){
//                case "A";
//                    return 0;
//                case "B";
//                    return 1;
//                case "C";
//                    return 2;
//                default:
//                    throw new IllegalFieldException();
//            }
//        }
//}
