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



public class Login_Paciente extends JFrame {
    private String DadosdoPaciente [][];
    private JLabel titulo;
    private JPanel central;
    private String login;
    private String senha;

    public String[][] getDadosdoPaciente() {
        return DadosdoPaciente;
    }

    public void setDadosdoPaciente(String[][] DadosdoPaciente) {
        this.DadosdoPaciente = DadosdoPaciente;
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

    
    public Login_Paciente(){
        
        super("Área do(a) paciente:");
        
        WindowEvent evt = null;
        
        AoAbrir(evt);
        
       DadosPaciente();
  
    }


private void AoAbrir(java.awt.event.WindowEvent evt){
    
    setLogin(Login.LoginField.getText());
    setSenha(Login.SenhaField.getText());
    
 }

        
    private void DadosPaciente() {

//       new LOGADO().getLoginPaciente(login, senha);  //esta merda nao vai pq tem q add ele no logado dps -jhen
       

       setLayout(new GridLayout(3,1));
       
 
        JPanel juntos = new JPanel();
        juntos.setLayout(new GridLayout(2, 1));
  
        
        JPanel Titulo = new JPanel();
        Titulo.setLayout(new FlowLayout());
        
        titulo = new JLabel("Login do(a) paciente:");
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
        
        JLabel loin = new JLabel("Bem Vindo(a) Paciente! ");
        loin.setBorder(BorderFactory.createMatteBorder(0, 15, 10, 15, new Color(147,211,255)));
        
        
        central.add(loin);
       
        central.add(logoff);
      
    
       juntos.add(central);
       central.setBackground(new Color(147,211,255));
    
       
       add(juntos); 
       
                
        JPanel dados01 = new JPanel();
        dados01.setLayout(new GridLayout(2,4));
        
        JLabel nome = new JLabel("Nome:");
        nome.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 0, new Color(147,211,255)));
        
        JLabel n = new JLabel();
        n.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
        
        JLabel csus = new JLabel("Cartão do SUS:");
        csus.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 0, new Color(147,211,255)));
        
        JLabel cartaosus = new JLabel();
        cartaosus.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
        
        JLabel prox = new JLabel("Próxima Consulta:");
        prox.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 0, new Color(147,211,255)));
        
        JLabel proxima = new JLabel();
        proxima.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
        
        
    dados01.add(nome);
    dados01.add(n);
    
    dados01.add(csus);
    dados01.add(cartaosus);
    
    dados01.add(prox);
    dados01.add(proxima);

    
    add(dados01);
    dados01.setBackground(new Color(147,211,255));
    
 
      JPanel botoes = new JPanel();
      botoes.setLayout(new GridLayout(3, 2));
      
      JButton btnmarcarconsulta= new JButton("Marcar Consulta");
      btnmarcarconsulta.setBackground(Color.WHITE);
      
      JButton btncartaoconsulta = new JButton("Cartão de Consulta");
      btncartaoconsulta.setBackground(Color.WHITE);
      
      JButton btnatualizardados = new JButton("Atualizar Dados");
      btnatualizardados.setBackground(Color.WHITE);
      
      botoes.add(btnmarcarconsulta);
      botoes.add(btncartaoconsulta);
      botoes.add(btnatualizardados);
     
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