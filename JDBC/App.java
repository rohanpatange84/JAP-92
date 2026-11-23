import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App{

	public static void main(String args[]) {

		int id = 80;
		String name = "Vishal";
		double mark = 78;

		System.out.println("Hello");

		try{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92","root","7666");

		String quary = "insert into student(id,name,marks) values(?,?,?);";

		PreparedStatement ps = con.prepareStatement(quary);

		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setDouble(3,mark);

		int  rowCount = ps.executeUpdate();

		if(rowCount > 0){
			System.out.println("Data add Sucess...");
		} 
	}catch(Exception e){
		System.out.println("While Adding----> "+e);

	}

	}
}