/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm.pkg12.gitaritmatika;

/**
 *
 * @author M.R.FIRDAUS
 */
public class BilanganInterfaceImpl implements BilanganInterface {

    @Override
    public double add(Bilangan bilangan) {
        return bilangan.getBilangan1() + bilangan.getBilangan2();
    }

    @Override
    public double sub(Bilangan bilangan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double mult(Bilangan bilangan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double div(Bilangan bilangan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
