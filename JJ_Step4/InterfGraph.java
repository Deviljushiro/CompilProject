
import java.util.*;

/**INTERFERENCE'S GRAPH**/

public class InterfGraph {
  
  private ArrayList<String> vertices; //String list of each vertex name : ("a","b",...)
  private ArrayList<String> interf;   //List of interferences between vertices (pattern : "vertex1-vertex2")
  private ArrayList<String> pref;     //List of preferences between vertices (pattern : "vertex1-vertex2")
  private int degree; //The degree of the InternGraph to respect

  /**Constructor**/
  public InterfGraph (ArrayList<String> v, ArrayList<String> i, ArrayList<String> p, int k) {

  	this.vertices = v;
  	this.interf = i;
  	this.pref = p;
    this.degree = k;
  }

  
  /**
   * @param int index, where we want to take the value in the list
   * @return String, vertex in the list at the index cell
   **/
  public String getVertex (int index) {

  	return this.vertices.get(index);
  }

  /**
  * @param ArrayList<String> interferences, list of interferences for searching
  * @param String vertex : the vertex where we want to know its index
  * @return int, the index of the vertex in parameter
  **/
  public int getIndex(ArrayList<String> vertices, String vertex) {

    boolean flag = true;
    int i=0;

    while(flag && (i<vertices.size()) ){
      if (vertices.get(i).equals(vertex)){
        flag = false;
        i++;
      }
      else{
        i++;
      } 
    }
    return i-1;
  }

