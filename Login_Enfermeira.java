package projeto_poo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login_Enfermeira extends JFrame {
    private String DadosdaEnfermeira [][];
    private JLabel titulo;
    private JPanel central;
    private String login;
    private String senha;

    public String[][] getDadosdaEnfermeira() {
        return DadosdaEnfermeira;
    }

    public void setDadosdaEnfermeira(String[][] DadosdaEnfermeira) {
        this.DadosdaEnfermeira = DadosdaEnfermeira;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JPanel getCentral() {
        return central;
    }

    public void setCentral(JPanel central) {
        this.central = central;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
    public Login_Enfermeira(){
        
        super("Área da(o) enfermeira(o):");
        
        WindowEvent evt = null;
        
        AoAbrir(evt);
        
       DadosdaEnfermeira();
  
    }


private void AoAbrir(java.awt.event.WindowEvent evt){
    
    setLogin(Login.LoginField.getText());
    setSenha(Login.SenhaField.getText());
    
 }

        
    private void DadosdaEnfermeira() {
        
       new Logado().getLoginEnfermeira(login, senha); 
       

       setLayout(new GridLayout(3,1));
       
 
        JPanel juntos = new JPanel();
        juntos.setLayout(new GridLayout(2, 1));
  
        
        JPanel Titulo = new JPanel();
        Titulo.setLayout(new FlowLayout());
        
        titulo = new JLabel("Login da(o) Enfermeira(o):");
        titulo.setForeground(Color.BLUE);
        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        Titulo.add(titulo);
        
        
         juntos.add(Titulo);
           Titulo.setBackground(new Color(147,211,255));
        
    
        central = new JPanel();
        central.setLayout(new GridLayout(1,5));

        Sair sair = new Sair();
       
       
       JButton logoff = new JButton("Logoff");
        logoff.setBorder(BorderFactory.createMatteBorder(10, 7, 10, 1,new Color(147,211,255)));
        logoff.addActionListener(sair);
        logoff.setBackground(Color.WHITE);
        
        JLabel loin = new JLabel("Bem Vindo(a) enfermeira(o)! ");
        loin.setBorder(BorderFactory.createMatteBorder(0, 15, 10, 15, new Color(147,211,255)));
        
        
        central.add(loin);
        central.add(logoff);
      
    
       juntos.add(central);
       central.setBackground(new Color(147,211,255));
    
       
       add(juntos); 
       
                
        JPanel dados01 = new JPanel();
        dados01.setLayout(new GridLayout(2,4));
        
        JLabel enf = new JLabel("Enfermeira(o):");
        enf.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 0, new Color(147,211,255)));
        
        JLabel enfermeira = new JLabel();
        enfermeira.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
        
        JLabel coren = new JLabel("Coren:");
        coren.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 0, new Color(147,211,255)));
        
        JLabel c = new JLabel();
        c.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
        
        
    dados01.add(enf);
    dados01.add(enfermeira);
    
    dados01.add(coren);
    dados01.add(c);
    
    
    add(dados01);
    dados01.setBackground(new Color(147,211,255));
    
 
      JPanel botoes = new JPanel();
      botoes.setLayout(new GridLayout(3, 2));
      
      JButton btnencaminhar = new JButton("Encaminhar");
      btnencaminhar.setBackground(Color.WHITE);
      
      JButton btnaplicarvacina = new JButton("Aplicar Vacina");
      btnaplicarvacina.setBackground(Color.WHITE);
      
      JButton btndadosdopaciente = new JButton("Dados do Paciente");
      btndadosdopaciente.setBackground(Color.WHITE);
      
      botoes.add(btnencaminhar);
      botoes.add(btnaplicarvacina);
      botoes.add(btndadosdopaciente);
     
    add(botoes);  
      botoes.setBackground(new Color(147,211,255));
   
    }
      
public class Sair implements ActionListener{
    @Override 
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
    }

}