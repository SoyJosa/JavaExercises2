package One;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CRUD {
	
	Connection cn;
	
	public CRUD() throws ClassNotFoundException, SQLException {
		this.cn = MySQL.connector();
	}
	
	List<Agency> findAll() throws SQLException{
		
		List<Agency> agencies = new ArrayList<>();
		
		PreparedStatement pst = cn.prepareStatement("SELECT * FROM Agency");
		pst.execute();
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
        	agencies.add(new Agency(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
        }
        
		return agencies;
	}
	
	Agency createAgency(String agName, int agZipCode, String email) throws SQLException {
		PreparedStatement pst = cn.prepareStatement("INSERT INTO Agency(agName,agZipCode,email) VALUES(?, ?, ?);");
		pst.setString(1, agName);
		pst.setInt(2, agZipCode);
		pst.setString(3, email);
		
        int rs = pst.executeUpdate();
		
        if(rs == 1) {
        	return new Agency(4, agName, agZipCode, email);
        }else {
        	return null;
        }
 	
	}
	
	Agency update(int idAgency, String agName, int agZipCode, String email) throws SQLException {
		PreparedStatement pst = cn.prepareStatement("UPDATE bnb.agency SET agName= ?, agZipCode=?, email=? WHERE idAgency = ?;");
		pst.setString(1, agName);
		pst.setInt(2, agZipCode);
		pst.setString(3, email);
		pst.setInt(4, idAgency);
		
        int rs = pst.executeUpdate();
		
        if(rs == 1) {
        	return new Agency(idAgency, agName, agZipCode, email);
        }else {
        	return null;
        }
		
	}
	
	void deletePerson(int idAgency) throws SQLException {
		
        Statement stmt = cn.createStatement();

        String delete = " DELETE FROM bnb.agency WHERE idAgency = "+idAgency+"; ";

        int result = stmt.executeUpdate(delete);
        
        System.out.println(result);
        
    }
	
	
}
