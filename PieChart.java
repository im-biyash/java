import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Piechart extends Frame {

    private final int supportive= 25;
    private final int against = 15;
    private final int neutral= 8;

    public Piechart() {
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int total = supportive+ against + neutral;
        int supportiveAngle = (supportive * 360) / total;
        int againstAngle = (against* 360) / total;
        int neutralAngle = (neutral * 360) / total;

        // Draw Supportive
        g.setColor(Color.GREEN);
        g.fillArc(50, 50, 300, 300, 0, supportiveAngle);

        // Draw Against
        g.setColor(Color.RED);
        g.fillArc(50, 50, 300, 300, supportiveAngle, againstAngle);

        // Draw Neutral
        g.setColor(Color.BLUE);
        g.fillArc(50, 50, 300, 300, supportiveAngle + againstAngle, neutralAngle);
    }

    public static void main(String[] args)
    {
        new Piechart();
    }
}