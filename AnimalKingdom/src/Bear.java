import java.awt.*;
public class Bear extends Critter
{
        boolean pol=false;
        private int moves;
        public Bear(boolean polar)
        {
            pol=polar;
            getColor();
        }
        public Color getColor()
        {
            if(pol==true)
            {
                return Color.WHITE;
            }
            else
            {
                return Color.BLACK;
            }
        }
        public String toString()
        {
            if (moves%2==0)
            {
                return "/";
            } else {
                return "\\";
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
                return Action.LEFT;
            }
        }

}
