//package game;
//
//import java.util.Scanner;
//
///**
// * Created by RENT on 2016-12-08.
// */
//public class Game {
//    private Display display;
//    private GameLogic gameLogic;
//    private Player player1;
//    private Player player2;
//    private Player currentPlayer;
//    private GameBoard gameBoard;
//
//    Game() {
//        display = new Display();
//        gameBoard = new GameBoard();
//        gameLogic = new GameLogic();
//    }
//
//    public void start() {
//        createPlayers();
//
//        while (true) {
//            readAndPerformMove();
//            displayBoard();
//
//            if (gameLogic.checkWinCondition(gameBoard)) {
//                System.out.println("Gra skończona, WYGRANA");
//                break;
//            }
//        }
//
//    }
//
//    private void displayBoard() {
//        System.out.println(gameBoard);
//    }
//
//    private void readAndPerformMove() {
//        String move;
//
//        boolean shouldRetry = false;
//        do{
//            System.out.println("Podaj ruch gracza " + currentPlayer.getMark() + " (" + currentPlayer.getName() + ") : ");
//            move = new Scanner(System.in).nextLine();
//
//            try {
//                if(gameBoard.setMark(move, currentPlayer.getMark())){
//                    shouldRetry = false;
//                } else {
//                    shouldRetry = true;
//                }
//
//                shouldRetry = !gameBoard.setMark(move, currentPlayer.getMark());
//            } catch (IllegalFieldException e) {
//                shouldRetry = true;
//            }
//
//        }while (shouldRetry);
//
//
//
//        if (currentPlayer == player1) {
//            currentPlayer = player2;
//        } else {
//            currentPlayer = player1;
//        }
//    }
//
//    private void createPlayers() {
//        player1 = createPlayer(Mark.TIC);
//        player2 = createPlayer(Mark.TOE);
//        currentPlayer = player1;
//    }
//
//    private Player createPlayer(Mark mark) {
//        System.out.println("Podaj imię gracza " + mark.getCharMark());
//        String playerName = new Scanner(System.in).nextLine();
//        Player player = new Player(playerName, mark);
//        System.out.println("Stworzono gracza: " + player);
//        return player;
//    }
//}