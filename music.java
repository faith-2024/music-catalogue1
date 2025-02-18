import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Music {

    public static void main(String[] args) {
        JFrame frame = new JFrame("music catalogue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        JLabel firstlabel = new JLabel("Music catalogue", SwingConstants.CENTER);
        firstlabel.setFont(new Font("Times New Roman", Font.BOLD, 44));
        frame.add(firstlabel, BorderLayout.NORTH);
        String[] genre = {"Rap", "Reggae", "Ballads", "Hip-Hop", "Pop", "Rock & Roll", "R&B", "Metal"};
        JList<String> genreL = new JList<>(genre);
        frame.add(genreL);
        frame.add(new JScrollPane(genreL), BorderLayout.WEST);
        JPanel pan = new JPanel(new GridLayout(4, 2, 2, 2));
        JLabel artistL = new JLabel("Artist Name:");
        pan.add(artistL);
        JTextField artistT = new JTextField();
        pan.add(artistT);
        JLabel studioL = new JLabel("Recorfind Studio:");
        pan.add(studioL);
        JTextField studioT = new JTextField();
        pan.add(studioT);
        JLabel catagoryL = new JLabel("Catagories");
        pan.add(catagoryL);
        JComboBox<String> catagoryC = new JComboBox<>(genre);
        pan.add(catagoryC);
        JCheckBox isavaliable = new JCheckBox("avaliable");
        pan.add(isavaliable);
        frame.add(pan, BorderLayout.CENTER);
        JPanel button = new JPanel();
        JButton button1 = new JButton("Submit");
        JButton button2 = new JButton("Exit");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String artist = artistT.getText();
                String studio = studioT.getText();
                String catagory = (String) catagoryC.getSelectedItem();
                boolean avaliable = isavaliable.isSelected();
                System.out.println("Artist: " + artist);
                System.out.println("Studio: " + studio);
                System.out.println("Catagory: " + catagory);
                System.out.println((avaliable ? "yes it is avaliable" : "no it is not avaliable"));
            }
        });
        button2.addActionListener(e ->System.exit(0));
        button.add(button1);
        button.add(button2);
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
    
}