import java.awt.*;

public class NinjaCat extends Critter
{
    public NinjaCat()
    {

    }
    public Color getColor()
    {
        return Color.CYAN;
    }
    public String toString()
    {
        return "avinash";
    }
    public Action getMove(CritterInfo info)
    {
        return Action.LEFT;
    }

}
