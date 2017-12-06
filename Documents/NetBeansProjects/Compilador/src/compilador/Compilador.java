/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author LuciaEmilia and Lucas Brito
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        String fileName = "/home/lucas_brito/Documents/Compiladores/Compiladores/Documents/NetBeansProjects/Compilador/src/compilador/input";
        InputStream input = new FileInputStream(fileName);
        ANTLRInputStream stream = new ANTLRInputStream(input);
        
        //Lexico
        GramaticaLexer lexer = new GramaticaLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        //Sintatico
        GramaticaParser parser = new GramaticaParser(tokens);
        ParseTree tree = parser.programa();
        System.out.println(tree.toStringTree(parser));
        
        //acoes semanticas, atraves de listener
        AcoesSemanticas listener = new AcoesSemanticas();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree); 
        
        System.out.println("\nTabela de Simbolos");
        System.out.println(listener.tabSimb);
                
        System.out.println("\nTabela de Constantes");
        System.out.println(listener.tabCons);
        
        System.out.println("\nERROS: ");
        for(String erro : listener.erros){
            System.out.println(erro);
        }
        
        
    }
    
}
