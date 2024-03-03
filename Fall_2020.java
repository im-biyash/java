import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fall_2020 extends JFrame {

    JTextField pointerStatusField, coordinatesField;

    public Fall_2020() {
        setTitle("Mouse Tracker");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());


        pointerStatusField = new JTextField("Outside",20 );
        pointerStatusField.setEditable(false);
        coordinatesField = new JTextField("", 20);
        coordinatesField.setEditable(false);

        panel.add(pointerStatusField);
        panel.add(coordinatesField);

        add(panel);
        addMouseMotionListener(new MouseMotionListener());
        setVisible(true);
    }

    class MouseMotionListener extends MouseAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            if (contains(e.getPoint())) {
                pointerStatusField.setText("Inside");
                coordinatesField.setText("X: " + e.getX() + ", Y: " + e.getY());
            } else {
                pointerStatusField.setText("Outside");
                coordinatesField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Fall_2020();
    }
}