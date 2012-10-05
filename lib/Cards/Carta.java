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

/**
     * Classe que define um objeto do tipo Carta, bem como metodos getters e setters.
     *
     */
public class Carta {

    private String naipe;
    private int num;

   
    public Carta(String naipe, int num) {
        this.naipe = naipe;
        this.num = num;
    }


	public String getNaipe() {
		return naipe;
	}


	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}
    
    
}
