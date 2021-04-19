
package projeto_poo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class DADOS_PESSOAIS extends JFrame{
    
    private JTextField NomeField;
    private JTextField SUSField;
    private JTextField IdadeField;
    private JTextField CPFField;
    private JTextField EmailField;
    private JTextField LoginField;
    private JTextField SenhaField;
    private JTextField TelefoneField;
    private endereco endereco;

    ///////////////////////////////////////////////////////////////////////////////
    
    public JTextField getNomeField() {
        return NomeField;
    }

    public JTextField getSUSField() {
        return SUSField;
    }

    public JTextField getIdadeField() {
        return IdadeField;
    }

    public JTextField getCPFField() {
        return CPFField;
    }

    public JTextField getEmailField() {
        return EmailField;
    }

    public JTextField getLoginField() {
        return LoginField;
    }

    public JTextField getSenhaField() {
        return SenhaField;
    }

    public JTextField getTelefoneField() {
        return TelefoneField;
    }

   
 //////////////////////////////////////////////////////////////////////////////////////

    public void setNomeField(JTextField NomeField) {
        this.NomeField = NomeField;
    }

    public void setSUSField(JTextField SUSField) {
        this.SUSField = SUSField;
    }

    public void setIdadeField(JTextField IdadeField) {
        this.IdadeField = IdadeField;
    }

    public void setCPFField(JTextField CPFField) {
        this.CPFField = CPFField;
    }

    public void setEmailField(JTextField EmailField) {
        this.EmailField = EmailField;
    }

    public void setLoginField(JTextField LoginField) {
        this.LoginField = LoginField;
    }

    public void setSenhaField(JTextField SenhaField) {
        this.SenhaField = SenhaField;
    }

    public void setTelefoneField(JTextField TelefoneField) {
        this.TelefoneField = TelefoneField;
    }

    
    
/////////////////////////////////////////////////////////////////////////////////    
    
    
    
    
    
 ///////////////////////////////////////////////////////////////////////////////
    
    public DADOS_PESSOAIS(){
    
        super("Dados pessoais");
        
        formulario();
    }

    
    
    private void formulario() {
        
////////////////////////////////////////////////////////////////////////////////

        setLayout(new BorderLayout());
        
        JPanel PainelDados01 = new JPanel();
        PainelDados01.setLayout(new FlowLayout());
        
        JLabel Titulo = new JLabel(" Insira Seus Dados Pessoais");
        Titulo.setFont(new Font("arial", Font.BOLD,20));
        PainelDados01.add(Titulo);
        
////////////////////////////////////////////////////////////////////////////////        
       JPanel PainelDados02= new JPanel();
       PainelDados02.setLayout(new GridLayout(4,1));
       
       
////////////////////////////////////////////////////////////////////////////////

       JLabel dadospessoais= new JLabel("Dados Pessoais");
       dadospessoais.setFont(new Font("arial", Font.BOLD,14));
       PainelDados02.add(dadospessoais);
           
 ///////////////////////////////////////////////////////////////////////////////


        JPanel SetorPessoal = new JPanel();
        SetorPessoal.setLayout(new GridLayout(4,4));
        
        
        JLabel Nome = new JLabel("Nome:");
        Nome.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
        
        setNomeField(new JTextField(8));
        getNomeField().setBorder(BorderFactory.createMatteBorder(1, 0, 1, 10, new Color(147,211,255)));
        
        
        JLabel SUS = new JLabel("Cartão do SUS:");
        SUS.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
        
        setSUSField(new JTextField(10));
        getSUSField().setBorder(BorderFactory.createMatteBorder(1,0,1,10, new Color(147,211,255)));
        
        JLabel Idade = new JLabel("Idade:");
        Idade.setBorder(BorderFactory.createMatteBorder(0,50, 0, 0, new Color(147,211,255)));
        
        setIdadeField( new JTextField(10));
        getIdadeField().setBorder(BorderFactory.createMatteBorder(1,0,1,10, new Color(147,211,255)));
        
        JLabel CPF = new JLabel("CPF:");
        CPF.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
        
        setCPFField(new JTextField(10));
        getCPFField().setBorder(BorderFactory.createMatteBorder(1,0,1,10, new Color(147,211,255)));
        
        
        JLabel Email = new JLabel("E-mail:");
        Email.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
        
        setEmailField(new JTextField(10));
        getEmailField().setBorder(BorderFactory.createMatteBorder(1,0,1,10, new Color(147,211,255)));
        
        JLabel Telefone = new JLabel("Telefone:");
        Telefone.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
        
        setTelefoneField(new JTextField(10));
        getTelefoneField().setBorder(BorderFactory.createMatteBorder(1,0,1,10, new Color(147,211,255)));
        
        JLabel Login = new JLabel("Login:");
        Login.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
                
        setLoginField(new JTextField(10));
        getLoginField().setBorder(BorderFactory.createMatteBorder(1,0,1,10, new Color(147,211,255)));
        getLoginField().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){getLoginField().setText(getCPFField().getText());}
            @Override
            public void mousePressed(MouseEvent e) {getLoginField().setText(getCPFField().getText());}
            @Override
            public void mouseReleased(MouseEvent e) {getLoginField().setText(getCPFField().getText());}
            @Override
            public void mouseEntered(MouseEvent e) {getLoginField().setText(getCPFField().getText());}
            @Override
            public void mouseExited(MouseEvent e) {getLoginField().setText(getCPFField().getText());}

        });
        
        
        JLabel Senha = new JLabel("Senha:");
        Senha.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
        
        setSenhaField(new JTextField(10));
        getSenhaField().setBorder(BorderFactory.createMatteBorder(1,0,1,10, new Color(147,211,255)));
        
        SetorPessoal.add(Nome);
        SetorPessoal.add(getNomeField());
        
        SetorPessoal.add(SUS);
        SetorPessoal.add(getSUSField());
        
        SetorPessoal.add(Idade);
        SetorPessoal.add(getIdadeField());
        
        SetorPessoal.add(CPF);
        SetorPessoal.add(getCPFField());
        
        SetorPessoal.add(Email);
        SetorPessoal.add(getEmailField());
        
        SetorPessoal.add(Telefone);
        SetorPessoal.add(getTelefoneField());
        
        SetorPessoal.add(Login);
        SetorPessoal.add(getLoginField());
        
        SetorPessoal.add(Senha);
        SetorPessoal.add(getSenhaField());
        
        PainelDados02.add(SetorPessoal);
       
      
