/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forularios;

import java.awt.BorderLayout;
import java.util.HashSet;
import java.util.Set;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Esau
 */
public class frmsGravado extends javax.swing.JPanel {

    /**
     * Creates new form frmISS
     */
    DecimalFormat df = new DecimalFormat("#.00");
  
    
    public frmsGravado() {
        initComponents();
        this.iss();
        this.afp();
        this.sGravado();
        this.cCargarTS();
        

    }
    
   
    public static double vIss,vAfp,vSgravado;
    
    public void iss(){
       frmPerfilEmp empi = new frmPerfilEmp();
       frmHorasExtras hx = new frmHorasExtras();
       
       if(hx.click < 1){
           
            this.jLabel4.setText(empi.sueldo);
            if(empi.sueldo1<1000){
                 vIss= empi.sueldo1*0.03;
                 this.cal_iss.setText(""+df.format(vIss));

            }else{
                vIss=30;
                this.cal_iss.setText(""+df.format(vIss));      
            }
           
       }else {
            this.jLabel4.setText(""+df.format(hx.Nsuma));
            if(hx.Nsuma<1000){
                 vIss= hx.Nsuma*0.03;
                 this.cal_iss.setText(""+df.format(vIss));

            }else{
                vIss=30;
                this.cal_iss.setText(""+df.format(vIss));      
            }
           
       }
        

    
    }
    
    public void afp(){
       frmPerfilEmp empi = new frmPerfilEmp();
       frmHorasExtras hx = new frmHorasExtras();
       
       if(hx.click < 1){
           
           this.jLabel14.setText(empi.sueldo);
            if(empi.sueldo1<7045.06){
                 vAfp= empi.sueldo1*0.0725;
                 this.cal_afp.setText(""+df.format(vAfp));

            }else{
                vAfp=7045.06*0.0725;
                this.cal_afp.setText(""+df.format(vAfp));      
            }
           
       }else{
           this.jLabel14.setText(""+df.format(hx.Nsuma));
            if(hx.Nsuma<7045.06){
                 vAfp= hx.Nsuma*0.0725;
                 this.cal_afp.setText(""+df.format(vAfp));

            }else{
                vAfp=7045.06*0.0725;
                this.cal_afp.setText(""+df.format(vAfp));      
            }
           
       }
         
       
       
    
    
    }
    
    public void sGravado(){
        frmPerfilEmp empi = new frmPerfilEmp();
        frmHorasExtras hx = new frmHorasExtras();

        if(hx.click < 1){
            vSgravado = empi.sueldo1-(vIss+vAfp);
            this.jLabel18.setText(empi.sueldo);
            this.jLabel19.setText(""+vIss);
            this.cal_afp2.setText(""+df.format(vAfp));
            this.resultado.setText("Sueldo gravado: "+df.format(vSgravado));

        }else {
            vSgravado = hx.Nsuma-(vIss+vAfp);
            this.jLabel18.setText(""+df.format(hx.Nsuma));
            this.jLabel19.setText(""+df.format(vIss));
            this.cal_afp2.setText(""+df.format(vAfp));
            this.resultado.setText("Sueldo gravado: "+df.format(vSgravado));
            
        }
        
        
        
        
    
    }
    public void cCargarTS(){
       frmPerfilEmp empi = new frmPerfilEmp();
       frmHorasExtras hx = new frmHorasExtras();

       if(hx.click < 1){
           this.jLabel42.setText("$  "+empi.sueldo);
            this.afp_renta.setText("$  "+ df.format(vAfp));
            this.iss_renta.setText("$  "+df.format(vIss));
            this.total_renta.setText("$  "+(df.format(vAfp+vIss)));
            this.renta_imponible.setText("$  "+df.format(vSgravado));
           
       }else {
           this.jLabel42.setText("$  "+df.format(hx.Nsuma));
            this.afp_renta.setText("$  "+ df.format(vAfp));
            this.iss_renta.setText("$  "+df.format(vIss));
            this.total_renta.setText("$  "+(df.format(vAfp+vIss)));
            this.renta_imponible.setText("$  "+df.format(vSgravado));
           
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

        Contenedor = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        afp_renta = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        iss_renta = new javax.swing.JLabel();
        total_renta = new javax.swing.JLabel();
        renta_imponible = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cal_afp2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cal_afp = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cal_iss = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("RENTA IMPONIBLE MENSUAL");
        Contenedor.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("Salario mensual:");
        Contenedor.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("Deducion mensual");
        Contenedor.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("$");
        Contenedor.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        afp_renta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        afp_renta.setText("$");
        Contenedor.add(afp_renta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 170, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("AFP: 7.25%");
        Contenedor.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("Dedupcion del ISS: 3%");
        Contenedor.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        iss_renta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        iss_renta.setText("iss_renta");
        Contenedor.add(iss_renta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 110, -1));

        total_renta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        total_renta.setText("$");
        Contenedor.add(total_renta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 107, -1));

        renta_imponible.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        renta_imponible.setText("$");
        Contenedor.add(renta_imponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 170, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("TOTAL");
        Contenedor.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel40.setText("Determinacion ISR");
        Contenedor.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel41.setText("Renta imponible");
        Contenedor.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Salario Gravado");
        Contenedor.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Sueldo");
        Contenedor.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel29.setText("(");
        Contenedor.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 20, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("ISS");
        Contenedor.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("+");
        Contenedor.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("AFP");
        Contenedor.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText(")");
        Contenedor.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 20, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText(")");
        Contenedor.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 10, -1));

        cal_afp2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cal_afp2.setText("AFP");
        Contenedor.add(cal_afp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("+");
        Contenedor.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("ISS");
        Contenedor.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("-");
        Contenedor.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 440, 20, -1));

        jLabel18.setText("Sueldo");
        Contenedor.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 440, 50, -1));

        resultado.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        resultado.setText("Resultado");
        Contenedor.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 180, -1));

        jLabel22.setText("(");
        Contenedor.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 440, 10, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("AFP:");
        Contenedor.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        cal_afp.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cal_afp.setText("resultado");
        Contenedor.add(cal_afp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel14.setText("variablesueldo");
        Contenedor.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Sueldo ");
        Contenedor.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Calculo de AFP");
        Contenedor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Porcentaje 7.25%");
        Contenedor.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jLabel16.setText("0.0725");
        Contenedor.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel15.setText("x");
        Contenedor.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        cal_iss.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cal_iss.setText("resultado");
        Contenedor.add(cal_iss, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel4.setText("variablesueldo");
        Contenedor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Sueldo ");
        Contenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Calculo de Iss");
        Contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 128, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Procentaje 3%");
        Contenedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel6.setText("0.03");
        Contenedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel5.setText("x");
        Contenedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel32.setText("Calculo Salario Gravado");
        Contenedor.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FRenta.png"))); // NOI18N
        Contenedor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -60, 990, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel afp_renta;
    private javax.swing.JLabel cal_afp;
    private javax.swing.JLabel cal_afp2;
    private javax.swing.JLabel cal_iss;
    private javax.swing.JLabel iss_renta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel renta_imponible;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel total_renta;
    // End of variables declaration//GEN-END:variables
}
