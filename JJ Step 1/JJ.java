

// JJ.java  //


abstract class ExprArith {	//For all the int expressions

    abstract int eval ();	//Int evaluation

}//ExprArith

abstract class ExprBool {	//For all the boolean expressions

    abstract boolean eval ();	//Boolean evaluation

}//ExprBool



///////////////////////////////////////
///////////CONSTANT///////////////////
/////////////////////////////////////

class Int extends ExprArith {

    int val;

    Int (int val) {
        this.val = val;
    }//Cte

    int eval () {
        return val;     //return arith
    }//eval

}//Cte

class Bool extends ExprBool {

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

class Inv extends ExprArith {

    ExprArith e;

    Inv (ExprArith e) {
        this.e = e;
    }//Inv

    int eval () {
        return -e.eval();   //Return -arith
    }//eval

}//Inv

////////////////////////////////////
/////////UNARY OP ON BOOL//////////
//////////////////////////////////

class Opp extends ExprBool {

    ExprBool e;

     (ExprBool e) {
        this.e = e;
    }//Inv

    int eval () {
        return !e.eval();   //return not(bool)
    }//eval

}//Opp


/////////////////////////////////////////////
////////ABSTRACT BINARY CLASS///////////////
///////////////////////////////////////////


abstract class IntToInt extends ExprArith {

    ExprArith e1, e2;

}//IntToInt

abstract class IntToBool extends ExprBool {

    ExprArith e1, e2;

}//IntToBool

abstract class BoolToBool extends ExprBool {

    ExprBool e1, e2;

}//BoolToBool



/////////////////////////////////////////////
/////////BINARY OP FROM INT TO INT//////////
///////////////////////////////////////////

class Add extends IntToInt {

    Add (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Add

    int eval () {
        return e1.eval() + e2.eval();   //return arith + arith
    }//eval

}//Add

class Sub extends IntToInt {

    Sub (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Sub

    int eval () {
        return e1.eval() - e2.eval();   //return arith - arith
    }//eval

}//Sub

class Mul extends IntToInt {

    Mul (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Mul

    int eval () {
        return e1.eval() * e2.eval();   //return arith * arith
    }//eval

}//Mul

class Div extends IntToInt {

    Div (ExprArith e1, ExprArith e2) {
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

    Blt (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Blt

    boolean eval () {
        return (e1.eval()<e2.eval());   //return true if arith < arith
    }//eval

}//Blt

class Ble extends IntToBool {

    Ble (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Ble

    boolean eval () {
        return (e1.eval()<=e2.eval());  //return true if arith <= arith
    }//eval

}//Ble

class Eq extends IntToBool {

    Eq (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Eq

    boolean eval () {
        return (e1.eval()==e2.eval());  //return true if arith = arith
    }//eval

}//Eq

class Dif extends IntToBool {

    Dif (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Dif

    boolean eval () {
        return (e1.eval()!=e2.eval());  //return true if arith =/= arith
    }//eval

}//Dif

class Bgt extends IntToBool {

    Bgt (ExprArith e1, ExprArith e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Bgt

    boolean eval () {
        return (e1.eval()>e2.eval());   //return true if arith > arith
    }//eval

}//Bgt

class Bge extends IntToBool {

    Bge (ExprArith e1, ExprArith e2) {
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

    And (ExprBool e1, ExprBool e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//And

    boolean eval () {
        return (e1.eval()&&e2.eval());  //return bool and bool
    }//eval

}//And

class Or extends BoolToBool {

    Or (ExprBool e1, ExprBool e2) {
        this.e1 = e1;
        this.e2 = e2;
    }//Or

    boolean eval () {
        return (e1.eval()||e2.eval());  //return bool or bool
    }//eval

}//Or



