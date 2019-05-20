public class Aluno{
	//Atributos
	private double p1;
	private double ma1;
	private double mb1;
	private double p2;
	private double ma2;
	private double mb2;
	private int qtdFaltas;
	private double media;
	private String status;
	
	//Getters
	public double getP1(){
		return p1;
	}
	public double getMa1(){
		return ma1;
	}
	public double getMb1(){
		return mb1;
	}
	public double getP2(){
		return p2;
	}
	public double getMa2(){
		return ma2;
	}
	public double getMb2(){
		return mb2;
	}
	public int getQtdFaltas(){
		return qtdFaltas;
	}
	public double getMedia(){
		return media;
	}
	public String getStatus(){
		return status;
	}
	
	//Setters
	public void setP1(double p1){
		this.p1 = p1;
	}
	public void setMa1(double ma1){
		this.ma1 = ma1;
	}
	public void setMb1(double mb1){
		this.mb1 = mb1;
	}
	public void setP2(double p2){
		this.p2 = p2;
	}
	public void setMa2(double ma2){
		this.ma2 = ma2;
	}
	public void setMb2(double mb2){
		this.mb2 = mb2;
	}
	public void setQtdFaltas(int qtdFaltas){
		this.qtdFaltas = qtdFaltas;
	}
	public void setMedia(double media){
		this.media = media;
	}
	public void setStatus(String status){
		this.status = status;
	}
	
	//Métodos
	public void calcularMedia(){
		double a1, a2;
		a1 = ((p1*70)+(ma1*20)+(mb1*10))/100;
		a2 = ((p2*70)+(ma2*20)+(mb2*10))/100;
		media = (a1+2*a2)/3;
	}
	public void situacaoAluno(int qtdAulas){
		qtdAulas = qtdAulas - (qtdAulas * 75/100);
		
		if((media >= 5) && (qtdFaltas <= qtdAulas)){
			status = "Aprovado";
		}
		else if(((media < 5) && (media >= 3)) && (qtdFaltas <= qtdAulas)){
			status = "Recuperação";
		}
        else if((media < 3) && (qtdFaltas <= qtdAulas)){
			status = "Reprovado por nota";
		}  
		else if(qtdFaltas >= qtdAulas){
			status = "Reprovado por falta";
		}
	}
	public void imprimir() {
		System.out.println(media);
		System.out.println(status);
	}
}
