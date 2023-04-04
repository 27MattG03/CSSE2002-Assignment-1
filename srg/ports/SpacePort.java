package srg.ports;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;

public class SpacePort extends Object {
    protected String name;
    protected Position position;

    protected String type = "SpacePort";

    public SpacePort(String name, Position position){
        this.name = name;
        this.position = position;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {

        return String.format("PORT: \"%s\" %s at %s", name,type, position.toString());
    }
    public List<String> getActions() {
        List<String> actions = new ArrayList<String>();
        return actions;
    }
}
