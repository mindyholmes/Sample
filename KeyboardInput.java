import processing.core.PApplet;
public class KeyboardInput extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main(new String[] {"KeyboardInput"});
    }

    public void settings()
    {
        size(300, 200);
    }

    public void setup()
    {
        background(0);
    }

    public void draw()
    {
        if (keyPressed)
        {
            if (key == 'a')
            {
                background(100);
            }
            if (key == 'z')
            {
                background(255);
            }

        }
    }
}