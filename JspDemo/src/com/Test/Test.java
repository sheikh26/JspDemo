package com.Test;

import java.util.ArrayList;
import java.util.Iterator;

import ccom.service.MarksheetService;

import com.Vo.MarksheetVo;

public class Test {
public static void main(String[] args) throws Exception {
	MarksheetVo vo= new MarksheetVo();
	vo.setRollNo("101");
	//vo.setName("paramesh");
	//vo.setChemistry(25);
	//vo.setPhysics(90);
	//vo.setMaths(77);

	MarksheetService service=new MarksheetService();
	//service.add(vo);
	//service.update(vo);
	//service.delete(vo);
	ArrayList list =service.getList();
	Iterator it=list.iterator();
while(it.hasNext()){
	 vo=(MarksheetVo) it.next();
	System.out.print("\t"+vo.getRollNo());
System.out.print("\t"+vo.getName());
System.out.print("\t"+vo.getPhysics());
System.out.print("\t"+vo.getChemistry());
System.out.println("\t"+vo.getMaths());
}
}
}
