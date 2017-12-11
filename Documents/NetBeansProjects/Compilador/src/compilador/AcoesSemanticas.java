/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author lucas_brito
 */
public class AcoesSemanticas extends GramaticaBaseListener {
    
    private TabSimb Tabela = new TabSimb();
    public Map<String, Integer> tabSimb = Tabela.getTabSimb();
    private PalavrasReservadas keywords = new PalavrasReservadas();
//    private List<String> keywords = new ArrayList<>();
    public Map<String, String> tabCons = Tabela.getTabConst();
    public Map<String, Integer> tabFunc = Tabela.getTabFunc();
    public List<String> erros = new ArrayList<String>();
    public Map<String, Boolean> VarInstan = new HashMap<String, Boolean>();
    public Map<String, List<Integer>> paramFunc = new HashMap<String, List<Integer>>();
    public Map<String, List<String>> varFunc = new HashMap<String, List<String>>();
    public String funcAtual = "Main";
    
   
    
    @Override
    public void enterDecVars(GramaticaParser.DecVarsContext ctx) {
        
        int flag = 0;
        for (TerminalNode id: ctx.listaIDs().ID()) {
            System.out.println("Entrou no "+id.getText());
                if (!tabSimb.containsKey(id.getText())){
                   
                    for(String palavra : keywords.getKeywords()){
                        if(palavra.equalsIgnoreCase(id.getText())){
                            erros.add("Linha "+ctx.getStart().getLine()+": Palavra reservada" );
                            flag = 1;
                        }
                    }                    
                    if(flag == 0){
                        tabSimb.put(id.getText(),ctx.tipo.t);
                        //VarInstan.put(id.getText(), false);
                        
                    }
                    flag = 0;    
                } 
                else erros.add("Linha "+ctx.getStart().getLine()+": ID duplicado." );
            }
    }
    @Override 
    public void enterDecConsts(GramaticaParser.DecConstsContext ctx) { 
        // pecorrer a lista de palavras reservadas para ver se o ID esta lá.
        // Verificar se o ID está na tabela de simbolos
        // Verificar o tipo
        
        TerminalNode id = ctx.ID();
        if(!tabSimb.containsKey(id.getText())){
            int tip = ctx.tipo().t;
            switch (tip){
                case 1: if(ctx.valor().INT() != null){ 
                            tabSimb.put(id.getText(), tip);
                            tabCons.put(id.getText(), ctx.tipo().getText());} 
                        else { 
                            erros.add("Linha "+ctx.getStart().getLine()+": Constante "+ctx.getText()+" com tipo inválido ");
                        } 
                        break;
                case 2: if(ctx.valor().STRING() != null){ 
                            tabSimb.put(id.getText(), tip); 
                            tabCons.put(id.getText(), ctx.tipo().getText());} 
                        else { erros.add("Linha "+ctx.getStart().getLine()+": Constante "+ctx.getText()+" com tipo inválido ");} 
                        break;
                case 3: if(ctx.valor().TRUE() != null || ctx.valor().FALSE() != null){ 
                            tabSimb.put(id.getText(), tip); 
                            tabCons.put(id.getText(), ctx.tipo().getText());} 
                        else { erros.add("Linha "+ctx.getStart().getLine()+": Constante "+ctx.getText()+" com tipo inválido ");} 
                        break;
                case 4: if(ctx.valor().REAL() != null){ 
                            tabSimb.put(id.getText(), tip); 
                            tabCons.put(id.getText(), ctx.tipo().getText());}
                        else { erros.add("Linha "+ctx.getStart().getLine()+": Constante "+ctx.getText()+" com tipo inválido ");} 
                        break;
            }
            
        }
         else erros.add("Linha "+ctx.getStart().getLine()+": ID duplicado");
    }
    
    
    
