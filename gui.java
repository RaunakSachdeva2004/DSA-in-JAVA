import javax.swing.JOptionPane;


public class gui {
 
    public static void main(String[] args) {
        

        String name = JOptionPane.showInputDialog("enter ur name : ");
        JOptionPane.showMessageDialog(null,"hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter ur age"));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("enter ur height"));
        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");


    }

}

    