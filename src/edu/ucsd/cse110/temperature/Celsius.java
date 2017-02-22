
/**
 * Created by joannegaeunson on 2/15/17.
 */
package edu.ucsd.cse110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = ((this.getValue()*9/5) + 32);
        return new Farenheit(value);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() +" C";
    }
}