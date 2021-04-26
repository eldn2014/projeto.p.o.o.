package projeto_poo;

import javax.swing.JOptionPane;



public class endereco {
    
    private String Rua; 
    private String Numero; 
    private String Bairro; 
    private String Cep; 
    private String Estado; 
    private String Cidade;
    private static String end[][];
    private static int x,y;
    
////////////////////////////////////////////////////////////////////////////////
    
    
    public void dado() {
       
        
        atualn();
         
         if(x<2){
             
             end = new String[x][y];
             
             for (int i=0; i<x; i++){
                 for (int j=0; j<y;j++){
                  if (j==0){end[i][j]= this.Rua;}
                  else if (j==1){end[i][j]= this.Numero;}
                  else if (j==2){end[i][j]= this.Bairro;}
                  else if (j==3){end[i][j]= this.Cep;}
                  else if (j==4){end[i][j]= this.Estado;}
                  else if (j==5){end[i][j]= this.Cidade;}
         
             }}
         JOptionPane.showMessageDialog(null,"Os dados inseridos foram salvos", "Dados Salvos", JOptionPane.PLAIN_MESSAGE);}
         
         else{
             
         String tmp[][] =new String[x-1][y-1];
         
         for(int i=0;i<x-1;i++){ 
           for(int j=0; j<y-1;j++){
             
          tmp[i][j]= end[i][j]; }}
        
         end =new String[x][y];
           
            for (int j=0; j<y;j++){
                  if (j==0){end[x-1][j]= this.Rua;}
                  else if (j==1){end[x-1][j]= this.Numero;}
                  else if (j==2){end[x-1][j]= this.Bairro;}
                  else if (j==3){end[x-1][j]= this.Cep;}
                  else if (j==4){end[x-1][j]= this.Estado;}
                  else if (j==5){end[x-1][j]= this.Cidade;}
                 }
         
        for(int i=0;i<x-1;i++){ 
           for(int j=0; j<y-1;j++){
             
          end[i][j]=tmp[i][j] ; }}
         
         
        
        
         JOptionPane.showMessageDialog(null,"Os dados inseridos foram salvos", "Dados Salvos", JOptionPane.PLAIN_MESSAGE);
         }
         
         impr(x, y,end);
    }
    
    
    public void impr(int x, int y, String dadosend[][]){
        
      for(int i=0;i<x;i++){ 
          System.out.println("\n");
           for(int j=0; j<y;j++){
    
         System.out.printf(" | OS DADOS DA POSIÇÃO ENDEREÇO ("+(i)+","+(j)+") "+ dadosend[i][j]+ " | ");
         
      }}
        
        
    }
    
    

    public endereco() {
    }

    public endereco(String Rua, String Numero, String Bairro, String Cep, String Estado, String Cidade) {
        this.Rua = Rua;
        this.Numero = Numero;
        this.Bairro = Bairro;
        this.Cep = Cep;
        this.Estado = Estado;
        this.Cidade = Cidade;
    }

    
////////////////////////////////////////////////////////////////////////////////
    
    public String getRua() {
        return Rua;
    }

    public String getNumero() {
        return Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getCep() {
        return Cep;
    }

    public String getEstado() {
        return Estado;
    }

    public String getCidade() {
        return Cidade;
    }
    
    
    
////////////////////////////////////////////////////////////////////////////////

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    
   
  
   public void atualn(){
        x++;
        y=6;
    }
 
    
   
    
}
