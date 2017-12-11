
grammar Gramatica;

@header{
  import java.util.HashMap;
  import java.util.Map;
  
}

@parser::members{
//   Map <String,Integer> tabSimb = new HashMap<String,Integer>();     
}


programa: 'Class' ID ';' (decVars|decConsts)* decFuncs* main 
    ;
decVars: tipo ':' listaIDs[$tipo.t] ';'
       ;

decVarsFunc: tipo ':' listaIDs[$tipo.t] ';'
       ;
tipo returns[int t]
    : 'Int'   {$t=1;}
    | 'Str'   {$t=2;}
    | 'Bool'  {$t=3;}
    | 'Float' {$t=4;}
    ;
listaIDs [int t]: ID (',' ID)*
        ;
listaIDs2: ID (',' ID)*
         ;
decConsts: 'final' tipo ID '=' valor ';'
         ;
decConstsFunc: 'final' tipo ID '=' valor ';'
         ;
valor: INT 
     | REAL
     | STRING
     | TRUE
     | FALSE
     ;
decFuncs: tipoRetorno ID '(' listaParam ')' '{' (decVarsFunc|decConstsFunc)* comandos* retorno? '}' // Mudar a declaração de variaveis e constantes para outro nome.
        ;
listaParam: (tipo ID (',' tipo ID)*)?
          ;
retorno: 'return' (expre)? ';'
      ;
tipoRetorno: tipo 
           | 'Void'
           ;
main: 'Main' '{' comandos* '}'
    ;
comandos: print ';'
        | read ';'
        | chamFuncs ';'
        | atribuicao ';' /* =,++, -- */
        | controle /* ifelse, for */
        | Tk_break ';'   
        ;
print: 'print' '(' listaExpre? ')'
     ;
read: 'read' '(' listaIDs2 ')'
    ;
chamFuncs: ID '(' (listaExpre)? ')'
         ;
listaExpre: expre(',' expre)*
          ;

// Mudar, fazer como do livro.

expre: ID /* Aqui tem que imprimir o valor associado ao ID, e não o ID -- Tratar se for Null*/
     | valor
     | funcMath
     ;
atribuicao: ID '=' testeLogic  
          | ID '++'
          | ID '--'
          ;

testeLogic returns[int t]: testeLogic '||' a=teste1 {$t = $a.t;}
           | a=teste1 {$t = $a.t;}
           ;

teste1 returns[int t]: teste1 '&&' a=teste2 {$t = $a.t;}
      | a=teste2 {$t = $a.t;}
      ;

teste2 returns[int t]: teste2 opSec a=teste3 {$t = $a.t;}
      | a=teste3 {$t = $a.t;}
      ;

teste3 returns[int t]:  teste3 opPrim a=funcMath {$t = $a.t;}
      | a=funcMath {$t = $a.t;}
      ;

             
funcMath returns[int t]: funcMath ('+'|'-') a=term {$t = $a.t;} 
        | a=term {$t = $a.t;}
        ;
term returns[int t]: term ('*'|'/') a=fator {$t = $a.t;}
    | a=fator {$t = $a.t;}
    ;

unary returns[int t]: ('!'|'-')? a=fator {$t = $a.t;}
     ;
fator returns[int t]: '(' testeLogic ')'  
    | INT {$t = 1;}
    | REAL {$t = 4;}
    | Tk_True {$t = 3;}
    | Tk_False {$t = 3;}
    | ID {$t = 5;}
    | STRING {$t = 2;}
    | chamFuncs  // Atribuição de String
     ;

controle: 'if' '(' testeLogic ')' '{' comandos* retorno? '}' ('else' '{' comandos* retorno? '}')?
        | 'for' '(' varControl? ';' testeLogic ';' incrementos? ')' '{' comandos* '}' 
        ;
varControl: (ID '=' INT)(',' (ID '=' INT))*
          ;

opSec: '>='
     | '<='
     |'<'
     |'>'
     ;
opPrim: '=='
      | '!='
      ;

incrementos:(atribuicao)(',' atribuicao)* 
           ;

                                  
Tk_break: 'break';
Tk_Class: 'Class';
Tk_Main: 'Main';
Tk_PtVirg: ';';
Tk_Virg: ',';
Tk_DoisPonts: ':';
Tk_AbrePar: '(';
Tk_FechPar: ')';
Tk_Int: 'Int';
Tk_Float: 'Float';
Tk_Bool: 'Bool';
Tk_Str: 'Str';
Tk_Neg: '!';
Tk_E: '&&';
TK_OU: '||';
Tk_MaiorQ: '>';
Tk_MenorQ: '<';
Tk_MaiorIgual: '>=';
Tk_MenorIgual: '<=';
Tk_Dif: '=!';
Tk_Igual: '==';
Tk_AbreChaves: '{';
Tk_FechaChaves: '}';
Tk_MULT: '*';
Tk_DIV: '/';
TK_SUB: '-';
Tk_SOMA: '+';
Tk_IF: 'if';
Tk_FOR: 'for';
Tk_ELSE: 'else';
Tk_Incre: '++';
Tk_Decre: '--';
Tk_PRINT: 'print';
Tk_READ: 'read';
Tk_VOID: 'Void';
Tk_RETURN: 'return';
Tk_FINAL: 'final';
Tk_Atribu: '=';
Tk_True: 'true';
Tk_False: 'false';

ID: [A-Za-z][A-Za-z0-9]* ;
INT: [0-9]+ ;
REAL: [0-9]+'.'[0-9]+ ;
STRING: '"' .*? '"' ;
COMMENT_LINE: '//' .*? '\r'? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n] -> skip;
