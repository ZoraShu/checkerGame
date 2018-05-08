//package Game;
//
//import org.junit.Test;
//import sun.security.util.AuthResources_pt_BR;
//
//import static org.junit.Assert.*;
//
///**
// * Created by yueshu on 5/7/18.
// */
//public class CheckerPlayTest {
//    @Test
//    public void test() {
//        CheckerPlay checkerPlay = new CheckerPlay();
//        printGraph(checkerPlay._chestBoard);
//        printGraph1(checkerPlay._chestBoard);
//
//        System.out.println("---- Step1 --- ");
//        boolean valid1 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), 1, 40/8, 40%8, 33/8, 33%8);
//        checkerPlay.findAllMovable(-1);
//
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid1);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//
//        System.out.println("---- Step2 --- ");
//        boolean valid2 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), -1, 19/8, 19%8, 26/8, 26%8);
//
//        checkerPlay.findAllMovable(1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//
//        System.out.println("");
//        System.out.println(valid2);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//
//        System.out.println("---- Step3 --- ");
//        boolean valid3 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), 1, 33/8, 33%8, 19/8, 19%8);
//        checkerPlay.findAllMovable(-1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//
//
//
//        System.out.println("");
//        System.out.println(valid3);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step4 --- ");
//        boolean valid4 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), -1, 21/8, 21%8, 28/8, 28%8);
//
//        checkerPlay.findAllMovable(1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid4);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step5 --- ");
//        boolean valid5 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), 1, 46/8, 46%8, 37/8, 37%8);
//        checkerPlay.findAllMovable(-1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid5);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step6 --- ");
//        boolean valid6 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), -1, 12/8, 12%8, 26/8, 26%8);
//        checkerPlay.findAllMovable(1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid6);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step7 --- ");
//        boolean valid7 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), 1, 42/8, 42%8, 35/8, 35%8);
//        checkerPlay.findAllMovable(-1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid7);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step8 --- ");
//        boolean valid8 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), -1, 28/8, 28%8, 42/8, 42%8);
//        checkerPlay.findAllMovable(1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid8);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step9 --- false");
//        //boolean valid9 = checkerPlay.movePiece(1, 51/8, 51%8, 44/8, 44%8);
//        boolean valid9 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), 1, 44/8, 44%8, 35/8, 35%8);
//        checkerPlay.findAllMovable(-1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//
//        System.out.println("");
//        System.out.println(valid9);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step10 --- ");
//        boolean valid10 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), -1, 17/8, 17%8, 24/8, 24%8);
//        checkerPlay.findAllMovable(1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid10);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step11 --- ");
//        boolean valid11 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), 1, 49/8, 49%8, 40/8, 40%8);
//        checkerPlay.findAllMovable(-1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid11);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step12 --- ");
//        boolean valid12 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), -1, 23/8, 23%8, 30/8, 30%8);
//        checkerPlay.findAllMovable(1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid12);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step13 --- ");
//        boolean valid13 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), 1, 56/8, 56%8, 49/8, 49%8);
//        checkerPlay.findAllMovable(-1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid13);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
//        System.out.println("---- Step14 --- ");
//        boolean valid14 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), -1, 42/8, 42%8, 56/8, 56%8);
//        checkerPlay.findAllMovable(1);
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid14);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("crowned status: "+ checkerPlay._chestBoard.getCrownedStatus(56/8, 56%8));
//
//
//        System.out.println("---- Step15 ---Cowed black Move up ");
//        boolean valid15 = checkerPlay.movePiece(checkerPlay.get_chestBoard(), 1, 58/8, 58%8, 49/8, 49%8);
//        System.out.println(valid15);
//
//        checkerPlay.findAllMovable(-1);
//        System.out.println("cannot make it here");
//        System.out.println("crowned status: "+ checkerPlay._chestBoard.getCrownedStatus(56/8, 56%8));
//
//
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (checkerPlay.get_chestBoard().getSquareArray()[i][j].isMoveable()) {
//                    System.out.println(i + "!!" + j);
//                }
//            }
//        }
//        checkerPlay.resetMoveable(checkerPlay._chestBoard);
//        System.out.println("");
//        System.out.println(valid15);
//        printGraph(checkerPlay._chestBoard);
//        System.out.println("");
//
////        System.out.println("---- Step16 ---");
////        boolean valid16 = checkerPlay.movePiece(-1, 56/8, 56%8, 42/8, 42%8);
////        System.out.println("");
////        System.out.println(valid16);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step17 -- ");
////        boolean valid17 = checkerPlay.movePiece(1, 40/8, 40%8, 33/8, 33%8);
////        System.out.println("");
////        System.out.println(valid17);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step18 --- ");
////        boolean valid18 = checkerPlay.movePiece(-1, 26/8, 26%8, 40/8, 40%8);
////        System.out.println("");
////        System.out.println(valid18);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step19 --- ");
////        boolean valid19 = checkerPlay.movePiece(1, 51/8, 51%8, 44/8, 44%8);
////        System.out.println("");
////        System.out.println(valid19);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step20 --- ");
////        boolean valid20 = checkerPlay.movePiece(-1, 10/8, 10%8, 19/8, 19%8);
////        System.out.println("");
////        System.out.println(valid20);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step21 --- ");
////        boolean valid21 = checkerPlay.movePiece(1, 60/8, 60%8, 51/8, 51%8);
////        System.out.println("");
////        System.out.println(valid21);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step22 ---Cowed black Move up ");
////        boolean valid22 = checkerPlay.movePiece(-1, 42/8, 42%8, 46/8, 46%8);
////        System.out.println("");
////        System.out.println(valid22);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step23 --- false ");
////        boolean valid23 = checkerPlay.movePiece(1, 45/8, 45%8, 38/8, 38%8);
////        System.out.println("");
////        System.out.println(valid23);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step24 --- ");
////        boolean valid24 = checkerPlay.movePiece(1, 44/8, 44%8, 37/8, 37%8);
////        System.out.println("");
////        System.out.println(valid24);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step25 ---  ");
////        boolean valid25 = checkerPlay.movePiece(-1, 30/8, 30%8, 58/8, 58%8);
////        System.out.println("");
////        System.out.println(valid25);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step26 --- ");
////        boolean valid26 = checkerPlay.movePiece(1, 55/8, 55%8, 37/8, 37%8);
////        System.out.println("");
////        System.out.println(valid26);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step27 --- false ");
////        boolean valid27 = checkerPlay.movePiece(-1, 14/8, 14%8, 22/8, 22%8);
////        System.out.println("");
////        System.out.println(valid27);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step28 ---  ");
////        boolean valid28 = checkerPlay.movePiece(-1, 14/8, 14%8, 23/8, 23%8);
////        System.out.println("");
////        System.out.println(valid28);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step29 --- ");
////        boolean valid29 = checkerPlay.movePiece(1, 37/8, 37%8, 28/8, 28%8);
////        System.out.println("");
////        System.out.println(valid29);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step30 ---  ");
////        boolean valid30 = checkerPlay.movePiece(-1, 19/8, 19%8, 37/8, 37%8);
////        System.out.println("");
////        System.out.println(valid30);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step31 --- ");
////        boolean valid31 = checkerPlay.movePiece(1, 53/8, 53%8, 44/8, 44%8);
////        System.out.println("");
////        System.out.println(valid31);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step32 --- ");
////        boolean valid32 = checkerPlay.movePiece(-1, 37/8, 37%8, 51/8, 51%8);
////        System.out.println("");
////        System.out.println(valid32);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step33 --- ");
////        boolean valid33 = checkerPlay.movePiece(1, 62/8, 62%8, 53/8, 53%8);
////        System.out.println("");
////        System.out.println(valid33);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step34 --- ");
////        boolean valid34 = checkerPlay.movePiece(-1, 23/8, 23%8, 30/8, 30%8);
////        System.out.println("");
////        System.out.println(valid34);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step35 --- ");
////        boolean valid35 = checkerPlay.movePiece(1, 53/8, 53%8, 44/8, 44%8);
////        System.out.println("");
////        System.out.println(valid35);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step36 --- false");
////        boolean valid36 = checkerPlay.movePiece(-1, 51/8, 51%8, 37/8, 37%8);
////        System.out.println("crowed : " + checkerPlay._chestBoard.getCrownedStatus(51/8, 51%8));
////        System.out.println("");
////        System.out.println(valid34);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step37 --- false");
////        boolean valid37 = checkerPlay.movePiece(-1, 58/8, 58%8, 49/8, 49%8);
////        System.out.println("");
////        System.out.println(valid37);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step38 --- false");
////        boolean valid38 = checkerPlay.movePiece(1, 44/8, 44%8, 37/8, 37%8);
////        System.out.println("");
////        System.out.println(valid38);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
////
////        System.out.println("---- Step39 --- false");
////        boolean valid39 = checkerPlay.movePiece(-1, 30/8, 30%8, 44/8, 44%8);
////        System.out.println("");
////        System.out.println(valid39);
////        printGraph(checkerPlay._chestBoard);
////        System.out.println("");
//    }
//
//    private void printGraph(ChestBoard _chestBoard) {
//        for (int p = 0; p < 8; p++) {
//            System.out.println("");
//            System.out.print("|");
//            for (int q = 0; q < 8; q++) {
//                if (_chestBoard.getPiece(p, q) != null && _chestBoard.geOwnerType(p, q) == 1) {
//                    System.out.print("*");
//                } else if (_chestBoard.getPiece(p, q) != null && _chestBoard.geOwnerType(p, q) == -1) {
//                    System.out.print("#");
//                } else {
//                    System.out.print(" ");
//                }
//                System.out.print("|");
//            }
//        }
//        System.out.println("");
//    }
//
//
//    private void printGraph1(ChestBoard _chestBoard) {
//        for (int p = 0; p < 8; p++) {
//            System.out.println("");
//            System.out.print("|");
//            for (int q = 0; q < 8; q++) {
//                if (_chestBoard.getPiece(p, q) != null) {
//                    System.out.print(p + " " + q);
//                } else {
//                    System.out.print("   ");
//                }
//                System.out.print("|");
//            }
//        }
//    }
//}