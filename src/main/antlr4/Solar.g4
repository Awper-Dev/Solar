grammar Solar;

start  :
     block  EOF;

definition :
    'def' ID '(' ID* (',' ID)* ')' '{' block return? '}';

application:
    ID '(' (INT | ID)* (',' (INT | ID))* ')';

assignment:
    ID '=' expression;

if:
    'if' '(' expression ')' '{' block return? '}';

ifelse:
    if 'else' '{' block return? '}';

block :
    expression (';' expression)*;

return :
    'return' expression;


literal
    : INT
    | BOOL
    ;

expression
   :   literal #Lit
   |   expression op=PLUS expression #Add
   |   expression op=MINUS expression #Sub
   |   expression op=DIV expression #Div
   |   expression op=MUL expression #Mul
   |   definition #Def
   |   application #App
   |   assignment #Ass
   |   if #Ifs
   |   ifelse #Ifelses
   ;

PLUS   :  '+';
MINUS  :  '-';
DIV    :  '/';
MUL    :  '*';

INT    :  '0'..'9'+;
BOOL   :  'true' | 'false';

ID     : 'a'..'z'+
       | 'A'..'Z'+;

WHITE : [ \t\r\n]+ -> skip;