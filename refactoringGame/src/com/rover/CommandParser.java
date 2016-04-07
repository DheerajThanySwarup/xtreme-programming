package com.rover;

import java.util.ArrayList;
import java.util.List;

public class CommandParser {
    public List<Command> parseCommand(String input) {
        char[] commandChars = input.toCharArray();
        List<Command> commandArray = new ArrayList<>();
        for(char command : commandChars) {
            commandArray.add(convertToCommand(command));
        }

        return commandArray;
    }

    private Command convertToCommand(char command) {
        switch(command){
            case 'M': return new MoveCommand();
            case 'R': return new TurnRightCommand();
            case 'L': return new TurnLeftCommand();
            default : throw new IllegalArgumentException("Invalid command: " + command);
        }
    }
}
