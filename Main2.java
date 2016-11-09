import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

	// Julio Barahona
	// Rafael Leon
	// Pablo Lopez
	// AED 2016
	// HDT 10

public class Main {
    public static void main (String [] args){
        try {
            Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost", "neo4j", "Db9296cfd2");
            try (Statement stmt = con.createStatement()) {
                ResultSet rs = stmt.executeQuery("MATCH (n:User) RETURN n.name");
                while (rs.next()) {
                    System.out.println(rs.getString("n.name"));
                }
            }

            Graph graph = new SingleGraph("Pruebas");
            Node[] nodos = new Node [14];
            String[] names = {"Alpha", "Bravo", "Charlie", "Delta", "Echoe", "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima", "Mike", "November"};

            for(int i = 0; i < 14; i++){
                graph.addNode(names[i]);
            }


            graph.display(true);

            con.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
