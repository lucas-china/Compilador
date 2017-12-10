/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;


import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


/**
 *
 * @author LuciaEmilia
 */
public class ErrorCatcher extends ConsoleErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        throw new UnsupportedOperationException("\nErro na linha " + i + ", no caractere da posição " + i1 + "."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
