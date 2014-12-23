/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;
import java.util.Collections;
import java.util.ArrayList;

public class Pratica62 {
    public static void main(String[] args) {
        
        Time time = new Time();  
        
        time.addJogador("Zagueiro",new Jogador(4, "David Luiz"));
        time.addJogador("Atacante",new Jogador(10, "Neymar"));
        time.addJogador("Goleiro",new Jogador(12, "Júlio César"));
        time.addJogador("Zagueiro",new Jogador(2, "Beutrano"));
        time.addJogador("Atacante",new Jogador(6, "Ciclano"));
        time.addJogador("Goleiro",new Jogador(19, "Blastoise"));
        
     /*   int pos = Collections.binarySearch(time, new Jogador(2, "Beutrano"),time.ordena(null) );
        if (pos >= 0) {
            System.out.println("Jogador encontrado:");
            System.out.println(String.format(format, time.get(pos).getNumero(), time.get(pos).getNome()));
        } else {
            System.out.println("Jogador não encontrado. Posição: " + (-pos-1));
        }*/
    }
}
