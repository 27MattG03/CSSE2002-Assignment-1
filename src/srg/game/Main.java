package srg.game;

import srg.given.CLIHandler;
import srg.given.Command;
import srg.given.IO;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        IO ioHandler = new IO();
        CLIHandler commandParser = new CLIHandler();

        boolean exit;
        do {
            Command command = commandParser.parse(ioHandler);
            exit = game.update(ioHandler, command);
        } while (!exit);
    }
}