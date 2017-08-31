/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package municao;

/**
 *
 * @author Fernando
 */
public class K47 extends CaixaDeMunicao implements AcaoArma {

    public K47(int bala) {
        super(bala);
    }

    @Override
    public void carregarArma(int projetil) {
        projetil = getBala() + projetil;
        setBala(projetil);
    }

    @Override
    public void disparaArma(int projetil) {
        projetil = getBala() - projetil;
        setBala(projetil);
    }
    
}
