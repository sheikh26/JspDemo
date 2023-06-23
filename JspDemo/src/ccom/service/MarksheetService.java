package ccom.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Vo.MarksheetVo;

public class MarksheetService {

	Connection conn;
	PreparedStatement ps;
public MarksheetService() throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
	
}
public void update( MarksheetVo vo) throws SQLException{
	 ps=conn.prepareStatement("update mark SET name=?,Chemistry=?,physics=?,Maths=? where rollno=?");
	 ps.setString(1,vo.getName());
	 ps.setInt(2, vo.getChemistry());
	 ps.setInt(3, vo.getPhysics());
	 ps.setInt(4, vo.getMaths());
	 ps.setString(5, vo.getRollNo());
	 ps.executeUpdate();
	 
	
	}
	
	

 public void add(MarksheetVo vo) throws Exception{
	 ps=conn.prepareStatement("insert into mark values(?,?,?,?,?)");
	 ps.setString(1, vo.getRollNo());
	 ps.setString(2,vo.getName());
	 ps.setInt(3, vo.getChemistry());
	 ps.setInt(4, vo.getPhysics());
	 ps.setInt(5, vo.getMaths());
	 
	 ps.executeUpdate();
 }
public void delete(MarksheetVo vo) throws Exception{
	ps=conn.prepareStatement("Delete from mark where Rollno=?");
	ps.setString(1, vo.getRollNo());
	ps.executeUpdate();
}
 
 public MarksheetVo get(MarksheetVo vo) throws Exception{
	 ps=conn.prepareStatement("Select * from mark where Rollno=?");
	 ps.setString(1, vo.getRollNo());
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
	vo.setRollNo(rs.getString(1));
	vo.setName(rs.getString(2));
	vo.setChemistry(rs.getInt(3));
	vo.setPhysics(rs.getInt(4));
	vo.setMaths(rs.getInt(5));
	
 }
	return vo;
 
 }
 public ArrayList getList() throws Exception{
	 
	 ps=conn.prepareStatement("Select* from mark ");
	 ArrayList list=new ArrayList();
	
	 ResultSet rs=ps.executeQuery();
	while(rs.next()){
	MarksheetVo vo=new MarksheetVo();
	vo.setRollNo(rs.getString(1));
	vo.setName(rs.getString(2));
	vo.setChemistry(rs.getInt(3));
	vo.setPhysics(rs.getInt(4));
	vo.setMaths(rs.getInt(5));
	list.add(vo);
 }
	return list;
 
 }
}
 