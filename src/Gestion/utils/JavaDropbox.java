package Gestion.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import com.dropbox.core.DbxAccountInfo;
import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxEntry;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuthNoRedirect;
import com.dropbox.core.DbxWriteMode;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class JavaDropbox {
	DbxClient dbxClient;

	public DbxClient authDropbox(String dropBoxAppKey, String dropBoxAppSecret) throws IOException, DbxException, URISyntaxException {
		DbxAppInfo dbxAppInfo = new DbxAppInfo(dropBoxAppKey, dropBoxAppSecret);
                JOptionPane pane = new JOptionPane();
		DbxRequestConfig dbxRequestConfig = new DbxRequestConfig(
				"JavaDropboxTutorial/1.0", Locale.getDefault().toString());
		DbxWebAuthNoRedirect dbxWebAuthNoRedirect = new DbxWebAuthNoRedirect(
				dbxRequestConfig, dbxAppInfo);
		String authorizeUrl = dbxWebAuthNoRedirect.start();
                pane.showMessageDialog(null,"Rendez vous sur le lien suivant \n"
                        + "pour avoir la cle de connection \n\n"+authorizeUrl,"INFORMATIONS !!!",JOptionPane.INFORMATION_MESSAGE);
		String m = ""; 
                Desktop.getDesktop().browse(new URI(authorizeUrl));
                m += pane.showInputDialog("ENTREZ la clez de connection recu !!!");
                if(m != null || !m.isEmpty()){
                    String dropboxAuthCode = m.trim();
                    DbxAuthFinish authFinish = dbxWebAuthNoRedirect.finish(dropboxAuthCode);
                    String authAccessToken = authFinish.accessToken;
                    dbxClient = new DbxClient(dbxRequestConfig, authAccessToken);
                    return dbxClient;
                }else{
                    return null;
                }
	}

	/* returns Dropbox size in GB */
	public long getDropboxSize() throws DbxException {
		long dropboxSize = 0;
		DbxAccountInfo dbxAccountInfo = dbxClient.getAccountInfo();
		// in GB :)
		dropboxSize = dbxAccountInfo.quota.total / 1024 / 1024 / 1024;
		return dropboxSize;
	}

	public void uploadToDropbox(String fileName) throws DbxException,
			IOException {
		File inputFile = new File(fileName);
		FileInputStream fis = new FileInputStream(inputFile);
		try {
			DbxEntry.File uploadedFile = dbxClient.uploadFile("/" + fileName,
					DbxWriteMode.add(), inputFile.length(), fis);
			String sharedUrl = dbxClient.createShareableUrl("/" + fileName);
			System.out.println("Uploaded: " + uploadedFile.toString() + " URL "
					+ sharedUrl);
		} finally {
			fis.close();
		}
	}

	public void createFolder(String folderName) throws DbxException {
		dbxClient.createFolder("/" + folderName);
	}

	public void listDropboxFolders(String folderPath) throws DbxException {
		DbxEntry.WithChildren listing = dbxClient
				.getMetadataWithChildren(folderPath);
		System.out.println("Files List:");
		for (DbxEntry child : listing.children) {
			System.out.println("	" + child.name + ": " + child.toString());
		}
	}
        
	public void if_exist_delete(String test) throws DbxException {
		DbxEntry.WithChildren listing = dbxClient
				.getMetadataWithChildren("/");
		System.out.println("Files List:");
		for (DbxEntry child : listing.children) {
                        if(child.name.equals(test)) dbxClient.delete(child.path);
		}
	}

	public void downloadFromDropbox(String fileName) throws DbxException,
			IOException {
		FileOutputStream outputStream = new FileOutputStream(fileName);
		try {
			DbxEntry.File downloadedFile = dbxClient.getFile("/" + fileName,
					null, outputStream);
			System.out.println("Metadata: " + downloadedFile.toString());
		} finally {
			outputStream.close();
		}
	}

}