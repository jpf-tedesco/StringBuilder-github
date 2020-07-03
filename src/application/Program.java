package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comentario;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Have a nice trip - Tenha uma boa viagem");
		Comentario c2 = new Comentario("Wow that's awesome - Ual que incrível!!");
		
		Date momento1 = sdf.parse("21/06/2018 13:05:44");
		String titulo1 = "Traveling to New Zeland - Viajando para a nova Zelandia";
		String conteudo1 = "I'm going to visit this wonderful country - Eu vou visitar este país maravilhoso";
		Integer likes1 = 12;
		Post post1 = new Post(momento1, titulo1, conteudo1, likes1);
		post1.addComentario(c1);
		post1.addComentario(c2);
		
		
		
		System.out.println("Post 1 -------------------------------------------------------------------------");
		System.out.println();
		System.out.println(post1.toString());
		System.out.println();
		
		/*-----------------------------------------------------------------------------------------------------*/
		
		Comentario c3 = new Comentario("Good night - Boa noite");
		Comentario c4 = new Comentario("My the force be with you - Minha força está com você");
		
		Date momento2 = sdf.parse("27/08/2018 23:14:19");
		String titulo2 = "Good night guys - Boa noite caras";
		String conteudo2 = "See you tomorrow - Vejo você amanhã";
		Integer likes2 = 5;
		Post post2 = new Post(momento2, titulo2, conteudo2, likes2);
		post2.addComentario(c3);
		post2.addComentario(c4);
		
		System.out.println("Post 2 -------------------------------------------------------------------------");
		System.out.println();
		System.out.println(post2.toString());
		System.out.println();
	}

}
