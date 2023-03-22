public class Exercicio {
  
    private String enunciado;
    private String materia;
    private String resposta;
    private boolean foiResolvido = false;
    
  
    public String getEnunciado(){
      return this.enunciado;
    }
    public String getMateria(){
      return this.materia;
    }
  
    public String getResposta(){
      return this.resposta;
    }
  
    public boolean getFoiResolvido(){
      return this.foiResolvido;
    }
  
    public void resolverExercidio(){
      this.foiResolvido = true;
    }  
    
  }