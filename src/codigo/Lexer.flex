package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%line
%type Tokens
L=[a-zA-Z_áéíóú]+
D=[0-9]+
A=["("")""{""}""[""]"]+
S=["+""*""/""-"]
P=["."","";"":""-""_""'"]
C=["--""\/*""*/"]+
E=[@,$,#,!,?,¡,¿|,¬,°]+
Strings=[\"]
espacio=[ ,\t, \r,\n]+
%{
public String lexeme;
%}
%%
ADD |	
ALL |	
ALTER |
ANALYZE |     
AND |	
AS |
ASC |	
ASENSITIVE |	
BEFORE |
BETWEEN |	
BIGINT |	
BINARY |
BLOB |	
BOTH |	
BY |
CALL |	
CASCADE |	
CASE |
CHANGE |	
CHAR |	
CHARACTER |
CHECK |	
COLLATE |	
COLUMN |
CONDITION |	
CONNECTION |	
CONSTRAINT |
CONTINUE |	
CONVERT |	
CREATE |
CROSS |	
CURRENT_DATE |	
CURRENT_TIME |
CURRENT_TIMESTAMP |
CURRENT_USER |	
CURSOR |
DATABASE |
DATABASES |	
DAY_HOUR |
DAY_MICROSECOND |	
DAY_MINUTE |	
DAY_SECOND |
DEC |	
DECIMAL |	
DECLARE |
DEFAULT	|
DELAYED	|
DELETE |
DESC |	
DESCRIBE |	
DETERMINISTIC |
DISTINCT |	
DISTINCTROW |	
DIV |
DOUBLE |	
DROP |	
DUAL |
EACH |	
ELSE |	
ELSEIF |
ENCLOSED |	
ESCAPED	EXISTS |
EXIT |	
EXPLAIN |	
FALSE |
FETCH |	
FLOAT |	
FOR |
FORCE |	
FOREIGN |	
FROM |
FULLTEXT |	
GOTO |	
GRANT |
GROUP |	
HAVING |	
HIGH_PRIORITY |
HOUR_MICROSECOND |	
HOUR_MINUTE |	
HOUR_SECOND |
IF |	
IGNORE |	
IN |
INDEX |	
INFILE |	
INNER |
INOUT |	 
INSENSITIVE |	
INSERT |
INT |
INTEGER |	
INTERVAL |
INTO |	
IS |	
ITERATE |
JOIN | 	
KEY |	
KEYS |
KILL |	
LEADING |	
LEAVE |
LEFT |	
LIKE |	
LIMIT |
LINES |	
LOAD |	
LOCALTIME |
LOCALTIMESTAMP |
LONGBLOB |
LOW_PRIORITY |
MEDIUMINT |
MINUTE_MICROSECOND |
MODIFIES |
NO_WRITE_TO_BINLOG |
ON |
OPTIONALLY |
OUT |
PRECISION |
PURGE |
REAL |
RENAME |
REQUIRE |
REVOKE |
SCHEMA |
SELECT |
SET |
SONAME |
SQL |
SQLWARNING |
SQL_SMALL_RESULT |
STRAIGHT_JOIN |
THEN |
TINYTEXT |
TRIGGER |
UNION |
UNSIGNED |
USE |
UTC_TIME |
VARBINARY |
VARYING |
WHILE |
XOR |
LOCK |
LONGTEXT |
MATCH |
MEDIUMTEXT |
MINUTE_SECOND |
NATURAL |
NULL |
OPTIMIZE |
OR |
OUTER |
PRIMARY |
READ |
REFERENCES |
REPEAT |
RESTRICT |
RIGHT |
SCHEMAS |
SENSITIVE |
SHOW |
SPATIA |
SQLEXCEPTION |
SQL_BIG_RESULT |
SSL |
TABLE |
TINYBLOB |
TO |
TRUE |
UNIQUE |
UPDATE |
USING |
UTC_TIMESTAMP |
VARCHAR |
WHEN |
WITH |
YEAR_MONTH |
LONG |
LOOP |
MEDIUMBLOB |
MIDDLEINT |
MOD |
NOT |
NUMERIC |
OPTION |
ORDER |
OUTFILE |
PROCEDURE |
READS |
REGEXP |
REPLACE |
RETURN |
RLIKE |
SECOND_MICROSECOND |
SEPARATOR |
SMALLINT |
SPECIFIC |
SQLSTATE |
SQL_CALC_FOUND_ROWS |
STARTING |
TERMINATED |
TINYINT |
TRAILING |
UNDO |
UNLOCK |
USAGE |
UTC_DATE |
VALUES |
VARCHARACTER |
WHERE |
WRITE |
add |	
all |	
alter |
analyze |     
and |	
as |
asc |	
asensitive |	
before |
between |	
bigint |	
binary |
blob |	
both |	
by |
call |	
cascade |	
case |
change |	
char |	
character |
check |	
collate |	
column |
condition |	
connection |	
constraint |
continue |	
convert |	
create |
cross |	
current_date |	
current_time |
current_timestamp |
current_user |	
cursor |
database |
databases |	
day_hour |
day_microsecond |	
day_minute |	
day_second |
dec |	
decimal |	
declare |
default	|
delayed	|
delete |
desc |	
describe |	
deterministic |
distinct |	
distinctrow |	
div |
double |	
drop |	
dual |
each |	
else |	
elseif |
enclosed |	
escaped	exists |
exit |	
explain |	
false |
fetch |	
float |	
for |
force |	
foreign |	
from |
fulltext |	
goto |	
grant |
group |	
having |	
high_priority |
hour_microsecond |	
hour_minute |	
hour_second |
if |	
ignore |	
in |
index |	
infile |	
inner |
inout |	 
insensitive |	
insert |
int |
integer |	
interval |
into |	
is |	
iterate |
join | 	
key |	
keys |
kill |	
leading |	
leave |
left |	
like |	
limit |
lines |	
load |	
localtime |
localtimestamp |
longblob |
low_priority |
mediumint |
minute_microsecond |
modifies |
no_write_to_binlog |
on |
optionally |
out |
precision |
purge |
real |
rename |
require |
revoke |
schema |
select |
set |
soname |
sql |
sqlwarning |
sql_small_result |
straight_join |
then |
tinytext |
trigger |
union |
unsigned |
use |
utc_time |
varbinary |
varying |
while |
xor |
lock |
longtext |
match |
mediumtext |
minute_second |
natural |
null |
optimize |
or |
outer |
primary |
read |
references |
repeat |
restrict |
right |
schemas |
sensitive |
show |
spatia |
sqlexception |
sql_big_result |
ssl |
table |
tinyblob |
to |
true |
unique |
update |
using |
utc_timestamp |
varchar |
when |
with |
year_month |
long |
loop |
mediumblob |
middleint |
mod |
not |
numeric |
option |
order |
outfile |
procedure |
reads |
regexp |
replace |
return |
rlike |
second_microsecond |
separator |
smallint |
specific |
sqlstate |
sql_calc_found_rows |
starting |
terminated |
tinyint |
trailing |
undo |
unlock |
usage |
utc_date |
values |
varcharacter |
where |
write |
Add |	
All |	
Alter |
Analyze |     
And |	
As |
Asc |	
Asensitive |	
Before |
Between |	
Bigint |	
Binary |
Blob |	
Both |	
By |
Call |	
Cascade |	
Case |
Change |	
Char |	
Character |
Check |	
Collate |	
Column |
Condition |	
Connection |	
Constraint |
Continue |	
Convert |	
Create |
Cross |	
Current_Date |	
Current_Time |
Current_Timestamp |
Current_User |	
Cursor |
Database |
Databases |	
Day_Hour |
Day_Microsecond |	
Day_Minute |	
Day_Second |
Dec |	
Decimal |	
Declare |
Default	|
Delayed	|
Delete |
Desc |	
Describe |	
Deterministic |
Distinct |	
Distinctrow |	
Div |
Double |	
Drop |	
Dual |
Each |	
Else |	
Elseif |
Enclosed |	
Escaped	Exists |
Exit |	
Explain |	
False |
Fetch |	
Float |	
For |
Force |	
Foreign |	
From |
Fulltext |	
Goto |	
Grant |
Group |	
Having |	
High_Priority |
Hour_Microsecond |	
Hour_Minute |	
Hour_Second |
If |	
Ignore |	
In |
Index |	
Infile |	
Inner |
Inout |	 
Insensitive |	
Insert |
Int |
Integer |	
Interval |
Into |	
Is |	
Iterate |
Join | 	
Key |	
Keys |
Kill |	
Leading |	
Leave |
Left |	
Like |	
Limit |
Lines |	
Load |	
Localtime |
Localtimestamp |
Longblob |
Low_Priority |
Mediumint |
Minute_Microsecond |
Modifies |
No_Write_To_Binlog |
On |
Optionally |
Out |
Precision |
Purge |
Real |
Rename |
Require |
Revoke |
Schema |
Select |
Set |
Soname |
Sql |
Sqlwarning |
Sql_Small_Result |
Straight_Join |
Then |
Tinytext |
Trigger |
Union |
Unsigned |
Use |
Utc_Time |
Varbinary |
Varying |
While |
Xor |
Lock |
Longtext |
Match |
Mediumtext |
Minute_Second |
Natural |
Null |
Optimize |
Or |
Outer |
Primary |
Read |
References |
Repeat |
Restrict |
Right |
Schemas |
Sensitive |
Show |
Spatia |
Sqlexception |
Sql_Big_Result |
Ssl |
Table |
Tinyblob |
To |
True |
Unique |
Update |
Using |
Utc_Timestamp |
Varchar |
When |
With |
Year_Month |
Long |
Loop |
Mediumblob |
Middleint |
Mod |
Not |
Numeric |
Option |
Order |
Outfile |
Procedure |
Reads |
Regexp |
Replace |
Return |
Rlike |
Second_Microsecond |
Separator |
Smallint |
Specific |
Sqlstate |
Sql_Calc_Found_Rows |
Starting |
Terminated |
Tinyint |
Trailing |
Undo |
Unlock |
Usage |
Utc_Date |
Values |
Varcharacter |
Where |
Write |
while {lexeme=yytext();return palabra_reservada;}
{espacio}({espacio})* {lexeme=yytext(); return vacio;}
{espacio} {/*ignore*/}
{Strings} {lexeme=yytext(); return comillas;}
{S} {lexeme=yytext(); return operador_matematico;}
{C}+ {lexeme=yytext(); return comentario;}
{P} {lexeme=yytext(); return signo_de_puntuacion;}
{L}({L}|{D})* {lexeme=yytext(); return variable;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return numero;}
{E}
{A} {lexeme=yytext(); return signo_de_agrupacion;}
. { lexeme=yytext(); return error;}
{E}+({L}|{D}|{L}{D}|{L}{D}{E}|{D}{L}{E})* {lexeme=yytext(); return error;}
