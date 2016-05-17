// ExprArithAST.g4

grammar ExprArithAST;

// This will be the entry point of our parser.
expr returns [ExprArith value] :
  e = additionExpr {$value = $e.value;} ;

//BoolExpr
boolExpr : Boolean | '('logicExpr')' | compExpr | 'not' boolExpr ;

//And ou OR expression
logicExpr returns [ExprBool value] :
  e1 = atomExpr {$value = e1.value;}
  ('and' e2 = atomExpr {$value = new And($value, $e2.value);}
  |'or' e2 = atomExpr {$value = new Or($value, $e2.value);})*;

//Comparaion expression
compExpr returns [ExprBool value] :
  e1 = atomExpr {$value = e1.value;}
  ('<' e2 = atomExpr {$value = new CompInf($value, $e2.value);}
  |'>' e2 = atomExpr {$value = new CompSup($value, $e2.value);}
  |'<=' e2 = atomExpr {$value = new CompInfEgal($value, $e2.value);}
  |'>=' e2 = atomExpr {$value = new CompSupEgal($value, $e2.value);}
  |'=' e2 = atomExpr {$value = new CompEgal($value, $e2.value);}
  |'!=' e2 = atomExpr {$value = new CompDiff($value, $e2.value);})*;

// Addition and subtraction have the lowest precedence.
additionExpr returns [ExprArith value] :
  e1 = multiplyExpr {$value = $e1.value;}
  ('+' e2 = multiplyExpr {$value = new Add($value, $e2.value);}
  | '-' e2 = multiplyExpr {$value = new Sub($value, $e2.value);})* ;

// Multiplication and division have a higher precedence.
multiplyExpr returns [ExprArith value] :
  e1 = atomExpr {$value = $e1.value;}
  ('*' e2 = atomExpr {$value = new Mul($value, $e2.value);}
  | '/' e2 = atomExpr {$value = new Div($value, $e2.value);})* ;

/* An expression atom is the smallest part of an expression: a number. Or 
   when we encounter parenthesis, we're making a recursive call back to the
   rule 'additionExpr'. As you can see, an 'atomExpr' has the highest
   precedence. */
atomExpr returns [ExprArith value] :
  c = Number {$value = new Cte(Integer.parseInt($c.text));}
  | '(' e1 = additionExpr ')' {$value = $e1.value;}
  | '-' e2 = atomExpr {$value = new Inv($e2.value);} ;

//T is a type
T : ( Number | Boolean | Array);

//k is a constant
k : (Number | Boolean);

//Array
Array : '[' T ']' ;

//Variable
x : [a-z]+ ;


//Boolean is a string value
Boolean :('true' | 'false');

// A number is an integer value
Number : ('0'..'9')+ ;

// We're going to ignore all white space characters
WS : [ \t\r\n]+ -> skip ;