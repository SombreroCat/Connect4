package connect4;
import java.awt.*;

public class Piece {
    private Color color;
    private int value;
    Piece(Color _color)
    {
        color = _color;
        value=(int)(Math.random()*4+1);
    }
    Color getColor()
    {
        return (color);
    }
    void setColor(Color _color)
    {
        color = _color;
    }
    
    int getValue()
    {
        return(value);
    }
}
