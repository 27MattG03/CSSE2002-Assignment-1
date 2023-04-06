package srg.given;

public class ShipCommand extends Command {
    public final String value;

    public ShipCommand(CommandType type, String value) {
        super(type);
        this.value = value;
    }
}
