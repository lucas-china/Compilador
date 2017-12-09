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
    private List<String> keywords = new PalavrasReservadas().getKeywords();
    public Map<String, String> tabCons = Tabela.getTabConst();
    public Map<String, Integer> tabFunc = Tabela.getTabFunc();
    public List<String> erros = new ArrayList<String>();
    public Map<String, Boolean> VarInstan = new HashMap<String, Boolean>();
    
    
    
    @Override
    public void enterDecVars(GramaticaParser.DecVarsContext ctx) {
        
        int flag = 0;
        for (TerminalNode id: ctx.listaIDs().ID()) {
                if (!tabSimb.containsKey(id.getText())){
                    for(String palavra : keywords){
                        if(palavra == id.getText()){
                            erros.add("Não pode usar palavra reservada como ID  na linha " + ctx.getStart().getLine());
                            flag = 1;
                        }
                    }                    
                    if(flag == 0){
                        tabSimb.put(id.getText(),ctx.tipo.t);
                        VarInstan.put(id.getText(), false);
                        
                    }
                    flag = 0;    
                } 
                else erros.add("ID duplicado (Variavel) na linha " + ctx.getStart().getLine());
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
                            erros.add("Tipo da constante invalido com a atribuição na linha " + ctx.getStart().getLine());
                        } 
                        break;
                case 2: if(ctx.valor().STRING() != null){ 
                            tabSimb.put(id.getText(), tip); 
                            tabCons.put(id.getText(), ctx.tipo().getText());} 
                        else { erros.add("Tipo da constante invalido com a atribuição na linha " + ctx.getStart().getLine());} 
                        break;
                case 3: if(ctx.valor().TRUE() != null || ctx.valor().FALSE() != null){ 
                            tabSimb.put(id.getText(), tip); 
                            tabCons.put(id.getText(), ctx.tipo().getText());} 
                        else { erros.add("Tipo da constante invalido com a atribuição na linha " + ctx.getStart().getLine());} 
                        break;
                case 4: if(ctx.valor().REAL() != null){ 
                            tabSimb.put(id.getText(), tip); 
                            tabCons.put(id.getText(), ctx.tipo().getText());}
                        else { erros.add("Tipo da constante invalido com a atribuição na linha " + ctx.getStart().getLine());} 
                        break;
            }
            
        }
         else erros.add("Na linha " + ctx.getStart().getLine() + " ID duplicado");
    }
    
    
    
    @Override 
    public void enterDecFuncs(GramaticaParser.DecFuncsContext ctx) {
        int tipo;
        
        TerminalNode id = ctx.ID();
        if(!tabSimb.containsKey(id.getText())){
            if(ctx.tipoRetorno().tipo() == null){ 
                if(ctx.retorno() == null){
                    // ta certo, void não tem retorno
                    tabSimb.put(id.getText(), 0); // 0 vai ser o tipo Void
                    tabFunc.put(id.getText(), 0);
                    
                }
                else {
                    erros.add("Na liha " + ctx.getStart().getLine() + " o tipo void não aceita returno");
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
                           erros.add("Na linha " + ctx.getStart().getLine() + " o retorno da função não é igual ao tipo da função");
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
                                        erros.add("O tipo de retorno não é igual ao tipo da função na linha " + ctx.getStart().getLine());
                                    }
                                    break;
                            case 2: if(ctx.retorno().expre().valor().STRING() != null){ 
                                        tabSimb.put(id.getText(), tipo);
                                        tabFunc.put(id.getText(),tipo);
                                    } 
                                    else { 
                                        erros.add("O tipo de retorno não é igual ao tipo da função na linha " + ctx.getStart().getLine());
                                    }
                                    break;
                            case 3: if(ctx.retorno().expre().valor().TRUE() != null || ctx.retorno().expre().valor().FALSE() != null){ 
                                        tabSimb.put(id.getText(), tipo);
                                        tabFunc.put(id.getText(),tipo);
                                    } 
                                    else { 
                                        erros.add("O tipo de retorno não é igual ao tipo da função na linha " + ctx.getStart().getLine());
                                    }
                                    break;
                            case 4: if(ctx.retorno().expre().valor().REAL() != null){ 
                                        tabSimb.put(id.getText(), tipo);
                                        tabFunc.put(id.getText(),tipo);
                                    } 
                                    else { 
                                        erros.add("O tipo de retorno não é igual ao tipo da função na linha " + ctx.getStart().getLine());
                                    }
                                    break;
                            default: erros.add("O tipo de retorno não é igual ao tipo da função na linha " + ctx.getStart().getLine());
                        }
                    }
                    else{
                        int tip = funcMath(ctx.retorno().expre().funcMath());
                        tipo = ctx.tipoRetorno().tipo().t;
                        if(tipo == tip){
                            tabSimb.put(id.getText(), tipo);
                            tabFunc.put(id.getText(),tipo);
                        }
                        else{
                            erros.add("O tipo de retorno não é igual ao tipo da função na linha " + ctx.getStart().getLine());
                        }
                    }                   
                    
                }
                else {
                    erros.add("Na linha " + ctx.getStart().getLine() + " a função precisa retornar alguma coisa");
                }                
            }
        }
        else erros.add("Na linha " + ctx.getStart().getLine() + " ID já usado!");
        
    }
    
    @Override 
    public void enterChamFuncs(GramaticaParser.ChamFuncsContext ctx) { 
        
        TerminalNode id = ctx.ID();
        if(!tabFunc.containsKey(id.getText())){
            erros.add("Na linha " + ctx.getStart().getLine() + " foi realizada uma chamada para a função " + id.getText()+" que não existe");
        }
        else {
            if(ctx.listaExpre() != null){
                //System.out.println("Existe parametros");
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
                    if(tip == x){ 
                        System.out.println("Tipo da expressão compativel");
                        VarInstan.put(id.getText(),true);
                    }
                    else{
                        System.out.println(ctx.testeLogic().getText());
                        erros.add("Tipo Incompativel na linha " + ctx.getStart().getLine() + ". Variavel do tipo: " + tip + "// Tipo Exp: " + x);
                    }                    
                }
                else{
                    // ID ++ ou ID --
                    System.out.println("Incremento ou Decremento!! ");
                }
            }
            else{
                erros.add("Impossivel mudar o valor de uma constante na linha " + ctx.getStart().getLine());
            }
        }
        else erros.add("Variavel não declarado na linha " + ctx.getStart().getLine());
    }
       
    public int testeLogicoOU(GramaticaParser.TesteLogicContext ctx){
        int tipo=10,tp1,tp2;
        boolean instan;
        if(ctx.getText().contains("||")){
            
            ParseTree child = ctx.getChild(0);
            GramaticaParser.TesteLogicContext ch = (GramaticaParser.TesteLogicContext)child;
            tp1 = ch.t;
            
            child = ctx.getChild(2);
            GramaticaParser.Teste1Context ch2 = (GramaticaParser.Teste1Context)child;
            tp2 = ch2.t;
            
            if(tp1 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch.getText())){
                    erros.add("Na linha " + ctx.getStart().getLine() + " foi usando uma variável não declarada");
                    tipo = 12;
                }
                else{
                    instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usado uma variavel não instanciada.");
                    }
                    tp1 = tabSimb.get(ch.getText());
                    if(tp1 != 3){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não booleano");
                        tipo = 12;
                    }
                    else{
                        tipo = 3;
                    }
                }
            }            
            if(tp2 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch2.getText())){
                    erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch2.getText()+ "  que não foi declarada.");
                    tipo = 12;
                }
                else{
                    instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch.getText()+ "  que não foi instanciada.");
                    }
                    tp2 = tabSimb.get(ch2.getText());
                    if(tp2 != 3){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não booleano");
                        tipo = 12;
                    }
                    else{
                        tipo = 3;
                    }
                }
            }
            if(tp1 !=3 || tp2 != 3){ // Testa se é um valor TRUE ou FALSE
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não booleano");
                tipo = 12;
            }
            else{
                tipo = 3;
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
        
        if(ctx.getText().contains("&&")){
            ParseTree child = ctx.getChild(0);
            GramaticaParser.Teste1Context ch = (GramaticaParser.Teste1Context)child;
            tp1 = ch.t;
            
            child = ctx.getChild(2);
            GramaticaParser.Teste2Context ch2 = (GramaticaParser.Teste2Context)child;
            tp2 = ch2.t;
            
            if(tp1 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch.getText())){
                    erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch.getText()+ "  que não foi declarada.");
                    tipo = 12;
                }
                else{
                    instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch.getText()+ "  que não foi instanciada.");
                    }
                    tp1 = tabSimb.get(ch.getText());
                    if(tp1 != 3){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não booleano.");
                        tipo = 12;
                    }
                    else{
                        tipo = 3;
                    }
                }
            }            
            if(tp2 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch2.getText())){
                    erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch2.getText()+ "  que não foi declarada.");
                    tipo = 12;
                }
                else{
                    instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch2.getText()+ "  que não foi instanciada.");
                    }
                    tp2 = tabSimb.get(ch2.getText());
                    if(tp2 != 3){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não booleano");
                        tipo = 12;
                    }
                    else{
                        tipo = 3;
                    }
                }
            }
            if(tp1 !=3 || tp2 != 3){ // Testa se é um valor TRUE ou FALSE
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não booleano");
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
        tp1 = ch.t;
        
        if(tp1 == 5){
            if(!tabSimb.containsKey(ch.getText())){
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch.getText()+ "  que não foi declarada.");
                tipo = 12;
            }
            instan = VarInstan.get(ch.getText());
                if (instan == false){
                    erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch.getText()+ "  que não foi instanciada.");
                }
        }
        
        child = ctx.getChild(2);
        GramaticaParser.Teste3Context ch2 = (GramaticaParser.Teste3Context)child;
        tp2 = ch2.t;
        if(tp2 == 5){
            if(!tabSimb.containsKey(ch2.getText())){
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch2.getText()+ "  que não foi declarada.");
                tipo = 12;
            }
            instan = VarInstan.get(ch2.getText());
            if (instan == false){
                erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch2.getText()+ "  que não foi instanciada.");
            }
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
        
        if(tp1 == 5){
            if(!tabSimb.containsKey(ch.getText())){
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch.getText()+ "  que não foi declarada.");
                tipo = 13;
            }
            instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch.getText()+ "  que não foi instanciada.");
                    }
        }
        
        child = ctx.getChild(2);
        GramaticaParser.FuncMathContext ch2 = (GramaticaParser.FuncMathContext)child;
        tp2 = ch2.t;
        if(tp2 == 5){
            if(!tabSimb.containsKey(ch2.getText())){
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch2.getText()+ "  que não foi declarada.");
                tipo = 13;
            }
            instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch2.getText()+ "  que não foi instanciada.");
                    }
        }
        
        
        return tipo;        
    }
    
    public int funcMath(GramaticaParser.FuncMathContext ctx){
        int tipo=14,tp1,tp2;
        boolean instan;
        
        if(ctx.getText().contains("+") || ctx.getText().contains("-")){
            ParseTree child = ctx.getChild(0);
             
            GramaticaParser.FuncMathContext ch = (GramaticaParser.FuncMathContext)child;
            tp1 = ch.t;
            
            child = ctx.getChild(2);
            GramaticaParser.TermContext ch2 = (GramaticaParser.TermContext)child;
            tp2 = ch2.t;
            
            if(tp1 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch.getText())){
                    erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch.getText()+ "  que não foi declarada.");
                    tipo = 14;
                }
                else{
                    instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch.getText()+ "  que não foi instanciada.");
                    }
                    tp1 = tabSimb.get(ch.getText());
                    if(tp1 == 3 || tp1 == 2){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não numerico na expressão");
                        tipo = 14;
                    }
                    else{
                        tipo = 1;
                    }
                }
            }            
            if(tp2 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch2.getText())){
                    erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch2.getText()+ "  que não foi declarada.");
                    tipo = 14;
                }
                else{
                    instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch2.getText()+ "  que não foi instanciada.");
                    }
                    tp2 = tabSimb.get(ch2.getText());
                    if(tp2 == 3 || tp2 == 2){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não numerico na expressão");
                        tipo = 14;
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
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não numerico");
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
            
            child = ctx.getChild(2);
            GramaticaParser.FatorContext ch2 = (GramaticaParser.FatorContext)child;
            tp2 = ch2.t;
            
            if(tp1 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch.getText())){
                    erros.add("Na linha " + ctx.getStart().getLine() + " foi usando a variável " + ch.getText()+ "  que não foi declarada.");
                    tipo = 15;
                }
                else{
                    instan = VarInstan.get(ch.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch.getText()+ "  que não foi instanciada.");
                    }
                    tp1 = tabSimb.get(ch.getText());
                    if(tp1 == 3 || tp1 == 2){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não numerico na expressão");
                        tipo = 15;
                    }
                    else{
                        tipo = 1;
                    }
                }
            }            
            if(tp2 == 5){ // Testa se é uma Variavel
                if(!tabSimb.containsKey(ch2.getText())){
                    erros.add("Na linha " + ctx.getStart().getLine() +" foi usando a variável " + ch2.getText()+ "  que não foi declarada.");
                    tipo = 15;
                }
                else{
                    //System.out.println(ch.getText());
                    instan = VarInstan.get(ch2.getText());
                    if (instan == false){
                        erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ch2.getText()+ "  que não foi instanciada.");
                    }
                    tp2 = tabSimb.get(ch2.getText());
                    if(tp2 == 3 || tp2 == 2){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não numerico na expressão");
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
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não numerico");
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
                                instan = VarInstan.get(ctx.ID().getText());
                                if (instan == false){
                                    erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ctx.ID().getText()+ "  que não foi instanciada.");
                                }
                            }catch(Exception e){
                                erros.add("Na linha " + ctx.getStart().getLine() +  " foi usando a variável " + ctx.ID().getText()+ "  que não foi declarada.");
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
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não booleano no IF");
            }
        }
        else {
            for(TerminalNode id : ctx.varControl().ID()){ // Testa se a variávela de controle é inteira
                tipo = tabSimb.get(id.getText());
                if(tipo != 1){
                    erros.add("Na linha " + ctx.getStart().getLine() + " foi usado uma variável não inteira na variável de controle.");
                }
                VarInstan.put(id.getText(),true);
            }
            if(testeLogicoOU(ctx.testeLogic()) != 3){
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usado um valor não booleano no condicional do FOR");
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
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado na função print() a variavel " + exp.ID().getText() + " que não foi declarada.");
                    }
                }
                else if(exp.funcMath() != null){
                    int tipo = funcMath(exp.funcMath());
                    if(tipo != 1 && tipo!=2 && tipo!=3 && tipo != 4){
                        erros.add("Na linha " + ctx.getStart().getLine() + " foi usado uma expressão invalida na função print().");
                    }
                }
                
            }
        }
    }
    
    @Override 
    public void enterRead(GramaticaParser.ReadContext ctx) { 
        for(TerminalNode id: ctx.listaIDs2().ID()){
            if(!tabSimb.containsKey(id.getText())){
                erros.add("Na linha " + ctx.getStart().getLine() + " foi usado na função read() a variavel " + id.getText() + " que não foi declarada.");
            }
            else{
                VarInstan.put(id.getText(),true);
            }
        }
    }
}
