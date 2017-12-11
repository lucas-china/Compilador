/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas_brito
 */
public class PalavrasReservadas {
    
    public ArrayList<String> keywords = new ArrayList<String>();
    
    PalavrasReservadas(){
        keywords.add("Main");
        keywords.add("Class");
        keywords.add("if");
        keywords.add("for");
        keywords.add("else");
        keywords.add("break");
        keywords.add("Int");
        keywords.add("Float");
        keywords.add("Bool");
        keywords.add("Str");
        keywords.add("final");
        keywords.add("return");
        keywords.add("Void");
        keywords.add("print");
        keywords.add("read");
        keywords.add("!");
        keywords.add("||");
        keywords.add(">");
        keywords.add("<");
        keywords.add(")");
        keywords.add("(");
        keywords.add("==");
        
        
    }
    
    public ArrayList<String> getKeywords(){
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }
    
}
