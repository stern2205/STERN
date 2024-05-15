/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stern;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalTime;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



/**
 *
 * @author calin
 */
public class GlobalTimeConverter extends javax.swing.JFrame {

    /**
     * Creates new form GlobalTimeConverter
     */
    

    
    
    public GlobalTimeConverter() {
        initComponents();      

        Thread t = new Thread(){
                           
            public void run()
                {
                while (true)
                {
                    DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");  
                    DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd"); 
                    
                    String timeString = timeformat.format(new Date()).toString();
                    String dateString = dateformat.format(new Date()).toString();
                    
                    displayTime.setText(timeString);
                    displayDate.setText(dateString);
                    
                    try{
                        Thread.sleep(1000);
                    }
                    catch(Exception e)
                    {

                    }
                }
            }
        };
        t.start();
    }
    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bgtab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabHome = new javax.swing.JPanel();
        tabHome1 = new javax.swing.JLabel();
        tabFeatures = new javax.swing.JPanel();
        tabFeatures1 = new javax.swing.JLabel();
        tabGlobalTimeConverter = new javax.swing.JPanel();
        tabGlobalTimeConverter1 = new javax.swing.JLabel();
        tabPersonalizedTimeConverter = new javax.swing.JPanel();
        tabPersonalizedTimeConverter1 = new javax.swing.JLabel();
        tabTimeMasterSchedule = new javax.swing.JPanel();
        tabtimeMasterSchedule1 = new javax.swing.JLabel();
        tabHistory = new javax.swing.JPanel();
        tabHistory1 = new javax.swing.JLabel();
        tabExit = new javax.swing.JPanel();
        tabExit1 = new javax.swing.JLabel();
        jPanel100 = new javax.swing.JPanel();
        resultTime = new javax.swing.JLabel();
        resultDate = new javax.swing.JLabel();
        resultTimezoe = new javax.swing.JLabel();
        ResultOffset = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        globeLogoGBC = new javax.swing.JLabel();
        globaltimeconverter = new javax.swing.JLabel();
        resultBg = new javax.swing.JPanel();
        displayDate = new javax.swing.JLabel();
        displayTime = new javax.swing.JLabel();
        selecttimezone = new javax.swing.JComboBox<>();
        confirmedtimezone_convert = new javax.swing.JButton();
        bgGlobaltimeconverter = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(null);

