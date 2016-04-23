/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweng311_part2;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kalvi_000
 */
public class modifyCourseRoster extends javax.swing.JFrame {

    /**
     * Creates new form modifyCourseRoster
     */
    private DefaultListModel studentListModel;
    private DefaultListModel studentsInCourseListModel;
    private DefaultListModel roomListModel;
    private DefaultListModel courseListModel;
    int selected_room;
    int selected_course;
    
    public modifyCourseRoster() {
        initComponents();
        this.setTitle("Modify Course Rosters");
    }
    
    public DefaultListModel setStudentList(){
        studentListModel = new DefaultListModel();
        for (int i = 0; i < SWENG311_part2.students.size(); i++) {
            studentListModel.addElement(SWENG311_part2.students.get(i).get_first() + " " + SWENG311_part2.students.get(i).get_last());
        }
        return studentListModel;
    }
    
    public DefaultListModel setRoomList(){
        roomListModel = new DefaultListModel();
        for (int i = 0; i < SWENG311_part2.rooms.size(); i++) {
            roomListModel.addElement(Integer.toString(SWENG311_part2.rooms.get(i).get_number()));
        }
        return roomListModel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        CourseList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsInCourseList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        RoomList = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList<>();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourseList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                CourseListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(CourseList);

        jScrollPane2.setViewportView(studentsInCourseList);

        RoomList.setModel(setRoomList());
        RoomList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                RoomListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(RoomList);

        jTextField1.setText("Students in Course");

        jTextField2.setText("Course");

        jTextField3.setText("Room");

        studentList.setModel(setStudentList());
        jScrollPane4.setViewportView(studentList);

        jTextField4.setText("Student List");

        jButton1.setText("Add Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete Student from Course");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jButton2)
                        .addGap(113, 113, 113)
                        .addComponent(jButton1)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_RoomListValueChanged
        courseListModel = new DefaultListModel();
        selected_room = RoomList.getSelectedIndex();
        for (int i = 0; i < SWENG311_part2.rooms.get(selected_room).courses.size(); i++) {
            courseListModel.addElement(SWENG311_part2.rooms.get(selected_room).courses.get(i).getName());
        }
        CourseList.setModel(courseListModel);
        studentsInCourseList.clearSelection();
        CourseList.clearSelection();
        DefaultListModel clear = new DefaultListModel();
        studentsInCourseList.setModel(clear);
        
    }//GEN-LAST:event_RoomListValueChanged

    private void CourseListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_CourseListValueChanged
        studentsInCourseListModel = new DefaultListModel();
        selected_course = CourseList.getSelectedIndex();
        for (int i = 0; i < SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.size(); i++) {
            studentsInCourseListModel.addElement(SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.get(i).get_first() + " " +SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.get(i).get_last());
        }
        studentsInCourseList.setModel(studentsInCourseListModel);
    }//GEN-LAST:event_CourseListValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (studentsInCourseList.getSelectedIndex() != -1) {
            int selected_student = studentsInCourseList.getSelectedIndex();
            SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.remove(selected_student);
            studentsInCourseListModel = new DefaultListModel();
            for (int i = 0; i < SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.size(); i++) {
                studentsInCourseListModel.addElement(SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.get(i).get_first() + " " + SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.get(i).get_last());
            }
            studentsInCourseList.setModel(studentsInCourseListModel);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (studentList.getSelectedIndex() != -1) {
            int selected_student = studentList.getSelectedIndex();
            boolean add = true;
            for (int i = 0; i < SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.size(); i++) {
                if (SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.get(i).get_first().equals(SWENG311_part2.students.get(selected_student).get_first()) && SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.get(i).get_last().equals(SWENG311_part2.students.get(selected_student).get_last())) {
                    add = false;
                    JOptionPane.showMessageDialog(null, "Student is already in that course, student not added to course");
                }
            }
            if (add) {
                int room_select = SWENG311_part2.rooms.get(selected_room).get_number();
                int class_time = SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).getTime();
                String first_add = SWENG311_part2.students.get(selected_student).get_first();
                String last_add = SWENG311_part2.students.get(selected_student).get_last();
                for (int i = 0; i < SWENG311_part2.rooms.size(); i++) {
                    //loops through all the courses
                    for (int j = 0; j < SWENG311_part2.rooms.get(i).courses.size(); j++) {
                        //loops through all the students taking those courses
                        if (SWENG311_part2.rooms.get(i).courses.get(j).getTime() == class_time) {
                            for (int k = 0; k < SWENG311_part2.rooms.get(i).courses.get(j).students.size(); k++) {
                                //checks to see if we have a matching student
                                if (SWENG311_part2.rooms.get(i).courses.get(j).students.get(k).get_first().toLowerCase().equals(first_add.toLowerCase()) && SWENG311_part2.rooms.get(i).courses.get(j).students.get(k).get_last().toLowerCase().equals(last_add.toLowerCase())) {
                                    //signals that we have a conflict
                                    add = false;
                                    JOptionPane.showMessageDialog(null, "Student is already in a course at that time, student not added to course");
                                }
                            }
                        }
                    }
                }
            }
            if (add) {
                SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.add(SWENG311_part2.students.get(selected_student));
                studentsInCourseListModel = new DefaultListModel();
                for (int i = 0; i < SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.size(); i++) {
                    studentsInCourseListModel.addElement(SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.get(i).get_first() + " " + SWENG311_part2.rooms.get(selected_room).courses.get(selected_course).students.get(i).get_last());
                }
                studentsInCourseList.setModel(studentsInCourseListModel);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(modifyCourseRoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifyCourseRoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifyCourseRoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifyCourseRoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifyCourseRoster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> CourseList;
    private javax.swing.JList<String> RoomList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JList<String> studentList;
    private javax.swing.JList<String> studentsInCourseList;
    // End of variables declaration//GEN-END:variables
}
