package srg.ports;

import javax.swing.text.Position;
import java.util.List;

public class ShipYard extends SpacePort{
    private List <String> canUpgrade;
    public ShipYard(String name, Position position, List<String> canUpgrade) {
        super(name, position);
        this.type = "ShipYard";
        this.canUpgrade = canUpgrade;
    }

    public void upgrade(Room room) {

    }

}
