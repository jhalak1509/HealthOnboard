/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.volunteer;

import business.common.ValidateDateOfBirth;
import business.common.ValidateEmailTextField;
import business.common.ValidateNumbers;
import business.common.ValidatePhoneNumber;
import business.common.ValidateStrings;
import business.common.Validation;
import business.personpkg.Person;
import business.userAccountpkg.UserAccount;
import business.userAccountpkg.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patil
 */
public class UpdateVolunteerProfile extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private Person person;
    private UserAccountDirectory userAccountDirectory;
    /**
     * Creates new form ViewVolunteerProfile
     */
    public UpdateVolunteerProfile(JPanel userProcessContainer, UserAccount userAccount, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = userAccount.getPerson();
        this.userAccountDirectory = userAccountDirectory;
        DateFormat form = new SimpleDateFormat("MM/dd/yyyy");
                
        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        dobField.setText(form.format(person.getDob()));
        genderComboBox.setSelectedItem(person.getGender());
        addressField2.setText(person.getAddress1());
        addressField1.setText(person.getAddress2());
        townField.setText(person.getTown());
        zipCodeField.setText(person.getZipCode());
        occupationField.setText(person.getZipCode());
        emailIDField.setText(person.getEmailId());
        userNameTxtField.setText(userAccount.getUserName());
        phoneNumberField.setText(String.valueOf(person.getPhoneNumber()));
        
        addInputVerifiers();
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
     private void addInputVerifiers() {
          
        InputVerifier stringValidation = new ValidateStrings();
        firstNameField.setInputVerifier(stringValidation);
        lastNameField.setInputVerifier(stringValidation);
        addressField1.setInputVerifier(stringValidation);
        addressField2.setInputVerifier(stringValidation);
        townField.setInputVerifier(stringValidation);
        occupationField.setInputVerifier(stringValidation);
        userNameTxtField.setInputVerifier(stringValidation);
        
      
        InputVerifier dobValidtion = new ValidateDateOfBirth();
        dobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ValidateNumbers();
        zipCodeField.setInputVerifier(numberValidation);
        
          InputVerifier emailValidtion = new ValidateEmailTextField();
           emailIDField.setInputVerifier(emailValidtion);
     
        
       InputVerifier phnumberValidation = new ValidatePhoneNumber();
        phoneNumberField.setInputVerifier(phnumberValidation);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        occupationField = new javax.swing.JTextField();
        areaCode = new javax.swing.JLabel();
        userNameTxtField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        town = new javax.swing.JLabel();
        townField = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        dobField = new javax.swing.JFormattedTextField();
        address2 = new javax.swing.JLabel();
        addressField2 = new javax.swing.JTextField();
        manageEnt1 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox();
        viewYourProfile1 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        viewYourProfile2 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        lastNameField = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        addressField1 = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();

        occupationField.setEditable(false);
        occupationField.setEnabled(false);

        areaCode.setText("User Name:");

        userNameTxtField.setEditable(false);
        userNameTxtField.setEnabled(false);

        firstName.setText("First Name:");

        phoneNumber.setText("Phone Number:");

        town.setText("Town/City: ");

        townField.setEditable(false);
        townField.setEnabled(false);

        zipCode.setText("Zip Code:");

        zipCodeField.setEditable(false);
        zipCodeField.setEnabled(false);

        occupation.setText("Occupation:");

        dobField.setEnabled(false);

        address2.setText("Address Line2 : ");

        addressField2.setEnabled(false);

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Heart Help");

        gender.setText("Gender:");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        genderComboBox.setEnabled(false);

        viewYourProfile1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile1.setText("Personal Information");

        firstNameField.setEditable(false);
        firstNameField.setEnabled(false);

        viewYourProfile2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile2.setText("Address: ");

        phoneNumberField.setEditable(false);
        phoneNumberField.setEnabled(false);
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        saveJButton.setText("Save");
        saveJButton.setEnabled(false);
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        LastName.setText("Last Name:");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lastNameField.setEditable(false);
        lastNameField.setEnabled(false);

        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        address.setText("Address Line1:");

        addressField1.setEditable(false);
        addressField1.setEnabled(false);

        emailID.setText("Email Address:");

        emailIDField.setEditable(false);
        emailIDField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(818, Short.MAX_VALUE)
                .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(380, 380, 380)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addGap(299, 299, 299))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(updateJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(saveJButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(town))
                                        .addGap(134, 134, 134)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(townField)
                                            .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(viewYourProfile1))
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(occupation)
                                                    .addComponent(areaCode)
                                                    .addComponent(phoneNumber))
                                                .addGap(114, 114, 114)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                            .addComponent(occupationField)
                                            .addComponent(userNameTxtField)
                                            .addComponent(firstNameField)
                                            .addComponent(phoneNumberField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addressField2)
                                            .addComponent(addressField1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gender)
                                            .addComponent(viewYourProfile2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dobField)
                                            .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addContainerGap(380, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailID))
                .addContainerGap(583, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(manageEnt1)
                    .addGap(18, 18, 18)
                    .addComponent(viewYourProfile1)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstName)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastName)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateOfBirth)
                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gender)
                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(viewYourProfile2)
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(address)
                        .addComponent(addressField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addressField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(address2))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(town))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zipCode))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(occupation)
                        .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(areaCode))
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phoneNumber))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backJButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(saveJButton)
                                .addComponent(updateJButton))))
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed

        firstNameField.setEnabled(true);
        lastNameField.setEnabled(true);
        dobField.setEnabled(true);
        genderComboBox.setEnabled(true);
        addressField1.setEnabled(true);
        addressField2.setEnabled(true);
        townField.setEnabled(true);
        zipCodeField.setEnabled(true);
        occupationField.setEnabled(true);
        userNameTxtField.setEnabled(true);
        phoneNumberField.setEnabled(true);
        saveJButton.setEnabled(true);
        updateJButton.setEnabled(false);
        firstNameField.setEditable(true);
        lastNameField.setEditable(true);
        dobField.setEditable(true);
        addressField1.setEditable(true);
        addressField2.setEditable(true);
        townField.setEditable(true);
        zipCodeField.setEditable(true);
        occupationField.setEditable(true);
        userNameTxtField.setEditable(true);
        phoneNumberField.setEditable(true);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed

        if(firstNameField.getText()!= null && !firstNameField.getText().isEmpty() &&
            lastNameField.getText()!= null && !lastNameField.getText().isEmpty() &&
            addressField1.getText()!=null && !addressField1.getText().isEmpty() &&
            addressField2.getText()!=null && !addressField2.getText().isEmpty() &&
            townField.getText()!=null && !townField.getText().isEmpty() &&
            occupationField.getText()!=null && !occupationField.getText().isEmpty() &&
            emailIDField.getText()!=null && !emailIDField.getText().isEmpty() &&
            userNameTxtField.getText()!=null && !userNameTxtField.getText().isEmpty()
              && genderComboBox.getSelectedIndex()>=1     
              && dobField.getText()!=null && !dobField.getText().isEmpty() && 
             zipCodeField.getText()!=null && !zipCodeField.getText().isEmpty() )
        {
            try
            {
                if(!(userAccount.getUserName().equals(userNameTxtField.getText()))&&!(userAccountDirectory.checkIfUsernameIsUnique(userNameTxtField.getText())))
                {
                    JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(dobField.getText()) ;
                int age = Validation.calculateAge(dateOfBirthVal);
                if(age<12)
                {
                    JOptionPane.showMessageDialog(null, "Your age does not qualify to be a Volunteer!","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                person.setFirstName(firstNameField.getText());
                person.setLastName(lastNameField.getText());
                person.setAddress2(addressField2.getText());
                person.setAddress1(addressField1.getText());
                person.setTown(townField.getText());
                person.setZipCode(zipCodeField.getText());
                person.setOccupation(occupationField.getText());
                userAccount.setUserName(userNameTxtField.getText());
                person.setDob(dateOfBirthVal);
                person.setPhoneNumber(phoneNumberField.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(this, "Please Enter valid details", "warning",JOptionPane.WARNING_MESSAGE);
            }
            catch(ParseException pe)
            {
                JOptionPane.showMessageDialog(this, "Please Enter valid details", "warning",JOptionPane.WARNING_MESSAGE);
            }

            {
                JOptionPane.showMessageDialog(null, "Your Profile has been updated successfully", "success", JOptionPane.PLAIN_MESSAGE);
                updateJButton.setEnabled(true);
                saveJButton.setEnabled(false);
                firstNameField.setEnabled(false);
                lastNameField.setEnabled(false);
                addressField2.setEnabled(false);
                dobField.setEnabled(false);
                genderComboBox.setEnabled(false);
                addressField1.setEnabled(false);
                townField.setEnabled(false);
                zipCodeField.setEnabled(false);
                occupationField.setEnabled(false);
                emailIDField.setEnabled(false);
                userNameTxtField.setEnabled(false);
                phoneNumberField.setEnabled(false);

            }

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address;
    private javax.swing.JLabel address2;
    private javax.swing.JTextField addressField1;
    private javax.swing.JTextField addressField2;
    private javax.swing.JLabel areaCode;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JFormattedTextField dobField;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JButton updateJButton;
    private javax.swing.JTextField userNameTxtField;
    private javax.swing.JLabel viewYourProfile1;
    private javax.swing.JLabel viewYourProfile2;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
