
import java.util.*;

/**INTERFERENCE'S GRAPH**/

class InterfGraph {
  
  private ArrayList<String> vertices; //String list of each vertex name : ("a","b",...)
  private ArrayList<String> interf;   //List of interferences between vertices (pattern : "vertex1-vertex2")
  private ArrayList<String> pref;     //List of preferences between vertices (pattern : "vertex1-vertex2")
  private int degree; //The degree of the InternGraph to respect

  /**Constructor**/
  InterfGraph (ArrayList<String> v, ArrayList<String> i, ArrayList<String> p, int k) {

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
    int i=-1;
    while(flag && (i<vertices.size()) ){
      i++;
      if (vertices.get(i) == vertex){
        flag = false;
      }
    }
    return vertices.get(i-1);
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
  * @param ArrayList<String> vertices, list of vertices
  * @param ArrayList<String> interferences, list of interferences
  * @return String maxVertex, the vertex with maximum degree
  **/
  String maxDegreeVertex (ArrayList<String> vertices, ArrayList<String> interferences) {
  
	  int max = getDegree(interferences, vertices.get(0) ); //Initialize the first degree's vertex as the max
	  String verticeMax = vertices.get(0); //Initialize the first vertex as the min degree's
	
	  for (int i=1;i<=interferences.size();i++) {
	
	    if (getDegree(interferences, vertices.get(i) ) > max) {
	
	      max = getDegree(interferences, vertices.get(i) ); //This is the new maximum degree 
	      verticeMax = vertices.get(i); //This is the new vertex with the maximum degree
	    }
	  }
	  return verticeMax;
  }


  /**
  * @param ArrayList<String> vertices, list of vertices
  * @param ArrayList<String> interferences, list of interferences
  * @return int min, the the minimum degree of the graph
  **/
  int minDegree(ArrayList<String> vertices, ArrayList<String> interferences) {
  
	  int min = this.getDegree(interferences, vertices.get(0) ); //Initialize the first degree's vertex as the min
	
	  for (int i=1;i<=interferences.size();i++) {
	
	    if (getDegree(interferences, vertices.get(i) ) < min) {
	
	      min = getDegree(interferences, vertices.get(i) ); //This is the new minimum degree  
	    }
	  }
	  return min;
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
  * @param ArrayList<String> vertices, list of vertices
  * @param ArrayList<String> interferences, list of interferences
  * @return boolean exist, true if a vertex in vertices had a degree inferior to this.degree
  **/
  boolean existVerticeOk (ArrayList<String> vertices, ArrayList<String> interferences){
    boolean exist = false;
    int i=0;

    while ( (!exist) && (i<vertices.size()) ){
      if ( getDegree(interferences, vertices.get(i) ) <= this.degree ){
        exist = true;
      }
    }
    return exist;
  }


  /**
  * @param ArrayList<String> vertices, list of vertices
  * @param ArrayList<String> interferences, list of interferences
  * @return boolean, True if a vertex needs to be spilled, False else or if the graph is empty
  **/
  boolean needSpill (ArrayList<String> vertices, ArrayList<String> interferences) {
    return ( !(vertices.isEmpty()) && minDegree(vertices, interferences)>this.degree );
  }


  /**
  * @param ArrayList<String> interferences, list to modify
  * @param String vertex, vertex that we have to delete it interferences
  * @return boolean, if the vertex degree's is inferior to the degree k, return true, else false 
  **/
  boolean notDegreeInf(ArrayList<String> interferences, String vertex){
    return (getDegree(interferences, vertex) > this.degree);
  }


  /**
  * @param None, just use the intern InterfGraph
  * @return ArrayList<String> vertexToColor, the list of vertices to color
  **/
  ArrayList<String> toColor () {

    ArrayList<String> vertexToColor = new ArrayList<String>(); //List to return, with all the vertices to color, without them to spill
    ArrayList<String> interferences = this.interf; //Copy of the initial list of interferences 
    ArrayList<String> vertices = this.vertices; //Copy of the initial list of vertices

      while( !(vertices.isEmpty()) ){
        while( existVerticeOk(vertices, interferences) ){
          
          int i=0;
          
          while( notDegreeInf(interferences, vertices.get(i))){
            i++;
          }

          while( getDegree(interferences, vertices.get(i) ) < this.degree ){
            vertexToColor.add(vertices.get(i)); // Add the vertex to them to color 
            deleteInterf(interferences, vertices.get(i)); // Delete all the interferences who had a link with the vertex
            vertices.remove( getIndex(vertices, vertices.get(i)) ); // Delete the vertex of the list of vertices
            i++;
          }
        }

        if ( needSpill(vertices, interferences) ){
          String vertexToSpill = maxDegreeVertex(vertices, interferences);
          deleteInterf(interferences, vertexToSpill);
          vertices.remove( getIndex(vertices, vertexToSpill) ); // Delete the vertexToSpill of the list of vertices
        }
      }

      return vertexToColor;
  }

  /**
  * @param  ArrayList<String> vertexToColor, list for compare with the vertices list og the InterGraph
  * @return ArrayList<String> vertexToSpill, the list of vertices to spill
  **/
  ArrayList<String> toSpill (ArrayList<String> vertexToColor) {

    ArrayList<String> vertexToSpill = this.vertices; //List to return, with all the vertices to spill, initialize with a copy of the vertices

    for (int i=0; i<=this.vertices.size();i++) {
      for (int j=0; i<=vertexToColor.size();i++){
        if (vertexToSpill.get(i) == vertexToColor.get(j)){ // If the vertex is in the list of vertexToColor, delete it from vertexToDelete
          vertexToSpill.remove(i);
        }
      }
    }
    return vertexToSpill;
  }
  
  /**
   * @param None, just use the intern InterfGraph
   * @return ArrayList<String> colors, the list of colors
   **/
   ArrayList<String> getColors () {
	   ArrayList<String> listColors = new ArrayList<String>();
	   for(int i=0; i<= this.degree; i++){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Veuillez entrer le nom d'une couleur : ");
		   String name = sc.nextLine();
		   listColors.add(name);
	   }
	   return listColors;
   }  


     /**
      * @param ArrayList<String> coloredVertices, list of vertices and their related color
      * @param String vertex, vertex that we want to know if it's colored 
      * @return boolean found, true if a vertex is in colored vertices 
      **/
      boolean isColored (ArrayList<String> coloredVertices, String vertex){
        boolean found = false;
        int i=0;
        while(!(found) && (i < coloredVertices.size()) ){

          String [] splittedEdge = coloredVertices.get(i).split("-"); //Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]
    
          if (splittedEdge[0] == vertex) { //If the parameter vertex is in the edge then degree+1

              found=true;
            }

          i++;
        }

        return found;
      }
       

  
  /**
   * @param ArrayList<String> vertexToColor, list for compare with the vertices list og the InterGraph
   * @param ArrayList<String> vertexToSpill, the list of vertices to spill
   * @return ArrayList<String> result, the list of vertices with their colors (pattern : "vertex - color")
   **/
   ArrayList<String> color (ArrayList<String> vertexToColor, ArrayList<String> vertexToSpill, ArrayList<String> colors) {
	   
	   ArrayList<String> result = new ArrayList<String>();
	   
	   for(int i=0; i<= vertexToSpill.size(); i++){ //Initialize all the vertices to spill at NULL
		   result.add(vertexToSpill.get(i)+" - "+"spill");
	   }
	   
	   result.add(vertexToColor.get(0)+" - "+colors.get(0)); //Initialize the first vertex with the first color
	   
	   for(int j=1; j<= vertexToColor.size(); j++){
       if( !(isColored(result, vertexToColor.get(i))) ){

       } 
	   }
		return result;
   }



  
}
