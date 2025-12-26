import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class lab4_6 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Thanawat Supannon 68160144 n27");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,150);
        frame.setLayout(new FlowLayout());

        Random random = new Random();
        int num1 = random.nextInt(12) + 1;
        int num2 = random.nextInt(12) + 1;

        String[] operator = {"+","-","*"};
        int opIndex= random.nextInt(3);
        String selectedOp = operators[opIndex];

        JLabel label1 = new JLabel(string.valueOf(num1));
        

    }
}



