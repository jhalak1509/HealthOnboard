/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hospital;

import BusinessModel.Hospital.Doctor;
import SQLConnection.SQLConnect;
import static UserInterface.Hospital.HospitalLoginPage.UserId;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jhalaksurve
 */
public class BookAppointment extends javax.swing.JPanel {

    /**
     * Creates new form BookAppointment
     */
    public BookAppointment() {
        initComponents();
        populateTable();
    }

    public  boolean isValidDate(String date)
    {
        String regex = "^(1[0-2]|0[1-9])/(3[01]"
                       + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)date);
        return matcher.matches();
    }
    
    public static boolean isTimeValid(String time) {
        String regex
                = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHospitalName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctorsNearby = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        btnBookAppointment = new javax.swing.JButton();
        lblReason = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        lblDoctorName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        lblHospitalName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblHeading.setBackground(new java.awt.Color(153, 204, 255));
        lblHeading.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 24)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("List of Doctors Nearby");

        tblDoctorsNearby.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Specialization", "Hospital name", "City"
            }
        ));
        tblDoctorsNearby.setColumnSelectionAllowed(true);
        tblDoctorsNearby.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDoctorsNearby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorsNearbyMouseClicked(evt);
            }
        });
        tblDoctorsNearby.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDoctorsNearbyKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctorsNearby);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 102, 255));
        btnSearch.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnSearch))
                            .addComponent(lblHeading))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnBookAppointment.setBackground(new java.awt.Color(102, 102, 102));
        btnBookAppointment.setFont(new java.awt.Font("Adelle Sans Devanagari", 1, 12)); // NOI18N
        btnBookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        lblReason.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblReason.setText("Reason for visit");

        lblDoctorName.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblDoctorName.setText("Doctor Name");

        lblHospitalName.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblHospitalName.setText("Hospital Name");

        lblDate.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblDate.setText("Date");

        lblTime.setFont(new java.awt.Font("Adelle Sans Devanagari", 0, 14)); // NOI18N
        lblTime.setText("Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(720, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDoctorName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblReason)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblDate)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHospitalName)
                            .addComponent(lblTime))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBookAppointment)
                .addGap(110, 110, 110))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReason)
                    .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorName)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalName)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnBookAppointment)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDoctorsNearbyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorsNearbyMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex = tblDoctorsNearby.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Select the row you want to DELETE");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctorsNearby.getModel();
        //Doctor selectedDoctor;
        //selectedDoctor= (Doctor) model.getValueAt(selectedRowIndex, 0).toString();
        txtDoctorName.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtHospitalName.setText(model.getValueAt(selectedRowIndex, 2).toString());

    }//GEN-LAST:event_tblDoctorsNearbyMouseClicked

    private void tblDoctorsNearbyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDoctorsNearbyKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tblDoctorsNearbyKeyPressed

    private void filter(String query){
        DefaultTableModel model = (DefaultTableModel) tblDoctorsNearby.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblDoctorsNearby.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }  
    
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String query = txtSearch.getText();
        filter(query);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        
        String reason = txtReason.getText();
        String doctorName = txtDoctorName.getText();
        String hospitalName = txtHospitalName.getText();
        String date = txtDate.getText();
        String time = txtTime.getText();
        try{
        Connection con=SQLConnect.Connect();
        PreparedStatement st = con.prepareStatement("Select DoctorId from Doctor where DoctorName = '"+doctorName+"'");
        ResultSet rs=st.executeQuery();
        System.out.print(HospitalLoginPage.UserId);
        if(rs.next()) {
        int doctorId = Integer.parseInt(rs.getString("DoctorId"));
        
        //int hospitalId = Integer.parseInt(rs.getString("HospitalId"));
        PreparedStatement st1 = con.prepareStatement("Select PatientId from Patient where UserId = '"+HospitalLoginPage.UserId+"'");
        ResultSet rs1=st1.executeQuery();
        
        if(rs1.next()){
        
        int patientId = rs1.getInt("PatientId");
        PreparedStatement st2 = con.prepareStatement("Insert into Appointment(DoctorId, PatientId, ReasonForVisit, DateOfVisit, TimeOfVisit) values('"+doctorId+"','"+patientId+"','"+reason+"''"+date+"''"+time+"')");
        st2.executeUpdate();
        JOptionPane.showMessageDialog(this,"Appointment booked!");
                
        txtReason.setText("");
        txtDoctorName.setText("");
        txtHospitalName.setText("");
        txtDate.setText("");
        txtTime.setText("");
        }          
        }
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            } 
        /*if(patientName.isEmpty() || txtPatientAge.getText().isEmpty() || reason.isEmpty() || doctorName.isEmpty() || hospitalName.isEmpty() || hospitalName.isEmpty() || date.isEmpty() || time.isEmpty())
        JOptionPane.showMessageDialog(this,"Please enter all the details");
        else{
            if(isValidDate(date)){
                if(isTimeValid(time)){
                    Connection con=SQLConnect.Connect();
                    PreparedStatement st=con.prepareStatement("Insert into Patient(PatientName,PatientAge,PatientGender,BloodGroup,PatientEmail) Values('"+patientName+"','"+patientAge+"','"+patientGender+"','"+bloodGroup+"','"+patientEmail+"')");
                
                    JOptionPane.showMessageDialog(this,"New Appointment added");

                    txtPatientName.setText(" ");
                    txtPatientAge.setText(" ");
                    txtPatientGender.setText("");
                    txtReason.setText(" ");
                    txtDoctorName.setText(" ");
                    txtHospitalName.setText(" ");
                    txtDate.setText(" ");
                    txtTime.setText(" ");
                }else
                JOptionPane.showMessageDialog(this,"Please enter time in 24 hours format");
            }else
            JOptionPane.showMessageDialog(this,"Please enter valid date in mm/dd/yyyy format");*/
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void populateTable(){
        
        String sql = "Select d.DoctorName, d.DoctorSpecialization, h.HospitalName, h.HospitalCity from Doctor d inner join Hospital h on d.HospitalId = h.HospitalId";
        try{
            Connection con=SQLConnect.Connect();
            PreparedStatement st=con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            tblDoctorsNearby.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            } 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblDoctorsNearby;
    private javax.swing.JTextField txtDate;
    public static javax.swing.JTextField txtDoctorName;
    public static javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtReason;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
