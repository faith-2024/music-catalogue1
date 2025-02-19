import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Music {
    private JFrame frame;
    private JTextField artistT, studioT;
    private JComboBox<String> categoryC;
    private JCheckBox isAvailable;
    private static final String[] genres = {"Rap", "Reggae", "Ballads", "Hip-Hop", "Pop", "Rock & Roll", "R&B", "Metal"};

    public Music() {
        initialization();
    }

    private void initialization() {
        frame = new JFrame("My Music Catalogue");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        
        headernorth();
        genrewest();
        feildcenter();
        buttonsouth();

        frame.setVisible(true);
    }
    private void headernorth() {
        JLabel title = new JLabel("My Music Catalogue", SwingConstants.CENTER);
        title.setFont(new Font("Times New Roman", Font.BOLD, 24));
        frame.add(title, BorderLayout.NORTH);
    }
    private void genrewest() {
        JList<String> genreList = new JList<>(genres);
        frame.add(new JScrollPane(genreList), BorderLayout.WEST);
    }
    private void feildcenter() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        panel.add(new JLabel("Artist Name:"));
        artistT = new JTextField();
        panel.add(artistT);

        panel.add(new JLabel("Recording Studio:"));
        studioT = new JTextField();
        panel.add(studioT);

        panel.add(new JLabel("Category:"));
        categoryC = new JComboBox<>(genres);
        panel.add(categoryC);

        isAvailable = new JCheckBox("Available");
        panel.add(isAvailable);

        frame.add(panel, BorderLayout.CENTER);
    }
    private void buttonsouth() {
        JPanel button = new JPanel();
        JButton button1 = new JButton("Submit");
        JButton button2 = new JButton("Exit");

        button1.addActionListener(e -> submitaction());
        button2.addActionListener(e -> System.exit(0));

        button.add(button1);
        button.add(button2);
        frame.add(button, BorderLayout.SOUTH);
    }
    private void submitaction() {
        String artist = artistT.getText();
        String studio = studioT.getText();
        String category = (String) categoryC.getSelectedItem();
        boolean available = isAvailable.isSelected();

        System.out.println("Artist: " + artist);
        System.out.println("Studio: " + studio);
        System.out.println("Category: " + category);
        System.out.println(available ? "Yes, it is available" : "No, it is not available");
    }

    public static void main(String[] args) {
        new Music();
    }
}
