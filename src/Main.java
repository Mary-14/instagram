import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {
        // создаём окно, параметр title - заголовок
        JFrame mainFrame = new JFrame("Ахахахаахахахахаахххх");
        // завершаем приложение, если закрыли окно
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создаём главную форму
        MainForm mainForm = new MainForm();
        // присоединяем главную форму к окну
        mainFrame.setContentPane(mainForm.rp);
        // обновляем размеры
        mainFrame.pack();
        // отображаём окно
        mainFrame.setVisible(true);
    }

}
