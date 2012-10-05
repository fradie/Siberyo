/**
 * @author Anderson fortes e Francis Diego Almeida
 */
/**
 *  
 *  Copyright (c) 2012 Anderson Fortes e Francis Almeida
 *  
 *  Este arquivo e parte do programa Baralho
 *
 *  Baralho e um software livre; voce pode redistribui-lo e/ou modifica-lo dentro dos termos da Licenca Publica Geral Menor GNU como 
 *  publicada pela Fundacao do Software Livre (FSF); na versao 2 da licenca, ou (na sua opniao) qualquer versao.
 *  
 *  Este programa e distribuido na esperanca que possa ser  util, mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUACAO a qualquer
 *  MERCADO ou APLICACAO EM PARTICULAR. Veja a Licenca Publica Geral Menor GNU para maiores detalhes.
 *  
 *  Voce deve ter recebido uma copia da Licenca Publica Geral Menor GNU junto com este programa, se nao, escreva para a Fundacao do Software
 *  Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 * 
 */

package Cards;

import java.util.ArrayList;
import java.util.Collections;
import Cards.Carta;

/**
 * Classe que implementa as funcoes para o jogo de cartas
 */
public class Baralho {

    private ArrayList<Carta> pilha = new ArrayList<Carta>();
    private ArrayList<Carta> descartados = new ArrayList<Carta>();
    
    /**
     * Construtor do baralho.
     */
    public Baralho() {
        
        ArrayList<String> naipes = new ArrayList<String>();
        
        naipes.add("Espada");
        naipes.add("Basto");
        naipes.add("Copas");
        naipes.add("Ouro");
       
        Carta carta;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                carta = new Carta(naipes.get(i), j+1);
                pilha.add(carta);
            }
        }
    }

    /**
     * Metodo que embaralha as cartas
     *
     */
    public void embaralhar() {
        Collections.shuffle(pilha);
        
    }

    /**
     * Metodo que corta em duas partes e passa a parte de cima para baixo
     *
     */
    public void cortar(int posicao) {
    	
    	if(posicao<0){
            System.err.println("Numero de corte deve ser maior que zero");
        }

        if(pilha.size()<posicao){
            System.err.println("Numero de corte deve ser menor que o numero de cartas");
        }
    	
        else{
            ArrayList<Carta> temp = new ArrayList<Carta>();
        
            for(int i=posicao;i<pilha.size();i++)
                temp.add(pilha.get(i));

            for(int i=0;i<posicao;i++)
                temp.add(pilha.get(i));
        
            Collections.copy(pilha, temp);
        }
    }

    /**
     * Metodo que retorna a primeira carta do monte de cartas
     *
     */
    public Carta getPrimeiraCarta() {
        return pilha.remove(0);
    }

    /**
     * Metodo que retorna a ultima carta do monte de cartas
     *
     */
    public Carta getUltimaCarta() {
    	return pilha.remove(pilha.size()-1);
    }
    /**
     * Metodo que move a carta do topo para o fim
     *
     */
    public void moverPrimeiraParaOFim() {
    	pilha.add(pilha.remove(0));
    }

    /**
     * Metodo que descarta uma carta de determinado valor e naipe
     *
     */
    public void Descartar(String naipe, int num) {
    	for (int i = 0; i < pilha.size(); i++) {
    		if (pilha.get(i).getNaipe()==naipe && pilha.get(i).getNum()==num) {
    			descartados.add(pilha.get(i));
    			pilha.remove(i);
    		}
    	}
        
    }
    /**
     * Metodo que mostra o monte de cartas descartadas
     *
     */
    public void visualizarDescartadas() {
    	for(int i=0;i<descartados.size();i++)
    		System.out.println("numero: " + descartados.get(i).getNum() + ", naipe: " + descartados.get(i).getNaipe());
    }
    /**
     * Metodo que permite visualizar o monte principal das cartas
     *
     */
    public void exibirPilha() {
        for (int i = 0; i < pilha.size(); i++) {
            System.out.println("numero: " + pilha.get(i).getNum() + ", naipe: " + pilha.get(i).getNaipe());
        }
    }
    /**
     * Metodo que permite ver as cartas do monte de descarte
     *
     */
    public Carta verCartaDescartada(int posicao) {
        return descartados.get(posicao);
    }
}
