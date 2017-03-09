package week06.swing.basics.UI_Controls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kond on 2017. 03. 08..
 * TODO: BoxLayout optimazation
 */
public class UIControls extends JFrame {

  private JTextField textfield1;
  private JLabel actualText, prevText;
  private JButton clearMemoryButton;

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new UIControls();
      }
    });
  }

  public UIControls() {
    // JFrame
    this.setSize(400, 110);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("UI Controls");

    // JPanel
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    // JTextfield
    textfield1 = new JTextField("", 20);
    textfield1.addActionListener(new TextfieldActionListener());
    panel.add(textfield1);
    Box.createRigidArea(new Dimension(0, 20));

    // JLabels
    actualText = new JLabel("Text: ");
    actualText.setHorizontalAlignment(JLabel.LEFT);
    prevText = new JLabel("Memory: ");
    prevText.setHorizontalAlignment(JLabel.LEFT);

    panel.add(actualText);
    panel.add(prevText);

    // JButton
    clearMemoryButton = new JButton("Clear Memory");
    clearMemoryButton.setHorizontalAlignment(JButton.LEFT);
    clearMemoryButton.addActionListener(new ClearMemoryButtonActionListener());
    panel.add(clearMemoryButton);
    Box.createRigidArea(new Dimension(0, 20));

    this.add(panel);
    //pack();
    this.setVisible(true);
  }

  private class TextfieldActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      prevText.setText("Memory: " + actualText.getText().substring(6));
      actualText.setText("Text: " + textfield1.getText());
    }
  }

  private class ClearMemoryButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      prevText.setText("Memory: ");
    }
  }
}
