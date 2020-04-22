import java.awt.*;

public class Tiger extends Critter
{
    int f=0;
    public Tiger()
    {

    }
    public Color getColor()
    {
        int c=(int)(3*Math.random());
        if(c==0 && (f>0 && f<=6))
        {
            f++;
            return Color.RED;
        }
        else if(c==0 && (f>6 && f<=12))
        {
            f++;
            return Color.GREEN;
        }
        else
        {
            f++;
            if(f>=12)
            {
                f=0;
            }
            return Color.BLUE;
        }
    }
    public String toString()
    {
        return "TGR";
    }
    public Action getMove(CritterInfo info)
    {
        if(info.frontThreat())
        {
            return Action.INFECT;
        }
        else if(info.getFront()==Neighbor.WALL || info.getRight()==Neighbor.WALL)
        {
            return Action.LEFT;
        }
        else if(info.getFront()==Neighbor.SAME)
        {
            return Action.RIGHT;
        }
        else
        {
            return Action.HOP;
        }
    }
}
