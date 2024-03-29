import javax.swing.JOptionPane;

public class CalculadoraIMC {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Esta é uma calculadora de IMC. \nCom base nisso, "
				+ "veremos se você está saudável ou não.");
		
		String nomeStr=JOptionPane.showInputDialog("Digite seu nome: \n");
		String pesoStr=JOptionPane.showInputDialog("Digite seu peso em kg: \n").replace(",", ".");
		double peso = Double.parseDouble(pesoStr);
		String alturaStr=JOptionPane.showInputDialog("Digite sua altura em metros: \n").replace(",", ".");
		double altura = Double.parseDouble(alturaStr);
		
		double imc = peso / (altura * altura);
		
		if(imc>=40.0) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nSua Obesidade é classe III.\nSeu IMC deu: "+imc);
		}else if(imc>=35.0 && imc<40) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nSuao Obesidade é classe II.\nSeu IMC deu: "+imc);
		}else if(imc>=30 && imc<35) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nSua Obesidade é classe I.\nSeu IMC deu: "+imc);
		}else if(imc>=25 && imc<30) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nVocê está com excesso de peso.\nSeu IMC deu: "+imc);
		}else if (imc>=18.5 && imc<25) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nSeu peso está normal.\nSeu IMC deu: "+imc);
		}else if(imc>=0 && imc<18.5) {
			JOptionPane.showMessageDialog(null, nomeStr+",\nVocê está abaixo do peso normal.\nSeu IMC deu: "+imc);
		}else {
			JOptionPane.showMessageDialog(null, nomeStr+",\nSeu IMC deu um valor inválido!");
		}
	}
}
