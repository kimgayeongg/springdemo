package board.view;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

import board.dao.BoardDAO;
import common.file.FileUpload;
//�ٿ�ε� â�� 
public class BoardDownLoadView extends AbstractView {
     private BoardDAO boardDao;
	private BoardDownLoadView() {
}

	public void setBoardDao(BoardDAO boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		int num = Integer.parseInt(request.getParameter("num"));
		String saveDirectory = FileUpload.urIPath(request);
		
		String upload = boardDao.getFile(num);
		String fileName = upload.substring(upload.indexOf("_")+1);
		
		//���ϸ��� �ѱ��϶� ���ڵ� �۾��� �Ѵ�.
		String str = URLEncoder.encode(fileName, "UTF-8");
		
		//�������Ͽ��� ������ ���� ��, + ǥ�ð� �ǹǷ� �������� ó������
		str = str.replaceAll("\\+", "%20");
		
		//������ Ÿ��
		response.setContentType("application/octet-stream");
		
		//�ٿ�ε� â�� ������ ���ϸ��� �����״�.
		response.setHeader("Content-Disposition", "attachment;filename=" + str +";");
		
		//�ڹٿ� ����� ������ �о�� Ŭ���̾�Ʈ�� ����� �ش�.
		FileCopyUtils.copy(new FileInputStream(new File(saveDirectory, upload)), response.getOutputStream());
	}
}
	
	