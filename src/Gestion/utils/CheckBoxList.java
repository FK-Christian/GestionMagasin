package Gestion.utils;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author FKC-Standard
 */
public class CheckBoxList extends JList<Object> {
    protected Border noFocusBorder = new EmptyBorder(1, 1, 1, 1);

    public CheckBoxList(){
        setCellRenderer(new CellRenderer());
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                int index = locationToIndex(e.getPoint());
                if (index != -1) {
                    JCheckBox checkbox = (JCheckBox)
                            getModel().getElementAt(index);
                    checkbox.setSelected(
                            !checkbox.isSelected());
                    repaint();
                }
            }
        });
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    //adds checkboxes..
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void addCheckbox(JCheckBox checkBox) {
        ListModel currentList = this.getModel();
        JCheckBox[] newList = new JCheckBox[currentList.getSize() + 1];
        for (int i = 0; i < currentList.getSize(); i++) {
            newList[i] = (JCheckBox) currentList.getElementAt(i);
        }
        newList[newList.length - 1] = checkBox;
        setListData(newList);
    }
    @SuppressWarnings("rawtypes")
    protected class CellRenderer implements ListCellRenderer {
        public Component getListCellRendererComponent(
                @SuppressWarnings("rawtypes") JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            JCheckBox checkbox = (JCheckBox) value;
            checkbox.setBackground(isSelected ?
                    getSelectionBackground() : getBackground());
            checkbox.setForeground(isSelected ?
                    getSelectionForeground() : getForeground());
            checkbox.setEnabled(isEnabled());
            checkbox.setFont(getFont());
            checkbox.setFocusPainted(false);
            checkbox.setBorderPainted(true);
            checkbox.setBorder(isSelected ?
                    UIManager.getBorder(
                            "List.focusCellHighlightBorder") : noFocusBorder);
            return checkbox;
        }
    }
}
