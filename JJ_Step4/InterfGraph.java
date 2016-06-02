
import java.util.*;

/**INTERFERENCE'S GRAPH**/

class InterfGraph {
  
  private ArrayList<String> vertices; //String list of each vertex name : ("a","b",...)
  private ArrayList<String> interf;   //List of interferences between vertices (pattern : "vertex1-vertex2")
  private ArrayList<String> pref;     //List of preferences between vertices (pattern : "vertex1-vertex2")
  private ArrayList<String> toColor; //String list of each vertex name to color, without spilled vertex: ("a","b",...)
  private int degree; //The degree of the InternGraph to respect

  /**Constructor**/
  InterfGraph (ArrayList<String> v, ArrayList<String> i, ArrayList<String> p) {

  	this.vertices = v;
  	this.interf = i;
  	this.pref = p;
    this.degree = k;
  }

  
  /**
   * @param int index, where we want to take the value in the list
   * @return String, vertex in the list at the index cell
   **/
  String getVertex (int index) {

  	return this.vertices.get(index);
  }

  /**
  * @param ArrayList<String> interferences, list of interferences for searching
  * @param String vertex : the vertex where we want to know its index
  * @return int, the index of the vertex in parameter
  **/
  String getIndex(ArrayList<String> vertices, String vertex) {
    boolean flag = true;
    i=0;
    while(flag && (i<vertices.size()) ){
      if (vertice[i] == vertex){
        flag = false;
      }
      i++;
    }
    return vertices[i-1];
  }



  /**
  * @param ArrayList<String> interferences, list of interferences for searching
  * @param String vertex : the vertex where we want to know its degree
  * @return int, the degree of the vertex in parameter (>= 0)
  **/
  int getDegree (ArrayList<String> interferences, String vertex) {

	int degree = 0; //Initialize the degree value

  	for (int i=0;i<interferences.size();i++) {

		String [] splittedEdge = interferences.get(i).split("-");	//Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]
		
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
  * @return int, the the minimum degree of the graph
  **/
  String minDegree () {
  
  int min = this.getDegree(this.interf.get(0)); //Initialize the first degree's vertex as the min

  for (int i=1;i<=this.interf.size();i++) {

    if (this.getDegree(this.interf.get(i)) < min) {

      min = this.getDegree(this.interf.get(i)); //This is the new minimum degree  
    }
  }
  return min;
  }


  /**
  * @param None, just use the intern InterfGraph
  * @return String, the vertex with the minimum degree of the graph
  **/
  String minDegreeVertex () {
	
	int min = this.getDegree(this.interf.get(0)); //Initialize the first degree's vertex as the min
  String verticeMin = this.getVertex(this.interf.get(0)); //Initialize the first vertex as the min degree's

	for (int i=1;i<=this.interf.size();i++) {

		if (this.getDegree(this.interf.get(i)) < min) {

			min = this.getDegree(this.interf.get(i));	//This is the new minimum degree	
      verticeMin = this.getVertex(this.interf.get(i));  //This is the new minimum degree
		}
	}
	return verticeMin;
  }

  /**
  * @param ArrayList<String> interferences, list to modify
  * @param String vertex, vertex that we have to delete it interferences
  **/
  void deleteInterf (ArrayList<String> interferences, String vertex){
      for (int i=0;i<interferences.size();i++) {

        String [] splittedEdge = interferences.get(i).split("-"); //Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]
    
        if ((splittedEdge[0] == vertex)||(splittedEdge[1] == vertex)) { //If the vertex is in the edge then remove this link of interferences
          interferences.remove(i);
        } 
      }    
  }

  /**
  * @param None, just use the intern InterfGraph
  * @return ArrayList<String> vertexToColor, the list of vertices to color
  **/
  ArrayList<String> toColor ( int k) {

  ArrayList<String> vertexToColor; //List to return, with all the vertices to color, without them to spill
  ArrayList<String> interferences = this.interf.clone(); //Copy of the initial list of interferences 
  ArrayList<String> vertices = this.vertices.clone(); //Copy of the initial list of vertices

    while( !(vertices.empty()) ){

      vertex = vertices[0]; //Initialize the first vertice

      while( getDegree(interferences, vertex) < this.degree ){
        vertexToColor.add(vertex()); 
        deleteInterf(interferences, vertex)
        vertices.remove()
      }
    }
  }


  /**
  * @param int colorNumber, 
  * @return boolean, True if the graph needs to be spilled, False else
  **/
  boolean needSpill (int colorNumber) {

	return (this.maxDegree() >

  }
  
}
