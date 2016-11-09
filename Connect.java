import java.sql.*;

	// Julio Barahona
	// Rafael Leon
	// Pablo Lopez
	// AED 2016
	// HDT 10

public class Connect {

    //Atributos
    private Connection con;
    private Statement stmt;
    private final String USER="neo4j";
    private final String PASSWORD= "Db9296cfd2";
    static final String  _URL = "jdbc:neo4j:bolt://localhost";

    //constructor
    public Connect(){
        try{
            con = DriverManager.getConnection(_URL, USER,PASSWORD);
            stmt = con.createStatement();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

    //Execute a query
    public newResultSet executeQuery(String query){
        newResultSet newResultado = null;
        try{
            newResultado = stmt.executeQuery(query);
        }catch(SQLException e){
            System.out.println("Error");
        }
        return newResultado;

    }
    //See in an specific table the newResults
    public newResultSet getQuery(String _query){
        Statement state = null;
        newResultSet newResultado = null;
        try{
            state = (Statement) con.createStatement();
            newResultado = state.executeQuery(_query);
        }
        catch(SQLException e)
        {
            e.printStackTrace();

        }
        return newResultado;
    }
    //History of queries
    public String History(newResultSet newResult){
        String stringArray ="";

        try {

            while(newResult.next()){
                stringArray += newResult.getString("n.name")+"\n";

            }
        }
        catch (SQLException e) {

            e.printStackTrace();
        }
        catch(NullPointerException  e1){

        }
        return stringArray;

    }
    public void insert(String node,String id){
        try {
            stmt.executeUpdate("CREATE ("+node+": User{name:'"+ id+"'})");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void relate(String name1, String name2,String peso){
        try {
            stmt.executeUpdate("MATCH (x:User {name:'" + name1 + "'})" +
                    "MATCH (y:User {name:'" + name2 + "'})" +
                    "MERGE (x)-[:CORREOS {length: '" + peso + "'}]->(y)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(){
        try {
            stmt.executeUpdate("MATCH (n) " +
                    "OPTIONAL MATCH (n)-[r]-()"+" delete n,r" );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void simplifying(){


    }
}