        bgtab.setBackground(new java.awt.Color(39, 39, 39));
        bgtab.setPreferredSize(new java.awt.Dimension(350, 600));
        bgtab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\calin\\OneDrive\\Documents\\NetBeansProjects\\STERN\\src\\Icon\\logo(welcome).png")); // NOI18N
        bgtab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, -1));

        tabHome.setBackground(new java.awt.Color(39, 39, 39));
        tabHome.setPreferredSize(new java.awt.Dimension(200, 35));

        tabHome1.setBackground(new java.awt.Color(237, 237, 237));
        tabHome1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        tabHome1.setForeground(new java.awt.Color(237, 237, 237));
        tabHome1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        tabHome1.setText("HOME");
        tabHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHome1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabHome1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout tabHomeLayout = new javax.swing.GroupLayout(tabHome);
        tabHome.setLayout(tabHomeLayout);
        tabHomeLayout.setHorizontalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tabHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tabHomeLayout.setVerticalGroup(
            tabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHomeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tabHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgtab.add(tabHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 350, 60));

        tabFeatures.setBackground(new java.awt.Color(39, 39, 39));
        tabFeatures.setPreferredSize(new java.awt.Dimension(200, 35));
        tabFeatures.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabFeatures1.setBackground(new java.awt.Color(237, 237, 237));
        tabFeatures1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        tabFeatures1.setForeground(new java.awt.Color(237, 237, 237));
        tabFeatures1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabFeatures1.setText("FEATURES");
        tabFeatures.add(tabFeatures1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 40));

        bgtab.add(tabFeatures, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 350, 60));

        tabGlobalTimeConverter.setBackground(new java.awt.Color(69, 69, 69));
        tabGlobalTimeConverter.setPreferredSize(new java.awt.Dimension(200, 35));
        tabGlobalTimeConverter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabGlobalTimeConverter1.setBackground(new java.awt.Color(237, 237, 237));
        tabGlobalTimeConverter1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        tabGlobalTimeConverter1.setForeground(new java.awt.Color(237, 237, 237));
        tabGlobalTimeConverter1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabGlobalTimeConverter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/global_time_converter.png"))); // NOI18N
        tabGlobalTimeConverter1.setText("GLOBAL TIME CONVERTER");
        tabGlobalTimeConverter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabGlobalTimeConverter1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabGlobalTimeConverter1MouseEntered(evt);
            }
        });
        tabGlobalTimeConverter.add(tabGlobalTimeConverter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 40));

        bgtab.add(tabGlobalTimeConverter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 350, 60));

        tabPersonalizedTimeConverter.setBackground(new java.awt.Color(39, 39, 39));
        tabPersonalizedTimeConverter.setPreferredSize(new java.awt.Dimension(200, 35));
        tabPersonalizedTimeConverter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabPersonalizedTimeConverter1.setBackground(new java.awt.Color(237, 237, 237));
        tabPersonalizedTimeConverter1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        tabPersonalizedTimeConverter1.setForeground(new java.awt.Color(237, 237, 237));
        tabPersonalizedTimeConverter1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabPersonalizedTimeConverter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/personalize-time-converter.png"))); // NOI18N
        tabPersonalizedTimeConverter1.setText("PERSONALIZED TIME CONVERTER");
        tabPersonalizedTimeConverter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPersonalizedTimeConverter1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabPersonalizedTimeConverter1MouseEntered(evt);
            }
        });
        tabPersonalizedTimeConverter.add(tabPersonalizedTimeConverter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));

        bgtab.add(tabPersonalizedTimeConverter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 350, 60));

        tabTimeMasterSchedule.setBackground(new java.awt.Color(39, 39, 39));
        tabTimeMasterSchedule.setPreferredSize(new java.awt.Dimension(200, 35));
        tabTimeMasterSchedule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabtimeMasterSchedule1.setBackground(new java.awt.Color(237, 237, 237));
        tabtimeMasterSchedule1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        tabtimeMasterSchedule1.setForeground(new java.awt.Color(237, 237, 237));
        tabtimeMasterSchedule1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabtimeMasterSchedule1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/time_master_scheudule.png"))); // NOI18N
        tabtimeMasterSchedule1.setText("TIME MASTER SCHEDULER");
        tabtimeMasterSchedule1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabtimeMasterSchedule1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabtimeMasterSchedule1MouseEntered(evt);
            }
        });
        tabTimeMasterSchedule.add(tabtimeMasterSchedule1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 40));

        bgtab.add(tabTimeMasterSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 350, 60));

        tabHistory.setBackground(new java.awt.Color(39, 39, 39));
        tabHistory.setPreferredSize(new java.awt.Dimension(200, 35));
        tabHistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabHistory1.setBackground(new java.awt.Color(237, 237, 237));
        tabHistory1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        tabHistory1.setForeground(new java.awt.Color(237, 237, 237));
        tabHistory1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabHistory1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/history.png"))); // NOI18N
        tabHistory1.setText("HISTORY");
        tabHistory1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHistory1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabHistory1MouseEntered(evt);
            }
        });
        tabHistory.add(tabHistory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 40));

        bgtab.add(tabHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 350, 60));

        tabExit.setBackground(new java.awt.Color(39, 39, 39));
        tabExit.setPreferredSize(new java.awt.Dimension(200, 35));
        tabExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabExit1.setBackground(new java.awt.Color(237, 237, 237));
        tabExit1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        tabExit1.setForeground(new java.awt.Color(237, 237, 237));
        tabExit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        tabExit1.setText("LOGOUT");
        tabExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabExit1MouseEntered(evt);
            }
        });
        tabExit.add(tabExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 40));

        bgtab.add(tabExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 350, 60));

        jPanel1.add(bgtab);
        bgtab.setBounds(0, 0, 350, 600);

        jPanel100.setBackground(new java.awt.Color(69, 69, 69));
        jPanel100.setLayout(null);

        resultTime.setBackground(new java.awt.Color(69, 69, 69));
        resultTime.setFont(new java.awt.Font("Goudy Stout", 1, 48)); // NOI18N
        resultTime.setForeground(new java.awt.Color(237, 237, 237));
        resultTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel100.add(resultTime);
        resultTime.setBounds(30, 375, 585, 50);

        resultDate.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        resultDate.setForeground(new java.awt.Color(237, 237, 237));
        resultDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultDate.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel100.add(resultDate);
        resultDate.setBounds(60, 470, 290, 50);

        resultTimezoe.setFont(new java.awt.Font("Lucida Sans", 1, 17)); // NOI18N
        resultTimezoe.setForeground(new java.awt.Color(237, 237, 237));
        resultTimezoe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel100.add(resultTimezoe);
        resultTimezoe.setBounds(30, 420, 585, 50);

        ResultOffset.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        ResultOffset.setForeground(new java.awt.Color(237, 237, 237));
        ResultOffset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ResultOffset.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel100.add(ResultOffset);
        ResultOffset.setBounds(330, 470, 260, 50);

        line.setBackground(new java.awt.Color(237, 237, 237));
        line.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(237, 237, 237), 2000, true));
        line.setForeground(new java.awt.Color(237, 237, 237));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel100.add(line);
        line.setBounds(30, 295, 585, 2);

        globeLogoGBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/half-globe-home.png"))); // NOI18N
        jPanel100.add(globeLogoGBC);
        globeLogoGBC.setBounds(0, 250, 650, 350);

        globaltimeconverter.setBackground(new java.awt.Color(237, 237, 237));
        globaltimeconverter.setFont(new java.awt.Font("Goudy Stout", 1, 22)); // NOI18N
        globaltimeconverter.setForeground(new java.awt.Color(237, 237, 237));
        globaltimeconverter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        globaltimeconverter.setText("GLOBAL TIME CONVERTER");
        globaltimeconverter.setToolTipText("");
        globaltimeconverter.setPreferredSize(new java.awt.Dimension(555, 30));
        jPanel100.add(globaltimeconverter);
        globaltimeconverter.setBounds(0, 40, 650, 40);

        resultBg.setBackground(new java.awt.Color(69, 69, 69));
        resultBg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(89, 89, 89), 125, true));

        javax.swing.GroupLayout resultBgLayout = new javax.swing.GroupLayout(resultBg);
        resultBg.setLayout(resultBgLayout);
        resultBgLayout.setHorizontalGroup(
            resultBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        resultBgLayout.setVerticalGroup(
            resultBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel100.add(resultBg);
        resultBg.setBounds(30, 350, 585, 180);

        displayDate.setFont(new java.awt.Font("Goudy Stout", 1, 18)); // NOI18N
        displayDate.setForeground(new java.awt.Color(237, 237, 237));
        displayDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayDate.setText("yyyy/mm/dd");
        displayDate.setPreferredSize(new java.awt.Dimension(230, 25));
        jPanel100.add(displayDate);
        displayDate.setBounds(0, 175, 650, 30);

        displayTime.setFont(new java.awt.Font("Goudy Stout", 1, 70)); // NOI18N
        displayTime.setForeground(new java.awt.Color(237, 237, 237));
        displayTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayTime.setText("00:00:00");
        jPanel100.add(displayTime);
        displayTime.setBounds(0, 90, 650, 97);

        selecttimezone.setBackground(new java.awt.Color(69, 69, 69));
        selecttimezone.setEditable(true);
        selecttimezone.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        selecttimezone.setForeground(new java.awt.Color(237, 237, 237));
        selecttimezone.setMaximumRowCount(5);
        selecttimezone.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {    "","UTC-12: Baker Island, Howland Island (United States)",
            "UTC-11: American Samoa, Niue (New Zealand)",
            "UTC-10: Hawaii (United States)",
            "UTC-9: Alaska (United States)",
            "UTC-8: United States (Pacific Time Zone)",
            "UTC-7: United States (Mountain Time Zone)",
            "UTC-6: United States (Central Time Zone), Mexico (Central Time Zone)",
            "UTC-5: United States (Eastern Time Zone), Colombia, Peru",
            "UTC-4: Canada (Atlantic Time Zone), Venezuela",
            "UTC-3: Argentina, Brazil (Brasília Time Zone)",
            "UTC-1: Portugal (Azores Time Zone)",
            "UTC±0: United Kingdom (Greenwich Mean Time), Ghana",
            "UTC+1: France, Germany, Italy, Nigeria, Spain (Central European Time)",
            "UTC+2: Greece, Egypt, South Africa, Turkey (Eastern European Time)",
            "UTC+3: Iraq, Kenya, Saudi Arabia, Russia (Moscow Time Zone)",
            "UTC+4: United Arab Emirates, Mauritius, Seychelles",
            "UTC+5: Pakistan, Maldives, Uzbekistan",
            "UTC+6: Bangladesh, Kazakhstan",
            "UTC+7: Cambodia, Thailand, Vietnam",
            "UTC+8: China, Singapore, Australia (Western Standard Time)",
            "UTC+9: Japan, South Korea",
            "UTC+10: Australia (Eastern Standard Time), Papua New Guinea",
            "UTC+11: Solomon Islands, Vanuatu",
            "UTC+12: New Zealand, Fiji"
        }));
        selecttimezone.setToolTipText("Select Time Zone");
        selecttimezone.setAlignmentX(0.0F);
        selecttimezone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Time Zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14), new java.awt.Color(237, 237, 237))); // NOI18N
        selecttimezone.setName(""); // NOI18N
        selecttimezone.setPreferredSize(new java.awt.Dimension(200, 40));
        selecttimezone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecttimezoneActionPerformed(evt);
            }
        });
        jPanel100.add(selecttimezone);
        selecttimezone.setBounds(155, 205, 300, 40);
        selecttimezone.getAccessibleContext().setAccessibleName("");

        confirmedtimezone_convert.setBackground(new java.awt.Color(88, 89, 89));
        confirmedtimezone_convert.setFont(new java.awt.Font("Goudy Stout", 0, 10)); // NOI18N
        confirmedtimezone_convert.setForeground(new java.awt.Color(237, 237, 237));
        confirmedtimezone_convert.setText("OK");
        confirmedtimezone_convert.setToolTipText("Tap to convert.");
        confirmedtimezone_convert.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));
        confirmedtimezone_convert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmedtimezone_convertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmedtimezone_convertMouseExited(evt);
            }
        });
        confirmedtimezone_convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmedtimezone_convertActionPerformed(evt);
            }
        });
        jPanel100.add(confirmedtimezone_convert);
        confirmedtimezone_convert.setBounds(455, 210, 40, 33);

        bgGlobaltimeconverter.setBackground(new java.awt.Color(69, 69, 69));
        bgGlobaltimeconverter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(89, 89, 89), 50, true));

        javax.swing.GroupLayout bgGlobaltimeconverterLayout = new javax.swing.GroupLayout(bgGlobaltimeconverter);
        bgGlobaltimeconverter.setLayout(bgGlobaltimeconverterLayout);
        bgGlobaltimeconverterLayout.setHorizontalGroup(
            bgGlobaltimeconverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        bgGlobaltimeconverterLayout.setVerticalGroup(
            bgGlobaltimeconverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel100.add(bgGlobaltimeconverter);
        bgGlobaltimeconverter.setBounds(30, 30, 585, 60);

        jPanel1.add(jPanel100);
        jPanel100.setBounds(350, 0, 650, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1014, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHome1MouseClicked
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabHome.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
        
        Welcome WelcomeFrame = new Welcome();
        WelcomeFrame.setVisible(true);
        WelcomeFrame.pack();
        WelcomeFrame.setLocationRelativeTo(null);
        this.dispose();
                
    }//GEN-LAST:event_tabHome1MouseClicked

    private void tabHome1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHome1MouseEntered
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabHome.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
    }//GEN-LAST:event_tabHome1MouseEntered

    private void tabGlobalTimeConverter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabGlobalTimeConverter1MouseClicked
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabGlobalTimeConverter.setBackground(clr);
        tabHome.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
        
        GlobalTimeConverter GlobalTimeConverterFrame = new GlobalTimeConverter();
        GlobalTimeConverterFrame.setVisible(true);
        GlobalTimeConverterFrame.pack();
        GlobalTimeConverterFrame.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_tabGlobalTimeConverter1MouseClicked

    private void tabGlobalTimeConverter1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabGlobalTimeConverter1MouseEntered
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabGlobalTimeConverter.setBackground(clr);
        tabHome.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
    }//GEN-LAST:event_tabGlobalTimeConverter1MouseEntered

    private void tabPersonalizedTimeConverter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPersonalizedTimeConverter1MouseClicked
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabPersonalizedTimeConverter.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabHome.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
        
        PersonalizedTimeConverter PersonalizedTimeConverterFrame = new PersonalizedTimeConverter();
        PersonalizedTimeConverterFrame.setVisible(true);
        PersonalizedTimeConverterFrame.pack();
        PersonalizedTimeConverterFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_tabPersonalizedTimeConverter1MouseClicked

    private void tabPersonalizedTimeConverter1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPersonalizedTimeConverter1MouseEntered
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabPersonalizedTimeConverter.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabHome.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
    }//GEN-LAST:event_tabPersonalizedTimeConverter1MouseEntered

    private void tabtimeMasterSchedule1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabtimeMasterSchedule1MouseClicked
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabTimeMasterSchedule.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabHome.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
        
        TimeMasterScheduler TimeMasterSchedulerFrame = new TimeMasterScheduler();
        TimeMasterSchedulerFrame.setVisible(true);
        TimeMasterSchedulerFrame.pack();
        TimeMasterSchedulerFrame.setLocationRelativeTo(null);
        this.dispose();
       
    }//GEN-LAST:event_tabtimeMasterSchedule1MouseClicked

    private void tabtimeMasterSchedule1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabtimeMasterSchedule1MouseEntered
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabTimeMasterSchedule.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabHome.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
    }//GEN-LAST:event_tabtimeMasterSchedule1MouseEntered

    private void tabHistory1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHistory1MouseClicked
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabHistory.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHome.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
        
        History HistoryFrame = new History();
        HistoryFrame.setVisible(true);
        HistoryFrame.pack();
        HistoryFrame.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_tabHistory1MouseClicked

    private void tabHistory1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHistory1MouseEntered
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabHistory.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHome.setBackground(new Color(39,39,39));
        tabExit.setBackground(new Color(39,39,39));
    }//GEN-LAST:event_tabHistory1MouseEntered

    private void tabExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabExit1MouseClicked
        // TODO add your handling code here:
        UIManager.put("OptionPane.background", new Color (39,39,39));
        UIManager.put("Panel.background", new Color(69,69,69));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("Button.background", new Color(69,69,69));
        UIManager.put("Button.foreground", new Color(247,247,247));
        
        JFrame frame = new JFrame("EXIT");
        
        int confirmed = JOptionPane.showConfirmDialog(frame, "Confirm if you want to LOGOUT", "LOGOUT Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (confirmed == JOptionPane.YES_OPTION) {
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null);
            this.dispose();
        }
        

    }//GEN-LAST:event_tabExit1MouseClicked

    private void tabExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabExit1MouseEntered
        // TODO add your handling code here:
        Color clr = new Color (69,69,69);
        tabExit.setBackground(clr);
        tabGlobalTimeConverter.setBackground(new Color(39,39,39));
        tabPersonalizedTimeConverter.setBackground(new Color(39,39,39));
        tabTimeMasterSchedule.setBackground(new Color(39,39,39));
        tabHistory.setBackground(new Color(39,39,39));
        tabHome.setBackground(new Color(39,39,39));

    }//GEN-LAST:event_tabExit1MouseEntered

    private void selecttimezoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecttimezoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecttimezoneActionPerformed

    private void confirmedtimezone_convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmedtimezone_convertActionPerformed
        // TODO add your handling code here:
        LocalDate currentDate = LocalDate.now(); // import -- packages ng java
        int year = currentDate.getYear(); //kinuha yung value sa inimport
        int month = currentDate.getMonthValue(); // kinuha value sa inimport
        int day = currentDate.getDayOfMonth(); // kinuha value sa inimport
        
        LocalTime currentTime = LocalTime.now(); // import din to                 
        
        int phhour = currentTime.getHour(); 
        int utcmin =currentTime.getMinute();
        int utcsec =currentTime.getSecond();
        
        int utchour = phhour - 8;
        if(utchour >=24){
            utchour = utchour-24;
            day--;
        }if (utchour<0){
            utchour = utchour+24;
            day++;
        }
        
        int time = 0;
        
        int option = selecttimezone.getSelectedIndex(); // combobox
        
        switch(option) {
            case 1:
                time = utchour - 12;
                resultTimezoe.setText("Baker Island, Howland Island (United States)");
                ResultOffset.setText("UTC-12");
                break;
                
            case 2:
                time = utchour - 11;
                resultTimezoe.setText("American Samoa, Niue (New Zealand)");
                ResultOffset.setText("UTC-11");
                break;
                
            case 3:
                time = utchour - 10;
                resultTimezoe.setText("Hawaii (United States)");
                ResultOffset.setText("UTC-10");
                break;
                
            case 4:
                time = utchour - 9;
                resultTimezoe.setText("Alaska (United States)");
                ResultOffset.setText("UTC-9");
                break;
                
            case 5:
                time = utchour - 8;
                resultTimezoe.setText("United States (Pacific Time Zone)");
                ResultOffset.setText("UTC-8");
                
                break;
            case 6:
                time = utchour - 7;
                resultTimezoe.setText("United States (Mountain Time Zone)");
                ResultOffset.setText("UTC-7");
                
                break;
            case 7:
                time = utchour - 6;
                resultTimezoe.setText("United States (Central Time Zone), Mexico (Central Time Zone)");
                ResultOffset.setText("UTC-6");
                break;
                
            case 8:
                time = utchour - 5;
                resultTimezoe.setText("United States (Eastern Time Zone), Colombia, Peru");
                ResultOffset.setText("UTC-5");
                break;
                
            case 9:
                time = utchour - 4;
                resultTimezoe.setText("Canada (Atlantic Time Zone), Venezuela");
                ResultOffset.setText("UTC-4");
                break;
                
            case 10:
                time = utchour - 3;
                resultTimezoe.setText("Argentina, Brazil (Brasília Time Zone)");
                ResultOffset.setText("UTC-3");
                break;
                
            case 11:
                time = utchour - 1;
                resultTimezoe.setText("Portugal (Azores Time Zone)");
                ResultOffset.setText("UTC-1");
                break;
                
            case 12:
                time = utchour;
                resultTimezoe.setText("United Kingdom (Greenwich Mean Time), Ghana");
                ResultOffset.setText("UTC+0");
                break;
                
            case 13:
                time = utchour + 1;
                resultTimezoe.setText("France, Germany, Italy, Nigeria, Spain (Central European Time)");
                ResultOffset.setText("UTC+1");
                break;
                
            case 14:
                time = utchour + 2;
                resultTimezoe.setText("Greece, Egypt, South Africa, Turkey (Eastern European Time)");
                ResultOffset.setText("UTC+2");
                break;
                
            case 15:
                time = utchour + 3;
                resultTimezoe.setText("Iraq, Kenya, Saudi Arabia, Russia (Moscow Time Zone)");
                ResultOffset.setText("UTC+3");
                break;
                
            case 16:
                time = utchour + 4;
                resultTimezoe.setText("United Arab Emirates, Mauritius, Seychelles");
                ResultOffset.setText("UTC+4");
                break;
                
            case 17:
                time = utchour + 5;
                resultTimezoe.setText("Pakistan, Maldives, Uzbekistan");
                ResultOffset.setText("UTC+5");
                break;
                
            case 18:
                time = utchour + 6;
                resultTimezoe.setText("Bangladesh, Kazakhstan");
                ResultOffset.setText("UTC+6");
                break;
                
            case 19:
                time = utchour + 7;
                resultTimezoe.setText("Cambodia, Thailand, Vietnam");
                ResultOffset.setText("UTC+7");
                break;
                
            case 20:
                time = utchour + 8;
                resultTimezoe.setText("China, Singapore, Australia (Western Standard Time)");
                ResultOffset.setText("UTC+8");
                break;
                
            case 21:
                time = utchour + 9;
                resultTimezoe.setText("Japan, South Korea");
                ResultOffset.setText("UTC+9");
                break;
                
            case 22:
                time = utchour + 10;
                resultTimezoe.setText("Australia (Eastern Standard Time), Papua New Guinea");
                ResultOffset.setText("UTC+10");
                break;
                
            case 23:
                time = utchour + 11;
                resultTimezoe.setText("Solomon Islands, Vanuatu");
                ResultOffset.setText("UTC+11");
                break;
                
            case 24:
                time = utchour + 12;
                resultTimezoe.setText("New Zealand, Fiji");
                ResultOffset.setText("UTC+12");
                break;
                
            default:
                System.out.println("Invalid.");
                return; 
        }

        
        
        
        if (time >= 24){
            time = time-24;
            day ++;
        }else if (time < 0){
            time = time+24;
            day --;
        }   
        
        if (day == 0){
            month = month-1;
            
            if (month == 1||month ==3||month ==5||month ==7||month ==8||month ==10||month ==12){
                day = 31;
            } if (month ==2){
                if ((year%4)==0){
                    day = 29;
                }else{
                    day = 28;
                }
            } else{
                day = 30;
            }
        }
            
        if (time < 10){
            resultTime.setText( time + ":" + utcmin + ":" + utcsec);
            String formattedTime = String.format("%02d:%02d:%02d",time,utcmin,utcsec);
            String formattedDate = String.format("%04d/%02d/%02d",year,month,day);
            resultTime.setText(formattedTime);
            resultDate.setText(formattedDate);
        }else{
            String formattedTime = String.format("%02d:%02d:%02d",time,utcmin,utcsec);
            String formattedDate = String.format("%04d/%02d/%02d",year,month,day);
            resultTime.setText(formattedTime);
            resultDate.setText(formattedDate);
        } 
        
    }//GEN-LAST:event_confirmedtimezone_convertActionPerformed

    private void confirmedtimezone_convertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmedtimezone_convertMouseEntered
        // TODO add your handling code here:
        confirmedtimezone_convert.setBackground(new Color(255, 234, 0));
        confirmedtimezone_convert.setForeground(new Color (0,0,0));
