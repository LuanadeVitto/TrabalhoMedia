class Principal{
	
	public static void main (String[] args){
		Aluno a1 = new Aluno();
		
		a1.setP1(8.0);
		a1.setMa1(8.0);
		a1.setMb1(10.0);
		
		a1.setP2(6.0);
		a1.setMa2(5.0);
		a1.setMb2(7.0);
		
		a1.setQtdFaltas(3);
		
		a1.calcularMedia();
		a1.situacaoAluno(20);
		
		a1.imprimir();
	}
}