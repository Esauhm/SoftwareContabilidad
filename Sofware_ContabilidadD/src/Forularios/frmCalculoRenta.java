/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Forularios;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
//


/**
 *
 * @author William
 */
public class frmCalculoRenta extends javax.swing.JPanel {
    //frmPerfilEmp emp = new frmPerfilEmp();
    frmsGravado salGrav = new frmsGravado();
    //frmBoltaP pago = new frmBoltaP();
    double temp,isr;
    
    /**
     * Creates new form frmCalculoRenta
     */
   
    DecimalFormat df = new DecimalFormat("#.00");
    public frmCalculoRenta() {
        initComponents();
        this.calcularRentar();
        
    }

    public void calcularRentar() {
        if(salGrav.vSgravado < 472 && salGrav.vSgravado> 0.01) {
    
             this.jLabel9.setText("\"Tramo 1. Sin retencion\"");
             lblSalarioGravado.setText(Double.toString(salGrav.vSgravado)); 
             lblSalarioLiquido.setText(Double.toString(salGrav.vSgravado));
             this.calculo.setText("Desde: $0.01     Hasta: $472.00      % A Aplicar:0%      Sobre el Exceso:$0      Cuota fija:$0");
             
           
        }
        else if (salGrav.vSgravado >= 472.01 && salGrav.vSgravado <= 895.24) 
        {
            this.jLabel10.setText("Tramo 2. Retencion del 10%");
            this.calculo.setText("Desde: $472.01      Hasta:$895.25       % A Aplicar:10%"
                    + "       Sobre el Exceso:$472.00      Cuota fija:$17.67");
            
             this.proceso_renta.setText(String.valueOf((salGrav.vSgravado +" - 472.00 = "+df.format((salGrav.vSgravado-472.00)))
                     +" X 10% = "+df.format(((salGrav.vSgravado-472.00)*0.1))+" + 17.67"+" = "+df.format((((salGrav.vSgravado-472.00)*0.1)+17.67))
             ));
            temp = salGrav.vSgravado;
            temp = temp-472;
            temp = temp * 0.1;
            temp = temp + 17.67;
            
            this.isr=temp;
            
            this.RENTA.setText(""+df.format((((salGrav.vSgravado-472.00)*0.1)+17.67)));
            temp = salGrav.vSgravado - temp;
            
            //String temp2 = Double.toString(temp);
            double temp2 = temp;
            lblSalarioGravado.setText(Double.toString(salGrav.vSgravado)); 
            this.liquido.setText(""+df.format(temp2)); 
             

        }
        else if (salGrav.vSgravado >= 895.25 && salGrav.vSgravado <= 2038.10) 
        {
             this.jLabel10.setText("Tramo 3. Retencion del 20%");
            this.calculo.setText("Desde: $895.25      Hasta:$2,038.10       % A Aplicar:20%"
                    + "       Sobre el Exceso:$895.24      Cuota fija:$60.00");
            
             this.proceso_renta.setText(String.valueOf((salGrav.vSgravado +" - 895.24 = "+df.format((salGrav.vSgravado-895.24)))
                     +" X 20% = "+df.format(((salGrav.vSgravado-895.24)*0.2))+" + 60.00"+" = "+df.format((((salGrav.vSgravado-895.24)*0.2)+60))
             ));
             
             temp = salGrav.vSgravado;
             temp = temp-895.24;
             temp = temp * 0.2;
             temp = temp + 60;
             this.isr=temp;
             this.RENTA.setText(""+ df.format((((salGrav.vSgravado-895.24)*0.2)+60)));
             temp = salGrav.vSgravado - temp;
             
               double temp2 = temp;
             lblSalarioGravado.setText( Double.toString( salGrav.vSgravado));
             this.liquido.setText(""+df.format(temp2));    
        }
        else if (salGrav.vSgravado > 2038.10){
            this.jLabel10.setText("Tramo 4. Retencion del 30%");
            this.calculo.setText("Desde: $2,038.11      Hasta: En adelante       % A Aplicar:30%"
                    + "       Sobre el Exceso:$2,038.10      Cuota fija:$288.57");
            
            this.proceso_renta.setText(String.valueOf((salGrav.vSgravado +" - 2,038.10 = "+df.format((salGrav.vSgravado-2038.10)))
                     +" X 30% = "+df.format(((salGrav.vSgravado-2038.10)*0.3))+" + 288.57"+" = "+df.format((((salGrav.vSgravado-2038.10)*0.3)+288.57))
             ));
            
            temp = salGrav.vSgravado;
            temp = temp-2038.10;
            temp = temp * 0.3;
            temp = temp + 288.57;
            this.isr=temp;
            this.RENTA.setText(""+df.format((((salGrav.vSgravado-2038.10)*0.3)+288.57)));
            temp = salGrav.vSgravado - temp;
            
            double temp2 = temp;
            lblSalarioGravado.setText(Double.toString(salGrav.vSgravado)); 
            
            this.liquido.setText(""+df.format(temp2));   
        }else{
            JOptionPane.showMessageDialog(null,"A ocurrido un error");  
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSalarioLiquido = new javax.swing.JLabel();
        liquido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSalarioGravado = new javax.swing.JLabel();
        RENTA = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        calculo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        proceso_renta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calculo1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Salario gravado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Salario liquido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        lblSalarioLiquido.setToolTipText("");
        jPanel1.add(lblSalarioLiquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 92, 30));

        liquido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        liquido.setText("$");
        jPanel1.add(liquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 260, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CALCULO RENTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Descuento: Renta");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        lblSalarioGravado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSalarioGravado.setText("$");
        jPanel1.add(lblSalarioGravado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 160, 30));

        RENTA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RENTA.setText("$");
        jPanel1.add(RENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 170, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 260, 30));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 366, 80, 20));

        calculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculo.setAutoscrolls(true);
        jPanel1.add(calculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 970, 30));

        jButton1.setText("Imprimir constancia Renta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 200, 30));

        proceso_renta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        proceso_renta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceso_renta.setText("cal2");
        proceso_renta.setAutoscrolls(true);
        jPanel1.add(proceso_renta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 970, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FRen.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 490));

        calculo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calculo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculo1.setAutoscrolls(true);
        jPanel1.add(calculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 970, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//BTN IMPRIMIR CONSTANCIA RENTA
        try {
            JasperReport jp = (JasperReport)
                    JRLoader.loadObject(frmBoltaP.class.getResource("/reportes/constancia_renta.jasper"));
            Map parametros = new HashMap<String,Object>();
            parametros.put("nombre",frmPerfilEmp.nombre);
            parametros.put("impuesto_renta",this.RENTA.getText());
            
            
            JasperPrint imprimir =
                    JasperFillManager.fillReport(jp,parametros ,new JREmptyDataSource());
            JasperViewer verpdf = new JasperViewer(imprimir);
            verpdf.show();
        } catch (JRException e) {
        }              
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RENTA;
    private javax.swing.JLabel calculo;
    private javax.swing.JLabel calculo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSalarioGravado;
    private javax.swing.JLabel lblSalarioLiquido;
    private javax.swing.JLabel liquido;
    private javax.swing.JLabel proceso_renta;
    // End of variables declaration//GEN-END:variables
}
