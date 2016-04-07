package com.board;

public class UniversalBoardCoordinate {

    private int row;
    private int column;

    public UniversalBoardCoordinate(String locationPhrase) throws InvalidCoordinateException {
        String[] coordinates = parseString(locationPhrase);

        row = parseCoordinates(coordinates[0].trim());
        column = parseCoordinates(coordinates[1].trim());
    }

    private int parseCoordinates(String trim) {
        return Integer.parseInt(trim);
    }

    private String[] parseString(String locationPhrase) throws InvalidCoordinateException {
        String noParens = locationPhrase.replace('(', ' ').replace(')', ' ');
        String[] coordinates = noParens.split(",");

        checkValidity(coordinates);
        return coordinates;
    }

    private void checkValidity(String[] coordinates) throws InvalidCoordinateException {
        if (coordinates.length != 2) {
            throw new InvalidCoordinateException("That's not a valid board location.");
        }
    }

}
