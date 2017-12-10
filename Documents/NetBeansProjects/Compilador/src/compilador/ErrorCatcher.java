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
    
    private AcoesSemanticas as;

    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        String erro = new String("Linha " + i + ": Erro sintatico na posição " + i1 + " <" + string+">.");
        as.erros.add(erro);
    }
    
    public ErrorCatcher(AcoesSemanticas as){
        this.as = as;
    }
    
}
