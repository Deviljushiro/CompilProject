
grammar grammar_JJ;






////////////////////////////////////////////////////////////////
/////////////THINGS THAT WE WANT TO IMPLEMENT//////////////////
//////////////////////////////////////////////////////////////

//type is a type
type: ('integer' | 'boolean' | 'array' 'of' type);

// Differentypekinds of expression
e : ( k | X | additionExpr | boolExpr | appelExpr | arrayExpr);

//Instructions
i : (X':=' e | eeExpr ':=' e | 'if' e 'then' e 'else' e | 'while' e 'do' i | appelExpr);

//Functions
d : 'f(' ( X ':' type)* ')' '[:' type']' 'var' ( X ':' type )* i;

//Programs
p : 'var' ( X ':' type )* d* i;





///////////////////////////////////////////////////////////////
//////////////////ARITHMETIC OPERATIONS///////////////////////
/////////////////////////////////////////////////////////////


// Addition and subtraction have the lowestypeprecedence.
additionExpr : multiplyExpr ('+' multiplyExpr | '-' multiplyExpr)* ;

// Multiplication and division have a higher precedence.
multiplyExpr : atomExpr ('*' atomExpr | '/' atomExpr)* ;

//Numeric and unary operations
atomExpr : Number | '(' additionExpr ')' | '-' atomExpr ;





//////////////////////////////////////////////////////////////
///////////////////BOOLEAN OPERATIONS////////////////////////
////////////////////////////////////////////////////////////


// Expressions with 'and' and 'or' of binarExpr
combinatedBinarExpr : (binarExpr | boolExpr) ('and' (binarExpr | boolExpr) | 'or' (binarExpr | boolExpr) ) * ;

// Boolean request
binarExpr : atomExpr ('>' atomExpr | '>=' atomExpr | '<' atomExpr | '<=' atomExpr | '=' atomExpr | '!=' atomExpr) *;

// Simple expression with boolean
boolExpr : Boolean | '(' combinatedBinarExpr ')' | binarExpr | 'not' boolExpr ;





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
appelExpr : ('read' | 'write' | 'f') ('(' e ')') * ;





////////////////////////////////////////////////////////////
///////////////////FINISHED ALPHABET///////////////////////
//////////////////////////////////////////////////////////


// A number is an integer value
Number : ('0'..'9')+ ;

//Boolean is a string : true or false
Boolean : ( 'true' | 'false' ) ;

//Variable
X : [a-z]+ ; 

//Constant
k : (Number | Boolean);  

       


////////////////////////////////////////////////////////
//////////////////IGNORE EMPTY INPUTS//////////////////
//////////////////////////////////////////////////////


// We're going to ignore all white space characters
WS : [ \t\r\n]+ -> skip ;
