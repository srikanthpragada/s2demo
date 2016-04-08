package action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileUploadAction extends ActionSupport {

	private File file;
	private String message;
	private String fileFileName, fileContentType;
	long count;

	public File getFile() {
		return file;
	}

	// copies uploaded file to file variable
	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	// copies filename
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	// copies file content type
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getMessage() {
		return message;
	}

	public String execute() throws Exception {
		if (file == null)
			message = "Sorry! File not uploaded!";
		else {
			System.out.println(file);
			// count no. of lines
			Path p = file.toPath();
			Stream<String> lines = Files.lines(p);
			message = "No. of lines : " + lines.count();
		}

		return SUCCESS;
	}
}
