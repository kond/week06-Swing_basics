package week06.swing.basics.say_hello_to_all_the_world;

import javax.swing.*;

/**
 * Created by kond on 2017. 03. 08..
 */
public class HelloWorld extends JFrame {

  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den",
          "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag",
          "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
          "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao",
          "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá",
          "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba",
          "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new HelloWorld();
      }
    });
  }

  public HelloWorld() {
    // JFrame
    this.setSize(400, 400);
    this.setLocationRelativeTo(null);
    this.setTitle("Hello World");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // JPanel
    JPanel panel = new JPanel();

    // JLabels
    for(String helloText : hellos) {
      JLabel label = new JLabel(helloText +" Kond! ");
      label.
      label.setVisible(true);
      panel.add(label);
    }

    this.add(panel);

    this.setVisible(true);

  }

}
