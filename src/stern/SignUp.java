/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stern;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author calin
 */
public class SignUp extends javax.swing.JFrame {
    Connection con;
    public SignUp() {
        initComponents();
        createConnection();
    }
    void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect the database
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ptcdb", "root", "Calingasanjohnerick01");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        login1 = new javax.swing.JButton();
        s4 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(null);

        Left.setBackground(new java.awt.Color(69, 69, 69));
        Left.setPreferredSize(new java.awt.Dimension(700, 600));
        Left.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(237, 237, 237));
        jLabel1.setFont(new java.awt.Font("Goudy Stout", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 237, 237));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create your Account");
        jLabel1.setPreferredSize(new java.awt.Dimension(540, 35));
        Left.add(jLabel1);
        jLabel1.setBounds(0, 50, 700, 35);

        jLabel2.setBackground(new java.awt.Color(237, 237, 237));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 237, 237));
        jLabel2.setText("Firstname");
        jLabel2.setToolTipText("");
        jLabel2.setPreferredSize(new java.awt.Dimension(550, 18));
        Left.add(jLabel2);
        jLabel2.setBounds(75, 110, 270, 35);

        firstname.setBackground(new java.awt.Color(80, 80, 80));
        firstname.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(237, 237, 237));
        firstname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstname.setToolTipText("Enter Your FirstName");
        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 80, 80), 5, true));
        Left.add(firstname);
        firstname.setBounds(75, 145, 550, 35);

        jLabel3.setBackground(new java.awt.Color(237, 237, 237));
        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 237, 237));
        jLabel3.setText("Lastname");
        Left.add(jLabel3);
        jLabel3.setBounds(75, 180, 270, 35);

        lastname.setBackground(new java.awt.Color(80, 80, 80));
        lastname.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(237, 237, 237));
        lastname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastname.setToolTipText("Enter Your Lastname");
        lastname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 80, 80), 5, true));
        Left.add(lastname);
        lastname.setBounds(75, 215, 550, 35);

        jLabel4.setBackground(new java.awt.Color(237, 237, 237));
        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 237, 237));
        jLabel4.setText("Email");
        Left.add(jLabel4);
        jLabel4.setBounds(75, 250, 550, 35);

        email.setBackground(new java.awt.Color(80, 80, 80));
        email.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(237, 237, 237));
        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setToolTipText("Enter Your Email");
        email.setActionCommand("<Not Set>");
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 80, 80), 5, true));
        Left.add(email);
        email.setBounds(75, 285, 550, 35);

        jLabel9.setBackground(new java.awt.Color(237, 237, 237));
        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(237, 237, 237));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Password");
        Left.add(jLabel9);
        jLabel9.setBounds(75, 320, 550, 30);

        password.setBackground(new java.awt.Color(80, 80, 80));
        password.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(237, 237, 237));
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.setToolTipText("Enter Your password");
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 80, 80), 5, true));
        password.setName(""); // NOI18N
        Left.add(password);
        password.setBounds(75, 355, 550, 35);

        jLabel5.setBackground(new java.awt.Color(237, 237, 237));
        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 237, 237));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Confirn paswword");
        Left.add(jLabel5);
        jLabel5.setBounds(75, 390, 550, 35);

        confirmpassword.setBackground(new java.awt.Color(80, 80, 80));
        confirmpassword.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        confirmpassword.setForeground(new java.awt.Color(237, 237, 237));
        confirmpassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        confirmpassword.setToolTipText("Enter Your password");
        confirmpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 80, 80), 5, true));
        confirmpassword.setName(""); // NOI18N
        Left.add(confirmpassword);
        confirmpassword.setBounds(75, 430, 550, 35);

        signup.setBackground(new java.awt.Color(39, 39, 39));
        signup.setFont(new java.awt.Font("Goudy Stout", 0, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(237, 237, 237));
        signup.setText("create account");
        signup.setAlignmentX(0.5F);
        signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 80, 80), 2, true));
        signup.setPreferredSize(new java.awt.Dimension(110, 25));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        Left.add(signup);
        signup.setBounds(225, 500, 250, 25);

        jLabel7.setBackground(new java.awt.Color(237, 237, 237));
        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(237, 237, 237));
        jLabel7.setText("If you already have an account");
        Left.add(jLabel7);
        jLabel7.setBounds(150, 540, 275, 30);

        login1.setBackground(new java.awt.Color(69, 69, 69));
        login1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        login1.setForeground(new java.awt.Color(237, 237, 237));
        login1.setText("Log in");
        login1.setBorder(null);
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login1MouseExited(evt);
            }
        });
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });
        Left.add(login1);
        login1.setBounds(443, 540, 75, 30);

        s4.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 234, 0));
        Left.add(s4);
        s4.setBounds(220, 325, 390, 20);

        jPanel1.add(Left);
        Left.setBounds(0, 0, 700, 600);

        Right.setBackground(new java.awt.Color(39, 39, 39));
        Right.setPreferredSize(new java.awt.Dimension(300, 600));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\calin\\OneDrive\\Documents\\NetBeansProjects\\STERN\\src\\Icon\\logo (signup).png")); // NOI18N

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(700, 0, 300, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1014, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        String firstN = firstname.getText();
        String lastN = lastname.getText();
        String Email = email.getText();
        String Password = password.getText();
        String Password1 = confirmpassword.getText();
        UIManager.put("OptionPane.background", new Color (39,39,39));
        UIManager.put("Panel.background", new Color(69,69,69));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        if ("".equals(firstN) || "".equals(lastN) || "".equals(Email) || "".equals(Password)) {
            JOptionPane.showMessageDialog(rootPane, "Please fill out all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!Password.equals(Password1)) {
            JOptionPane.showMessageDialog(rootPane, "Password Do Not Match.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO USER (Firstname, Lastname, Email, Password) VALUES ('"+firstN+"', '"+lastN+"', '"+Email+"', '"+Password+"')");

                JOptionPane.showMessageDialog(rootPane, "Your Account Created. Login Now");
                Login LoginFrame = new Login();
                LoginFrame.setVisible(true);
                LoginFrame.pack();
                LoginFrame.setLocationRelativeTo(null);

                this.dispose();

            } catch (SQLException ex) {
                System.out.println(ex);  
            }
        }
  
    }//GEN-LAST:event_signupActionPerformed

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        // TODO add your handling code here (IF YOU HAVE AN ACCOUNT):
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_login1ActionPerformed

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        // TODO add your handling code here:
        signup.setBackground(new Color(255, 234, 0));
        signup.setForeground(new Color (0,0,0));
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        // TODO add your handling code here:
        signup.setBackground(new Color(39,39,39));
        signup.setForeground(new Color (240,240,240));
    }//GEN-LAST:event_signupMouseExited

    private void login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseEntered
        // TODO add your handling code here:
        login1.setForeground(new Color (255, 234, 0));
    }//GEN-LAST:event_login1MouseEntered

    private void login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseExited
        // TODO add your handling code here:
        login1.setForeground(new Color (237, 237, 237));
    }//GEN-LAST:event_login1MouseExited

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton login1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel s4;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
