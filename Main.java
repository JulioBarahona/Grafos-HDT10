import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import java.io.File;

	// Julio Barahona
	// Rafael Leon
	// Pablo Lopez
	// AED 2016
	// HDT 10

public class Main {
	//Inicio main method
	
	/* 
	Data base is created and fills the info in csv
	*/
	public enum NodeType implements Label{
		UserNode;
	}
	public enum RelationType implements RelationshipType{
		Mails;
	}
	
	public static void main(String[] args) {
		//File path changes according to each computer and the neo4j installation file directory 
		 File PATH = new File("C:\\UserNodes\\cesar\\Documents\\Neo4j\\HDT10");
		 /*
		Creates a new database and its proper route 
		 */		 
		 GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
		 GraphDatabaseService dbService = dbFactory.newEmbeddedDatabase(PATH);
		 /* Makes a try for the DB conection*/
		 try (Transaction tx = dbService.beginTx()){
						/*=============================*/
						/*   New UserNode generation   */
						/*=============================*/
			 //   Genertaes and the sets (ID & Name) for UserNode_1   //
			 Node UserNode_1 = dbService.createNode(NodeType.UserNode);
			//	  Genertaes and the sets (ID & Name) for UserNode_2   //
			 Node UserNode_2 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_3   //
			 Node UserNode_3 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_4   //
			 Node UserNode_4 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_5   //
			 Node UserNode_5 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_6   //
			 Node UserNode_6 = dbService.createNode(NodeType.UserNode);			
			 //   Genertaes and the sets (ID & Name) for UserNode_7   //
			 Node UserNode_7 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_8  //
			 Node UserNode_8 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_9   //
			 Node UserNode_9 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_10   //
			 Node UserNode_10 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_11   //
			 Node UserNode_11 = dbService.createNode(NodeType.UserNode);			
			//   Genertaes and the sets (ID & Name) for UserNode_12   //
			 Node UserNode_12 = dbService.createNode(NodeType.UserNode);
			//   Genertaes and the sets (ID & Name) for UserNode_13   //
			 Node UserNode_13 = dbService.createNode(NodeType.UserNode);			
			//   Genertaes and the sets (ID & Name) for UserNode_14   //
			 Node UserNode_14 = dbService.createNode(NodeType.UserNode);
			 
						/*============================*/
						/*   UserNode ID generation   */
						/*============================*/		
			 // Sets info on UserNode_1
			 UserNode_1.setProperty("Nombre", "UserNode 1");
			 UserNode_1.setProperty("ID", 1);
			// Sets info on UserNode_2
			 UserNode_2.setProperty("Nombre", "UserNode 2");
			 UserNode_2.setProperty("ID", 2);
			 // Sets info on UserNode_3
			 UserNode_3.setProperty("Nombre", "UserNode 3");
			 UserNode_3.setProperty("ID", 3);
			 // Sets info on UserNode_4
			 UserNode_4.setProperty("Nombre", "UserNode 4");
			 UserNode_4.setProperty("ID", 4);
			 // Sets info on UserNode_5
			 UserNode_5.setProperty("Nombre", "UserNode 5");
			 UserNode_5.setProperty("ID", 5);
			 // Sets info on UserNode_6
			 UserNode_6.setProperty("Nombre", "UserNode 6");
			 UserNode_6.setProperty("ID", 6);
			 // Sets info on UserNode_7
			 UserNode_7.setProperty("Nombre", "UserNode 7");
			 UserNode_7.setProperty("ID", 7);
			 // Sets info on UserNode_8
			 UserNode_8.setProperty("Nombre", "UserNode 8");
			 UserNode_8.setProperty("ID", 8);
			 // Sets info on UserNode_9
			 UserNode_9.setProperty("Nombre", "UserNode 9");
			 UserNode_9.setProperty("ID", 9);
			 // Sets info on UserNode_10
			 UserNode_10.setProperty("Nombre", "UserNode 10");
			 UserNode_10.setProperty("ID", 10);
			 // Sets info on UserNode_11
			 UserNode_11.setProperty("Nombre", "UserNode 11");
			 UserNode_11.setProperty("ID", 11);
			 // Sets info on UserNode_12
			 UserNode_12.setProperty("Nombre", "UserNode 12");
			 UserNode_12.setProperty("ID", 12);
			 // Sets info on UserNode_13
			 UserNode_13.setProperty("Nombre", "UserNode 13");
			 UserNode_13.setProperty("ID", 13);
			 // Sets info on UserNode_14
			 UserNode_14.setProperty("Nombre", "UserNode 14");
			 UserNode_14.setProperty("ID", 14);
			 
			 			/*================================*/
						/*   Emails sent betweent users   */
						/*================================*/
			/*   UserNode_1 to...   */
			//   UserNode_2   //
			 Relationship P1_to_P2 = UserNode_1.createRelationshipTo(UserNode_2, RelationType.Mails);
			 P1_to_P2.setProperty("Mails Sent", 3);
			//   UserNode_3   //
			 Relationship P1_to_P3 = UserNode_1.createRelationshipTo(UserNode_3, RelationType.Mails);
			 P1_to_P3.setProperty("Mails Sent", 2);
			//   UserNode_9   //
			 Relationship P1_to_P9 = UserNode_1.createRelationshipTo(UserNode_9, RelationType.Mails);
			 P1_to_P9.setProperty("Mails Sent", 6);
			//   UserNode_14   //
			 Relationship P1_to_P14 = UserNode_1.createRelationshipTo(UserNode_14, RelationType.Mails);
			 P1_to_P14.setProperty("Mails Sent", 1);
			 //=======================================================================================//
			 /*   UserNode_2 to...   */
			 //   UserNode_1   //
			 Relationship P2_to_P1 = UserNode_2.createRelationshipTo(UserNode_1, RelationType.Mails);
			 P2_to_P1.setProperty("Mails Sent", 5);				
			 //   UserNode_3   //
			 Relationship P2_to_P3 = UserNode_2.createRelationshipTo(UserNode_3, RelationType.Mails);
			 P2_to_P3.setProperty("Mails Sent", 8);
			 //   UserNode_4   //
			 Relationship P2_to_P4 = UserNode_2.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P2_to_P4.setProperty("Mails Sent", 2);
			 //   UserNode_12   //
			 Relationship P2_to_P12 = UserNode_2.createRelationshipTo(UserNode_12, RelationType.Mails);
			 P2_to_P12.setProperty("Mails Sent", 1);
			//=======================================================================================//
			/*   UserNode_3 to...   */
			 //   UserNode_1   //
			 Relationship P3_to_P1 = UserNode_3.createRelationshipTo(UserNode_1, RelationType.Mails);
			 P3_to_P1.setProperty("Mails Sent", 5);
			 //   UserNode_4   //
			 Relationship P3_to_P4 = UserNode_3.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P3_to_P4.setProperty("Mails Sent", 2);
			 //=======================================================================================//
			/*   UserNode_4 to...   */
			 //   UserNode_5   //
			 Relationship P4_to_P5 = UserNode_4.createRelationshipTo(UserNode_5, RelationType.Mails);
			 P4_to_P5.setProperty("Mails Sent", 5);
			 //   UserNode_6   //
			 Relationship P4_to_P6 = UserNode_4.createRelationshipTo(UserNode_6, RelationType.Mails);
			 P4_to_P6.setProperty("Mails Sent", 7);
			 //   UserNode_11   //
			 Relationship P4_to_P11 = UserNode_4.createRelationshipTo(UserNode_11, RelationType.Mails);
			 P4_to_P11.setProperty("Mails Sent", 2);
			 //   UserNode_13   //
			 Relationship P4_to_P13 = UserNode_4.createRelationshipTo(UserNode_13, RelationType.Mails);
			 P4_to_P13.setProperty("Mails Sent", 3);
			 //   UserNode_14   //
			 Relationship P4_to_P14 = UserNode_4.createRelationshipTo(UserNode_14, RelationType.Mails);
			 P4_to_P14.setProperty("Mails Sent", 7);
			 //=======================================================================================//
			 /*   UserNode_5 to...   */
			 //   UserNode_4   //
			 Relationship P5_to_P4 = UserNode_5.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P5_to_P4.setProperty("Mails Sent", 2);
			 //   UserNode_6   //
			 Relationship P5_to_P6 = UserNode_5.createRelationshipTo(UserNode_6, RelationType.Mails);
			 P5_to_P6.setProperty("Mails Sent", 6);
			 //   UserNode_11   //
			 Relationship P5_to_P11 = UserNode_5.createRelationshipTo(UserNode_11, RelationType.Mails);
			 P5_to_P11.setProperty("Mails Sent", 4);
			 //   UserNode_12   //
			 Relationship P5_to_P12 = UserNode_5.createRelationshipTo(UserNode_12, RelationType.Mails);
			 P5_to_P12.setProperty("Mails Sent", 3);
			 //   UserNode_13   //
			 Relationship P5_to_P13 = UserNode_5.createRelationshipTo(UserNode_13, RelationType.Mails);
			 P5_to_P13.setProperty("Mails Sent", 7);
			 //   UserNode_14   //
			 Relationship P5_to_P14 = UserNode_5.createRelationshipTo(UserNode_14, RelationType.Mails);
			 P5_to_P14.setProperty("Mails Sent", 9);
			 //=======================================================================================//
			 /*   UserNode_6 to...   */
			 //   UserNode_4   //
			 Relationship P6_to_P4 = UserNode_6.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P6_to_P4.setProperty("Mails Sent", 6);
			 //   UserNode_5   //
			 Relationship P6_to_P5 = UserNode_6.createRelationshipTo(UserNode_5, RelationType.Mails);
			 P6_to_P5.setProperty("Mails Sent", 2);
			 //   UserNode_12   //
			 Relationship P6_to_P12 = UserNode_6.createRelationshipTo(UserNode_12, RelationType.Mails);
			 P6_to_P12.setProperty("Mails Sent", 7);
			 //   UserNode_13   //
			 Relationship P6_to_P13 = UserNode_6.createRelationshipTo(UserNode_13, RelationType.Mails);
			 P6_to_P13.setProperty("Mails Sent", 7);
			 //=======================================================================================//
			 /*   UserNode_7 to...   */
			 //   UserNode_8   //
			 Relationship P7_to_P8 = UserNode_7.createRelationshipTo(UserNode_8, RelationType.Mails);
			 P7_to_P8.setProperty("Mails Sent", 12);
			 //   UserNode_9   //
			 Relationship P7_to_P9 = UserNode_7.createRelationshipTo(UserNode_9, RelationType.Mails);
			 P7_to_P9.setProperty("Mails Sent", 13);
			 //   UserNode_11   //
			 Relationship P7_to_P11 = UserNode_7.createRelationshipTo(UserNode_11, RelationType.Mails);
			 P7_to_P11.setProperty("Mails Sent", 1);
			 //=======================================================================================//
			 /*   UserNode_8 to...   */
			 //   UserNode_6   //
			 Relationship P8_to_P6 = UserNode_8.createRelationshipTo(UserNode_6, RelationType.Mails);
			 P8_to_P6.setProperty("Mails Sent", 3);
			 //   UserNode_7   //
			 Relationship P8_to_P7 = UserNode_8.createRelationshipTo(UserNode_7, RelationType.Mails);
			 P8_to_P7.setProperty("Mails Sent", 14);
			 //   UserNode_9   //
			 Relationship P8_to_P9 = UserNode_8.createRelationshipTo(UserNode_9, RelationType.Mails);
			 P8_to_P9.setProperty("Mails Sent", 21);
			 //   UserNode_10   //
			 Relationship P8_to_P10 = UserNode_8.createRelationshipTo(UserNode_10, RelationType.Mails);
			 P8_to_P10.setProperty("Mails Sent", 2);
			 //=======================================================================================//
			 /*   UserNode_9 to...   */
			 //   UserNode_5   //
			 Relationship P9_to_P5 = UserNode_9.createRelationshipTo(UserNode_5, RelationType.Mails);
			 P9_to_P5.setProperty("Mails Sent", 4);
			 //   UserNode_7   //
			 Relationship P9_to_P7 = UserNode_9.createRelationshipTo(UserNode_7, RelationType.Mails);
			 P9_to_P7.setProperty("Mails Sent", 12);
			 //   UserNode_8   //
			 Relationship P9_to_P8 = UserNode_9.createRelationshipTo(UserNode_8, RelationType.Mails);
			 P9_to_P8.setProperty("Mails Sent", 23);
			 //=======================================================================================//
			 /*   UserNode_10 to...   */
			 //   UserNode_4   //
			 Relationship P10_to_P4 = UserNode_10.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P10_to_P4.setProperty("Mails Sent", 9);
			 //   UserNode_5   //
			 Relationship P10_to_P5 = UserNode_10.createRelationshipTo(UserNode_5, RelationType.Mails);
			 P10_to_P5.setProperty("Mails Sent", 7);
			 //   UserNode_6   //
			 Relationship P10_to_P6 = UserNode_10.createRelationshipTo(UserNode_6, RelationType.Mails);
			 P10_to_P6.setProperty("Mails Sent", 1);
			 //   UserNode_7   //
			 Relationship P10_to_P7 = UserNode_10.createRelationshipTo(UserNode_7, RelationType.Mails);
			 P10_to_P7.setProperty("Mails Sent", 1);
			 //   UserNode_11   //
			 Relationship P10_to_P11 = UserNode_10.createRelationshipTo(UserNode_11, RelationType.Mails);
			 P10_to_P11.setProperty("Mails Sent", 5);
			 //   UserNode_12   //
			 Relationship P10_to_P12 = UserNode_10.createRelationshipTo(UserNode_12, RelationType.Mails);
			 P10_to_P12.setProperty("Mails Sent", 4);
			 //   UserNode_13   //
			 Relationship P10_to_P13 = UserNode_10.createRelationshipTo(UserNode_13, RelationType.Mails);
			 P10_to_P13.setProperty("Mails Sent", 8);
			 //   UserNode_14   //
			 Relationship P10_to_P14 = UserNode_10.createRelationshipTo(UserNode_14, RelationType.Mails);
			 P10_to_P14.setProperty("Mails Sent", 7);
			 //=======================================================================================//
			 /*   UserNode_11 to...   */
			 //UserNode_4
			 Relationship P11_to_P4 = UserNode_11.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P11_to_P4.setProperty("Mails Sent", 4);
			 //UserNode_6
			 Relationship P11_to_P6 = UserNode_11.createRelationshipTo(UserNode_6, RelationType.Mails);
			 P11_to_P6.setProperty("Mails Sent", 1);
			 //UserNode_10
			 Relationship P11_to_P10 = UserNode_11.createRelationshipTo(UserNode_10, RelationType.Mails);
			 P11_to_P10.setProperty("Mails Sent", 1);
			 //UserNode_13
			 Relationship P11_to_P13 = UserNode_11.createRelationshipTo(UserNode_13, RelationType.Mails);
			 P11_to_P13.setProperty("Mails Sent", 9);
			 //UserNode_14
			 Relationship P11_to_P14 = UserNode_11.createRelationshipTo(UserNode_14, RelationType.Mails);
			 P11_to_P14.setProperty("Mails Sent", 1);
			 //=======================================================================================//
			 /*   UserNode_12 to...   */
			 //UserNode_4
			 Relationship P12_to_P4 = UserNode_12.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P12_to_P4.setProperty("Mails Sent", 4);
			 //UserNode_5
			 Relationship P12_to_P5 = UserNode_12.createRelationshipTo(UserNode_5, RelationType.Mails);
			 P12_to_P5.setProperty("Mails Sent", 4);
			 //UserNode_6
			 Relationship P12_to_P6 = UserNode_12.createRelationshipTo(UserNode_6, RelationType.Mails);
			 P12_to_P6.setProperty("Mails Sent", 9);
			 //UserNode_10
			 Relationship P12_to_P10 = UserNode_12.createRelationshipTo(UserNode_10, RelationType.Mails);
			 P12_to_P10.setProperty("Mails Sent", 2);
			 //UserNode_11
			 Relationship P12_to_P11 = UserNode_12.createRelationshipTo(UserNode_11, RelationType.Mails);
			 P12_to_P11.setProperty("Mails Sent", 4);
			 //UserNode_13
			 Relationship P12_to_P13 = UserNode_12.createRelationshipTo(UserNode_13, RelationType.Mails);
			 P12_to_P13.setProperty("Mails Sent", 8);
			 //UserNode_14
			 Relationship P12_to_P14 = UserNode_12.createRelationshipTo(UserNode_14, RelationType.Mails);
			 P12_to_P14.setProperty("Mails Sent", 9);
			 //=======================================================================================//
			 /*   UserNode_13 to...   */
			 //   UserNode_4   //
			 Relationship P13_to_P4 = UserNode_13.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P13_to_P4.setProperty("Mails Sent", 1);
			 //   UserNode_5   //
			 Relationship P13_to_P5 = UserNode_13.createRelationshipTo(UserNode_5, RelationType.Mails);
			 P13_to_P5.setProperty("Mails Sent", 3);
			 //   UserNode_10   //
			 Relationship P13_to_P10 = UserNode_13.createRelationshipTo(UserNode_10, RelationType.Mails);
			 P13_to_P10.setProperty("Mails Sent", 2);
			 //   UserNode_11   //
			 Relationship P13_to_P11 = UserNode_13.createRelationshipTo(UserNode_11, RelationType.Mails);
			 P13_to_P11.setProperty("Mails Sent", 3);
			 //   UserNode_12   //
			 Relationship P13_to_P12 = UserNode_13.createRelationshipTo(UserNode_12, RelationType.Mails);
			 P13_to_P12.setProperty("Mails Sent", 2);		
			 //=======================================================================================//
			 /*   UserNode_14 to...   */
			 //   UserNode_4   //
			 Relationship P14_to_P4 = UserNode_14.createRelationshipTo(UserNode_4, RelationType.Mails);
			 P14_to_P4.setProperty("Mails Sent", 7);
			 //   UserNode_10   //
			 Relationship P14_to_P10 = UserNode_14.createRelationshipTo(UserNode_10, RelationType.Mails);
			 P14_to_P10.setProperty("Mails Sent", 6);
			 //   UserNode_11   //
			 Relationship P14_to_P11 = UserNode_14.createRelationshipTo(UserNode_11, RelationType.Mails);
			 P14_to_P11.setProperty("Mails Sent", 8);
			 //   UserNode_12   //
			 Relationship P14_to_P12 = UserNode_14.createRelationshipTo(UserNode_12, RelationType.Mails);
			 P14_to_P12.setProperty("Mails Sent", 3);
			 tx.success();
		 }
		 catch (Exception ex){
                    System.out.println("Error: Database connection failed");
                }
		 /*
		 Closes the database service 
		 */
		 dbService.shutdown();
	 }
}