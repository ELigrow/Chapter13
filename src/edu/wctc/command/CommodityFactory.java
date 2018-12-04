package edu.wctc.command;

/**
 * Factory class for ICommodity objects
 * @author eplig
 * @version 1.0
 */
public class CommodityFactory {

    /**
     * Factory constructor for ICommodity objects. Takes CommodityType to create an object. Returns ICommodity object
     * @param commodityType CommodityType: CommodityType Enum to base object returned
     * @return ICommodity: Commodity created in respect to Enum entered
     */
    public ICommodity getCommodity(CommodityType commodityType) {
        switch (commodityType) {
            case BEANS:
                return new Beans();
            case CORN:
                return new Corn();
            case WHEAT:
                return new Wheat();
            default:
                return null;
        }
    }
}
