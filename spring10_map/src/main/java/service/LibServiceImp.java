package service;

import java.util.HashMap;
import java.util.List;

import dao.LibDAO;
import dto.LibmapDTO;

public class LibServiceImp implements LibService {

private LibDAO dao;

public LibServiceImp() {
	
}

public void setDao(LibDAO dao) {
	this.dao = dao;
}
@Override
public List<LibmapDTO> f_listProcess(int pageNO, int pageSize, String keyword){
	HashMap<String, Object> map = new HashMap<String, Object>();
	map.put("startpage", (pageNO - 1) * pageSize + 1);
	map.put("endpage", pageNO * pageSize);
	map.put("keyword", keyword);
	return dao.lib_list(map);
}

@Override
public int f_countAllProcess(String data) {
return dao.lib_countAll(data);	

}
}
