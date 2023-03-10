package board.service;

import java.io.File;
import java.util.List;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import board.dto.PageDTO;
import board.service.BoardService;

public class BoardServiceImp implements BoardService {
	private BoardDAO boardDao;

	private BoardServiceImp() {

	}

	public void setBoardDao(BoardDAO boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public int countProcess() {
		return boardDao.count();
	}

	@Override
	public List<BoardDTO> listProcess(PageDTO pv) {
		return boardDao.list(pv);
	}

	@Override
	public void insertProcess(BoardDTO dto) {
		//�亯���̸�
		if(dto.getRef() !=0) {
		   boardDao.reStepCount(dto);
		   dto.setRe_step(dto.getRe_step() +1);
		   dto.setRe_level(dto.getRe_level() +1);
		}
		boardDao.sava(dto);
	}

	@Override
	public BoardDTO contentProcess(int num) {
		 boardDao.readCount(num);
		return boardDao.content(num);
	}

	@Override
	public BoardDTO updateSelectProcess(int num) {
		return boardDao.content(num);
	}

	@Override
	public void updateProcess(BoardDTO dto, String urlpath) {
		String filename = dto.getUpload();
		
		//������ ������ ������
		if(filename != null) {
		
			String path = boardDao.getFile(dto.getNum());
			//���� ÷�������� ������
			if(path != null) {
				File file = new File(urlpath, path);
				file.delete();
			}
		}
		
		boardDao.update(dto);
	}

	@Override
	public void deleteProcess(int num, String urlpath) {
	    String path = boardDao.getFile(num);
	    if(path!=null) {
	    	File file = new File(urlpath, path);
	    	file.delete();
	    }
	    boardDao.delete(num);
	}

	@Override
	public String fileSelectprocess(int num) {
		// TODO Auto-generated method stub
		return null;
	}

}
