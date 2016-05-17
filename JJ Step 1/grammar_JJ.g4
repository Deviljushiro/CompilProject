grammar grammar_JJ;


// Diferent kinds of expression
e : (k | x | numExpr | boolExpr | numExpr | appelExpr | eeExpr | arrayExpr);


// Expressions with 'and' and 'or' of binarExpr
combinatedBinarExpr : binarExpr ('and' binarExpr | 'or' binarExpr ) * ;

// Boolean request
binarExpr : numExpr ('>' numExpr | '>=' numExpr | '<' numExpr | '<=' numExpr | '=' numExpr | '!=' numExpr) * ;

// Simple expression with boolean
boolExpr : Boolean | '(' combinatedBinarExpr ')' | binarExpr | 'not' boolExpr ;


// Addition and subtraction have the lowest precedence
additionExpr : multiplyExpr ('+' multiplyExpr | '-' multiplyExpr ) * ;

// Multiplication and division have a higher precedence.
multiplyExpr : numExpr ('*' numExpr | '/' numExpr ) * ;

// Simple expression with integer
numExpr : Number | '(' additionExpr ')' | '-' numExpr ;


appelExpr : ('read' | 'write' | 'f') ('(' e ')') * ;

eeExpr : e '[' e ']' ;

arrayExpr : 'new' Array '[' e ']' ;







// T is a type
T : (Number | Boolean | Array);

//k is a constant
k : (Number | Boolean);

// A number is an integer value
Number : ('0'..'9')+ ;

// Variable
x : ('a'..'z')+;

//Boolean is a string : true or false
Boolean : ('true' | 'false');

//Array of T
Array : 'array' 'of' T; 

// We're going to ignore all white space characters
WS : [ \t\r\n]+ -> skip ;