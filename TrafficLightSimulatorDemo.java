package javalabs;
/*Write a Java program that simulates a traffic light. The program lets the user select one of
three lights: red, yellow, or green. When a radio button is selected, the light is turned on,
and only one light can be on at a time. No light is on when the program starts*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulatorDemo extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;
    private TrafficLightPanel lightPanel;

    public TrafficLightSimulatorDemo() {
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        JPanel controlPanel = new JPanel();
        controlPanel.add(redButton);
        controlPanel.add(yellowButton);
        controlPanel.add(greenButton);

        lightPanel = new TrafficLightPanel();

        add(controlPanel, BorderLayout.NORTH);
        add(lightPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == greenButton) {
            lightPanel.setColors(Color.GREEN, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
        } else if (e.getSource() == yellowButton) {
            lightPanel.setColors(Color.LIGHT_GRAY, Color.YELLOW, Color.LIGHT_GRAY);
        } else if (e.getSource() == redButton) {
            lightPanel.setColors(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.RED);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TrafficLightSimulatorDemo::new);
    }
}

class TrafficLightPanel extends JPanel {
    private Color color1, color2, color3;

    public TrafficLightPanel() {
        setPreferredSize(new Dimension(150, 350));
        setColors(Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY);
    }

    public void setColors(Color c1, Color c2, Color c3) {
        color1 = c1;
        color2 = c2;
        color3 = c3;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int postWidth = 10;
        int postHeight = getHeight();
        int postX = getWidth() / 2 - postWidth / 2;

        // Draw the post
        g.setColor(Color.DARK_GRAY);
        g.fillRect(postX, 0, postWidth, postHeight);

        // Draw the box around the lights
        int boxWidth = 80;
        int boxHeight = 220;
        int boxX = postX - boxWidth / 2;
        int boxY = getHeight() / 90-10;

        g.setColor(Color.BLACK);
        g.fillRect(boxX, boxY, boxWidth, boxHeight);

        int diameter = 60;
        int x = postX - diameter / 2;
        int y = boxY + 10;

        // Draw the lights
        g.setColor(color1);
        g.fillOval(x, y, diameter, diameter);

        g.setColor(color2);
        g.fillOval(x, y + diameter + 10, diameter, diameter);

        g.setColor(color3);
        g.fillOval(x, y + 2 * (diameter + 10), diameter, diameter);
    }
}