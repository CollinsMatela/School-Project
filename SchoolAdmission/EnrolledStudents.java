package school.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EnrolledStudents extends javax.swing.JFrame {
    
    
        Connection con;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
        ResultSetMetaData rsmd;
    
        private static final String Dbname = "applicationform";
	private static final String DbDriver = "com.mysql.cj.jdbc.Driver";
	private static final String DbURL = "jdbc:mysql://localhost:3306/" + Dbname;
	private static final String DbUsername = "root";
	private static final String DbPassword = "";
        
    public void SQLconnection(){

         try {
                   Class.forName(DbDriver);
                   con = DriverManager.getConnection(DbURL, DbUsername, DbPassword);
                   System.out.println("Connection successful!");
                   
         } catch (ClassNotFoundException e) {
             
                   System.err.println("JDBC Driver not found: " + e.getMessage());
                   e.printStackTrace();
         } catch (SQLException e) {
             
                   System.err.println("Database connection failed: " + e.getMessage());
                  e.printStackTrace();
         }
         } // SQLconnection END
    
    public void StudentsApplicantsTable(){
        
            try {
                pst = con.prepareStatement("SELECT * FROM school_records");
                rs = pst.executeQuery();
                rsmd = rs.getMetaData();
                
                
                
                DefaultTableModel ApplicantTable = new DefaultTableModel();
                ApplicantTable.setColumnIdentifiers(new String[]{"School No.","Last Name", "First Name", "Middle Name", "Email Address", "Contact Number", "Year", "Course", "Section", "TOR", "Good Moral", "Report Card", "Miscellaneous", "Prelim", "Midterm", "PreFinals", "Finals", "Total Tuition"});
                
                while(rs.next()){
                   String StudentNumber = rs.getString("school_id");
                   String StudentLastName = rs.getString("student_lastname");
                   String StudentFirstName = rs.getString("student_firstname");
                   String StudentMiddleName = rs.getString("student_middlename");
                   String StudentEmailAddress = rs.getString("student_email");
                   String StudentContactNumber = rs.getString("student_contact");
                   String StudentYear  = rs.getString("year_level");
                   String StudentCourse = rs.getString("student_course");
                   String StudentSection  = rs.getString("student_section");
                   String TOR  = rs.getString("transcript_of_records");
                   String GoodMoral  = rs.getString("good_moral");
                   String ReportCard  = rs.getString("report_card");
                   String Miscel  = rs.getString("miscellaneous_tuition");
                   
                   String Prelim  = rs.getString("prelim_tuition");
                   String Midterm  = rs.getString("midterm_tuition");
                   String Prefinals  = rs.getString("prefinals_tuition");
                   String Finals  = rs.getString("finals_tuition");
                   String Total  = rs.getString("total_tuition");

                    ApplicantTable.addRow(new Object[]{StudentNumber, StudentLastName, StudentFirstName, StudentMiddleName, StudentEmailAddress, StudentContactNumber, StudentYear, StudentCourse, StudentSection, TOR, GoodMoral, 
                                                        ReportCard, Miscel, Prelim, Midterm, Prefinals, Finals, Total});
                    
                }
                jTable2.setModel(ApplicantTable);
   
            } catch (SQLException ex) {
                Logger.getLogger(StudentApplicants.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public EnrolledStudents() {
        initComponents();
        SQLconnection();
        StudentsApplicantsTable();
         panel.setVisible(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INPUT FRAME");
        setName("DashboardFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(249, 246, 238));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 66, 37));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 60));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(249, 246, 238));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("-");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 40, 30));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("S");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 40, 30));

        jPanel4.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 20, 290, 470));

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(jTable2);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1720, 720));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setText("Enrolled Students Table");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(153, 153, 153));
        jButton10.setText("...");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 235)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 20, 40, 30));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1760, 810));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("< Return");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StudentApplicants frame = new StudentApplicants();
        dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         panel.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panel.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrolledStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
