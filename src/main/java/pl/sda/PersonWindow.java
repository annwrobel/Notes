package pl.sda;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by jakubwrabel on 12.01.2017.
 */
public class PersonWindow extends JFrame {

    public PersonWindow() throws HeadlessException {
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(600, 400);
        setLayout(new FlowLayout());

        JButton button = new JButton("Kliknij mnie");
        add(button);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 50));
        add(textField);


        JList<Person> jList = new JList<>();
        add(jList);

        java.util.List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Piotr", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Łukasz", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));


        Object[] objects = personList.toArray();
        Person[] persons = personList.toArray(new Person[personList.size()]);


        jList.setListData(persons);

        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(300, 100));
        add(textArea);


        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    Person person = jList.getSelectedValue();
                    textArea.setText(person.toComplexString());
//                    textArea.setText( ((Person)object).toComplexString());

                }
            }
        });

        jList.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                int keyCode = e.getKeyCode();
                int vkC = KeyEvent.VK_C;
                System.out.println("KEY TYPED " + keyChar);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


//        jList.setListData(personList.toArray(new Person[personList.size()]));


        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (textField.getText().equals("Cześć")) {
                    textField.setText("");
                } else {
                    textField.setText("Cześć");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        repaint();
    }

    public static void main(String[] args) {
        new PersonWindow();
    }
}