    @Override 
    public void enterDecFuncs(GramaticaParser.DecFuncsContext ctx) {
        int tipo = 0;
        List<Integer> listaParam = new ArrayList<Integer>();
        funcAtual = ctx.ID().getText();
        
        TerminalNode id = ctx.ID();
        if(!tabSimb.containsKey(id.getText())){
            if(ctx.tipoRetorno().tipo() == null){
                if( ctx.retorno() == null){
                    // ta certo, void não tem retorno
                    tabSimb.put(id.getText(), 0); // 0 vai ser o tipo Void
                    tabFunc.put(id.getText(), 0);
                }
                else if(ctx.retorno().expre() == null){
                    // ta certo, void não tem retorno
                    tabSimb.put(id.getText(), 0); // 0 vai ser o tipo Void
                    tabFunc.put(id.getText(), 0);
                    
                }
                else {
                    tabSimb.put(id.getText(), 0); 
                    tabFunc.put(id.getText(), 0);
                    erros.add("Linha "+ctx.getStart().getLine()+": Erro de tipo. Retorno invalido");
                }
            }
            else {
                if(ctx.retorno() != null){
                    // ta certo, a função tem um tipo, ela precisa de um retorno
                    if(ctx.retorno().expre().ID() != null){
                       tipo = tabSimb.get(ctx.retorno().expre().ID().getText());
                       if(tipo == ctx.tipoRetorno().tipo().t){
                           tabSimb.put(id.getText(), ctx.tipoRetorno().tipo().t); 
                            tabFunc.put(id.getText(), ctx.tipoRetorno().tipo().t);
                       }
                       else{
                           erros.add("Linha "+ctx.getStart().getLine()+": Erro de tipo. Retorno invalido");
                       }
                    }
                    else if(ctx.retorno().expre().valor() != null){
                        tipo = ctx.tipoRetorno().tipo().t;
                        switch (tipo){
                            case 1: if(ctx.retorno().expre().valor().INT() != null){ 
                                        tabSimb.put(id.getText(), tipo);
                                        tabFunc.put(id.getText(),tipo);
                                    } 
                                    else { 
                                        erros.add("Linha "+ctx.getStart().getLine()+": Erro de tipo. Retorno invalido");
                                    }
                                    break;
                            case 2: if(ctx.retorno().expre().valor().STRING() != null){ 
                                        tabSimb.put(id.getText(), tipo);
                                        tabFunc.put(id.getText(),tipo);
                                    } 
                                    else { 
                                        erros.add("Linha "+ctx.getStart().getLine()+": Erro de tipo. Retorno invalido");
                                    }
                                    break;
                            case 3: if(ctx.retorno().expre().valor().TRUE() != null || ctx.retorno().expre().valor().FALSE() != null){ 
                                        tabSimb.put(id.getText(), tipo);
                                        tabFunc.put(id.getText(),tipo);
                                    } 
                                    else { 
                                        erros.add("Linha "+ctx.getStart().getLine()+": Erro de tipo. Retorno invalido");
                                    }
                                    break;
                            case 4: if(ctx.retorno().expre().valor().REAL() != null){ 
                                        tabSimb.put(id.getText(), tipo);
                                        tabFunc.put(id.getText(),tipo);
                                    } 
                                    else { 
                                        erros.add("Linha "+ctx.getStart().getLine()+": Erro de tipo. Retorno invalido");
                                    }
                                    break;
                            default: erros.add("Linha "+ctx.getStart().getLine()+": Erro de tipo. Retorno invalido");
                        }
                    }
                    else{
                        int tip = testeLogicoOU(ctx.retorno().expre().testeLogic());
                        tipo = ctx.tipoRetorno().tipo().t;
                        if(tipo == tip){
                            tabSimb.put(id.getText(), tipo);
                            tabFunc.put(id.getText(),tipo);
                        }
                        else{
                            erros.add("Linha "+ctx.getStart().getLine()+": Erro de tipo. Retorno invalido");
                        }
                    }                   
                    
                }
                else {
                    erros.add("Linha "+ctx.getStart().getLine()+": Esperando retorno da funcao");
                }                
            }
            
            if(ctx.listaParam() == null){
                paramFunc.put(ctx.ID().getText(), listaParam);
            }
            else{
                for(GramaticaParser.TipoContext tip : ctx.listaParam().tipo()){
                    listaParam.add(tip.t);
                }
                paramFunc.put(ctx.ID().getText(), listaParam);
            }
        }
        else  erros.add("Linha "+ctx.getStart().getLine()+": ID duplicado");
    }
    
