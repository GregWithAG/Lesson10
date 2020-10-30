package InsertRemove;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PeopleList extends javax.swing.JFrame {
    ArrayList<Person> people = new ArrayList();
    DefaultListModel list = new DefaultListModel();

    public PeopleList() {
        initComponents();
        people.add(new Person("Bob",25,"M"));
        people.add(new Person("Fran",55,"O"));
        people.add(new Person("Mark",15,"M"));
        people.add(new Person("Sue",30,"F"));
        PeopleLST.setModel(list);
        for(Person p: people){
            list.addElement(p.getName());
        }
    }
    
    public void ClearForm(){
        TXTName.setText("");
        TXTAge.setText("");
        buttonGroup1.clearSelection();
        PeopleLST.clearSelection();
    }
    
    public void show(Person p){
        TXTName.setText(p.getName());
        TXTAge.setText("" + p.getAge());
        if(p.getGender() == "M")
            MaleRB.setSelected(true);
        else if(p.getGender() == "F")
            FemaleRB.setSelected(true);
        else
            OtherRB.setSelected(true);
        
    }
    
    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;
    }
    
    public static int findInsertPoint (ArrayList a, Object searchValue){
	   int left = 0;
	   int right = a.size()-1;
	   int midpoint=0;
           int result=0;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
	      result = ((Comparable)a.get(midpoint)).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(result < 0)
	   midpoint++;
	   return midpoint;	   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PeopleLST = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTName = new javax.swing.JTextField();
        TXTAge = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        MaleRB = new javax.swing.JRadioButton();
        FemaleRB = new javax.swing.JRadioButton();
        OtherRB = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        ExitMnu = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        ClearMnu = new javax.swing.JMenuItem();
        AddMnu = new javax.swing.JMenuItem();
        DeleteMnu = new javax.swing.JMenuItem();
        FilterMenu = new javax.swing.JMenu();
        ShowAllMnu = new javax.swing.JMenuItem();
        MalesMnu = new javax.swing.JMenuItem();
        FemalesMnu = new javax.swing.JMenuItem();
        OtherMnu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        PeopleLST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PeopleLSTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PeopleLST);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" Age:");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        MaleRB.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(MaleRB);
        MaleRB.setText("Male");

        FemaleRB.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(FemaleRB);
        FemaleRB.setText("Female");

        OtherRB.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(OtherRB);
        OtherRB.setText("Other");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaleRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FemaleRB, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OtherRB)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaleRB)
                    .addComponent(FemaleRB)
                    .addComponent(OtherRB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FileMenu.setText("File");

        ExitMnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/exit.png"))); // NOI18N
        ExitMnu.setText("Exit");
        ExitMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMnuActionPerformed(evt);
            }
        });
        FileMenu.add(ExitMnu);

        jMenuBar1.add(FileMenu);

        EditMenu.setText("Edit");

        ClearMnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/exit.png"))); // NOI18N
        ClearMnu.setText("Clear");
        ClearMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearMnuActionPerformed(evt);
            }
        });
        EditMenu.add(ClearMnu);

        AddMnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/insert.png"))); // NOI18N
        AddMnu.setText("Add");
        AddMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMnuActionPerformed(evt);
            }
        });
        EditMenu.add(AddMnu);

        DeleteMnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/delete.png"))); // NOI18N
        DeleteMnu.setText("Delete");
        EditMenu.add(DeleteMnu);

        jMenuBar1.add(EditMenu);

        FilterMenu.setText("Filter");

        ShowAllMnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/all.png"))); // NOI18N
        ShowAllMnu.setText("Show All");
        FilterMenu.add(ShowAllMnu);

        MalesMnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/male.png"))); // NOI18N
        MalesMnu.setText("Males");
        MalesMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalesMnuActionPerformed(evt);
            }
        });
        FilterMenu.add(MalesMnu);

        FemalesMnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/female.png"))); // NOI18N
        FemalesMnu.setText("Females");
        FemalesMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemalesMnuActionPerformed(evt);
            }
        });
        FilterMenu.add(FemalesMnu);

        OtherMnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InsertRemove/all.png"))); // NOI18N
        OtherMnu.setText("Other");
        FilterMenu.add(OtherMnu);

        jMenuBar1.add(FilterMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTAge, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXTAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMnuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitMnuActionPerformed

    private void ClearMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearMnuActionPerformed
        ClearForm();
    }//GEN-LAST:event_ClearMnuActionPerformed

    private void FemalesMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemalesMnuActionPerformed
        ClearForm();
    }//GEN-LAST:event_FemalesMnuActionPerformed

    private void MalesMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalesMnuActionPerformed
        ClearForm();
    }//GEN-LAST:event_MalesMnuActionPerformed

    private void PeopleLSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeopleLSTMouseClicked
        String name = "" + PeopleLST.getSelectedValue();
        int loc = search(people, new Person(name,0,""));
        show(people.get(loc));
    }//GEN-LAST:event_PeopleLSTMouseClicked

    private void AddMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMnuActionPerformed
        String Name = TXTName.getText();
        int Age = Integer.parseInt(TXTAge.getText());
        String Gender = buttonGroup1.getSelection().getActionCommand();
        int loc = findInsertPoint(people,Name);
        people.add(loc,(new Person(Name,Age,Gender)));
        show(people.get(loc));
    }//GEN-LAST:event_AddMnuActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddMnu;
    private javax.swing.JMenuItem ClearMnu;
    private javax.swing.JMenuItem DeleteMnu;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem ExitMnu;
    private javax.swing.JRadioButton FemaleRB;
    private javax.swing.JMenuItem FemalesMnu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu FilterMenu;
    private javax.swing.JRadioButton MaleRB;
    private javax.swing.JMenuItem MalesMnu;
    private javax.swing.JMenuItem OtherMnu;
    private javax.swing.JRadioButton OtherRB;
    private javax.swing.JList<String> PeopleLST;
    private javax.swing.JMenuItem ShowAllMnu;
    private javax.swing.JTextField TXTAge;
    private javax.swing.JTextField TXTName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
