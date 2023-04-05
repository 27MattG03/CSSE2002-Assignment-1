package src.srg.ports;

import src.srg.exceptions.InsufficientCapcaityException;
import src.srg.exceptions.InsufficientResourcesException;
import src.srg.resources.FuelContainer;
import src.srg.resources.FuelGrade;
import src.srg.resources.ResourceContainer;
import src.srg.resources.ResourceType;
import src.srg.ship.CargoHold;
import src.srg.ship.NavigationRoom;
import src.srg.ship.RoomTier;

public class Store extends SpacePort {
    private final int MAX_FUEL = 1000;
    private final int MAX_REPAIR_KIT = 10;
    private CargoHold cargoHold = new CargoHold(RoomTier.AVERAGE);

    public Store(String name, Position position) {

        super(name, position);

        try {
            cargoHold.storeResource(new ResourceContainer(ResourceType.REPAIR_KIT, MAX_REPAIR_KIT));
            cargoHold.storeResource(new FuelContainer(FuelGrade.TRITIUM,MAX_FUEL));
            cargoHold.storeResource(new FuelContainer(FuelGrade.HYPERDRIVE_CORE,MAX_FUEL));
        } catch (InsufficientCapcaityException error){

        }
    }
    public ResourceContainer purchase(String item,
                                      int amount)
            throws InsufficientResourcesException {
       return new ResourceContainer(ResourceType.REPAIR_KIT, amount);
    }

}
