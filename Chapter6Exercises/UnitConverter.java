/**
 * This class is used to create a converter that
 * converts between lengths of various units.
 */

public class UnitConverter
{
    private String unit;
    private double convertedValue;

    /**
     * Constructs an object that can convert between units.
     * @param u the original unit
     */
    public UnitConverter(String u)
    {
        unit = u;
    }

    /**
     * Converts the given value to meters.
     * @param l the given value
     * @return the value in meters
     */
    public double toMeters(double l)
    {
        double meters = 0;

        if (unit.equals("in"))
            meters = l*0.0254;
        else if (unit.equals("ft"))
            meters = l*0.3048;
        else if (unit.equals("mi"))
            meters = l*1609.344;
        else if (unit.equals("mm"))
            meters = l*0.001;
        else if (unit.equals("cm"))
            meters = l*0.01;
        else if (unit.equals("m"))
            meters = l;
        else if (unit.equals("km"))
            meters = l*1000;

        return meters;
    }

    /**
     * Converts the value from meters to a new unit.
     * @param d the value in meters
     * @return the value in the new unit
     */
    public double fromMeters(double d)
    {
        if (unit.equals("in"))
            convertedValue = d*39.37007874;
        else if (unit.equals("ft"))
            convertedValue = d*3.2808399;
        else if (unit.equals("mi"))
            convertedValue = d*0.000621371192;
        else if (unit.equals("mm"))
            convertedValue = d*1000.0;
        else if (unit.equals("cm"))
            convertedValue = d*100.0;
        else if (unit.equals("m"))
            convertedValue = d;
        else if (unit.equals("km"))
            convertedValue = d*0.001;

        return convertedValue;
    }
}
