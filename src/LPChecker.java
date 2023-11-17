import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LPChecker extends JFrame {

    private JPanel jpanel;
    private JLabel inputYearLabel;
    private JTextField tfYear;
    private JButton btnCheck;

    public LPChecker(){
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = 0;

                try {
                    year = Integer.parseInt(tfYear.getText());
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, "Invalid input!");
                    return;
                }

                if(year % 400 == 0){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                }else if(year %100 == 0){
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                }else if (year%4 == 0){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                }else{
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                }
            }
        });
    }
    public static void main(String[] args) {
        LPChecker app = new LPChecker();
        app.setContentPane(app.jpanel);
        app.setSize(300, 200);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}

