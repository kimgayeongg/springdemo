package part02;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import dao.MemDAO;
import model.MemDTO;

public class ServiceImp implements Service {

	private MemDAO memDao;

	public ServiceImp() {

	}

	public void setMemDao(MemDAO memDao) {
		this.memDao = memDao;
	}

	@Override
	public void insertProcess() {

		memDao.insertMethod(new MemDTO(108, "������", 50, "���"));
		memDao.insertMethod(new MemDTO(109, "������", 20, "����"));

	}// insertProcess()
}// end class
