/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin Cooper
 */
import java.awt.*;

import java.awt.event.*;

import java.sql.*;

import java.util.Vector;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;

 

public class displayMissingReportRecords extends JFrame implements ActionListener {

 

    JFrame frame1;
    JPanel buttonPanel;
    JLabel recordLabel, selectDateLabel, l2;

    JComboBox c1;

    JButton b1, backButton, backButton2;

    Connection con;

    ResultSet rs, rs1;

    Statement st, st1;

    PreparedStatement pst;

    String ids;

    static JTable table;

    String[] columnNames = {"Unit", "Room", "missingItem", "itemDescription", "fullName", "phoneNumber", "Address",
                "Email"};

    String date;

 

    displayMissingReportRecords() {

 

        recordLabel = new JLabel("Obtaining Missing Report Record Information");

        recordLabel.setForeground(Color.red);

        recordLabel.setFont(new Font("Serif", Font.BOLD, 20));

        selectDateLabel = new JLabel("Select Date");

        b1 = new JButton("Submit");

 

        recordLabel.setBounds(100, 50, 350, 40);

        selectDateLabel.setBounds(75, 110, 75, 20);

        b1.setBounds(150, 150, 150, 20);

        b1.addActionListener(this);
        
       backButton = new JButton();
       backButton.addActionListener(this);
       backButton.setText("Back");
       backButton.setBounds(150, 200, 150, 20);

 

        setTitle("Missing Report Records");

        setLayout(null);

        setVisible(true);

        setSize(500, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
 

        add(recordLabel);

        add(selectDateLabel);;

        add(b1);
        
        add(backButton);

        try {
        
            con = DBConnect.getConnection();
            st = con.createStatement();

            rs = st.executeQuery("select missingDate from missingMaster");

            Vector v = new Vector();

            while (rs.next()) {

                ids = rs.getString(1);

                v.add(ids);

            }

            c1 = new JComboBox(v);

            c1.setBounds(150, 110, 150, 20);

 

            add(c1);

            st.close();

            rs.close();

        } catch (Exception e) {

        }
    }

 

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            showTableData();

        }
        if(ae.getSource() == backButton){
            this.setVisible(false);
            new adminUserMenu().setVisible(true);
        }
        
        if(ae.getSource() == backButton2){
            frame1.setVisible(false);
        }
    }

 

    public void showTableData() {

 
       buttonPanel = new JPanel();
       buttonPanel.setBounds(800, 800, 200, 100);
       buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
       backButton2 = new JButton();
       backButton2.setText("Back");
       backButton2.setBounds(60, 400, 220, 30);
       buttonPanel.add(backButton2);
        
        frame1 = new JFrame("Database Search Result");
        
        frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        frame1.setLayout(new BorderLayout());
        
        frame1.setLocationRelativeTo(null);
        
        frame1.add(buttonPanel, BorderLayout.SOUTH);
        backButton2.addActionListener(this);
        

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);
        


        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        // Dropdown list of dates from the database
        date = (String) c1.getSelectedItem();

        // Variables to hold data from Database
        String Unit, Room, missingItem, missingDate, itemDescription, fullName, phoneNumber,
                Address, Email;

 

        try {

            pst = con.prepareStatement("select * from missingMaster where missingDate='" + date + "'");

            ResultSet rs = pst.executeQuery();

            int i = 0;

            if (rs.next()) {

                Unit = rs.getString("Unit");

                Room = rs.getString("Room");

                missingItem = rs.getString("missingItem");

                missingDate = rs.getString("missingDate");
                
                itemDescription = rs.getString("itemDescription");

                fullName = rs.getString("fullName");

                phoneNumber = rs.getString("phoneNumber");

                Address = rs.getString("Address");
                
                Email = rs.getString("Email");

              

                model.addRow(new Object[]{Unit, Room, fullName, missingItem, missingDate, itemDescription, fullName,
                phoneNumber, Address, Email});

                i++;

            }

            if (i < 1) {

                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

            }

            if (i == 1) {

                System.out.println(i + " Record Found");

            } else {

                System.out.println(i + " Records Found");

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(800, 300);
        
        frame1.setLocationRelativeTo(null);

    }
    
}