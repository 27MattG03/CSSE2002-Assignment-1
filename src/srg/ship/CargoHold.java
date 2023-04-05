package src.srg.ship;


public class CargoHold extends Room {
    private final int MAX_CAPACITY_BASIC = 5;
    private final int MAX_CAPACITY_AVERAGE = 10;
    private final int MAX_CAPACITY_PRIME = 15;

    private int capacity;
    public CargoHold(RoomTier tier) {
        super(tier);
        this.capacity = getMaximumCapacity();
    }
    public int getMaximumCapacity() {
        switch (this.getTier()){
            case BASIC :
                return MAX_CAPACITY_BASIC;
            case AVERAGE:
                return MAX_CAPACITY_AVERAGE;
            case PRIME:
                return MAX_CAPACITY_PRIME;
            default:
                return 0;
        }
    }
    public int getRemainingCapacity() {
        return this.capacity;
    }
    public List<ResourceContainer> getResources(){

    }
}
