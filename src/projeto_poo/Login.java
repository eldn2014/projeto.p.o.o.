
package projeto_poo;


import java.awt.event.*;
import java.awt.*;
import java.text.AttributedCharacterIterator;
import java.util.Locale;
import java.util.Map;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import projeto_poo.LOGADO;

public class Login extends JFrame{
    
     public static JTextField LoginField;
     public static JTextField SenhaField;
     public static String[]Campos =new String[6];
    
     
     public Login(){
        super("Area de Login");
        
        MenuLogin();
        MenuFormulario();
       
    }
 
     
     private void MenuLogin(){
         
         Cadastro cadastro = new Cadastro();
         Ajuda ajuda = new Ajuda();
         Sobre sobre =new Sobre();
         
         JMenu menucadastro= new JMenu("Cadastro");
         menucadastro.setForeground(Color.WHITE);
         
         JMenuItem ItemCadastro= new JMenuItem("Realizar Cadastro"); // cria o item(botão) cadastro    
         ItemCadastro.addActionListener(cadastro);
         menucadastro.add(ItemCadastro);
         ItemCadastro.setBackground(new Color(93,150,255));
         ItemCadastro.setForeground(Color.WHITE);
        
         
         JMenu menuajuda =new JMenu("Ajuda");
         menuajuda.setForeground(Color.WHITE);
         
         JMenuItem Itemajuda = new JMenuItem("Obter Contato Para Ajuda"); // cria o item(botão) cadastro
         Itemajuda.addActionListener(ajuda);
         menuajuda.add(Itemajuda);
         Itemajuda.setBackground(new Color(93,150,255)); 
         Itemajuda.setForeground(Color.WHITE);
         
         
         
         JMenu menusobre= new JMenu("Sobre..");
         menusobre.setForeground(Color.WHITE);
         
         JMenuItem ItemSobre= new JMenuItem("Informações"); // cria o item(botão) cadastro
         ItemSobre.addActionListener(sobre);
         menusobre.add(ItemSobre);
         ItemSobre.setBackground(new Color(93,150,255)); 
         ItemSobre.setForeground(Color.WHITE);
         
         
         
     
         JMenuBar barralogin = new JMenuBar();// cria a barra onde vai os itens(botoes criados acima)
         setJMenuBar(barralogin);
         barralogin.setBackground(new Color(93,150,255));
         
         
         
         barralogin.add(menucadastro);
         barralogin.add(menuajuda);
         barralogin.add(menusobre);
         
         
     }
     
    private void MenuFormulario() {
        setLayout(new BorderLayout());
        
        JPanel PainelLogin01= new JPanel();
        PainelLogin01.setLayout(new FlowLayout());
        
        JLabel Titulo=new JLabel("Sistema de Vacinação de São Paulo");
        Titulo.setFont(new Font("arial",Font.BOLD,15));
        PainelLogin01.add(Titulo);
        
        
        
         JPanel PainelLogin02= new JPanel();
         PainelLogin02.setLayout(new GridLayout(2, 2));
      
         JLabel Usuario=new JLabel("Usuário:");
         Usuario.setBorder(BorderFactory.createMatteBorder(0, 130, 0, 0, new Color(147,211,255)));
        
         LoginField= new JTextField(10);
         LoginField.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 30, new Color(147,211,255)));
        
        
         
         JLabel senha =new JLabel("Senha:"); 
         senha.setBorder(BorderFactory.createMatteBorder(0, 138, 0, 0, new Color(147,211,255)));
         
         SenhaField = new JPasswordField(10);
         SenhaField.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 30, new Color(147,211,255)));
    
         PainelLogin02.add(Usuario);
         PainelLogin02.add(LoginField);
         
        
         PainelLogin02.add(senha);
         PainelLogin02.add(SenhaField);
         
         
        
         
         JPanel PainelLogin03 = new JPanel();
         PainelLogin03.setLayout(new FlowLayout());
         
         Fechar fechar = new Fechar();
         Entrar entrar = new Entrar();
         
         JButton BotaoEntra = new JButton("Entrar");
         BotaoEntra.addActionListener(entrar);
         BotaoEntra.setBackground(Color.WHITE);
         
         JButton BotaoFechar = new JButton("Fechar");
         BotaoFechar.addActionListener(fechar);
         BotaoFechar.setBackground(Color.WHITE);
         
         
         PainelLogin03.add(BotaoEntra);
         PainelLogin03.add(BotaoFechar);
         
        PainelLogin03.setBackground(new Color(147,211,255));
        PainelLogin02.setBackground(new Color(147,211,255));
        PainelLogin01.setBackground(new Color(147,211,255));
        
//        PainelLogin02.setBorder(BorderFactory.createMatteBorder(20, 1, 0, 0, new Color(147,211,255)));
    
       
        add(PainelLogin01, BorderLayout.NORTH);
        add(PainelLogin02,BorderLayout.CENTER);
        add(PainelLogin03, BorderLayout.SOUTH);
        
        
    }
   
      private class Cadastro implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
            DADOS_PESSOAIS dadospessoais= new DADOS_PESSOAIS();
           
            dadospessoais.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dadospessoais.setSize(530,400);
            dadospessoais.setVisible(true);
            dadospessoais.setLocationRelativeTo(null);
            dadospessoais.setResizable(false);
            dispose();
        }
     }
     
      private class Ajuda  implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
            
          JOptionPane.showMessageDialog(null,"Programa Criado"
                  + " por Emesson, Bruna, jhenifer e gabrielly\nQualquer problema "
                  + "entrar em contato.\nTelefone(11) 91234-5678", 
                  "Dados", JOptionPane.PLAIN_MESSAGE);}
        }
      
      private class Sobre  implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
            
          JOptionPane.showMessageDialog(null,"Programa Criado"
                  + " por Emesson, Bruna, Jhenifer e Gabrielly.\nProgeto Programação"
                  + " Orienta a Objetos em java."
                  + "\nCurso: Ciencia da Computação  Turma:2f 20212",
                  "Dados", JOptionPane.PLAIN_MESSAGE);}
        }
      
      private class Fechar implements ActionListener{ 
   
       public void actionPerformed(ActionEvent event) {// metodo para evento do botão
       System.exit(0); // faz com que o programa feche e não fique rodando em segundo plano
       
       }
       
   }
    
      
      private class Entrar implements ActionListener{ 
       
       public void actionPerformed(ActionEvent event) {
           
           
            String logi=LoginField.getText();
            String senha=SenhaField.getText();
           
          
            
          LOGIN_MEDICO LoginMedico = new LOGIN_MEDICO();      
          
            LOGADO log = new LOGADO();
            log.getLoginMedico(logi,senha, Campos);
            
             if(  Campos[5]== "true") {
                 
            LoginMedico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            LoginMedico.setSize(530,300);
            LoginMedico.setVisible(true);
            LoginMedico.setLocationRelativeTo(null);
            LoginMedico.setResizable(false);
            dispose();
           
                 
             }
             
            else if(log.getLoginInfermeira(logi,senha) == true){
             
             
                
                System.out.println("login Infermeira");
                
             }
            
            else {JOptionPane.showMessageDialog( null, "Usuário e/ou Senha Incorretos,Por Favor Tente Novamente", "ERRO", JOptionPane.ERROR_MESSAGE);}
                
           
        
       
       }}}
       
   
      
      
      
     
      
     

