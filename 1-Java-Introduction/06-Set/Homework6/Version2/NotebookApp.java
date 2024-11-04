import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;

public class NotebookApp extends JFrame {
    private JButton addNewButton;
    private JButton showAllButton;
    private JButton searchButton;
    private JButton exitButton;

    public NotebookApp() {
        setTitle("Notebook App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));
        
        addNewButton = new JButton("Внести новую модель в Базу данных");
        showAllButton = new JButton("Вывести весь список на экран");
        searchButton = new JButton("Поиск ноутбука");
        exitButton = new JButton("Завершить программу");
        
        mainPanel.add(addNewButton);
        mainPanel.add(showAllButton);
        mainPanel.add(searchButton);
        mainPanel.add(exitButton);
        
        addNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAddNewForm();
            }
        });
        
        showAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAllNotebooks();
            }
        });
        
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSearchForm();
            }
        });
        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        add(mainPanel);
        setVisible(true);
    }
    
    private void showAddNewForm() {
        JFrame addNewFrame = new JFrame("Внести новую модель в Базу данных");
        addNewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addNewFrame.setSize(400, 300);
        addNewFrame.setLocationRelativeTo(null);
        
        JPanel addNewPanel = new JPanel();
        addNewPanel.setLayout(new GridLayout(9, 2));
        
        JLabel nameLabel = new JLabel("Название:");
        JTextField nameTextField = new JTextField();
        JLabel firmLabel = new JLabel("Фирма производитель:");
        JTextField firmTextField = new JTextField();
        JLabel cpuLabel = new JLabel("Процессор:");
        JTextField cpuTextField = new JTextField();
        JLabel sizeLabel = new JLabel("Диагональ экрана:");
        JTextField sizeTextField = new JTextField();
        JLabel ramLabel = new JLabel("Объем RAM:");
        JTextField ramTextField = new JTextField();
        JLabel hddLabel = new JLabel("Объем HDD:");
        JTextField hddTextField = new JTextField();
        JLabel osLabel = new JLabel("Наличие операционной системы:");
        JTextField osTextField = new JTextField();
        JLabel colorLabel = new JLabel("Цвет корпуса:");
        JTextField colorTextField = new JTextField();
        
        JButton saveButton = new JButton("Записать");
        JButton cancelButton = new JButton("Отмена");
        
        addNewPanel.add(nameLabel);
        addNewPanel.add(nameTextField);
        addNewPanel.add(firmLabel);
        addNewPanel.add(firmTextField);
        addNewPanel.add(cpuLabel);
        addNewPanel.add(cpuTextField);
        addNewPanel.add(sizeLabel);
        addNewPanel.add(sizeTextField);
        addNewPanel.add(ramLabel);
        addNewPanel.add(ramTextField);
        addNewPanel.add(hddLabel);
        addNewPanel.add(hddTextField);
        addNewPanel.add(osLabel);
        addNewPanel.add(osTextField);
        addNewPanel.add(colorLabel);
        addNewPanel.add(colorTextField);
        addNewPanel.add(new JLabel());
        addNewPanel.add(saveButton);
        addNewPanel.add(new JLabel());
        addNewPanel.add(cancelButton);} else {
            StringBuilder sb = new StringBuilder();
            Collections.sort(notebooks);
            for (Notebook notebook : notebooks) {
                sb.append(notebook.getArt()).append(", ").append(notebook.getFirm()).append(" ").append(notebook.getName()).append(" ")
                        .append(notebook.getColor()).append(" (").append(notebook.getSize()).append("/")
                        .append(notebook.getRam()).append("/").append(notebook.getHdd()).append("/")
                        .append(notebook.isOs() ? "Есть ОС" : "Нет ОС").append(")\n");
            }
            
            JOptionPane.showMessageDialog(this, sb.toString());
        }
    }
    
    private void showSearchDialog() {
        JTextField searchField = new JTextField();
        Object[] message = {"Введите Артикул, Марку, Модель, Диагональ, Объем ОЗУ или ПЗУ, цвет ноутбука"}
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String firm = firmTextField.getText();
                String cpu = cpuTextField.getText();
                String size = sizeTextField.getText();
                String ram = ramTextField.getText();
                String hdd = hddTextField.getText();
                String os = osTextField.getText();
                String color = colorTextField.getText();
                
                if (name.isEmpty() || firm.isEmpty() || cpu.isEmpty() || size.isEmpty() || ram.isEmpty()
                        || hdd.isEmpty() || os.isEmpty() || color.isEmpty()) {
                    JOptionPane.showMessageDialog(addNewFrame, "Все поля должны быть заполнены", "Ошибка", JOptionPane.ERROR_MESSAGE);
                } else {
                    String art = generateArt();
                    insertNotebook(art, name, firm, cpu, size, ram, hdd, os,)
                }
            }
        }
    }
}
```        
