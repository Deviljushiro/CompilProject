
/**INTERFERENCE'S GRAPH**/

public class InterfGraph {
  
  private ArrayList<String> vertices; //Vertices list (string names)
  private ArrayList<String> interf;   //List of interferences between vertices (pattern : "vertex-vertex")
  private ArrayList<String> pref;     //List of preferences between vertices (pattern : "vertex-vertex")
  
  /**Constructor**/
  public InterfGraph (ArrayList<Integer> v, ArrayList<String> i, ArrayList<String> p) {
    this.vertices = v;
    this.interf = i;
    this.pref = p;
  }
  
  /**
   * @param int index, where we want to take the value in the list
   * @return String value in the list at the index cell
   **/
  public String getVertex (int index) {
    return this.vertices.get(index);
  }
  
}
