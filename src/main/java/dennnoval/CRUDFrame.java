package dennnoval;

public class CRUDFrame extends javax.swing.JFrame {
  
  public CRUDFrame() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
  private void initComponents() {

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>                        

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
      new CRUDFrame().setVisible(true);
    });
  }

  // Variables declaration - do not modify                     
  // End of variables declaration                   
}
