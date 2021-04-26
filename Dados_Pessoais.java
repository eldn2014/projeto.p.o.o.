package projeto_poo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;




public class Dados_Pessoais extends JFrame{
    
    private JTextField NomeField;
    private JTextField SUSField;
    private JTextField IdadeField;
    private JTextField CPFField;
    private JTextField EmailField;
    private JTextField LoginField;
    private JTextField SenhaField;
    private JTextField TelefoneField;
    private endereco endereco;
    private JTextField RuaField; // cria um atributo 
    private JTextField NumbField; // cria um atributo 
    private JTextField CidadeField; // cria um atributo 
    private JTextField CEPField; // cria um atributo 
    private JTextField BairroField; // cria um atributo 
    private JComboBox boxst;
    private final String estados[]={"","AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};


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

    public endereco getEndereco() {
        return endereco;
    }

    public JTextField getRuaField() {
        return RuaField;
    }

    public JTextField getNumbField() {
        return NumbField;
    }

    public JTextField getCidadeField() {
        return CidadeField;
    }

    public JTextField getCEPField() {
        return CEPField;
    }

    public JTextField getBairroField() {
        return BairroField;
    }

    public JComboBox getBoxst() {
        return boxst;
    }

    public String[] getEstados() {
        return estados;
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

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    public void setRuaField(JTextField RuaField) {
        this.RuaField = RuaField;
    }

    public void setNumbField(JTextField NumbField) {
        this.NumbField = NumbField;
    }

    public void setCidadeField(JTextField CidadeField) {
        this.CidadeField = CidadeField;
    }

    public void setCEPField(JTextField CEPField) {
        this.CEPField = CEPField;
    }

    public void setBairroField(JTextField BairroField) {
        this.BairroField = BairroField;
    }

    public void setBoxst(JComboBox boxst) {
        this.boxst = boxst;
    }
    
    
    
    
    
 ///////////////////////////////////////////////////////////////////////////////
    
    public Dados_Pessoais(){
    
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
       PainelDados02.setLayout(new GridLayout(9,4));
       
       
////////////////////////////////////////////////////////////////////////////////

       JLabel setor01= new JLabel("Dados Pessoais");
       setor01.setFont(new Font("arial", Font.BOLD,14));
       PainelDados02.add(setor01);
       
       JLabel setor012= new JLabel(" ");
       setor01.setFont(new Font("arial", Font.BOLD,14));
       PainelDados02.add(setor012);
       
       JLabel setor013= new JLabel(" ");
       setor01.setFont(new Font("arial", Font.BOLD,14));
       PainelDados02.add(setor013);
       
       JLabel setor014= new JLabel(" ");
       setor01.setFont(new Font("arial", Font.BOLD,14));
       PainelDados02.add(setor014);
           
 ///////////////////////////////////////////////////////////////////////////////

        JLabel Nome = new JLabel("Nome:");
        Nome.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
        
        setNomeField(new JTextField(10));
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
        
        PainelDados02.add(Nome);
        PainelDados02.add(getNomeField());
        
        PainelDados02.add(SUS);
        PainelDados02.add(getSUSField());
        
        PainelDados02.add(Idade);
        PainelDados02.add(getIdadeField());
        
        PainelDados02.add(CPF);
        PainelDados02.add(getCPFField());
        
        PainelDados02.add(Email);
        PainelDados02.add(getEmailField());
        
        PainelDados02.add(Telefone);
        PainelDados02.add(getTelefoneField());
        
        PainelDados02.add(Login);
        PainelDados02.add(getLoginField());
        
        PainelDados02.add(Senha);
        PainelDados02.add(getSenhaField());
        
        
////////////////////////////////////////////////////////////////////////////////


        JLabel setor03 = new JLabel("Endereço");
        setor03.setFont(new Font("arial", Font.BOLD,14));
        PainelDados02.add(setor03);
        
        JLabel setor032= new JLabel(" ");
       setor01.setFont(new Font("arial", Font.BOLD,14));
       PainelDados02.add(setor032);
       
       JLabel setor033= new JLabel(" ");
       setor01.setFont(new Font("arial", Font.BOLD,14));
       PainelDados02.add(setor033);
       
       JLabel setor034= new JLabel(" ");
       setor01.setFont(new Font("arial", Font.BOLD,14));
       PainelDados02.add(setor034);

        
////////////////////////////////////////////////////////////////////////////////

        
         JLabel RuaLabel= new JLabel("Rua:"); // cria um titulo
         RuaLabel.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
        
         setRuaField(new JTextField(40));// chama o atributo e o define uma textbox para inserir dados
         getRuaField().setBorder(BorderFactory.createMatteBorder(1, 0, 1, 10, new Color(147,211,255)));
        
         JLabel NumbLabel= new JLabel("Número:");// cria um titulo
         NumbLabel.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
         
         setNumbField(new JTextField(40));// chama o atributo e o define uma textbox para inserir dados
         getNumbField().setBorder(BorderFactory.createMatteBorder(1, 0, 1, 10, new Color(147,211,255)));
        
         JLabel BairroLabel= new JLabel("Bairro:");// cria um titulo
         BairroLabel.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
         
         setBairroField(new JTextField(40));// chama o atributo e o define uma textbox para inserir dados
         getBairroField().setBorder(BorderFactory.createMatteBorder(1, 0, 1, 10, new Color(147,211,255)));
         
       
         JLabel CidadeLabel= new JLabel("Cidade:");// cria um titulo
         CidadeLabel.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
         
         setCidadeField(new JTextField(40));// chama o atributo e o define uma textbox para inserir dados
         getCidadeField().setBorder(BorderFactory.createMatteBorder(1, 0, 1, 10, new Color(147,211,255)));
        
         JLabel STLabel= new JLabel("Estado:");// cria um titulo
         STLabel.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
         
         setBoxst(new JComboBox(estados));
         getBoxst().setBorder(BorderFactory.createMatteBorder(1, 0, 1, 10, new Color(147,211,255)));
         getBoxst().setBackground(new Color(0,134,255));
         getBoxst().setForeground(Color.white);
        
         JLabel CEPLabel= new JLabel("CEP:");// cria um titulo
         CEPLabel.setBorder(BorderFactory.createMatteBorder(0, 50, 0, 0, new Color(147,211,255)));
         
         setCEPField(new JTextField(40));// chama o atributo e o define uma textbox para inserir dados
         getCEPField().setBorder(BorderFactory.createMatteBorder(1, 0, 1, 10, new Color(147,211,255)));
        
        PainelDados02.add(RuaLabel);// adiciona ao painel de cadastro o titulo
        PainelDados02.add(getRuaField());// adiciona ao painel de cadastro o textbox
        
        PainelDados02.add(BairroLabel);// adiciona ao painel de cadastro o titulo
        PainelDados02.add(getBairroField());//adiciona ao painel de cadastro o textbox
        
        PainelDados02.add(NumbLabel);// adiciona ao painel de cadastro o titulo
        PainelDados02.add(getNumbField());//adiciona ao painel de cadastro o textbox
        
        PainelDados02.add(CidadeLabel);// adiciona ao painel de cadastro o titulo
        PainelDados02.add(getCidadeField());//adiciona ao painel de cadastro o textbox
        
        PainelDados02.add(STLabel);// adiciona ao painel de cadastro o titulo
        PainelDados02.add(getBoxst());//adiciona ao painel de cadastro o textbox
        
        PainelDados02.add(CEPLabel);// adiciona ao painel de cadastro o titulo
        PainelDados02.add(getCEPField());//adiciona ao painel de cadastro o textbox
      

  
    

       
      
////////////////////////////////////////////////////////////////////////////////

        JPanel PainelDados03 = new JPanel();
        PainelDados03.setLayout(new FlowLayout());
        
        Salvar salvar = new Salvar();
        Voltar voltar = new Voltar();
         
         JButton BotaoProximo = new JButton("Salvar");
         BotaoProximo.addActionListener(salvar);
         BotaoProximo.setBackground(Color.WHITE);
         
         JButton BotaoVoltar = new JButton("Voltar");
         BotaoVoltar.addActionListener(voltar);
         BotaoVoltar.setBackground(Color.WHITE);
         
         
         
         PainelDados03.add(BotaoProximo);
         PainelDados03.add(BotaoVoltar);
         
///////////////////////////////////////////////////////////////////////////////         
        

        add(PainelDados01, BorderLayout.NORTH);
        PainelDados01.setBackground(new Color(147,211,255));
        
        add(PainelDados02, BorderLayout.CENTER);
        PainelDados02.setBackground(new Color(147,211,255));
        
        add(PainelDados03, BorderLayout.SOUTH);
        PainelDados03.setBackground(new Color(147,211,255));
        
    }

    private class Salvar implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
            
            
            if (NomeField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Nome", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (SUSField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Cartão do SUS", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (IdadeField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Idade", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (CPFField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo CPF", "Erro", JOptionPane.ERROR_MESSAGE);}            
            else if (EmailField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados selecionados no Campo E-mail", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (TelefoneField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Telefone", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (LoginField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Login", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (SenhaField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Senha", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (RuaField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Rua", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (BairroField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Bairro", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (NumbField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Numero", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (CidadeField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Cidade", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (boxst.getSelectedItem().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Selecionado no Campo Estado", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (CEPField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo CEP", "Erro", JOptionPane.ERROR_MESSAGE);}
            
            else{
               new Logado().dados1(NomeField.getText(), SUSField.getText(), IdadeField.getText(), CPFField.getText(), 
                            EmailField.getText(), SUSField.getText(), LoginField.getText(), SenhaField.getText());
                
                setEndereco(new endereco(RuaField.getText(), NumbField.getText(), BairroField.getText(), CEPField.getText(), 
                        boxst.getSelectedItem().toString(), CidadeField.getText()));
                endereco.dado();
                
                Login objLogin=new Login();
         
         
         objLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         objLogin.setSize(400, 180);
         objLogin.setVisible(true);
         objLogin.setLocationRelativeTo(null);
         dispose();}}

       
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