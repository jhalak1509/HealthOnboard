package ui.helper;

import businessFramework.organizations.Organizations;
import businessFramework.organizations.OrganizationsDirectory;
import businessFramework.organizations.TransportationOrganizations;
import businessFramework.userAccount.User;
import businessFramework.requestPipeline.HelpRequest;
import businessFramework.requestPipeline.TransportationRequest;
import businessFramework.requestPipeline.ManagerRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vinaykumargudooru
 */
public class ProcessAnonymousHelpReqPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private HelpRequest request;
    private User user;
    private OrganizationsDirectory od;
    /**
     * Creates new form ProcessAnonymousHelpReqPanel
     */
    public ProcessAnonymousHelpReqPanel(JPanel userProcessContainer, HelpRequest request, User user, OrganizationsDirectory od) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.user = user;
        this.od = od;
        
        requestResultCombo.removeAllItems();
        requestResultCombo.addItem(ManagerRequest.REQUEST_ACCEPT);
        requestResultCombo.addItem(ManagerRequest.REQUEST_REJECT);
        
        needTransportCombo.removeAllItems();
        needTransportCombo.addItem("YES");
        needTransportCombo.addItem("NO");
        
       
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(210,240,114);
         Color c2 = new Color(210,240,114);
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitRequest = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentsTxtAreaField = new javax.swing.JTextArea();
        needTransport = new javax.swing.JLabel();
        needTransportCombo = new javax.swing.JComboBox();
        requestStatus = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestResultCombo = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();

        submitRequest.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        submitRequest.setText("Process Work Request :");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Add comments: ");

        commentsTxtAreaField.setColumns(20);
        commentsTxtAreaField.setRows(5);
        jScrollPane1.setViewportView(commentsTxtAreaField);

        needTransport.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        needTransport.setText("Need Transportation:");

        needTransportCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        requestStatus.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        requestStatus.setText("Help Request ");

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestResultCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitJButton.setBackground(new java.awt.Color(0, 153, 153));
        submitJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Result");
        submitJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(requestStatus))
                                    .addGap(81, 81, 81))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(needTransport)
                                    .addGap(41, 41, 41)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(needTransportCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(submitRequest)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestStatus)
                    .addComponent(requestResultCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                        .addComponent(backJButton)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(needTransportCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(needTransport))
                        .addGap(50, 50, 50)
                        .addComponent(submitJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewAnonymousRequest viewAnonymousRequest = (ViewAnonymousRequest) component;
        viewAnonymousRequest.populateAnonymousHelpRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(requestResultCombo.getSelectedIndex()<0 || commentsTxtAreaField.getText().trim().isEmpty()
            || needTransportCombo.getSelectedIndex()<0     )
        {
            JOptionPane.showMessageDialog(null, "Please enter data in all fields", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         if(commentsTxtAreaField.getText().length()>50 )
        {
        JOptionPane.showMessageDialog(null, "Please enter few words in text area", "warning", JOptionPane.WARNING_MESSAGE);
        return;      
        }
        request.setRequestOutcome((String)requestResultCombo.getSelectedItem());
        request.setComments(commentsTxtAreaField.getText());
        request.setStatus(ManagerRequest.REQUEST_COMPLETED);
        request.setResolveDate(new Date());
        user.getRequestPipeline().getRequestList().add(request);
        String needTransport = (String)needTransportCombo.getSelectedItem();

        JOptionPane.showMessageDialog(null, "Help Request has been processed successfully", "success", JOptionPane.PLAIN_MESSAGE);

        if(needTransport.equals("YES"))
        {
            TransportationRequest needTransportWorkRequest = new TransportationRequest();
            needTransportWorkRequest.setReqMessage("Need Transport");
            needTransportWorkRequest.setSenderDetails(user);
            needTransportWorkRequest.setStatus("Sent");
            needTransportWorkRequest.setNeedTransportation((String)needTransportCombo.getSelectedItem());
            needTransportWorkRequest.setRequestDate(new Date());
            Organizations organization = null;
            for(Organizations org : od.getOrganizationsList())
            {
                if(org instanceof TransportationOrganizations)
                {
                    organization = org;
                }
            }
            if(organization == null)
            {
                JOptionPane.showMessageDialog(null, "Unable to create transport request! Please create transport organization !!", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            organization.getRequestPipeline().getRequestList().add(needTransportWorkRequest);
            user.getRequestPipeline().getRequestList().add(needTransportWorkRequest);

            JOptionPane.showMessageDialog(null, "Transport Request has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            commentsTxtAreaField.setText("");
        }

    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea commentsTxtAreaField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel needTransport;
    private javax.swing.JComboBox needTransportCombo;
    private javax.swing.JComboBox requestResultCombo;
    private javax.swing.JLabel requestStatus;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel submitRequest;
    // End of variables declaration//GEN-END:variables
}
