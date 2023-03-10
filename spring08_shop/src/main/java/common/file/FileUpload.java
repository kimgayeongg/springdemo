package common.file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUpload {

	
	 public static UUID saveCopyFile(MultipartFile file, HttpServletRequest request) {
		String fileName = file.getOriginalFilename();
		
		//�ߺ����ϸ��� ó���ϱ� ���� ���� �߻�
		UUID random = UUID.randomUUID();
		
		
		
		File ff = new File(urIPath(request), random+"_"+fileName);
		
		
		try {
		FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(ff));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return random;
		}//end saveCopyFile()
	   
	 
	 public static String urIPath(HttpServletRequest request) {
		 String root = request.getSession().getServletContext().getRealPath("/");
		 System.out.println("root" + root);
		 String saveDirectory = root + "temp" + File.separator;
		 
		 File fe = new File(saveDirectory);
		 if(!fe.exists())
			 fe.mkdir();
		 
		 return saveDirectory;
	 }

	 
}//end class
