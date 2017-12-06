/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucas_brito
 */
public class TabSimb {
    private Map<String, Integer> tabSimb = new HashMap<String, Integer>();    
    private Map<String, String> tabConst = new HashMap<String, String>();
    private Map<String, Integer> tabFunc = new HashMap<String, Integer>(); 
    
    public Map<String, Integer> getTabSimb() {
        return tabSimb;
    }
    public void setTabSimb(Map<String, Integer> tabSimb) {
        this.tabSimb = tabSimb;
    }
    
    public Map<String, String> getTabConst() {
        return tabConst;
    }
    public void setTabConst(Map<String, String> tabConst) {
        this.tabConst = tabConst;
    }
    
     public Map<String, Integer> getTabFunc() {
        return tabFunc;
    }
    public void setTabFunc(Map<String, Integer> tabFunc) {
        this.tabFunc = tabFunc;
    }
}
