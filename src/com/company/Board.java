package com.company;

public class Board {
    Integer sizeBoard = 8;
    Field[][] board;

    public Board(){
        boolean currencyDark = true;

        for(int count_x = 0; count_x < sizeBoard; count_x++){
            for(int count_y = 0; count_y < sizeBoard; count_y++){
                if(count_y == 0){
                    board[count_x][count_y] = new Field(count_x, count_y, currencyDark);
                }
                else{
                    if(currencyDark){
                        currencyDark = false;
                    }
                    else{
                        currencyDark = true;
                    }
                    board[count_x][count_y] = new Field(count_x, count_y, currencyDark);
                }
            }
        }
    }

    public void resetBoard(){
        for(int count_x = 0; count_x < sizeBoard; count_x++){
            for(int count_y = 0; count_y < sizeBoard; count_y++) {
                board[count_x][count_y].setPieceName(null);
            }
        }
    }

    public void initBoard(){
        // Set King
        board[4][1].setPieceName("kingB1");
        board[4][6].setPieceName("kingW1");

        // Set Queen
        board[3][1].setPieceName("queenB1");
        board[3][6].setPieceName("queenW1");

        // Set Bishop
        board[2][1].setPieceName("bishopB1");
        board[5][1].setPieceName("bishopB2");
        board[2][6].setPieceName("bishopW1");
        board[5][6].setPieceName("bishopW2");

        // Set Knight
        board[1][1].setPieceName("knightB1");
        board[6][1].setPieceName("knightB2");
        board[1][6].setPieceName("knightW1");
        board[6][6].setPieceName("knightW2");

        // Set Rook
        board[0][1].setPieceName("rookB1");
        board[7][1].setPieceName("rookB2");
        board[0][6].setPieceName("rookW1");
        board[7][6].setPieceName("rookW2");

        // Set Pawn
        for(Integer count_x = 0; count_x < sizeBoard; count_x++){
            board[count_x][1].setPieceName("pawnB" + count_x.toString());
            board[count_x][6].setPieceName("pawnW" + count_x.toString());
        }
    }
}