////////////////////////////////////////////////////////////////////////////////

        JPanel PainelDados03 = new JPanel();
        PainelDados03.setLayout(new FlowLayout());
        
        Proximo proximo = new Proximo();
        Voltar voltar = new Voltar();
         
         JButton BotaoProximo = new JButton("proximo");
         BotaoProximo.addActionListener(proximo);
         BotaoProximo.setBackground(Color.WHITE);
         
         JButton BotaoVoltar = new JButton("voltar");
         BotaoVoltar.addActionListener(voltar);
         BotaoVoltar.setBackground(Color.WHITE);
         
         
         
         PainelDados03.add(BotaoProximo);
         PainelDados03.add(BotaoVoltar);
         
///////////////////////////////////////////////////////////////////////////////         
        

        add(PainelDados01, BorderLayout.NORTH);
        PainelDados01.setBackground(new Color(147,211,255));
        
        add(PainelDados02, BorderLayout.CENTER);
        SetorPessoal.setBackground(new Color(147,211,255));
        
        add(PainelDados03, BorderLayout.SOUTH);
        PainelDados03.setBackground(new Color(147,211,255));
        
    }

    private class Proximo implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
            
            LOGADO log= new LOGADO();
            
            if (NomeField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Nome", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (SUSField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Cartão do SUS", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (IdadeField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Idade", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (CPFField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo CPF", "Erro", JOptionPane.ERROR_MESSAGE);}            
            else if (EmailField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados selecionados no Campo E-mail", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (TelefoneField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Telefone", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (LoginField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Login", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (SenhaField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Senha", "Erro", JOptionPane.ERROR_MESSAGE);}
                
            else{log.dados01(NomeField.getText(), SUSField.getText(), IdadeField.getText(), CPFField.getText(), EmailField.getText(), SUSField.getText(), LoginField.getText(), SenhaField.getText());
            
           
             endereco objendereço = new endereco();
             
             
             objendereço.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             objendereço.setSize(400, 300);
             objendereço.setVisible(true);
             objendereço.setLocationRelativeTo(null);
             dispose();
             objendereço.setResizable(false);
            
        }}

       
    }
    
    
    private class Voltar implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
           
         Login objLogin=new Login();
         
         
         objLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         objLogin.setSize(400, 180);
         objLogin.setVisible(true);
         objLogin.setLocationRelativeTo(null);
         dispose();
           
         
            
            
        }

       
    }
    
       
}
