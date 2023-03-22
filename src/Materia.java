public class Materia {
  
  private  String nomeMateria;
  private String tema;
  private int quantidadeExercicios;
  private int quantidadeAulas;

  public String getNome(){
    return this.nomeMateria;
  }
  public String getTema(){
    return this.tema;
  }

  public int getExecicios(){
    return this.quantidadeExercicios;
  }

  public int getAulas(){
    return this.quantidadeAulas;
  }

  public void addExercicos(){
    this.quantidadeExercicios += 1;
  }

  public void addAulas(){
    this.quantidadeAulas += 1;
  }
}