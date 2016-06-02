
import java.util.*;

/**INTERFERENCE'S GRAPH**/

class InterfGraph {
  
  private ArrayList<String> vertices; //String list of each vertex name : ("a","b",...)
  private ArrayList<String> interf;   //List of interferences between vertices (pattern : "vertex1-vertex2")
  private ArrayList<String> pref;     //List of preferences between vertices (pattern : "vertex1-vertex2")
  
  /**Constructor**/
  InterfGraph (ArrayList<String> v, ArrayList<String> i, ArrayList<String> p) {

  	this.vertices = v;
  	this.interf = i;
  	this.pref = p;
  }

  
  /**
   * @param int index, where we want to take the value in the list
   * @return String, vertex in the list at the index cell
   **/
  String getVertex (int index) {

  	return this.vertices.get(index);
  }


  /**
  * @param String vertex : the vertex where we want to know its degree
  * @return int, the degree of the vertex in parameter (>= 0)
  **/
  int getDegree (String vertex) {

	int degree = 0; //Initialize the degree value

  	for (int i=0;i<this.interf.size();i++) {

		String [] splittedEdge = this.interf.get(i).split("-");	//Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]
		
      		if ((splittedEdge[0] == vertex)||(splittedEdge[1] == vertex)) {	//If the parameter vertex is in the edge then degree+1

			degree++;
		} 
    	}
	return degree;
  }


  /**
  * @param None, just use the intern InterfGraph
  * @return int, the maximum degree of the graph
  **/
  int maxDegree () {
	
	int max = this.getDegree(this.interf.get(0)); //Initialize the first degree's vertex as the max

	for (int i=1;i<=this.interf.size();i++) {

		if (this.getDegree(this.interf.get(i)) > max) {

			max = this.getDegree(this.interf.get(i));	//This is the new maximum degree	
		}
	}
	return max;
  }


  /**
  * @param None, just use the intern InterfGraph
  * @return int, the minimum degree of the graph
  **/
  int minDegree () {
	
	int min = this.getDegree(this.interf.get(0)); //Initialize the first degree's vertex as the min

	for (int i=1;i<=this.interf.size();i++) {

		if (this.getDegree(this.interf.get(i)) < min) {

			min = this.getDegree(this.interf.get(i));	//This is the new minimum degree	
		}
	}
	return min;
  }


  /**
  * @param int colorNumber, 
  * @return boolean, True if the graph needs to be spilled, False else
 
  boolean needSpill (int colorNumber) {

	return (this.maxDegree() >

  }
  **/
}
