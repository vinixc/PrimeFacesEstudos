package hello.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

@ManagedBean
@ViewScoped
public class FileBean {
	private String diretorioDestino = "/home/desenvolvimento/Documentos/";
	private UploadedFile file;
	
	
	
	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}
	
	private void upload(String fileName, InputStream in) {
		try {
			OutputStream out = new FileOutputStream(new File(diretorioDestino + fileName));
			int reader = 0;
			byte[] bytes = new byte[(int)getFile().getSize()];
			while((reader = in.read(bytes)) != -1) {
				out.write(bytes,0,reader);
			}
			in.close();
			out.flush();
			out.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void send() {
		FacesContext context = FacesContext.getCurrentInstance();
		if(getFile() == null) {
			context.addMessage(null, new FacesMessage("Erro", "Escolha um arquivo"));
		}
		else {
			String nomeArquivo = file.getFileName().substring(file.getFileName().lastIndexOf("\\") +1);
			try {
				upload(nomeArquivo, file.getInputstream());
			} catch (IOException e) {
				e.printStackTrace();
			}
			context.addMessage(null, new FacesMessage("Sucesso", "Arquivo importado com sucesso!"));
		}
	}
	
}