    @Override
    public void enterDecVarsFunc(GramaticaParser.DecVarsFuncContext ctx) {
        int flag = 0;
        List<String> vars = new ArrayList<String>();
        for (TerminalNode id: ctx.listaIDs().ID()) {
            System.out.println("Entrou no "+id.getText());
                if (!varFunc.containsKey(id.getText())){
                   
                    for(String palavra : keywords.getKeywords()){
                        if(palavra.equalsIgnoreCase(id.getText())){
                            erros.add("Linha "+ctx.getStart().getLine()+": Palavra reservada" );
                            flag = 1;
                        }
                    }                    
                    if(flag == 0){
                        tabSimb.put(id.getText(),ctx.tipo.t);
                        //VarInstan.put(id.getText(), false);
                         vars.add(id.getText());                      
                    }
                    flag = 0;    
                } 
                else erros.add("Linha "+ctx.getStart().getLine()+": ID duplicado." );
            }
        varFunc.put(funcAtual,vars);
    }
    
    @Override 
    public void enterChamFuncs(GramaticaParser.ChamFuncsContext ctx) { 
        List<Integer> listaParam = new ArrayList<Integer>();
        int i, tipo, tip;
        
        TerminalNode id = ctx.ID();
        if(!tabFunc.containsKey(id.getText())){
            erros.add("Linha " + ctx.getStart().getLine() + ": Funcao "+id.getText()+" nao encontrada");
        }
        else {
            if(ctx.listaExpre() != null){
                listaParam = paramFunc.get(ctx.ID().getText());
                i=0;
                for(GramaticaParser.ExpreContext exp: ctx.listaExpre().expre()){
                    if(exp.ID() != null){
                        if(tabSimb.containsKey(exp.ID().getText())){
                            tipo = tabSimb.get(exp.ID().getText());
                            tip = listaParam.get(i);
                            if(tipo == tip){
                                
                            }
                            else{
                                erros.add("Linha: " + ctx.getStart().getLine() + " variável de um tipo diferente da esperada na chamada da função " + exp.ID().getText() + " no parametro " + (i+1));
                            }
                        }
                        else{
                            erros.add("Linha: " + ctx.getStart().getLine() + " variável não declarada.");
                        }
                    }
                    else if(exp.valor() != null){
                        if(exp.valor().INT() != null){
                            tip = listaParam.get(i);
                            if(tip != 1){ // Arrumar !!                               
                                erros.add("Linha: " + ctx.getStart().getLine() + " variável de um tipo diferente da esperada na chamada da função "+ ctx.ID().getText() + " no parametro " + (i+1));        
                            }
                        }
                        else if(exp.valor().STRING() != null){
                            tip = listaParam.get(i);
                            if(tip != 2){
                               erros.add("Linha: " + ctx.getStart().getLine() + " variável de um tipo diferente da esperada na chamada da função " + ctx.ID().getText() + " no parametro " + (i+1)); 
                            }                        
                        }
                        else if(exp.valor().TRUE() != null || exp.valor().FALSE() != null){
                            tip = listaParam.get(i);
                            if(tip != 3){
                               erros.add("Linha: " + ctx.getStart().getLine() + " variável de um tipo diferente da esperada na chamada da função " + ctx.ID().getText() + " no parametro " + (i+1)); 
                            }                        
                        }
                        else if(exp.valor().REAL() != null){
                            tip = listaParam.get(i);
                            if(tip != 4){
                               erros.add("Linha: " + ctx.getStart().getLine() + " variável de um tipo diferente da esperada na chamada da função " + ctx.ID().getText() + " no parametro " + (i+1)); 
                            }                        
                        }
                    }
                    else if(exp.testeLogic() != null){
                        System.out.println("256:  " + exp.testeLogic().getText());
                        tip = testeLogicoOU(exp.testeLogic());
                        tipo = listaParam.get(i);
                        if(tip != tipo){
                            erros.add("Linha: " + ctx.getStart().getLine() + " variável de um tipo diferente da esperada na chamada da função " + ctx.ID().getText() + " no parametro " + (i+1)); 
                        }
                    }
                    i++;
                }
            }
            else{
                //System.out.println("Sem parametros");
                
            }
        }
    }
    
