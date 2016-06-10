
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

    while(flag && (i<vertices.size()) ){	//If it's not found or if this the list's end

      if (vertices.get(i).equals(vertex)){

        flag = false;
        i++;
      }
      else{

        i++;
      } 
    }
    return i-1;	//Return the index
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

      while ( (!exist) && (i<vertices.size()) && !(vertices.isEmpty())){	//If it's not empty or not in the list's end or if we didnt already find something

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

    if( (minDegree(vertices, interferences) >= this.degree) && !(vertices.isEmpty()) ) {	//If the minimum degree of the actual graphe is superior to the number of colors

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
    

    for( int k = 0; k < this.vertices.size()  ; k++){	//CLONE ALL THE VERTICES 
      allVertices.add(this.vertices.get(k));
    }

    for( int l = 0; l<this.interf.size(); l++){		//CLONE ALL THE INTERFERENCES
      interferences.add(this.interf.get(l));
    }

    int deg = this.degree;	//CLONE THE NUMBER OF COLORS
    
  
      while( !(allVertices.isEmpty()) ){

        int i=0;

        while( !(allVertices.isEmpty()) && existVerticeOk(allVertices, interferences) && i<allVertices.size()){

          if( getDegree(interferences, allVertices.get(i) ) < deg ){

            vertexToColor.add(allVertices.get(i)); // Add the vertex to them to color 

            interferences=deleteInterf(interferences, allVertices.get(i)); // Delete all the interferences who had a link with the vertex

            int index = getIndex(allVertices, allVertices.get(i) );
            allVertices.remove( index ); // Delete the vertex of the list of vertices
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

  	ArrayList<String> vertexToSpill = new ArrayList<String>();	//Initialize the result


    for (int i=0;i<allVertices.size();i++) {	//If the vertex is not in the "to be colored" vertices, then add it to the "to be spilled" vertices

    	if (!(vertexToColor.contains(allVertices.get(i)))) {

    		vertexToSpill.add(allVertices.get(i));
    	}
    }
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

        if (splittedEdge[0].equals(vertex)) { 	//If the left part (the vertex) is the right one

          found=true;
          color = splittedEdge[1];	//Add the right part (the color) the result
        }

        else {
        	i++;
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

      if ((splittedEdge[0].equals(vertex))&&(!(splittedEdge[1]).equals("spill"))) { //If the parameter vertex is in the edge then degree+1

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
      
      if (splittedEdge[0].equals(vertex)) { 	//If the left part of the interference is the vertex

        interferencesVertex.add(splittedEdge[1]);	//Then Add the other to the list
      }  
      else if (splittedEdge[1].equals(vertex)) { 	//If the right part of the interference is the vertex

        interferencesVertex.add(splittedEdge[0]);	//Then Add the other to the list
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

	   
	   for(int i=0; i< vertexToSpill.size(); i++){ //Initialize all the vertices to spill at "spill" color

		   result.add(vertexToSpill.get(i)+"-"+"spill");
	   }
	   
	
	   for(int j=0; j< vertexToColor.size(); j++){ //Loop in the colored vertices

	      ArrayList<String> colorToUse = new ArrayList<String>(); 

	      for( int c = 0; c < colors.size()  ; c++){	//CLONE THE COLOR'S LIST

	      	colorToUse.add(colors.get(c));
	      }



	      ArrayList<String> interferences = interferencesVertex(vertexToColor.get(j));	//Create a list with all the vertex's interferences
	      
	      for(int k=0; k<interferences.size(); k++){//Loop in the interferences of this vertex

	          if (isColored(result, interferences.get(k))) {

	            colorToUse.remove(getColor(result, interferences.get(k)));
	          }
          }

	      boolean colorfound = false;	//Basic flag boolean
	      int colorIndex = 0;	//Initialize the value of the loop's index

	      while (!(colorfound)) {	//Take the first color in the cloned list to color the vertex

		      if (colorToUse.get(colorIndex)!= null){	

		      	colorfound = true;
		      }

		      else {
		      	colorIndex++;
		      }

	  	  }
	       
	  	  result.add(vertexToColor.get(j)+"-"+colorToUse.get(colorIndex));	//Color the vertex

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
     i1.add("w-z");
     
     c1.add("bleu");
     c1.add("jaune");

     InterfGraph g1 = new InterfGraph ( v1, i1, p1, c1.size());

     ArrayList<String> vc1 = g1.toColor();	//Create the "to be colored" list
     ArrayList<String> vs1 = g1.toSpill(vc1, v1);	//Create the "to be spilled" list
     ArrayList<String> result = g1.color(vc1,vs1,c1);	//Color the graph
     System.out.println("COLORED GRAPH :");
     System.out.println(result);
   }



  
}
