/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forularios;

import java.awt.Color;
import java.text.DecimalFormat;

/**
 *
 * @author Esau
 */
public class frmAguinaldo extends javax.swing.JPanel {

    /**
     * Creates new form frmAguinaldo
     */
    DecimalFormat df = new DecimalFormat("#.00");
    public frmAguinaldo() {
        initComponents();
        this.aguinaldo();
    }
    public static double vAguinaldo;
    public void aguinaldo(){
      frmPerfilEmp empi = new frmPerfilEmp();
      this.tiempolb.setText(""+empi.tiempo1+" Dias");
      this.jLabel13.setText(""+empi.nombre);
      //menor a 1 año
      if(empi.tiempo1<365){
       this.jLabel2.setText(""+empi.nombre+" tiene menos de 1 año trabajando");
       vAguinaldo = ((empi.sueldo1/30)*(empi.tiempo1*0.052054794));
       this.jLabel8.setText("("+empi.sueldo1+"/30)"+"*("+empi.tiempo1+"*0.052054794))");
       this.jLabel7.setText("("+empi.sueldo1/30+")*(diastrabajados*0.052054794))");
       this.jLabel9.setText("("+(empi.sueldo1/30)+")*("+(empi.tiempo1*0.052054794)+")");
       this.jLabel10.setText("Total:"+df.format(vAguinaldo));

      //menor a 3 años
      }else if(empi.tiempo1<1095){
       
        this.jLabel2.setText("El empleado "+empi.nombre+" tiene entre 1 y 3 años trabajando");
       vAguinaldo = ((empi.sueldo1/30)*15);
       this.jLabel6.setText("(("+empi.sueldo1+"/30)*15)");
       this.jLabel8.setText("("+empi.sueldo1+"/30)*15");
       this.jLabel7.setText("("+empi.sueldo1/30+")*15");
       this.jLabel9.setVisible(false);
       this.jLabel10.setText("Total:"+df.format(vAguinaldo));
      
      
      //menor a 10 años
      }else if(empi.tiempo1<3650){
          
       vAguinaldo = ((empi.sueldo1/30)*19);
       this.jLabel6.setText("(("+empi.sueldo1+"/30)*19)");
       this.jLabel2.setText("El empleado "+empi.nombre+" tiene entre 3 y 10 años trabajando");
       this.jLabel8.setText("("+empi.sueldo1+"/30)*19");
       this.jLabel7.setText("("+empi.sueldo1/30+")*19");
       this.jLabel9.setVisible(false);
       this.jLabel10.setText("Total:"+df.format(vAguinaldo));
          
      
      //mayor a 10 años
      }else{
        vAguinaldo = ((empi.sueldo1/30)*21);
       this.jLabel6.setText("(("+empi.sueldo1+"/30)*21)");
       this.jLabel2.setText("El empleado "+empi.nombre+" tiene màs 10 años trabajando");
       this.jLabel8.setText("("+empi.sueldo1+"/30)*21");
       this.jLabel7.setText("("+empi.sueldo1/30+")*21");
       this.jLabel9.setVisible(false);
       this.jLabel10.setText("Total:"+df.format(vAguinaldo));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tiempolb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Su tiempo trabajando es:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        tiempolb.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tiempolb.setText("dias");
        jPanel1.add(tiempolb, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Menos de 1 año");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 280, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Datos del Empleado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Calculo del Aguinaldo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("Tiempo dentro de la Empresa:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setText("Nombre del Empleado:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Nombre");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("((sueldo/30)*(diastrabajados*0.052054794))");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("((sueldo/30)*(diastrabajados*0.052054794))");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("((sueldo/30)*(diastrabajados*0.052054794))");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 350, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("((sueldo/30)*(diastrabajados*0.052054794))");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Total De Aguinaldo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 470, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Calculos para Aguinaldo");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FAguinaldo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1060, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tiempolb;
    // End of variables declaration//GEN-END:variables
}