  /**
  * @param ArrayList<String> interferences, list of interferences for searching
  * @param String vertex : the vertex where we want to know its degree
  * @return int, the degree of the vertex in parameter (>= 0)
  **/
  public int getDegree (ArrayList<String> interferences, String vertex) {

	int degree = 0; //Initialize the degree value

  	for (int i=0;i<interferences.size();i++) {

		  String [] splittedEdge = interferences.get(i).split("-");	//Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]
		
  		if ((splittedEdge[0].equals(vertex))||(splittedEdge[1].equals(vertex))) {	//If the parameter vertex is in the edge then degree+1
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
  public String maxDegreeVertex (ArrayList<String> vertices, ArrayList<String> interferences) {
  
	  int max = 0; //Initialize the first degree's vertex as the max
	  String verticeMax = vertices.get(0); //Initialize the first vertex as the min degree's
	
	  for (int i=0; i<vertices.size();i++) {
	
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
  public int minDegree(ArrayList<String> vertices, ArrayList<String> interferences) {
  
	  int min = getDegree(interferences, vertices.get(0) ); //Initialize the first degree's vertex as the min
	
	  for (int i=1; i<vertices.size(); i++) {
      int testMin = getDegree(interferences, vertices.get(i));
	    if ( testMin < min) {
	      min = testMin; //This is the new minimum degree  
	    }
	  }
	  return min;
  }



  /**
  * @param ArrayList<String> interferences, list to modify
  * @param String vertex, vertex that we have to delete it interferences
  **/
  public ArrayList<String> deleteInterf (ArrayList<String> interferences, String vertex){

      ArrayList<String> inter = interferences;
      int i=0;
      while ( i<interferences.size() ) {

        String [] splittedEdge = interferences.get(i).split("-"); //Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]
    
        if ( (splittedEdge[0].equals(vertex)) || (splittedEdge[1].equals(vertex)) ) { //If the vertex is in the edge then remove this link of interferences
          interferences.remove(i);
        } 
        else{
          i++;
        }
      }   
      return interferences;
  }


  /**
  * @param ArrayList<String> vertices, list of vertices
  * @param ArrayList<String> interferences, list of interferences
  * @return boolean exist, true if a vertex in vertices had a degree inferior to this.degree
  **/
  public boolean existVerticeOk (ArrayList<String> vertices, ArrayList<String> interferences){
    boolean exist = false;
    int i=0;
    int deg = this.degree;

      while ( (!exist) && (i<vertices.size()) && !(vertices.isEmpty())){
        if ( getDegree(interferences, vertices.get(i) ) < deg ){
          exist = true;
        }
        i++;
      }
    return exist;
  }


  /**
  * @param ArrayList<String> vertices, list of vertices
  * @param ArrayList<String> interferences, list of interferences
  * @return boolean, True if a vertex needs to be spilled, False else or if the graph is empty
  **/
  public boolean needSpill (ArrayList<String> vertices, ArrayList<String> interferences) {

    boolean needSpill = false;
    if( (minDegree(vertices, interferences) >= this.degree) && !(vertices.isEmpty()) ) {
      needSpill=true;
    }
    return needSpill;
  }


  /**
  * @param ArrayList<String> interferences, list to modify
  * @param String vertex, vertex that we have to delete it interferences
  * @return boolean, if the vertex degree's is inferior to the degree k, return true, else false 
  **/
  public boolean notDegreeInf(ArrayList<String> interferences, String vertex){
    return (getDegree(interferences, vertex) > this.degree);
  }


  /**
  * @param None, just use the intern InterfGraph
  * @return ArrayList<String> vertexToColor, the list of vertices to color
  **/
  public ArrayList<String> toColor () {

    ArrayList<String> vertexToColor = new ArrayList<String>(); //List to return, with all the vertices to color, without them to spill
    ArrayList<String> interferences = new ArrayList<String>(); //Copy of the initial list of interferences 
    ArrayList<String> allVertices = new ArrayList<String>(); //Copy of the initial list of vertices
    
    for( int k = 0; k < this.vertices.size()  ; k++){
      allVertices.add(this.vertices.get(k));
    }

    for( int l = 0; l<this.interf.size(); l++){
      interferences.add(this.interf.get(l));
    }

    int deg = this.degree;
    
  
      while( !(allVertices.isEmpty()) ){
        int i=0;
        while( !(allVertices.isEmpty()) && existVerticeOk(allVertices, interferences) ){
          if( getDegree(interferences, allVertices.get(i) ) < deg ){

            vertexToColor.add(allVertices.get(i)); // Add the vertex to them to color 
            System.out.println("vertexToColor : " + vertexToColor) ;

            interferences=deleteInterf(interferences, allVertices.get(i)); // Delete all the interferences who had a link with the vertex
            System.out.println("interferences : " + interferences) ;

            int index = getIndex(allVertices, allVertices.get(i) );
            allVertices.remove( index ); // Delete the vertex of the list of vertices
            System.out.println("vertices : " + allVertices);
          }
          else{
            i++;
          }
          
        }

      if ( !(allVertices.isEmpty()) && needSpill(allVertices, interferences) ){
          String vertexToSpill = maxDegreeVertex(allVertices, interferences);
          interferences=deleteInterf(interferences, vertexToSpill);
          allVertices.remove( getIndex(allVertices, vertexToSpill) ); // Delete the vertexToSpill of the list of vertices
      }
    }
    return vertexToColor;
  }

  /**
  * @param  ArrayList<String> vertexToColor, list for compare with the vertices list og the InterGraph
  * @return ArrayList<String> vertexToSpill, the list of vertices to spill
  **/
  public ArrayList<String> toSpill (ArrayList<String> vertexToColor, ArrayList<String> allVertices) {


    ArrayList<String> vertexToSpill = allVertices; //List to return, with all the vertices to spill, initialize with a copy of the vertices
    ArrayList<String> comparateur = allVertices;
    System.out.println("allVertices" + vertexToSpill);

  System.out.println("compare" + comparateur);
    
    /*int k = 0;

    for(int i=0; i<comparateur.size(); i++){
      for(int j=0; j<vertexToColor.size(); j++){
        if (comparateur.get(i).equals( vertexToColor.get(j) ) ){
          vertexToSpill.remove(k);
        }
        else{
          k++;
        }
      }
    }*/


    int i=0;
    while (i < vertexToSpill.size() ) {
      String vts = vertexToSpill.get(i);

      int j=0;
      boolean flag = false;
      while ( !(flag) && (j<vertexToColor.size())){

        String vertex = vertexToColor.get(j);

        if (vts.equals(vertex) ){ // If the vertex is in the list of vertexToColor, delete it from vertexToDelete
          vertexToSpill.remove(i);
          flag = true;
        }
        else{
          j++;
        }

      }
      i++;
    }
    System.out.println("vertexToSpill : " + vertexToSpill);
    return vertexToSpill;
  }
  
  /**
   * @param String vertex, vertex
   * @param ArrayList<String> coloredVertices, list
   * @return String color, the color of this vertex
   **/
   public String getColor (ArrayList<String> coloredVertices, String vertex) {
	   
      boolean found = false;
      int i=0;
      String color = "";

      while(!(found) && (i < coloredVertices.size()) ){

        String [] splittedEdge = coloredVertices.get(i).split("-"); //Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]
      
        if (splittedEdge[0].equals(vertex)) { 

          found=true;
          color = splittedEdge[1];
        }
      }  
      return color;
   }  


 /**
  * @param ArrayList<String> coloredVertices, list of vertices and their related color
  * @param String vertex, vertex that we want to know if it's colored 
  * @return boolean found, true if a vertex is in colored vertices 
  **/
  public boolean isColored (ArrayList<String> coloredVertices, String vertex){
    boolean found = false;
    int i=0;
    while(!(found) && (i < coloredVertices.size()) ){

      String [] splittedEdge = coloredVertices.get(i).split("-"); //Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]

      if (splittedEdge[0].equals(vertex)) { //If the parameter vertex is in the edge then degree+1

          found=true;
        }

      i++;
    }

    return found;
  }


   /**
   * @param String vertex, vertex 
   * @return ArrayList<String> interferencesVertex, the list of vertices with their colors (pattern : "vertex - color")
   **/
   public ArrayList<String> interferencesVertex (String vertex) {

    ArrayList<String> interferencesVertex = new ArrayList<String>();

    for (int i=0;i<this.interf.size();i++) {

      String [] splittedEdge = this.interf.get(i).split("-"); //Split the "vertex1-vertex2" in splittedEdge[vertex1,vertex2]
      
      if (splittedEdge[0].equals(vertex)) { 

        interferencesVertex.add(splittedEdge[1]);
      }  
      else if (splittedEdge[1].equals(vertex)) { 

        interferencesVertex.add(splittedEdge[0]);
      }  
    }
    return interferencesVertex; 
  }  
      

  
  /**
   * @param ArrayList<String> vertexToColor, list for compare with the vertices list og the InterGraph
   * @param ArrayList<String> vertexToSpill, the list of vertices to spill
   * @return ArrayList<String> result, the list of vertices with their colors (pattern : "vertex - color")
   **/
   public ArrayList<String> color (ArrayList<String> vertexToColor, ArrayList<String> vertexToSpill, ArrayList<String> colors) {
	   
	   ArrayList<String> result = new ArrayList<String>();

	   
	   for(int i=0; i< vertexToSpill.size(); i++){ //Initialize all the vertices to spill at NULL
		   result.add(vertexToSpill.get(i)+" - "+"spill");
	   }
	   
	 
	   for(int j=0; j< vertexToColor.size(); j++){ //Loop in the colored vertices

      ArrayList<String> colorToUse = colors; //Copy list of colors

      ArrayList<String> interferences = interferencesVertex(vertexToColor.get(j));
      
      for(int k=0; k<interferences.size(); k++){//Loop in the interferences of this vertex

          if (!(isColored(result, interferences.get(k)))) {

            colorToUse.remove(getColor(result, interferences.get(k)));
          }
      }
      result.add(vertexToColor.get(j) + " - " + colorToUse.get(0));
       
	   }
		return result;
   }


  public static void main(String[] args){

     ArrayList<String> v1 = new ArrayList<String>();
     ArrayList<String> i1 = new ArrayList<String>();
     ArrayList<String> p1 = new ArrayList<String>();
     ArrayList<String> c1 = new ArrayList<String>();

     v1.add("u");
     v1.add("v");
     v1.add("x");
     v1.add("y");
     v1.add("z");
     v1.add("w");
     v1.add("p");

     i1.add("u-x");
     i1.add("u-v");
     i1.add("v-x");
     i1.add("v-y");
     i1.add("v-z");
     i1.add("v-w");
     i1.add("x-y");
     i1.add("z-p");
     i1.add("y-z");
     
     c1.add("bleu");
     c1.add("jaune");

     InterfGraph g1 = new InterfGraph ( v1, i1, p1, 3);
     System.out.println("main1 : " + v1 );
     ArrayList<String> vc1 = g1.toColor();
     System.out.println("main2 : " + v1 );
     ArrayList<String> vs1 = g1.toSpill(vc1, v1);
     ArrayList<String> result = g1.color(vc1,vs1,c1);
     System.out.println(result);
   }



  
}
