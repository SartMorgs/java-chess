package com.company;

public class Game {
    // seta que o atributo existe
    private Board board;
    // Mudar pra lista
    private Piece[] whitePieces;
    private Piece[] blackPieces;

    public Game() {
        // inicializa o tabuleiro
        board = new Board();

        // cria torres brancas
        whitePieces[0] = new Piece("rookW1", true, "rook");
        whitePieces[1] = new Piece("rookW2", true, "rook");

        // cria torres pretas
        blackPieces[0] = new Piece("rookB1", false, "rook");
        blackPieces[1] = new Piece("rookB2", false, "rook");

        // cria cavalos brancos
        whitePieces[2] = new Piece("knightW1", true, "knight");
        whitePieces[3] = new Piece("knightW2", true, "knight");

        // cria cavalos pretos
        blackPieces[2] = new Piece("knightB1", false, "knight");
        blackPieces[3] = new Piece("knightB2", false, "knight");

        // bispos brancos
        whitePieces[4] = new Piece("bishopW1", true, "bishop");
        whitePieces[5] = new Piece("bishopW2", true, "bishop");

        // bispos pretos
        blackPieces[4] = new Piece("bishopB1", false, "bishop");
        blackPieces[5] = new Piece("bishopB2", false, "bishop");

        // rainha branca
        whitePieces[6] = new Piece("queenW1", true, "queen");

        // rainha preta
        blackPieces[6] = new Piece("queenB1", false, "queen");

        // rei branco
        whitePieces[7] = new Piece("kingW1", true, "king");

        // rei preto
        blackPieces[7] = new Piece("kingB1", false, "king");

        Integer countPawn = 0;
        // peões brancos
        for(Integer count = 8; count < 16; count++){
            countPawn = count - 8;
            whitePieces[count] = new Piece("pawnW" + countPawn.toString(), true, "pawn");
        }

        // peões pretos
        for(Integer count = 8; count < 16; count++){
            countPawn = count - 8;
            blackPieces[count] = new Piece("pawnB" + countPawn.toString(), false, "pawn");
        }
    }
}
