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



public class Login_Medico extends JFrame {
    private String DadosdoMedico [][];
    private JLabel titulo;
    private JPanel central;
    private String login;
    private String senha;
    private String Camposm[];

 
    public String[][] getDadosdoMedico() {
        return DadosdoMedico;
    }

    public void setDadosdoMedico(String[][] DadosdoMedico) {
        this.DadosdoMedico = DadosdoMedico;
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

    public String[] getCamposm() {
        return Camposm;
    }

    public void setCamposm(String[] Camposm) {
        this.Camposm = Camposm;
    }
    
/////////////////////////////////////////////////////////////////////////////////    
    
    public Login_Medico(){
        super("Área do Médico");
        
        WindowEvent evt = null;
        
        AoAbrir(evt);
        
       dadosdomedico();
  
    }


private void AoAbrir(java.awt.event.WindowEvent evt){
    setLogin(Login.LoginField.getText());
    setSenha(Login.SenhaField.getText());
    
 }

 

        
        
    private void dadosdomedico() {
        Camposm= new String[Login.Campos.length];
       new Logado().getLoginMedico(login, senha, Camposm);
       
////////////////////////////////////////////////////////////////////////////////////   

       setLayout(new GridLayout(3,1));
       
 ///////////////////////////////////////////////////////////////////////////////
        
        JPanel juntos = new JPanel();
        juntos.setLayout(new GridLayout(2, 1));
        
        
  //////////////////////////////////////////////////////////////////////////////      
        
  
        JPanel Titulo = new JPanel();
        Titulo.setLayout(new FlowLayout());
        
        titulo = new JLabel("Login Médico");
        titulo.setForeground(Color.BLUE);
        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        Titulo.add(titulo);
        
        
         juntos.add(Titulo);
           Titulo.setBackground(new Color(147,211,255));
        
 ///////////////////////////////////////////////////////////////////////////////     
    
        central = new JPanel();
        central.setLayout(new GridLayout(1,5));

        Sair sair= new Sair();
       
       
       JButton logoff= new JButton("Logoff");
        logoff.setBorder(BorderFactory.createMatteBorder(10, 7, 10, 1,new Color(147,211,255)));
        logoff.addActionListener(sair);
        logoff.setBackground(Color.WHITE);
        
        JLabel loin= new JLabel("Bem Vindo(a) Doutor(a) "+ Camposm[0]);
        loin.setBorder(BorderFactory.createMatteBorder(0, 15, 10, 15, new Color(147,211,255)));
        
        
        central.add(loin);
       
        central.add(logoff);
      
    
       juntos.add(central);
       central.setBackground(new Color(147,211,255));
    
    
        
////////////////////////////////////////////////////////////////////////////////        
      

/**************/add(juntos);  // 1/3 do grid
   
        
////////////////////////////////////////////////////////////////////////////////      

      
                
        JPanel dados01=new JPanel();
        dados01.setLayout(new GridLayout(2,4));
        
        JLabel Medico= new JLabel("Médico:");
        Medico.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 0, new Color(147,211,255)));
        
        JLabel md= new JLabel(Camposm[0]);
        md.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
        
        JLabel crm= new JLabel("CRM:");
        crm.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 0, new Color(147,211,255)));
        
        JLabel crm01= new JLabel(Camposm[1]);
        crm01.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
        
        JLabel res= new JLabel("Residente?:");
        res.setBorder(BorderFactory.createMatteBorder(10, 50, 10, 0, new Color(147,211,255)));
        
        JLabel resi= new JLabel(Camposm[2]);
        resi.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
        
        JLabel func= new JLabel("Especialidade:");
        func.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(147,211,255)));
        
        JLabel fun= new JLabel(Camposm[3]);
        fun.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 50, new Color(147,211,255)));
   
        
    dados01.add(Medico);
    dados01.add(md);
    
    dados01.add(crm);
    dados01.add(crm01);
    
    dados01.add(res);
    dados01.add(resi);
    
    dados01.add(func);
    dados01.add(fun);
 ///////////////////////////////////////////////////////////////////////////////
 
 
    /*************/add(dados01);// 2/3 do grid
    dados01.setBackground(new Color(147,211,255));
      
////////////////////////////////////////////////////////////////////////////////

      JPanel botoes = new JPanel();
      botoes.setLayout(new GridLayout(3, 2));
      
      JButton btnencaminhar= new JButton("Encaminhar Paciente");
      btnencaminhar.setBackground(Color.WHITE);
      
      JButton btndadospaciente = new JButton("Dados do Paciente");
      btndadospaciente.setBackground(Color.WHITE);
      
      JButton btnprescrever = new JButton("Prescrever Vacina");
      btnprescrever.setBackground(Color.WHITE);
      
      JButton btngerarreceita = new JButton("Gerar Receita");
      btngerarreceita.setBackground(Color.WHITE);
      
      
      JButton btnagendados = new JButton("Pacientes Agendados");
      btnagendados.setBackground(Color.WHITE);
      
      botoes.add(btnencaminhar);
      botoes.add(btndadospaciente);
      botoes.add(btnprescrever);
      botoes.add(btngerarreceita);
      botoes.add(btnagendados);
      
 ////////////////////////////////////////////////////////////////////////////////
 
 
      /*****************/ add(botoes);  // 3/3 do grid
      botoes.setBackground(new Color(147,211,255));
           
   
      

  
        
////////////////////////////////////////////////////////////////////////////////
        
        
   
        
    }
      


public class Sair implements ActionListener{
    @Override 
    public void actionPerformed(ActionEvent e) {
        System.exit(0);}}






}