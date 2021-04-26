package projeto_poo;



import javax.swing.JOptionPane;




public class Logado {
    
  private String[][] DadosdoMedico;  
  private String[][] DadosdaInfermeira;   
  private String[][] DadosdoPaciente;   
  private static int x, y;
  private static String dadosend01[][];
  
  
    public Logado() {
    }
 
    public String[] getLoginMedico(String Login, String senha, String [] campos) {
         
        
        x=4; y=5; String temp;
        
        
      DadosdoMedico= new String[x][y];
      
      
      DadosdoMedico[0][0]="Paulo";  DadosdoMedico[0][1]="1892127";  DadosdoMedico[0][2]="SIM"; DadosdoMedico[0][3]="PEDIATRA";     DadosdoMedico[0][4]="Paulo+2015";
      DadosdoMedico[1][0]="Carla";  DadosdoMedico[1][1]="1931477";  DadosdoMedico[1][2]="SIM"; DadosdoMedico[1][3]="DENTISTA";     DadosdoMedico[1][4]="Carla2000";
      DadosdoMedico[2][0]="João";   DadosdoMedico[2][1]="0981078";  DadosdoMedico[2][2]="NÃO"; DadosdoMedico[2][3]="CIRUGIÃO";     DadosdoMedico[2][4]="João.4254";
      DadosdoMedico[3][0]="Julia";  DadosdoMedico[3][1]="0178492";  DadosdoMedico[3][2]="NÃO"; DadosdoMedico[3][3]="MÉDICO GERAL"; DadosdoMedico[3][4]="Julia-123";
      
    
        for (int i=0; i<x; i++ ){
          if ( Login.equals(DadosdoMedico[i][y-4]) && senha.equals(DadosdoMedico[i][y-1])){
              for (int j=0; j<y-1; j++ ){
                 campos[j] = DadosdoMedico [i][j]; }
              campos[5]= "true";
              
              return campos;}}
        campos[5]= null;
        return campos ;
    }
    

    public boolean getLoginEnfermeira(String Login, String senha) {
        x=6; y=3;
      DadosdaInfermeira= new String[x][y];
      
      
      DadosdaInfermeira[0][0]="Ana Paula";  DadosdaInfermeira[0][1]="27859";   DadosdaInfermeira[0][2]="Aninha01";
      DadosdaInfermeira[1][0]="Joaquina";   DadosdaInfermeira[1][1]="65789";   DadosdaInfermeira[1][2]="Jlove150";
      DadosdaInfermeira[2][0]="Sophia";     DadosdaInfermeira[2][1]="02547";   DadosdaInfermeira[2][2]="Sh0p1411";
      DadosdaInfermeira[3][0]="Alessadra";  DadosdaInfermeira[3][1]="18249";   DadosdaInfermeira[3][2]="Aless4+1";
      DadosdaInfermeira[4][0]="Alex";       DadosdaInfermeira[4][1]="29129";   DadosdaInfermeira[4][2]="413X+sil";
      DadosdaInfermeira[5][0]="Pedro";      DadosdaInfermeira[5][1]="31025";   DadosdaInfermeira[5][2]="Peter-48";
      
    
        for (int i=0; i<x; i++ ){
          if ( Login.equals(DadosdaInfermeira[i][y-2]) && senha.equals(DadosdaInfermeira[i][y-1])){
              
          return true;}}
      
        return false; 
        
    }
    
    

   public void dados1( String nome, String sus, String idade, String cpf, String email,String tele, String login ,String senha){
      
      
         atualn();
         
         if(x<2){
             
             dadosend01 = new String[x][y];
             
             for (int i=0; i<x; i++){
                 for (int j=0; j<y;j++){
                  if (j==0){dadosend01[i][j]= nome;}
                  if (j==1){dadosend01[i][j]= sus;}
                  if (j==2){dadosend01[i][j]= idade;}
                  if (j==3){dadosend01[i][j]= cpf;}
                  if (j==4){dadosend01[i][j]= email;}
                  if (j==5){dadosend01[i][j]= tele;}
                  if (j==6){dadosend01[i][j]= login;}
                  if (j==7){dadosend01[i][j]= senha;}
         
         
             }}
         JOptionPane.showMessageDialog(null,"Os dados inseridos foram salvos\n"
                 + "Seu login é seu CPF", "Dados Salvos", JOptionPane.PLAIN_MESSAGE);}
         
         else{
             
         String tmp[][] =new String[x-1][y-1];
         
         for(int i=0;i<x-1;i++){ 
           for(int j=0; j<y-1;j++){
             
          tmp[i][j]= dadosend01[i][j]; }}
        
         dadosend01 =new String[x][y];
           
            for (int j=0; j<y;j++){
                  if (j==0){dadosend01[x-1][j]= nome;}
                  if (j==1){dadosend01[x-1][j]= sus;}
                  if (j==2){dadosend01[x-1][j]= idade;}
                  if (j==3){dadosend01[x-1][j]= cpf;}
                  if (j==4){dadosend01[x-1][j]= email;}
                  if (j==5){dadosend01[x-1][j]= tele;}
                  if (j==6){dadosend01[x-1][j]= login;}
                  if (j==7){dadosend01[x-1][j]= senha;}
                 }
         
        for(int i=0;i<x-1;i++){ 
           for(int j=0; j<y-1;j++){
             
          dadosend01[i][j]=tmp[i][j] ; }}
         
         
        
        
         JOptionPane.showMessageDialog(null,"Os dados inseridos foram salvos\n"
                 + "Seu login é seu CPF", "Dados Salvos", JOptionPane.PLAIN_MESSAGE);
         }
         
         impr(x, y,dadosend01);
      
      
      
      
      
    
}
 
    
  
   public void atualn(){
        x++;
        y=8;
    }
   
    public void impr(int x, int y, String dadosend[][]){
        
      for(int i=0;i<x;i++){ 
          System.out.println("\n");
           for(int j=0; j<y;j++){
    
         System.out.printf(" | OS DADOS DA POSIÇÃO PESSOAL ("+(i)+","+(j)+") "+ dadosend[i][j]+ " | ");}}
        
        
    }
    

}