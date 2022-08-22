package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Привет, друг!",
                "Приветствие",
                1);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Как тебя зовут?",
                "Вопрос",
                3,
                null,
                null,
                "Ввод.");
        
        
        String[] acceptableValues = {"Вариант 1", "Вариант 2", "Вариант 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Что ты любишь больше всего?",
                "Выбор",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
