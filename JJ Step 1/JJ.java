

// JJ.java  //


abstract class numExpr {	//For all the int expressions

    abstract int eval ();	//Int evaluation

}//numExpr

abstract class boolExpr {	//For all the boolean expressions

    abstract boolean eval ();	//Boolean evaluation

}//boolExpr



///////////////////////////////////////
///////////CONSTANT///////////////////
/////////////////////////////////////

class Int extends numExpr {

    int val;

    Int (int val) {
        this.val = val;
    }//Cte

    int eval () {
        return val;     //return arith
    }//eval

}//Cte

class Bool extends boolExpr {

    boolean val;

    Bool (boolean bool) {
        this.val = val;
    }//Bool

    boolean eval () {
        return val;     //return bool
    }//eval 
}//Bool



///////////////////////////////////
/////////UNARY OP ON INT//////////
/////////////////////////////////

class Inv extends numExpr {

    numExpr e;

    Inv (numExpr e) {
        this.e = e;
    }//Inv

    int eval () {
        return -e.eval();   //Return -arith
    }//eval

}//Inv

////////////////////////////////////
/////////UNARY OP ON BOOL//////////
//////////////////////////////////

class Opp extends boolExpr {

    boolExpr
 e;

     (boolExpr
     e) {
        this.e = e;
    }//Inv

    int eval () {
        return !e.eval();   //return not(bool)
    }//eval

}//Opp


/////////////////////////////////////////////
////////ABSTRACT BINARY CLASS///////////////
///////////////////////////////////////////


abstract class IntToInt extends numExpr {

    numExpr e1, e2;

}//IntToInt

abstract class IntToBool extends boolExpr {

    numExpr e1, e2;

}//IntToBool

abstract class BoolToBool extends boolExpr {

    boolExpr
 e1, e2;

}//BoolToBool



/////////////////////////////////////////////
/////////BINARY OP FROM INT TO INT//////////
///////////////////////////////////////////

class Add extends IntToInt {

    Add (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Add

    int eval () {
        return e1.eval() + e2.eval();   //return arith + arith
    }//eval

}//Add

class Sub extends IntToInt {

    Sub (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Sub

    int eval () {
        return e1.eval() - e2.eval();   //return arith - arith
    }//eval

}//Sub

class Mul extends IntToInt {

    Mul (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Mul

    int eval () {
        return e1.eval() * e2.eval();   //return arith * arith
    }//eval

}//Mul

class Div extends IntToInt {

    Div (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Div

    int eval () {
        return e1.eval() / e2.eval();   //return arith / arith
    }//eval

}//Div

//////////////////////////////////////////////
/////////BINARY OP FROM INT TO BOOL//////////
////////////////////////////////////////////

class Blt extends IntToBool {

    Blt (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Blt

    boolean eval () {
        return (e1.eval()<e2.eval());   //return true if arith < arith
    }//eval

}//Blt

class Ble extends IntToBool {

    Ble (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Ble

    boolean eval () {
        return (e1.eval()<=e2.eval());  //return true if arith <= arith
    }//eval

}//Ble

class Eq extends IntToBool {

    Eq (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Eq

    boolean eval () {
        return (e1.eval()==e2.eval());  //return true if arith = arith
    }//eval

}//Eq

class Dif extends IntToBool {

    Dif (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Dif

    boolean eval () {
        return (e1.eval()!=e2.eval());  //return true if arith =/= arith
    }//eval

}//Dif

class Bgt extends IntToBool {

    Bgt (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Bgt

    boolean eval () {
        return (e1.eval()>e2.eval());   //return true if arith > arith
    }//eval

}//Bgt

class Bge extends IntToBool {

    Bge (numExpr e1, numExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Bge

    boolean eval () {
        return (e1.eval()>=e2.eval());  //return true if arith >= arith
    }//eval

}//Bge


///////////////////////////////////////////////
/////////BINARY OP FROM BOOL TO BOOL//////////
/////////////////////////////////////////////

class And extends BoolToBool {

    And (boolExpr e1, boolExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//And

    boolean eval () {
        return (e1.eval()&&e2.eval());  //return bool and bool
    }//eval

}//And

class Or extends BoolToBool {

    Or (boolExpr e1, boolExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Or

    boolean eval () {
        return (e1.eval()||e2.eval());  //return bool or bool
    }//eval

}//Or



