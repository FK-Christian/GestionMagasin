package Gestion.utils;

import java.util.Iterator;
import java.util.Set;
import javax.swing.JPanel;

import  org.jfree.chart.ChartFactory;
import  org.jfree.chart.ChartFrame;
import  org.jfree.data.general.DefaultPieDataset;
import org.json.simple.JSONObject;

public class Statistiques {
    private static String titre;
    private static org.jfree.chart.JFreeChart chart;
    private static DefaultPieDataset data;
    private static ChartFrame frame;
    private static JSONObject donnee;
    
    public static DefaultPieDataset pieChartData(){
            data = new DefaultPieDataset();
            Set cle = donnee.keySet();
            for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
                System.out.println(next.toString()+" "+donnee.get(next));
                data.setValue(next.toString(),(int)(donnee.get(next)));
            }
            return data;
    }
    
    public static void setStatistiques(JSONObject don){
        donnee = don;
        titre = donnee.get("titre").toString();
        donnee.remove("titre");
        chart = ChartFactory.createPieChart(titre, pieChartData(), true/*legend?*/,true/*tooltips?*/, false/*URLs?*/);
        frame = new ChartFrame("Statistiques",chart); 
        frame.pack();
    }
    
    public static JPanel getPanel(){
        JPanel pan = frame.getChartPanel();
        return pan;
    }
    
}


