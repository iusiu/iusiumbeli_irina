package homework_nr_12;

public enum FuelTypes {
    DIESEL,
    ELECTRIC,
    GASOLINE,
    CNG,
    LPG;

    public boolean isLiquidFuel(){
        if(this == DIESEL || this == LPG || this == GASOLINE)
            return true;
        return false;
    }
}
