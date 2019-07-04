package Gestion.utils;

/**
 *
 * @author FKC-Standard
 */
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class TacheProgression extends JPanel implements ActionListener,PropertyChangeListener {
  private JProgressBar progressBar;
  private Task task;
  private Thread Tache;

public TacheProgression() {
    progressBar = new JProgressBar();
    progressBar.setStringPainted(true);
    progressBar.setIndeterminate(true);
    progressBar.setFont(new java.awt.Font("Tahoma", 1, 18));
}
  
  public void SetTache(Runnable r){
      this.Tache = new Thread(r);
  }
  
  public JProgressBar getProgression(){
      return this.progressBar;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
     Lancer();
  }
 
  class Task extends SwingWorker<Void, Void> {
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public Void doInBackground() {
      Tache.start();
      Random random = new Random();
      int progress = 0;
      setProgress(0);
      while (Tache.isAlive()) {
        try {
          Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException ignore) {
        }
        if(!Tache.isInterrupted()){
            progress += 1;
            setProgress(Math.min(progress, 100));
            progressBar.setValue(Math.min(progress, 100));
            progressBar.setString(""+(Math.min(progress, 100))+" %");
        }
      }
      progress += 100-progress;
      setProgress(Math.min(progress, 100));
      progressBar.setValue(Math.min(progress, 100));
      progressBar.setString(""+(Math.min(progress, 100))+" %");
      return null;
    }
    
    @Override
    public void done() {
      Toolkit.getDefaultToolkit().beep();
      setCursor(null);
      Gestion.vues.InterfacesGraphiques.PagePrincipale.AfficheProgression(progressBar,false);
      String m = Gestion.vues.InterfacesGraphiques.PagePrincipale.messager.getText();
      Gestion.vues.InterfacesGraphiques.PagePrincipale.messager.setText(m+"   Tache Terminée !!!");    
    }
  }
  
  public void Lancer() {
    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    task = new Task();
    task.addPropertyChangeListener(this);
    task.execute();
  }
  
  @Override
  public void propertyChange(PropertyChangeEvent evt) {
      progressBar.repaint();
  }
  
    public static class JOB_EXPORT_IMPORT implements Runnable{
        @Override
        public void run() {
            int t=0;
            while (t<99999) {                
                System.out.println("Merci FKC !!!");
                t++;
            }
        } 
    }
 
}
