package src.srg.resources;

public class ResourceContainer extends Object{
    static final int MAXIMUM_CAPACITY = 10;
    private int amount;
    private ResourceType type;
    public ResourceContainer(ResourceType type, int amount) {
        if (amount <= MAXIMUM_CAPACITY) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException();
        }
        if (type == ResourceType.FUEL) {
            throw new IllegalArgumentException();
        } else {
            this.type = type;
        }


    }
    public boolean canStore(ResourceType type) {
        if (type == ResourceType.FUEL) {
            return false;
        }
        else {
            return true;
        }

    }
    public int getAmount() {
        return this.amount;
    }
}
