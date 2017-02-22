
/**
 * Created by joannegaeunson on 2/15/17.
 */
package edu.ucsd.cse110.temperature;
public class Farenheit extends Temperature
{
    public Farenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = ((this.getValue()-32)*5/9);
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() +" F";    }
}