import java.awt.*;

public class Giant extends Critter
{
    int c=0;
    public Giant()
    {

    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public String toString() {
        if(c>0 && c<=6)
        {
            c++;
            return "fee";
        }
        else if(c>6 && c<=12)
        {
            c++;
            return "fie";
        }
        else if(c>12 && c<=18)
        {
            c++;
            return "foe";
        }
        else
        {
            c++;
            if(c>=24)
            {
                c=0;
            }
            return "fum";
        }
    }
    public Action getMove(CritterInfo info)
    {
        if(info.frontThreat())
        {
            return Action.INFECT;
        }
        else if(info.getFront()==Neighbor.EMPTY)
        {
            return Action.HOP;
        }
        else
        {
            return Action.RIGHT;
        }
    }
}
