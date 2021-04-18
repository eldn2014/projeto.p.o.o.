
package projeto_poo;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class endereço extends JFrame{
    
    private JTextField RuaField; // cria um atributo 
    private JTextField NumbField; // cria um atributo 
    private JTextField CidadeField; // cria um atributo 
    private JTextField CEPField; // cria um atributo 
    private JTextField BairroField; // cria um atributo 
    private JComboBox boxst;
    private final String estados[]={"","AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};

    
    /////////////////////////////////////////////////////////////////////////////////
    
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
    
    //////////////////////////////////////////////////////////////////////////////////

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
    
    
  ///////////////////////////////////////////////////////////////////////////////////
 
    
    
    public endereço(){
        super("Endereço");// cria a janela endereço
        
        criarFormulario();// chama o metodo o qual cria um formulario com titulo, campos e botoes.
    }

    private class SalvarAction implements ActionListener{
        
     public void actionPerformed(ActionEvent event) {// metodo para evento do botão
    
        LOGADO log= new LOGADO();
        String estado= boxst.getSelectedItem().toString();
         
             if (RuaField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Rua", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (BairroField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Bairro", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (NumbField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Número", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (CidadeField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo Cidade", "Erro", JOptionPane.ERROR_MESSAGE);}            
            else if (estado.equals("")){JOptionPane.showMessageDialog(null,"Sem Dados selecionados no Campo Estado", "Erro", JOptionPane.ERROR_MESSAGE);}
            else if (CEPField.getText().equals("")){JOptionPane.showMessageDialog(null,"Sem Dados Inserido no Campo CEP", "Erro", JOptionPane.ERROR_MESSAGE);}
             
             else{
                log.dados02(RuaField.getText(), BairroField.getText(), NumbField.getText(), CidadeField.getText(), estado, CEPField.getText());
         
                Login objLogin=new Login();
                
                objLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
                objLogin.setSize(400, 180);
                objLogin.setVisible(true);
                objLogin.setLocationRelativeTo(null);
                objLogin.setResizable(false);
                dispose();
             }
    }}
     
     private class VoltarAction implements ActionListener{  // subclasse  
        
     public void actionPerformed(ActionEvent event) {
     
        DADOS_PESSOAIS dadospessoais= new DADOS_PESSOAIS();
        
            dadospessoais.setUndecorated(true);
            dadospessoais.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dadospessoais.setSize(530,300);
            dadospessoais.setVisible(true);
            dadospessoais.setLocationRelativeTo(null);
            dispose();
     
     
     }}
     
     
     
    
    private void criarFormulario() {// cria um novo metodo
        
        setLayout(new BorderLayout());// cria um layout
        
////////////////////////////////////////////////////////////////////////////////

        JPanel painelTitulo=new JPanel(); // cria um painel
        painelTitulo.setLayout(new FlowLayout());// define o layout deste painel
        
        JLabel titulo = new JLabel("Cadastro de Endereço");// cria um titulo para esse painel
        titulo.setFont(new Font("Arial",Font.BOLD,16 ));// define a fonte, o formato e o tamanho
        painelTitulo.add(titulo);// seta as informações no titulo
        
////////////////////////////////////////////////////////////////////////////////        
        
        JPanel painelCadastro =new JPanel(); // cria um novo painel
        painelCadastro.setLayout(new GridLayout(6, 2)); // define o layout deste painel
        
         JLabel RuaLabel= new JLabel("Rua:"); // cria um titulo
         RuaLabel.setBorder(BorderFactory.createMatteBorder(0, 155, 0, 0, new Color(147,211,255)));
        
         RuaField=new JTextField(40); // chama o atributo e o define uma textbox para inserir dados
         RuaField.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 20, new Color(147,211,255)));
        
         JLabel NumbLabel= new JLabel("Número:");// cria um titulo
         NumbLabel.setBorder(BorderFactory.createMatteBorder(0, 133, 0, 0, new Color(147,211,255)));
         
         NumbField=new JTextField(40);// chama o atributo e o define uma textbox para inserir dados
         NumbField.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 20, new Color(147,211,255)));
        
         JLabel BairroLabel= new JLabel("Bairro:");// cria um titulo
         BairroLabel.setBorder(BorderFactory.createMatteBorder(0, 141, 0, 0, new Color(147,211,255)));
         
         BairroField=new JTextField(40);// chama o atributo e o define uma textbox para inserir dados
         BairroField.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 20, new Color(147,211,255)));
         
       
         JLabel CidadeLabel= new JLabel("Cidade:");// cria um titulo
         CidadeLabel.setBorder(BorderFactory.createMatteBorder(0, 139, 0, 0, new Color(147,211,255)));
         
         CidadeField=new JTextField(40);// chama o atributo e o define uma textbox para inserir dados
         CidadeField.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 20, new Color(147,211,255)));
        
         JLabel STLabel= new JLabel("Estado:");// cria um titulo
         STLabel.setBorder(BorderFactory.createMatteBorder(0, 140, 0, 0, new Color(147,211,255)));
         
         boxst = new JComboBox(estados);
         boxst.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 10, new Color(147,211,255)));
         boxst.setBackground(new Color(0,134,255));
         boxst.setForeground(Color.white);
        
         JLabel CEPLabel= new JLabel("CEP:");// cria um titulo
         CEPLabel.setBorder(BorderFactory.createMatteBorder(0, 155, 0, 0, new Color(147,211,255)));
         
         CEPField=new JTextField(40);// chama o atributo e o define uma textbox para inserir dados
         CEPField.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 20, new Color(147,211,255)));
        
        painelCadastro.add(RuaLabel);// adiciona ao painel de cadastro o titulo
        painelCadastro.add(RuaField);// adiciona ao painel de cadastro o textbox
        
        painelCadastro.add(BairroLabel);// adiciona ao painel de cadastro o titulo
        painelCadastro.add(BairroField);//adiciona ao painel de cadastro o textbox
        
        painelCadastro.add(NumbLabel);// adiciona ao painel de cadastro o titulo
        painelCadastro.add(NumbField);//adiciona ao painel de cadastro o textbox
        
        painelCadastro.add(CidadeLabel);// adiciona ao painel de cadastro o titulo
        painelCadastro.add(CidadeField);//adiciona ao painel de cadastro o textbox
        
        painelCadastro.add(STLabel);// adiciona ao painel de cadastro o titulo
        painelCadastro.add(boxst);//adiciona ao painel de cadastro o textbox
        
        painelCadastro.add(CEPLabel);// adiciona ao painel de cadastro o titulo
        painelCadastro.add(CEPField);//adiciona ao painel de cadastro o textbox
