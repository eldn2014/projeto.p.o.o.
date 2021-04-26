package projeto_poo;
import java.util.Locale;
import javax.swing.*;


public class Projeto_Poo {
    

    public static void main(String[] args) {

         Login objLogin=new Login();
         
         
//       objLogin.setUndecorated(true);
//       objLogin.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
         objLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
         objLogin.setSize(400, 180);
         objLogin.setVisible(true);
         objLogin.setLocationRelativeTo(null);
         objLogin.setResizable(false);
         
         
         
         
    }
    
}
