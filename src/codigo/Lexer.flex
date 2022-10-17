package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
E=[!#$%&'?@]+
A=["("")""{""}""[""]"]+
S=["+""*""/""-"]
P=["."","";"":""-""_"]
C=["--""/*""*/"]+
Strings=[\"]
espacio=[ ,\t, \r,\n]+
%{
public String lexeme;
%}
%%
create |
drop |
alter |
truncate |
insert |
update |
delete |
while {lexeme=yytext();return palabra_reservada;}
{espacio}({espacio})* {lexeme=yytext(); return vacio;}
{Strings} {lexeme=yytext(); return comillas;}
{C} {lexeme=yytext(); return comentario;}
{P} {lexeme=yytext(); return signo_de_puntuacion;}
{S} {lexeme=yytext(); return operador_matematico;}
{L}({L}|{D})* {lexeme=yytext(); return variable;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return numero;}
{E}({E}|{L})* {lexeme=yytext(); return ERRORES;}
{A} {lexeme=yytext(); return signo_de_agrupacion;}
