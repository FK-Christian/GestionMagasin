package Gestion.utils;

import java.io.File;
import java.util.ArrayList;
import javax.swing.filechooser.FileFilter;
public class FiltreFichier extends FileFilter {
	private ArrayList<String[]> donnees;
	public FiltreFichier(){
            this.donnees = new ArrayList<>();
	}
        public void addFiltre(String extension,String description){
            String[] don = {extension,description};
            this.donnees.add(don);
        }
        public void remove(String extension){
            for (int i = 0; i < this.donnees.size(); i++) {
                if(this.donnees.get(i)[0].equals(extension)){
                    this.donnees.remove(i);
                }
            }
        }
        public void remouveAll(){
            this.donnees.clear();
        }
        public String ToString(){
           String m = "";
            for (int i = 0; i < this.donnees.size(); i++) {
                //m += this.donnees.get(i)[0]+" - "+this.donnees.get(i)[1]+"  ";
                m += this.donnees.get(i)[0]+"          "+this.donnees.get(i)[1];
            }
           return m;
        }
        @Override
	public boolean accept(File file){
            for (int i = 0; i < this.donnees.size(); i++) {
                if(file.getName().endsWith(this.donnees.get(i)[0])) return true;
            }
            return false;
	}
        @Override
	public String getDescription(){
		return this.ToString();
	}
}