    @Override 
    public void enterAtribuicao(GramaticaParser.AtribuicaoContext ctx) { 
        // verificar se o id esta na tabela de simbolo;
        // verificar se não é constante;
        // verificar o escopo; DIFICIL;
        // verifico o tipo, sintetizado da expressão;
        // gerar o código;
        
        int x;
        TerminalNode id = ctx.ID();
        if(tabSimb.containsKey(id.getText())){
            if(!tabCons.containsKey(id.getText())){
                if(ctx.getChild(2) != null){
                    int tip = tabSimb.get(id.getText());
                    x = testeLogicoOU(ctx.testeLogic());
                    if(tip == 4 && (x == 1 || x == 4)){
                        System.out.println("Tipo da expressão compativel");
                        //VarInstan.put(id.getText(),true);
                    }
                    else if(tip == x){ 
                        System.out.println("Tipo da expressão compativel");
                        //VarInstan.put(id.getText(),true);
                    }
                    else{
                        System.out.println(ctx.testeLogic().getText());
                        erros.add("Linha "+ctx.getStart().getLine()+" :Tipo Incompativel" + ". Variavel do tipo: " + tip + "// Tipo Exp: " + x);
                    }                    
                }
                else{
                    // ID ++ ou ID --
                    System.out.println("Incremento ou Decremento!! ");
                }
            }
            else{
                erros.add("Linha "+ctx.getStart().getLine()+": Alteracao de constante "+ctx.getText()+" invalida ");
            }
        }
        else erros.add("Linha "+ctx.getStart().getLine()+"Variavel "+ctx.getText()+" não declarada");
    }
       
