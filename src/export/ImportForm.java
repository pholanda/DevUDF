package export;

/**
 *
 * @author holanda
 */
public class ImportForm extends javax.swing.JPanel {

    /**
     * Creates new form ImportForm
     */
    public ImportForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "mean", "mean_deviation", "square_root", "standard_deviation", "variance", " ", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jCheckBox1.setText("Select All");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Import");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jCheckBox1)
                                        .addComponent(jButton1))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