//        globaltimeconverter.setForeground(new Color(255, 234, 0));


    }//GEN-LAST:event_confirmedtimezone_convertMouseEntered

    private void confirmedtimezone_convertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmedtimezone_convertMouseExited
        // TODO add your handling code here:
        confirmedtimezone_convert.setBackground(new Color(89,89,89));
        confirmedtimezone_convert.setForeground(new Color (240,240,240));
//        globaltimeconverter.setForeground(new Color(237, 237, 237));

    }//GEN-LAST:event_confirmedtimezone_convertMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GlobalTimeConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlobalTimeConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlobalTimeConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlobalTimeConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlobalTimeConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ResultOffset;
    private javax.swing.JPanel bgGlobaltimeconverter;
    private javax.swing.JPanel bgtab;
    private javax.swing.JButton confirmedtimezone_convert;
    private javax.swing.JLabel displayDate;
    private javax.swing.JLabel displayTime;
    private javax.swing.JLabel globaltimeconverter;
    private javax.swing.JLabel globeLogoGBC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel line;
    private javax.swing.JPanel resultBg;
    private javax.swing.JLabel resultDate;
    private javax.swing.JLabel resultTime;
    private javax.swing.JLabel resultTimezoe;
    private javax.swing.JComboBox<String> selecttimezone;
    private javax.swing.JPanel tabExit;
    private javax.swing.JLabel tabExit1;
    private javax.swing.JPanel tabFeatures;
    private javax.swing.JLabel tabFeatures1;
    private javax.swing.JPanel tabGlobalTimeConverter;
    private javax.swing.JLabel tabGlobalTimeConverter1;
    private javax.swing.JPanel tabHistory;
    private javax.swing.JLabel tabHistory1;
    private javax.swing.JPanel tabHome;
    private javax.swing.JLabel tabHome1;
    private javax.swing.JPanel tabPersonalizedTimeConverter;
    private javax.swing.JLabel tabPersonalizedTimeConverter1;
    private javax.swing.JPanel tabTimeMasterSchedule;
    private javax.swing.JLabel tabtimeMasterSchedule1;
    // End of variables declaration//GEN-END:variables
}
