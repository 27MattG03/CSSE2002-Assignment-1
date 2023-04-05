package src.srg.game;

import src.srg.cli.given.*;
import src.srg.ship.RoomTier;
import src.srg.ship.Ship;
import src.srg.ports.SpacePort;

import java.util.List;

public class Game {
    private List<SpacePort> ports;
    private Ship ship;

    public Game() {

        MapGenerator generator = new MapGenerator();
        ports = generator.generateMap();
        ship = new Ship("Leaden Matter", "Jesko Thoch", "SCS1249", RoomTier.BASIC, RoomTier.BASIC,
                ports);
    }

    private boolean handleGameCommand(IO ioHandler, Command command) {
        switch (command.type) {
            case EXIT -> {
                return true;
            }
            case SHOW_STATUS -> {
                ioHandler.writeLn(ship.toString());
            }
        }
        return false;
    }

    public boolean update(IO ioHandler, Command command) {
        if (command instanceof ShipCommand shipCommand) {
            ship.performCommand(ioHandler, shipCommand);
        } else {
            return handleGameCommand(ioHandler, command);
        }

        return false;
    }

}
