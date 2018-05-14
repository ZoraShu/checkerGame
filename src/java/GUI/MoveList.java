package GUI;

import Game.ChestBoard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yueshu on 5/4/18.
 * This class will get the input file and put the step into a arraylist
 * The boardRecordList is used to keep the coordinating board info
 * when user hit previous, the saved board will be set to current board and repaint the graphic
 */
public class MoveList {
    //read file to list
    //record every move in case of hit previous
    private ArrayList<ChestBoard> boardRecordList;
    private ArrayList<List<Integer>> moveList;
    private ArrayList<Integer> _turnRecord;
    private String _path;

    MoveList(String path) {
        moveList = new ArrayList();
        _turnRecord = new ArrayList<>();
        _turnRecord.add(0);
        ArrayList initStep = new ArrayList();
        initStep.add(-1);
        initStep.add(-1);
        moveList.add(0, initStep);
        boardRecordList = new ArrayList<>();
        _path = path;
        try {
            getInputData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private void getInputData() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(_path));
        scanner.nextLine();
        String line;
        while(scanner.hasNext()) {
            line = scanner.nextLine();
            List<Integer> move = parseActualStep(line);
            moveList.add(move);
        }
    }

    private List<Integer> parseActualStep(String line) {
        String[] temp = line.split(",");
        List<Integer> result = new ArrayList<>();
        result.add(Integer.valueOf(temp[0]));
        result.add(Integer.valueOf(temp[1]));
        return result;
    }

    public ArrayList<ChestBoard> getBoardRecordList() {
        return boardRecordList;
    }
    public ArrayList<List<Integer>> getMoveList() {
        return moveList;
    }
    public ArrayList<Integer> get_turnRecord() {
        return _turnRecord;
    }
}
