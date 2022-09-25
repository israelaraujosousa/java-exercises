package salaryCalculation;

import java.util.Scanner;

public class SalaryCalculation {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.println("Informe o valor da hora: ");
		double valorHora = scan.nextDouble();
		
		double salarioBruto = horasTrabalhadas*valorHora;
		System.out.println("O salário bruto é de: R$ " +salarioBruto);
		
		double ir = (salarioBruto*11)/100;
		double inss = (salarioBruto*8/100);
		double sindicato = (salarioBruto*5)/100;
		double totalDescontos = (ir+inss+sindicato);
		
		System.out.println("IR(11%)= "+ ir);
		System.out.println("INSS(8%)= "+inss);
		System.out.println("SINDICATO(5%)= "+sindicato);
		System.out.println("Total de descontos: R$ "+totalDescontos );
		
		double salarioLiquido = salarioBruto-(ir+inss+sindicato);
		System.out.println("O sálario liquido é de: R$ "+salarioLiquido);
		
		scan.close();


	}

}
