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


literal :
    | INT
    | BOOL
    ;

expression
   :
   |   literal
   |   expression (PLUS | MINUS | DIV | MUL) expression
   |   definition
   |   application
   |   assignment
   |   if
   |   ifelse
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