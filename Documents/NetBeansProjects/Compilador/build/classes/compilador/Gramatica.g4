
grammar Gramatica;

programa: 'Class' ID ';' (decVars|decConsts)* decFuncs* main 
    ;
decVars: tipo ':' listaIDs ';'
       ;
tipo: 'Int'
    | 'Str'
    | 'Bool'
    | 'Float'
    ;
listaIDs: ID (',' ID)*
        ;
decConsts: 'final' tipo ID '=' valor ';'
         ;
valor: INT
     | REAL
     | STRING
     ;
decFuncs: tipoRetorno ID '(' listaParam ')' '{' (decVars|decConsts)* comandos* retorno? '}' // Garantir que tenha retorno
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
        ;
print: 'print' '(' listaExpre? ')'
     ;
read: 'read' '(' listaIDs ')'
    ;
chamFuncs: ID '(' (listaExpre)? ')'
         ;
listaExpre: expre(',' expre)*
          ;
expre: ID /* Aqui tem que imprimir o valor associado ao ID, e não o ID -- Tratar se for Null*/
     | valor
     | funcMath
     ;
atribuicao: ID '=' expre 
          | ID '++'
          | ID '--'
          ;
funcMath: funcMath ('+'|'-') term 
        | term
        ;
term: term ('*'|'/') fator
    | fator
    ;
fator: '(' funcMath ')'
     | '-'?(INT|REAL|ID|chamFuncs)
     ;

controle: 'if' '(' testeLogic ')' '{' comandos* retorno? '}' ('else' '{' comandos* retorno? '}')?
        | 'for' '(' varControl ';' testeLogic ';' incrementos ')' '{' comandos*/*|break  */ '}' 
        ;
varControl: (ID | ID '=' INT)(',' (ID | ID '=' INT))*
          ;
testeLogic: '!' testeLogic
          | testeLogic ('&&'|'||') testeLogic
          | '(' testeLogic ')'
          | expre opLogic expre
          ;
opLogic: '=='
       | '=!'
       | '>='
       | '<='
       |'<'
       |'>'
       ;
incrementos:(atribuicao)(',' atribuicao)* // Aceitar incrementos maiores que 1? (Teria que ser uma atribuição ex. a=a+2)
           ;


                                  
                              
Tk_Class: 'Class';
Tk_Main: 'Main';
Tk_PtVirg: ';';
Tk_AbrePar: '{';
Tk_FechPar: '}';

ID: [A-Za-z][A-Za-z0-9]* ;
INT: [0-9]+ ;
REAL: [0-9]+'.'[0-9]+ ;
STRING: '"' .*? '"' ;
COMMENT_LINE: '//' .*? '\r'? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t\r\n] -> skip;
