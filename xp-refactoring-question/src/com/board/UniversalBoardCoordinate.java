package com.board;

public class UniversalBoardCoordinate {

    private int row;
    private int column;

    public UniversalBoardCoordinate(String locationPhrase) throws InvalidCoordinateException {
        String noParens = locationPhrase.replace('(', ' ').replace(')', ' ');
        String[] coordinates = noParens.split(",");

        if (coordinates.length != 2) {
            throw new InvalidCoordinateException("That's not a valid board location.");
        }

        row = Integer.parseInt(coordinates[0].trim());
        column = Integer.parseInt(coordinates[1].trim());
    }

}
