/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Event;
import Main.Main;
import static Main.Main.event;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author yosin
 */

public class UserEventsFilters extends javax.swing.JFrame {
    public static ArrayList<String>combo = new ArrayList<String>();
    DefaultListModel<String>list= new DefaultListModel<String>();
    /**
     * Creates new form FrameFiltersDate
     */
    public UserEventsFilters() {
        initComponents();
        
        Main.toUpdate();
        combo();
        for(int i=0;i<combo.size();i++){
            jComboBox1.addItem(combo.get(i));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spinnerDia = new javax.swing.JSpinner();
        spinnerMes = new javax.swing.JSpinner();
        spinnerAno = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Fecha");

        spinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        spinnerAno.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(19), Integer.valueOf(19), null, Integer.valueOf(1)));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinnerAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jList1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Ciudad");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(33, 33, 33))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EventsUser admi= new EventsUser();
        this.dispose();
        admi.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if((int)spinnerDia.getValue()<10 && (int)spinnerMes.getValue()<10){
            String fechaDia="0"+String.valueOf(spinnerDia.getValue());
            String fechaMes="0"+String.valueOf(spinnerMes.getValue());
            String fechaAno=String.valueOf(spinnerAno.getValue());
            String fecha=(fechaDia+"/"+fechaMes+"/"+fechaAno);
            searchDate(fecha);
        }else if((int)spinnerDia.getValue()<10 ){
            String fechaDia="0"+String.valueOf(spinnerDia.getValue());
            String fechaMes=String.valueOf(spinnerMes.getValue());
            String fechaAno=String.valueOf(spinnerAno.getValue());
            String fecha=(fechaDia+"/"+fechaMes+"/"+fechaAno);
        
            searchDate(fecha);
        }else if((int)spinnerMes.getValue()<10 ){
            String fechaDia="0"+String.valueOf(spinnerDia.getValue());
            String fechaMes=String.valueOf(spinnerMes.getValue());
            String fechaAno=String.valueOf(spinnerAno.getValue());
            String fecha=(fechaDia+"/"+fechaMes+"/"+fechaAno);
        
            searchDate(fecha);
        }else{
            String fechaDia=String.valueOf(spinnerDia.getValue());
            String fechaMes=String.valueOf(spinnerMes.getValue());
            String fechaAno=String.valueOf(spinnerAno.getValue());
            String fecha=(fechaDia+"/"+fechaMes+"/"+fechaAno);
            
        }
     
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        searchCity();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UserEventsFilters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserEventsFilters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserEventsFilters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserEventsFilters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserEventsFilters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JSpinner spinnerAno;
    private javax.swing.JSpinner spinnerDia;
    private javax.swing.JSpinner spinnerMes;
    // End of variables declaration//GEN-END:variables

public void combo(){ 
    Event eve= Main.event.inicioEvento;
       if(eve.nextEvent==Main.event.inicioEvento){
           combo.add(eve.getCity());
          
       }else{
           
            do{
                ciudades(eve.getCity());
                System.out.println("Esto es city"+eve.getCity());
                eve=eve.nextEvent;
            } while(eve!=Main.event.inicioEvento);
            
        }
     
}

public void ciudades(String ciudad){
    if(combo.isEmpty()){
        combo.add(ciudad);
        System.out.println("Se agrego");
        return;
    }else{
        for(String i : combo){
            if(i.equals(ciudad)){
                return;
            }
        }
    }
    combo.add(ciudad);    
}

    

public void searchDate(String fecha){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    
    
        Event eve= event.inicioEvento;
        
       if(eve.nextEvent==event.inicioEvento){
           String fechaComoCadena = sdf.format(eve.getDateEvet());
           
           System.out.println(fecha);
           System.out.println(fechaComoCadena);
          
            if(fechaComoCadena.equals(fecha)){
                list.clear();
                
                list.addElement("Reporte: "+eve.getNameEvent());
                list.addElement(" ID reporte: "+fechaComoCadena);
                list.addElement(" ID reporte: "+eve.getCity());
                list.addElement(" ");
                jList1.setModel(list);
            } 
        }else{
            do{
                try{
                    eve=eve.nextEvent;
                    String fechaComoCadena = sdf.format(eve.getDateEvet());
                    Date date = sdf.parse(fecha);
                    String date1 = sdf.format(date);
                    if(fechaComoCadena.equals(date1)){
                        list.clear();
                        list.addElement("Reporte: "+eve.getNameEvent());
                        list.addElement(" ID reporte: "+fechaComoCadena);
                        list.addElement(" ID reporte: "+eve.getCity());
                        list.addElement(" ");

                    }
                }catch(Exception e){
                    System.out.println(e);
                }                                
            } while(eve!=Main.event.inicioEvento);
            jList1.setModel(list);            
        }
}
public void searchCity(){
            try{
            String city= (String)jComboBox1.getSelectedItem();
            Event nuevo=Main.event.inicioEvento;
            if(nuevo.nextEvent==Main.event.inicioEvento){
                
                if(nuevo.getStateEvent()=="Pendiente"){
                    if(nuevo.getCity()=="San Ramón"){
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
                        Date fecha= nuevo.getDateEvet();
                        String fechaComoCadena = sdf.format(fecha);
                        list.addElement("Reporte: "+nuevo.getNameEvent());
                        list.addElement(" ID reporte: "+fechaComoCadena);
                        list.addElement(" ID reporte: "+nuevo.getCity());
                        list.addElement(" ");
                        jList1.setModel(list);
                    }else{
                    JOptionPane.showMessageDialog(null,"No hay Reportes");
                    }   
                }else{
                    JOptionPane.showMessageDialog(null,"Los eventos para esa ciudad ya se Realizaron");
                }
                
            }else{
                
                do{
                   
                        if(nuevo.getStateEvent()=="Pendiente"){
                            System.out.println(nuevo.getCity());
                            if(nuevo.getCity().equals(city)){
                            
                                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
                                Date fecha= nuevo.getDateEvet();
                                String fechaComoCadena = sdf.format(fecha);
                                list.addElement("Reporte: "+nuevo.getNameEvent());
                                list.addElement(" ID reporte: "+fechaComoCadena);
                                list.addElement(" ID reporte: "+nuevo.getCity());
                                list.addElement(" ");

                                nuevo=nuevo.nextEvent;
                        }else{
                        nuevo=nuevo.nextEvent;
                        //JOptionPane.showMessageDialog(null,"Los eventos para esa ciudad ya se Realizaron");
                        } 
                    }else{
                        nuevo=nuevo.nextEvent;
                        //JOptionPane.showMessageDialog(null,"Los eventos para esa ciudad ya se Realizaron");
                    } 
                    
                } while(nuevo!=Main.event.inicioEvento);
                jList1.setModel(list);
            } 
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"No hay Reportes");
       }
    
}
}
