/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ConsoleErrorListener;

/**
 *
 * @author LuciaEmilia and Lucas Brito
 */
public class Compilador {

    
    public  String Compilador(String caminho) throws FileNotFoundException, IOException {
      
//        String fileName = "C:\\Users\\LuciaEmilia\\Documents\\NetBeansProjects\\Compilador-master\\Documents\\NetBeansProjects\\Compilador\\src\\compilador\\input";
//        InputStream input = new FileInputStream(caminho);
//        ANTLRInputStream stream = new ANTLRInputStream(input);
         ANTLRInputStream stream = new ANTLRInputStream(caminho);
        
       
        //Lexico
        GramaticaLexer lexer = new GramaticaLexer((CharStream) stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        //acoes semanticas, atraves de listener
        AcoesSemanticas listener = new AcoesSemanticas();
        ParseTreeWalker walker = new ParseTreeWalker();
        
        //Sintatico
        GramaticaParser parser = new GramaticaParser(tokens);
        ConsoleErrorListener listener_ = new ErrorCatcher(listener);
        parser.addErrorListener(listener_);
        ParseTree tree = parser.programa();
        System.out.println(tree.toStringTree(parser));
        if (!listener.erros.isEmpty() ){
            return printErrors(listener.erros);
        }
        
        
        walker.walk(listener,tree); 
        
        System.out.println("\nTabela de Simbolos");
        System.out.println(listener.tabSimb);
                
        System.out.println("\nTabela de Constantes");
        System.out.println(listener.tabCons);
        
        System.out.println("\nTabela de Funções");
        System.out.println(listener.tabFunc);
        
        System.out.println(listener.paramFunc);
        System.out.println("\nVariaveis das Funções");
        System.out.println(listener.varFunc);
        
        if (listener.erros.isEmpty()){
            return "Compilado com sucesso!";   
        }
        else {
            return printErrors(listener.erros);
        }
    }
    
    public String printErrors(List<String> errors){
        StringBuilder erros = new StringBuilder();
            System.out.println("\nERROS: ");
            for(String erro : errors){
                erros.append(erro);
                erros.append("\n");
            }
            System.out.println(erros);
            return erros.substring(0);
    }
    
}
