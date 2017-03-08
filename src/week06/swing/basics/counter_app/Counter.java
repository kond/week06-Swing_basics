package week06.swing.basics.counter_app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kond on 2017. 03. 08..
 */
public class Counter extends JFrame {

  private JButton countButton;
  private JLabel countLabel;
  private int pressCount = 0;


  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new Counter();
      }
    });
  }

  public Counter() {
    // JFrame
    //this.setSize(400, 400);
    this.setSize(300, 60);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setTitle("Basic Example Application");

    // JPanel
    JPanel panel = new JPanel();

    // JButton
    countButton = new JButton("Press me!");
    countButton.addActionListener(new CountButtonActionListener());
    panel.add(countButton);

    // JLabel
    countLabel = new JLabel("Pressed: 0");
    panel.add(countLabel);

    this.add(panel);
    //pack();
    this.setVisible(true);
  }

  private void updateCounter() {
    countLabel.setText("Pressed: " + pressCount);
  }

  private class CountButtonActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      pressCount++;
      updateCounter();
    }
  }
}