    public int testeLogicoOU(GramaticaParser.TesteLogicContext ctx){
        
        int tipo=10,tp1,tp2;
        boolean instan;
        
        if(ctx.testeLogic()!=null){            
                        
            ParseTree child = ctx.getChild(0);
            GramaticaParser.TesteLogicContext ch = (GramaticaParser.TesteLogicContext)child;           
            
            if(ch.getText().contains("||") || ch.getText().contains("&&") || ch.getText().contains(">=") || ch.getText().contains(">") || ch.getText().contains("<") || ch.getText().contains("<=") || ch.getText().contains("==") || ch.getText().contains("!=") || ch.getText().contains("*") || ch.getText().contains("/") || ch.getText().contains("+") || ch.getText().contains("-")){
                System.out.println("f1: " + ch.getText());
                tp1 = testeLogicoOU(ctx.testeLogic());
            }
            else            
                tp1 = ch.t;                    
                       
            child = ctx.getChild(2);
            GramaticaParser.Teste1Context ch2 = (GramaticaParser.Teste1Context)child;
            if(ch2.getText().contains("||") || ch2.getText().contains("&&") || ch2.getText().contains(">=") || ch2.getText().contains(">") || ch2.getText().contains("<") || ch2.getText().contains("<=") || ch2.getText().contains("==") || ch2.getText().contains("!=") || ch2.getText().contains("*") || ch2.getText().contains("/") || ch2.getText().contains("+") || ch2.getText().contains("-")){
                System.out.println("f2: " +ch2.getText());
                tp2 = testeLogicoE(ctx.teste1());
            } 
            else
                tp2 = ch2.t;
            
            if(tp1 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch.getText())){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não declarada");
                    tipo = 12;
                }
                else{
                    /*instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não inicializada");
                    }*/
                    tp1 = tabSimb.get(ch.getText());
                    if(tp1 != 3){
                        erros.add("Linha "+ctx.getStart().getLine()+": Esperando um booleano");
                        tipo = 12;
                    }
                    else{
                        tipo = 3;
                    }
                }
            }            
            if(tp2 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch2.getText())){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não declarada");
                    tipo = 12;
                }
                else{
                    /*instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não declarada");
                    }*/
                    tp2 = tabSimb.get(ch2.getText());
                    if(tp2 != 3){
                        erros.add("Linha "+ctx.getStart().getLine()+": Esperando um booleano");
                        tipo = 12;
                    }
                    else{
                        tipo = 3;
                    }
                }
            }
            if(tp1 == 3 && tp2 == 3){ // Testa se é um valor TRUE ou FALSE
                tipo = 3;
            }
            else if(tp1 == 1 || tp1 == 2 || tp1 == 4|| tp2 == 1 || tp2 == 2 || tp2 == 4){               
                erros.add("Linha "+ctx.getStart().getLine()+": Esperando um booleano");
                tipo = 12;              
            }            
        }
        else{
            tipo = testeLogicoE(ctx.teste1());
        }
        
        return tipo;
    }
    
    public int testeLogicoE(GramaticaParser.Teste1Context ctx){
        int tipo = 11,tp1,tp2;
        boolean instan;
        
        if(ctx.teste1() != null){
            ParseTree child = ctx.getChild(0);
            GramaticaParser.Teste1Context ch = (GramaticaParser.Teste1Context)child;           
            
            if(ch.getText().contains("&&") || ch.getText().contains(">=") || ch.getText().contains(">") || ch.getText().contains("<") || ch.getText().contains("<=") || ch.getText().contains("==") || ch.getText().contains("!=") || ch.getText().contains("*") || ch.getText().contains("/") || ch.getText().contains("+") || ch.getText().contains("-") ){
                System.out.println("f1.1: " + ch.getText());
                tp1 = testeLogicoE(ctx.teste1());
            }
            else            
                tp1 = ch.t;                    
                       
            child = ctx.getChild(2);
            GramaticaParser.Teste2Context ch2 = (GramaticaParser.Teste2Context)child;
            if(ch2.getText().contains(">=") || ch2.getText().contains(">") || ch2.getText().contains("<") || ch2.getText().contains("<=") || ch2.getText().contains("==") || ch2.getText().contains("!=") || ch2.getText().contains("*") || ch2.getText().contains("/") || ch2.getText().contains("+") || ch2.getText().contains("-")){
                System.out.println("f2.2: " +ch2.getText());
                tp2 = teste2(ctx.teste2());
            } 
            else
                tp2 = ch2.t;
            
            if(tp1 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch.getText())){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não declarada");
                    tipo = 12;
                }
                else{
                    /*instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não inicializada");
                    }*/
                    tp1 = tabSimb.get(ch.getText());
                    if(tp1 != 3){
                        erros.add("Linha "+ctx.getStart().getLine()+": Esperando um booleano");
                        tipo = 12;
                    }
                    else{
                        tipo = 3;
                    }
                }
            }            
            if(tp2 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch2.getText())){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não declarada");
                    tipo = 12;
                }
                else{
                    /*instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não declarada");
                    }*/
                    tp2 = tabSimb.get(ch2.getText());
                    if(tp2 != 3){
                        erros.add("Linha "+ctx.getStart().getLine()+": Esperando um booleano");
                        tipo = 12;
                    }
                    else{
                        tipo = 3;
                    }
                }
            }
            if(tp1 !=3 || tp2 != 3){ // Testa se é um valor TRUE ou FALSE
                erros.add("Linha "+ctx.getStart().getLine()+": Esperando um booleano");
                tipo = 12;
            }
            else{
                tipo = 3;
            } 
        }
        else{
            tipo = teste2(ctx.teste2());
        }
        
        return tipo;
    }
    
    public int teste2(GramaticaParser.Teste2Context ctx){
        int tipo = 3,tp1,tp2;
        boolean instan;
        
        if(ctx.opSec() == null){
            tipo = teste3(ctx.teste3());
            return tipo;
        }
       
        ParseTree child = ctx.getChild(0);
        GramaticaParser.Teste2Context ch = (GramaticaParser.Teste2Context)child;      

        if(ch.getText().contains(">=") || ch.getText().contains(">") || ch.getText().contains("<") || ch.getText().contains("<=") || ch.getText().contains("==") || ch.getText().contains("!=") || ch.getText().contains("*") || ch.getText().contains("/") || ch.getText().contains("+") || ch.getText().contains("-") ){
            System.out.println("f1.1: " + ch.getText());
            tp1 = teste2(ctx.teste2());
        }
        else            
            tp1 = ch.t;                    
                       
        child = ctx.getChild(2);
        GramaticaParser.Teste3Context ch2 = (GramaticaParser.Teste3Context)child;
        if(ch2.getText().contains("==") || ch2.getText().contains("!=") || ch2.getText().contains("*") || ch2.getText().contains("/") || ch2.getText().contains("+") || ch2.getText().contains("-")){
            System.out.println("f2.2: " +ch2.getText());
            tp2 = teste3(ctx.teste3());
        } 
        else
            tp2 = ch2.t;        
        
        if(tp1 == 5){
            if(!tabSimb.containsKey(ch.getText())){
                erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não declarada");
                tipo = 12;
            }
            /*instan = VarInstan.get(ch.getText());
                if (instan == false){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não inicializada");
                }*/
        }
        
        
        if(tp2 == 5){
            if(!tabSimb.containsKey(ch2.getText())){
                erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não declarada");
                tipo = 12;
            }
            /*instan = VarInstan.get(ch2.getText());
            if (instan == false){
                erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não inicializada");
            }*/
        }
        
        
        return tipo;
    }
    
    public int teste3(GramaticaParser.Teste3Context ctx){
        int tipo=3,tp1,tp2;
        boolean instan;
        
        if(ctx.opPrim() == null){
            tipo = funcMath(ctx.funcMath());
            return tipo;
        }
        
        ParseTree child = ctx.getChild(0);
        GramaticaParser.Teste3Context ch = (GramaticaParser.Teste3Context)child;
        tp1 = ch.t;
        
        if(ch.getText().contains("==") || ch.getText().contains("!=") || ch.getText().contains("*") || ch.getText().contains("/") || ch.getText().contains("+") || ch.getText().contains("-") ){
            System.out.println("f1.1: " + ch.getText());
            tp1 = teste3(ctx.teste3());
        }
        else            
            tp1 = ch.t;                    
                       
        child = ctx.getChild(2);
        GramaticaParser.FuncMathContext ch2 = (GramaticaParser.FuncMathContext)child;
        if(ch2.getText().contains("*") || ch2.getText().contains("/") || ch2.getText().contains("+") || ch2.getText().contains("-")){
            System.out.println("f2.2: " +ch2.getText());
            tp2 = funcMath(ctx.funcMath());
        } 
        else
            tp2 = ch2.t;
        
        if(tp2 == 5){
            if(!tabSimb.containsKey(ch2.getText())){
                erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não declarada");
                tipo = 13;
            }
            /*instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não inicializada");
                    }*/
        }
        
        
        return tipo;        
    }
    
    public int funcMath(GramaticaParser.FuncMathContext ctx){
        int tipo=14,tp1,tp2;
        boolean instan;
        
        
        
        if(ctx.getText().contains("+") || ctx.getText().contains("-")){
            ParseTree child = ctx.getChild(0);
            
            GramaticaParser.FuncMathContext ch = (GramaticaParser.FuncMathContext)child;
            
            if(ch.getText().contains("*") || ch.getText().contains("/") || ch.getText().contains("+") || ch.getText().contains("-") ){
                System.out.println("f1.1: " + ch.getText());
                tp1 = funcMath(ctx.funcMath());
            }
            else            
                tp1 = ch.t;                    

            child = ctx.getChild(2);
            GramaticaParser.TermContext ch2 = (GramaticaParser.TermContext)child;
            if(ch2.getText().contains("+") || ch2.getText().contains("-")){
                System.out.println("f2.2: " +ch2.getText());
                tp2 = term(ctx.term());
            } 
            else
            tp2 = ch2.t;
            
            if(tp1 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch.getText())){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não declarada");
                    tipo = 14;
                }
                else{
                   /* instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não inicializada");
                    }*/
                    tp1 = tabSimb.get(ch.getText());
                    if(tp1 == 3 || tp1 == 2){
                        erros.add("Linha "+ctx.getStart().getLine()+": Esperando valor numerico");
                        tipo = 14;
                    }
                    else if(tp1 == 4){
                        tipo = 4;
                    }
                    else{
                        tipo = 1;
                    }
                }
            }            
            if(tp2 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch2.getText())){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não declarada");
                    tipo = 14;
                }
                else{
                    /*instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não inicializada");
                    }*/
                    tp2 = tabSimb.get(ch2.getText());
                    if(tp2 == 3 || tp2 == 2){
                        erros.add("Linha "+ctx.getStart().getLine()+": Esperando um valor numerico");
                        tipo = 14;
                    }
                    else if(tp1 == 4){
                        tipo = 4;
                    }
                    else{
                        tipo = 1;
                    }
                }
            }
            if((tp1==1) && tp2 ==1 ){ // Testa se é um valor INT ou FLOAT
                tipo = 1;
            }
            else if(tp1==4 && tp2 == 4){
                tipo = 4;
            }
            else if((tp1==1 && tp2==4) || (tp1==2 && tp2==1)){
                tipo = 4;
            }
            else{
                erros.add("Linha "+ctx.getStart().getLine()+": Esperando um valor numerico");
                tipo = 14;
            } 
        }
        else{
            tipo = term(ctx.term());
        }
        
        return tipo;
    }
    
    public int term(GramaticaParser.TermContext ctx){
        int tipo = 15,tp1,tp2;
        boolean instan;
        
        if(ctx.getText().contains("*") || ctx.getText().contains("/")){
            ParseTree child = ctx.getChild(0);
            GramaticaParser.TermContext ch = (GramaticaParser.TermContext)child;
            tp1 = ch.t;

            if(ch.getText().contains("+") || ch.getText().contains("-") ){
                System.out.println("f1.1: " + ch.getText());
                tp1 = term(ctx.term());
            }
            else            
                tp1 = ch.t;                    

            child = ctx.getChild(2);
            GramaticaParser.FatorContext ch2 = (GramaticaParser.FatorContext)child;          
            tp2 = ch2.t;
            
            if(tp1 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch.getText())){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não declarada");
                    tipo = 15;
                }
                else{
                    /*instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch.getText()+" não inicializada");
                    }*/
                    tp1 = tabSimb.get(ch.getText());
                    if(tp1 == 3 || tp1 == 2){
                        erros.add("Linha "+ctx.getStart().getLine()+": Esperando valor numerico");
                        tipo = 15;
                    }
                    else{
                        tipo = 1;
                    }
                }
            }            
            if(tp2 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch2.getText())){
                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não declarada");
                    tipo = 15;
                }
                else{
                    //System.out.println(ch.getText());
                    /*instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ch2.getText()+" não inicializada");
                    }*/
                    tp2 = tabSimb.get(ch2.getText());
                    if(tp2 == 3 || tp2 == 2){
                        erros.add("Linha "+ctx.getStart().getLine()+": Esperando valor numerico");
                        tipo = 15;
                    }
                    else{
                        tipo = 1;
                    }
                }
            }
            if((tp1==1) || (tp1==4)){ // Testa se é um valor INT ou FLOAT
                if((tp2==1) || (tp2==4)){
                    tipo = 1;
                }
            }
            else{
                erros.add("Linha "+ctx.getStart().getLine()+": Esperando valor numerico");
                tipo = 15;
            } 
        }
        else{
            tipo = fator(ctx.fator());
        }        
        
        return tipo;
    }
    
    public int fator(GramaticaParser.FatorContext ctx){
        int tipo=16;
        boolean instan;
        
        if(ctx.testeLogic() != null){
            tipo = testeLogicoOU(ctx.testeLogic());
        }
        else{
            if(ctx.INT() != null){
                tipo = 1;
            }
            else{
                if(ctx.REAL() != null){
                    tipo = 4;
                }
                else{
                    if(ctx.Tk_True() != null || ctx.Tk_False() != null){
                        tipo = 3;
                    }
                    else{
                        if(ctx.ID() != null){
                            try{
                                tipo = tabSimb.get(ctx.ID().getText());
                                /*instan = VarInstan.get(ctx.ID().getText());
                                if (instan == false){
                                    erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ctx.ID().getText()+" não inicializada");
                                }*/
                            }catch(Exception e){
                                erros.add("Linha "+ctx.getStart().getLine()+": Variável "+ctx.ID().getText()+" não declarada");
                            }
                        }
                        else{
                            if(ctx.STRING() != null){
                                tipo = 2;
                            }
                            else{
                                if(ctx.chamFuncs() != null){
                                //System.out.println(ctx.chamFuncs().ID().getText());
                                // Tenta chamar a função se ela existir;
                                try{
                                    tipo = tabFunc.get(ctx.chamFuncs().ID().getText());
                                }catch (Exception e){}                                
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return tipo;
    }
    
    @Override 
    public void enterControle(GramaticaParser.ControleContext ctx) {
        int tipo;
        if(ctx.getText().contains("if")){
           
            if(testeLogicoOU(ctx.testeLogic()) != 3){
                erros.add("Linha "+ctx.getStart().getLine()+": Erro na construcao do IF. Esperando valor booleano");
            }
        }
        else {
            for(TerminalNode id : ctx.varControl().ID()){ // Testa se a variávela de controle é inteira
                tipo = tabSimb.get(id.getText());
                if(tipo != 1){
                    erros.add("Linha "+ctx.getStart().getLine()+": Erro na construcao do FOR. Esperando valor inteiro");
                }
                //VarInstan.put(id.getText(),true);
            }
            if(testeLogicoOU(ctx.testeLogic()) != 3){
                erros.add("Linha "+ctx.getStart().getLine()+": Erro na construcao do FOR. Esperando valor booleano");
            }
            
        }
    }
    
    @Override 
    public void enterPrint(GramaticaParser.PrintContext ctx) { 
    
        if(ctx.listaExpre() != null){
            Iterator it = ctx.listaExpre().expre().iterator();
            GramaticaParser.ExpreContext exp;
            while(it.hasNext()){
                exp = (GramaticaParser.ExpreContext) it.next();
                if(exp.ID() != null){
                    if(!tabSimb.containsKey(exp.ID().getText())){
                        erros.add("Linha "+ctx.getStart().getLine()+": Variavel "+exp.ID().getText()+" nao declarada");
                    }
                }
                else if(exp.testeLogic() != null){
                    int tipo = testeLogicoOU(exp.testeLogic());
                    if(tipo != 1 && tipo!=2 && tipo!=3 && tipo != 4){
                        erros.add("Linha "+ctx.getStart().getLine()+": Expressao invalida");
                    }
                }
                
            }
        }
    }
    
    @Override 
    public void enterRead(GramaticaParser.ReadContext ctx) { 
        for(TerminalNode id: ctx.listaIDs2().ID()){
            if(!tabSimb.containsKey(id.getText())){
               erros.add("Linha "+ctx.getStart().getLine()+": Variavel  "+id.getText()+" nao declarada");
            }
            else{
                //VarInstan.put(id.getText(),true);
            }
        }
    }
}
