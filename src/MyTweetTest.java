import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;


public class MyTweetTest {
	public final static int LISTENING_PORT = 3333;
	private final static String DB_URL = "jdbc:mysql://localhost:3306/mytweetdb";
	private final static String DB_USER = "root";
	private final static String DB_PASS = "pr0fes0ra";
	 
	public static void main(String[] args) throws IOException, SQLException {
		    
		    ServerSocket serverSocket = 
	                new ServerSocket(LISTENING_PORT);
	        System.out.println("Server started.");
	        
	        while (true) { 
	            Socket socket = serverSocket.accept(); 
	            MainThread mainThread = 
	                new MainThread(socket); 
	            mainThread.start();    
	        }	             
	 }
}
