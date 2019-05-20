import java.util.Scanner;

class Principal{
	
	public static void main (String[] args){
		Aluno a1 = new Aluno();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a nota P1: ");
        a1.setP1(scan.nextDouble());
		
		System.out.print("Informe a nota Ma1: ");
        a1.setMa1(scan.nextDouble());
		
		System.out.print("Informe a nota Mb1: ");
        a1.setMb1(scan.nextDouble());
		
		System.out.print("Informe a nota P2: ");
        a1.setP2(scan.nextDouble());
		
		System.out.print("Informe a nota Ma2: ");
        a1.setMa2(scan.nextDouble());
		
		System.out.print("Informe a nota Mb2: ");
        a1.setMb2(scan.nextDouble());
		
		System.out.print("Quantidade de faltas: ");
        a1.setQtdFaltas(scan.nextInt());
		
		a1.calcularMedia();
		
		System.out.print("Quantidade de Aulas: ");
        a1.situacaoAluno(scan.nextInt());
		
		a1.imprimir();
	}
}
