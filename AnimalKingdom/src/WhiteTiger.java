import java.awt.*;
public class WhiteTiger extends Critter
{
    private boolean infectedAnother = false;
    public Color getColor()
    {
        return Color.WHITE;
    }

    public String toString()
    {
        if(infectedAnother)
        {
            return "TGR";
        }
        else
        {
            return "tgr";
        }
    }
    @Override
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
