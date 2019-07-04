package Gestion.utils;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {
    private String photo;
    
    public Panneau(String n){
        this.photo = n;
    }
    
    public String getPhoto(){
        return this.photo;
    }
    public void setphoto(String m){
        this.photo = m;
    }
    
    @Override
    public void paintComponent(Graphics g){
        try {
            Image img = ImageIO.read (new File(getPhoto()));
            g.drawImage(img, 0, 0, this.getWidth(),this.getHeight(), this);
        } catch (IOException e) {
            Gestion.utils.Utils.addMessage(e.toString(), true);
        }
    }
}