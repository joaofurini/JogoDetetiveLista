package codigos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class JogoDetetive {
	
	//Função para responder o que o jogador é
	public static void daResposta(String veredito) {
		if(veredito.contentEquals("Inocente")) {
			System.out.println("Voce é inocente");
		}
		else if (veredito.contentEquals("Cumplice")) {
			System.out.println("Voce é cumplice");
		}
		else if (veredito.contains("Assassino")) {
			
			System.out.println("Voce é assassino");
		}
	}
//Programa principal
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList listaPerguntas = new ArrayList();
		ArrayList listaRespostas = new ArrayList();
		int julgamento = 0;
		String veredito = null;
		

		listaPerguntas.add("Mora perto da vitima?");
		listaPerguntas.add("Ja conversou com a vitima?");
		listaPerguntas.add("Interagiu com a vitima?");
		
		Iterator i = listaPerguntas.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			String resposta = ler.nextLine();
			if (resposta.contentEquals("sim")) {
				listaRespostas.add(resposta);
			}
		}
		Iterator it = listaRespostas.iterator();
		while(it.hasNext()) {
			if(it.next().equals("sim")) {
				julgamento += 1;
			}
			
		if (listaRespostas.size() == 3) {
			 veredito = "Assassino";
		}
		else if (listaRespostas.size() == 2) {
			 veredito = "Cumplice";
		}
		else if (listaRespostas.size() == 1) {
			 veredito = "Inocente";
			
		}
		else {
			 veredito = "Inocente";
		}
}
		System.out.println(listaRespostas);
		daResposta(veredito);
}
}
