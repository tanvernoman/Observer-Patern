/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovserverexample;

/**
 *
 * @author thnom
 */
public class HexObserver extends Observer{

    public HexObserver(Subject s) {
        subj=s;
        subj.attach(this);
    }
    public void update(){
        System.out.println(" "+ Integer.toHexString(subj.getState()));
    }
}
