import java.util.Scanner;


public class tictactoe {
    public static void main(String[] args) {
        boolean isFinished = false;
        boolean playerWon= false;
        int activePlayer = 1;
        int[][] playGround = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        boolean feld1used = false;
        boolean feld2used = false;
        boolean feld3used = false;
        boolean feld4used = false;
        boolean feld5used = false;
        boolean feld6used = false;
        boolean feld7used = false;
        boolean feld8used = false;
        boolean feld9used = false;
        System.out.println("Welcome to tictactoe");
        while (!isFinished) {
            if((feld1used==true)&&(feld2used==true)&&(feld3used==true) &&(feld4used==true)&&(feld5used==true)&&(feld6used==true)&&(feld7used==true) &&(feld8used==true)&&(feld9used==true)){

                System.out.println("Thats a draw, all fields used");
                isFinished=true;
            }

            if ((playGround[0][0]==1)&&(playGround[0][1]==1)&&(playGround[0][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }
            if ((playGround[1][0]==1)&&(playGround[1][1]==1)&&(playGround[1][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }
            if ((playGround[2][0]==1)&&(playGround[2][1]==1)&&(playGround[2][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }
            if ((playGround[0][0]==1)&&(playGround[1][0]==1)&&(playGround[2][0]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }
            if ((playGround[0][1]==1)&&(playGround[1][1]==1)&&(playGround[2][1]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            } if ((playGround[0][2]==1)&&(playGround[1][2]==1)&&(playGround[2][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }if ((playGround[0][0]==1)&&(playGround[1][1]==1)&&(playGround[2][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }if ((playGround[0][2]==1)&&(playGround[1][1]==1)&&(playGround[2][0]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }




            if ((playGround[0][0]==2)&&(playGround[0][1]==2)&&(playGround[0][2]==2)){
                isFinished=true;
                System.out.println("player  two the game");
            }
            if ((playGround[1][0]==2)&&(playGround[1][1]==2)&&(playGround[1][2]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }
            if ((playGround[2][0]==2)&&(playGround[2][1]==2)&&(playGround[2][2]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }
            if ((playGround[0][0]==2)&&(playGround[1][0]==2)&&(playGround[2][0]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }
            if ((playGround[0][1]==2)&&(playGround[1][1]==2)&&(playGround[2][1]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            } if ((playGround[0][2]==2)&&(playGround[1][2]==2)&&(playGround[2][2]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }if ((playGround[0][0]==2)&&(playGround[1][1]==2)&&(playGround[2][2]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }if ((playGround[0][2]==2)&&(playGround[1][1]==2)&&(playGround[2][0]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }


            if ((activePlayer == 1)&&(!isFinished)) {

                System.out.println("Enter Your Choice for the Row Player 1  ");
                int playerChoiceX = scanner.nextInt();
                System.out.println("Enter Your Choice for the collumn  Player 1 ");
                int playerChoiceY = scanner.nextInt();

               if ((playerChoiceX == 1) && (playerChoiceY == 1) && (!feld1used)) {

                    feld1used = true;
                    activePlayer = 2;
                    playGround[0][0] = 1;

                } else if ((playerChoiceX == 1) && (playerChoiceY == 2) && (!feld2used)) {
                    feld2used = true;

                    activePlayer = 2;
                    playGround[0][1] = 1;

                } else if ((playerChoiceX == 1) && (playerChoiceY == 3) && (!feld3used)) {
                    feld3used = true;
                    activePlayer = 2;
                    playGround[0][2] = 1;

                } else if ((playerChoiceX == 2) && (playerChoiceY == 1) && (!feld4used)) {
                    feld4used = true;
                    activePlayer = 2;
                    playGround[1][0] = 1;

                } else if ((playerChoiceX == 2) && (playerChoiceY == 2) && (!feld5used)) {
                    feld5used = true;
                    activePlayer = 2;
                    playGround[1][1] = 1;

                } else if ((playerChoiceX == 2) && (playerChoiceY == 3) && (!feld6used)) {
                    feld6used = true;
                    activePlayer = 2;
                    playGround[1][2] = 1;

                } else if ((playerChoiceX == 3) && (playerChoiceY == 1) && (!feld7used)) {
                    feld7used = true;
                    activePlayer = 2;
                    playGround[2][0] = 1;

                } else if ((playerChoiceX == 3) && (playerChoiceY == 2) && (!feld8used)) {
                    feld8used = true;
                    activePlayer = 2;
                    playGround[2][1] = 1;

                } else if ((playerChoiceX == 3) && (playerChoiceY == 3) && (!feld9used)) {
                    feld9used = true;
                    activePlayer = 2;
                    playGround[2][2] = 1;

                } else {
                    System.out.println("this field is used or a wrong value");
                    activePlayer = 1;

                }
            }
                    for (int row = 0; row < playGround.length; row++) {

                        for (int col = 0; col < playGround.length; col++) {

                            String signToPrint = " ";
                            if (playGround[row][col] == 1) {
                                signToPrint = "x";
                            } else if (playGround[row][col] == 2) {
                                signToPrint = "o";
                            }
                            System.out.print(signToPrint + "|");

                        }

                        System.out.println();



                    }
            if((feld1used==true)&&(feld2used==true)&&(feld3used==true) &&(feld4used==true)&&(feld5used==true)&&(feld6used==true)&&(feld7used==true) &&(feld8used==true)&&(feld9used==true)){

                System.out.println("Thats a draw, all fields used");
                isFinished=true;
            }

            if ((playGround[0][0]==1)&&(playGround[0][1]==1)&&(playGround[0][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }
            if ((playGround[1][0]==1)&&(playGround[1][1]==1)&&(playGround[1][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }
            if ((playGround[2][0]==1)&&(playGround[2][1]==1)&&(playGround[2][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }
            if ((playGround[0][0]==1)&&(playGround[1][0]==1)&&(playGround[2][0]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }
            if ((playGround[0][1]==1)&&(playGround[1][1]==1)&&(playGround[2][1]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            } if ((playGround[0][2]==1)&&(playGround[1][2]==1)&&(playGround[2][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }if ((playGround[0][0]==1)&&(playGround[1][1]==1)&&(playGround[2][2]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }if ((playGround[0][2]==1)&&(playGround[1][1]==1)&&(playGround[2][0]==1)){
                isFinished=true;
                System.out.println("player one won the game");
            }




            if ((playGround[0][0]==2)&&(playGround[0][1]==2)&&(playGround[0][2]==2)){
                isFinished=true;
                System.out.println("player  two the game");
            }
            if ((playGround[1][0]==2)&&(playGround[1][1]==2)&&(playGround[1][2]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }
            if ((playGround[2][0]==2)&&(playGround[2][1]==2)&&(playGround[2][2]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }
            if ((playGround[0][0]==2)&&(playGround[1][0]==2)&&(playGround[2][0]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }
            if ((playGround[0][1]==2)&&(playGround[1][1]==2)&&(playGround[2][1]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            } if ((playGround[0][2]==2)&&(playGround[1][2]==2)&&(playGround[2][2]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }if ((playGround[0][0]==2)&&(playGround[1][1]==2)&&(playGround[2][2]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }if ((playGround[0][2]==2)&&(playGround[1][1]==2)&&(playGround[2][0]==2)){
                isFinished=true;
                System.out.println("player two won the game");
            }



                if ((activePlayer == 2)&&(!isFinished)) {
                    System.out.println("Enter Your Choice for the Row Player 2 ");
                    int playerChoiceX2 = scanner.nextInt();
                    System.out.println("Enter Your Choice for the collumn  Player 2 ");
                    int playerChoiceY2 = scanner.nextInt();


                    if ((playerChoiceX2 == 1) && (playerChoiceY2 == 1) && (!feld1used)) {

                        feld1used = true;

                        activePlayer = 1;
                        playGround[0][0] = 2;
                    } else if ((playerChoiceX2 == 1) && (playerChoiceY2 == 2) && (!feld2used)) {
                        feld2used = true;

                        activePlayer = 1;
                        playGround[0][1] = 2;

                    }
                    else if ((playerChoiceX2 == 1) && (playerChoiceY2 == 3) && (!feld3used)) {
                        feld3used = true;
                        activePlayer = 1;
                        playGround[0][2] = 2;

                    } else if ((playerChoiceX2 == 2) && (playerChoiceY2 == 1) && (!feld4used)) {
                        feld4used = true;
                        activePlayer = 1;
                        playGround[1][0] = 2;

                    } else if ((playerChoiceX2 == 2) && (playerChoiceY2 == 2) && (!feld5used)) {
                        feld5used = true;
                        activePlayer = 1;
                        playGround[1][1] = 2;

                    } else if ((playerChoiceX2 == 2) && (playerChoiceY2 == 3) && (!feld6used)) {
                        feld6used = true;
                        activePlayer = 1;
                        playGround[1][2] = 2;

                    } else if ((playerChoiceX2 == 3) && (playerChoiceY2 == 1) && (!feld7used)) {
                        feld7used = true;
                        activePlayer = 1;
                        playGround[2][0] = 2;

                    } else if ((playerChoiceX2 == 3) && (playerChoiceY2 == 2) && (!feld8used)) {
                        feld8used = true;
                        activePlayer = 1;
                        playGround[2][1] = 2;

                    } else if ((playerChoiceX2 == 3) && (playerChoiceY2 == 3) && (!feld9used)) {
                        feld9used = true;
                        activePlayer = 1;
                        playGround[2][2] = 2;

                    } else {
                        System.out.println("this field is used or a wrong value");
                        activePlayer =2;

                    }

                    for (int row = 0; row < playGround.length; row++) {

                        for (int col = 0; col < playGround.length; col++) {

                            String signToPrint = " ";
                            if (playGround[row][col] == 1) {
                                signToPrint = "x";
                            } else if (playGround[row][col] == 2) {
                                signToPrint = "o";
                            }
                            System.out.print(signToPrint + "|");

                        }

                        System.out.println();


                    }

                }


            }
        }
    }


