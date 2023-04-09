import java.io.*;
/**
 * Represents an aircraft.
 */
abstract class Sweet implements Serializable
{
    private String name;
    private double weight;

    public Sweet(String name, double weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }
    public double getWeight(){
        return weight;
    }

    public abstract String getType();

    public abstract String getflavor();
}

class Candy extends Sweet
{
public String flavor;
 public Candy(String name, double weight, String flavor)
 {

     super (name, weight);
     this.flavor = flavor;
 }

    @Override
    public String getType()
    {
        return "Candy";
    }
    @Override
    public String getflavor()
    {
        return flavor;
    }

    class OtherSweets extends Sweet {
     public OtherSweets (String name, double weight)
     {
         super(name, weight);
     }

        @Override
        public String getType() {
            return "OtherSweets";
        }
        @Override
        public String getflavor() {
            return null;
        }
    }




}

