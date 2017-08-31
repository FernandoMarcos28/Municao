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
public abstract class CaixaDeMunicao  {
    private int bala;

    public CaixaDeMunicao(int bala) {
        this.bala = bala;
    }

    public int getBala() {
        return bala;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }
}
