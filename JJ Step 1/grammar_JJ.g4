
grammar JJ_ANTLR;






////////////////////////////////////////////////////////////////
/////////////THINGS THAT WE WANT TO IMPLEMENT//////////////////
//////////////////////////////////////////////////////////////

//type is the string of the different types implemented in this language
type: ('integer' | 'boolean' | 'array' 'of' type);

// Different kinds of expression
e : ( k | X | additionExpr | boolExpr | appelExpr | arrayExpr);

//Instructions including expressions
i : (X':=' e | eeExpr ':=' e | 'if' e 'then' e 'else' e | 'while' e 'do' i | appelExpr);

//Functions including instructions
d : 'f(' ( X ':' type)* ')' '[:' type']' 'var' ( X ':' type )* i;

//Programs including functions
p : 'var' ( X ':' type )* d* i;





///////////////////////////////////////////////////////////////
//////////////////ARITHMETIC OPERATIONS///////////////////////
/////////////////////////////////////////////////////////////


// Addition and subtraction have the lowest precedence.
additionExpr : multiplyExpr ('+' multiplyExpr | '-' multiplyExpr)* ;

// Multiplication and division have a higher precedence.
multiplyExpr : atomExpr ('*' atomExpr | '/' atomExpr)* ;

//Numeric and unary operations with the main precedence
atomExpr : Number | '(' additionExpr ')' | '-' atomExpr ;





//////////////////////////////////////////////////////////////
///////////////////BOOLEAN OPERATIONS////////////////////////
////////////////////////////////////////////////////////////


// Compare 2 boolean expressions with 'and' and 'or' with the lowest precedence
combinatedcompareExpr : (compareExpr | boolExpr) ('and' (compareExpr | boolExpr) | 'or' (compareExpr | boolExpr) ) * ;

// Compare 2 numeric expression and return boolean with a higher precedence
compareExpr : atomExpr ('>' atomExpr | '>=' atomExpr | '<' atomExpr | '<=' atomExpr | '=' atomExpr | '!=' atomExpr) *;

// Simple expression with boolean with the main precedence
boolExpr : Boolean | '(' combinatedcompareExpr ')' | compareExpr | 'not' boolExpr ;





/////////////////////////////////////////////////////////////
/////////////////////ARRAY OPERATIONS///////////////////////
///////////////////////////////////////////////////////////


//Initialisation of an array of a certain type
arrayExpr : 'new' 'array' 'of' type '[' e ']' ;

//Indexation of an expression
eeExpr : e '[' e ']' ;





////////////////////////////////////////////////////////////
//////////////////////CALL TARGETS/////////////////////////
//////////////////////////////////////////////////////////


//Call function read, write or defined function with f rule
appelExpr : ( 'read' | 'write' | 'f' ) ( '(' e ')' )* ;





////////////////////////////////////////////////////////////
///////////////////FINISHED ALPHABET///////////////////////
//////////////////////////////////////////////////////////


//Number is an integer value
Number : ('0'..'9')+ ;

//Boolean is a string : true or false
Boolean : ( 'true' | 'false' ) ;

//Variable is a combination of characters
X : [a-z]+ ; 

//Constant is number or boolean only
k : (Number | Boolean);  

       


////////////////////////////////////////////////////////
//////////////////IGNORE EMPTY INPUTS//////////////////
//////////////////////////////////////////////////////


// We're going to ignore all white space characters
WS : [ \t\r\n]+ -> skip ;
