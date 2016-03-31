package Mini_App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		List<Aluno> listaAlunos= new ArrayList<>(); 
		Scanner scan = new Scanner(System.in);
		int opt=0, opt2=0;
		Aluno comp = new Aluno();
		
		while(opt!=7)
		{	
		int	found=0;
		
		System.out.println("Escolha a opção:");
		System.out.println("1-Incluir alunos");
		System.out.println("2-Remover alunos");
		System.out.println("3-Verificar se aluno está matriculado");
		System.out.println("4-Listar alunos aprovados");
		System.out.println("5-Listar alunos reprovados por falta");
		System.out.println("6-Listar alunos por ordem alfabética");
		System.out.println("7-Sair");
		
		
	
		opt = scan.nextInt();
		
		switch (opt){
		
		case 1:
		{
			Aluno al = new Aluno();
			
			scan.nextLine(); 
			System.out.println("Digite o nome do aluno:");
            String S1 = scan.nextLine();
            al.setNome(S1);
			System.out.println("Digite a matrícula do aluno:");
            String S2 = scan.nextLine();
            al.setMatricula(S2);
			System.out.println("Digite a media do aluno");
			double S3 = scan.nextDouble();
			al.setMedia(S3);
			System.out.println("Digite a quantidade de faltas do aluno");
			int S4 = scan.nextInt();
			al.setFaltas(S4);
			listaAlunos.add(al);
		}break;
		
		case 2:
		{			
			scan.nextLine(); 
			System.out.println("Deseja remover por nome ou por matrícula?:");
			System.out.println("1- Nome");
			System.out.println("2- Matricula");
			opt2 = scan.nextInt();
            if (opt2==1)
            {
            scan.nextLine(); 	
            System.out.println("Digite o nome do aluno:");
            String SS = scan.nextLine();
            Iterator<Aluno> it = listaAlunos.iterator();
            while (it.hasNext()) {
            Aluno nm = it.next();
            if (nm.getNome().equals(SS)) {
            it.remove();
            }
            }
            }
            else if (opt2==2)
            {
            scan.nextLine(); 	
			System.out.println("Digite a matrícula do aluno:");
			String SM = scan.nextLine();
            Iterator<Aluno> it = listaAlunos.iterator();
            while (it.hasNext()) {
            Aluno nm = it.next();
            if (nm.getMatricula().equals(SM)) {
            it.remove();
            }
            }
			}

		} break;
		
		case 3:
		{	
            scan.nextLine(); 	
			System.out.println("Digite a matrícula do aluno:");
			String SM = scan.nextLine();
            Iterator<Aluno> it = listaAlunos.iterator();
            while (it.hasNext()) {
            Aluno nm = it.next();
            if (nm.getMatricula().equals(SM)) {
            System.out.println("O aluno está matriculado!");
            found=1;
            }
            }
            if (found==0)
            System.out.println("O aluno não está matriculado!");	
	        
		}break;
		case 4:
		{
            Iterator<Aluno> it = listaAlunos.iterator();
            while (it.hasNext()) {
            Aluno nm = it.next();
            if (nm.getMedia()>=7) {
            System.out.println("Aluno [nome=" + nm.getNome()+ ", matricula=" + nm.getMatricula()+ ", media=" + nm.getMedia() + ", faltas=" + nm.getFaltas()+"]");
            }
            }
             
		}break;
		
		case 5:
		{
            Iterator<Aluno> it = listaAlunos.iterator();
            while (it.hasNext()) {
            Aluno nm = it.next();
            if (nm.getFaltas()>7) {
            System.out.println("Aluno [nome=" + nm.getNome()+ ", matricula=" + nm.getMatricula()+ ", media=" + nm.getMedia() + ", faltas=" + nm.getFaltas()+"]");
            }
            }
             
		}break;
		
		case 6:
		{
             Collections.sort(listaAlunos, comp);
             System.out.println(Arrays.toString(listaAlunos.toArray()));
		}break;
		
		
		case 7:
		{
			System.exit(1);	
		}break;
		
		default:
		{
			System.out.println("Opção inválida!");
		}
		
		}
		
		}// Fim do while

	}

}