////////////////////////////////////////////////////////////////////////////////        
        

        JPanel painelBotoes =new JPanel();// cria um painel
        painelBotoes.setLayout(new FlowLayout());// define o layout do painel

        
        SalvarAction salvaraction= new SalvarAction();// chama o objeto salvar action
         VoltarAction voltarction= new VoltarAction();
        
        JButton BotaoSalvar=new JButton("Salvar"); // define um botão
        BotaoSalvar.addActionListener(salvaraction);// define a função salvaraction ao botão salvar do painel
        BotaoSalvar.setBackground(Color.WHITE);
        
        JButton BotaoVoltar=new JButton("Voltar"); // define um botão
        BotaoVoltar.addActionListener(voltarction);
        BotaoVoltar.setBackground(Color.WHITE);
        
        painelBotoes.add(BotaoSalvar);// seta os botões no painel criado
        painelBotoes.add(BotaoVoltar);// seta os botões no painel criado
       
        
        add(painelTitulo, BorderLayout.NORTH);// adiciona um painel ao layout principal, em uma posição especifica.
        painelTitulo.setBackground(new Color(147,211,255));      
 
        add(painelCadastro, BorderLayout.CENTER);// adiciona um painel ao layout principal, em uma posição especifica.
        painelCadastro.setBackground(new Color(147,211,255));
        
        add(painelBotoes, BorderLayout.SOUTH);// adiciona um painel ao layout principal, em uma posição especifica.
        painelBotoes.setBackground(new Color(147,211,255));
        
        
    }


    
}
