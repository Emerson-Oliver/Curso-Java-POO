package entities;

public class Aluno {
    public String nome;
    public double nota1Trimestre;
    public double nota2Trimestre;
    public double nota3Trimestre;

    public double mediaFinal() {
        return nota1Trimestre + nota2Trimestre + nota3Trimestre;
    }
    
    public double notaRestante() {
    	return 60 - (nota1Trimestre + nota2Trimestre + nota3Trimestre);
    }
   
}
