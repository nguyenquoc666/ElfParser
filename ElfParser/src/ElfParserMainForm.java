
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.Math.pow;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Quoc
 */
public class ElfParserMainForm extends javax.swing.JFrame {

  /**
   * Creates new form ElfParserMainForm
   */
  public ElfParserMainForm() {
    initComponents();
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
    jPanel2 = new javax.swing.JPanel();
    btnOpen = new javax.swing.JButton();
    btnReset = new javax.swing.JButton();
    btnAbout = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    tabContain = new javax.swing.JTabbedPane();
    tabOverview = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtaText = new javax.swing.JTextArea();
    tabELFHeader = new javax.swing.JPanel();
    tabSHeaders = new javax.swing.JPanel();
    tabPHeaders = new javax.swing.JPanel();
    tabSymbols = new javax.swing.JPanel();
    tabCapabilities = new javax.swing.JPanel();
    tabScoring = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Score"));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 65, Short.MAX_VALUE)
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Controls"));

    btnOpen.setText("Open");
    btnOpen.setName(""); // NOI18N
    btnOpen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpenActionPerformed(evt);
      }
    });

    btnReset.setText("Reset");

    btnAbout.setText("About");

    btnClose.setText("Close");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
          .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnOpen)
          .addComponent(btnReset))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnAbout)
          .addComponent(btnClose))
        .addGap(30, 30, 30))
    );

    txtaText.setColumns(20);
    txtaText.setRows(5);
    jScrollPane1.setViewportView(txtaText);

    javax.swing.GroupLayout tabOverviewLayout = new javax.swing.GroupLayout(tabOverview);
    tabOverview.setLayout(tabOverviewLayout);
    tabOverviewLayout.setHorizontalGroup(
      tabOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabOverviewLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        .addContainerGap())
    );
    tabOverviewLayout.setVerticalGroup(
      tabOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tabOverviewLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        .addContainerGap())
    );

    tabContain.addTab("Overview", tabOverview);

    javax.swing.GroupLayout tabELFHeaderLayout = new javax.swing.GroupLayout(tabELFHeader);
    tabELFHeader.setLayout(tabELFHeaderLayout);
    tabELFHeaderLayout.setHorizontalGroup(
      tabELFHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 560, Short.MAX_VALUE)
    );
    tabELFHeaderLayout.setVerticalGroup(
      tabELFHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 422, Short.MAX_VALUE)
    );

    tabContain.addTab("ELF Header", tabELFHeader);

    javax.swing.GroupLayout tabSHeadersLayout = new javax.swing.GroupLayout(tabSHeaders);
    tabSHeaders.setLayout(tabSHeadersLayout);
    tabSHeadersLayout.setHorizontalGroup(
      tabSHeadersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 560, Short.MAX_VALUE)
    );
    tabSHeadersLayout.setVerticalGroup(
      tabSHeadersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 422, Short.MAX_VALUE)
    );

    tabContain.addTab("SHeaders", tabSHeaders);

    javax.swing.GroupLayout tabPHeadersLayout = new javax.swing.GroupLayout(tabPHeaders);
    tabPHeaders.setLayout(tabPHeadersLayout);
    tabPHeadersLayout.setHorizontalGroup(
      tabPHeadersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 560, Short.MAX_VALUE)
    );
    tabPHeadersLayout.setVerticalGroup(
      tabPHeadersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 422, Short.MAX_VALUE)
    );

    tabContain.addTab("PHeaders", tabPHeaders);

    javax.swing.GroupLayout tabSymbolsLayout = new javax.swing.GroupLayout(tabSymbols);
    tabSymbols.setLayout(tabSymbolsLayout);
    tabSymbolsLayout.setHorizontalGroup(
      tabSymbolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 560, Short.MAX_VALUE)
    );
    tabSymbolsLayout.setVerticalGroup(
      tabSymbolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 422, Short.MAX_VALUE)
    );

    tabContain.addTab("Symbols", tabSymbols);

    javax.swing.GroupLayout tabCapabilitiesLayout = new javax.swing.GroupLayout(tabCapabilities);
    tabCapabilities.setLayout(tabCapabilitiesLayout);
    tabCapabilitiesLayout.setHorizontalGroup(
      tabCapabilitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 560, Short.MAX_VALUE)
    );
    tabCapabilitiesLayout.setVerticalGroup(
      tabCapabilitiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 422, Short.MAX_VALUE)
    );

    tabContain.addTab("Capabilities", tabCapabilities);

    javax.swing.GroupLayout tabScoringLayout = new javax.swing.GroupLayout(tabScoring);
    tabScoring.setLayout(tabScoringLayout);
    tabScoringLayout.setHorizontalGroup(
      tabScoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 560, Short.MAX_VALUE)
    );
    tabScoringLayout.setVerticalGroup(
      tabScoringLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 422, Short.MAX_VALUE)
    );

    tabContain.addTab("Scoring", tabScoring);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(tabContain, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(tabContain, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(23, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  
  
  // declare variables:
  // constant
  public static final byte constantElfHeaderLength = 52;
  
  // var of elf header
  public String ei_mag = "ELF";
  public byte ei_class = 0;
  public byte ei_data = 0;
  public byte ei_version = 0;
  public String ei_osabi = "";
  public byte ei_abiver = 0;
  public byte ei_pad = 0;
  public String e_type = "";
  public String e_machine = "";
  public byte e_ver = 0;
  public String e_entry = "";
  public int e_phoff = 0;
  public int e_shoff = 0;
  public String e_flags = "";
  public int e_ehsize = 0;
  public int e_phentsize = 0;
  public int e_phnum = 0;
  public int e_shentsize = 0;
  public int e_shnum = 0;
  public int e_shstrndx = 0;
  
  // var of program header
  public String p_type = "";
  public int p_offset = 0;
  public String vadrr = "";
  public String p_paddr = "";
  public int p_filesz = 0;
  public int p_memsz = 0;
  public String p_flags = "";
  public byte p_align = 0;
  
  // var of section header
  public String s_name = "";
  public String s_type = "";
  public String s_flags = "";
  public String s_vaddr = "";
  public int s_offset = 0;
  public int s_size = 0;
  public String link = "";
  
  // function convert string input to hexa string
  public String toHex(File file){
    StringBuilder builder = new StringBuilder();
    try {
      FileInputStream fin = new FileInputStream(file);
      byte[] buffer = new byte[1024];
      int bytesRead = 0;
      while((bytesRead = fin.read(buffer)) > -1)
        for(int i = 0; i < bytesRead; i++)
          builder.append(String.format("%02x", buffer[i] & 0xFF)).append(i != bytesRead - 1 ? " " : "");
    } catch (IOException e) {
      e.printStackTrace();
    }
    return builder.toString();
  }
  // convert string hex  to int little endian
  public int convertHex2IntLEB(String str){
    int strLen = str.length();
    int res = 0;
    for (int i = 0; i < strLen ; i+=3){
      int temp = 0;
      temp =  Integer.parseInt(str.substring(i, i+2), 16 );
      res = (int) (res + temp*(pow(100, i/3)));
    }
    return res;
  }
  
  // elf header process
  public void elfHeaderProc(String strElfHeaderInput){
    String mag =        strElfHeaderInput.substring(0, 3*4);
    String cla =        strElfHeaderInput.substring(3*4, 3*4+3*1);
    String data =       strElfHeaderInput.substring(3*5, 3*5+3*1);
    String ei_ver =    strElfHeaderInput.substring(3*6, 3*6+3*1);
    String osabi =      strElfHeaderInput.substring(3*7, 3*7+3*1);
    String abiver =     strElfHeaderInput.substring(3*8, 3*8+3*1);
    String pad =        strElfHeaderInput.substring(3*9, 3*9+3*7);
    String type =       strElfHeaderInput.substring(3*16, 3*16+3*2);
    String machine =    strElfHeaderInput.substring(3*18, 3*18+3*2);
    String elf_ver =        strElfHeaderInput.substring(3*20, 3*20+3*4);
    String entry =      strElfHeaderInput.substring(3*24, 3*24+3*4);
    String phoff =      strElfHeaderInput.substring(3*28, 3*28+3*4);
    String shoff =      strElfHeaderInput.substring(3*32, 3*32+3*4);
    String flags =      strElfHeaderInput.substring(3*36, 3*36+3*4);
    String ehsize =     strElfHeaderInput.substring(3*40, 3*40+3*2);
    String phentsize =  strElfHeaderInput.substring(3*42, 3*42+3*2);
    String phnum =      strElfHeaderInput.substring(3*44, 3*44+3*2);
    String shentsize =  strElfHeaderInput.substring(3*46, 3*46+3*2);
    String shnum =      strElfHeaderInput.substring(3*48, 3*48+3*2);
    String shstrndx =   strElfHeaderInput.substring(3*50, 3*50+3*2);
    System.out.printf("\n ===========================================");
    System.out.printf("\n" + mag);
    System.out.printf("\n" + cla);
    System.out.printf("\n" + data);
    System.out.printf("\n" + ei_ver);
    System.out.printf("\n" + osabi);
    System.out.printf("\n" + abiver);
    System.out.printf("\n" + pad);
    System.out.printf("\n" + type);
    System.out.printf("\n" + machine);
    System.out.printf("\n" + elf_ver);
    System.out.printf("\n" + entry);
    System.out.printf("\n" + phoff);
    System.out.printf("\n" + shoff);
    System.out.printf("\n" + flags);
    System.out.printf("\n" + ehsize);
    System.out.printf("\n" + phentsize);
    System.out.printf("\n" + phnum);
    System.out.printf("\n" + shentsize);
    System.out.printf("\n" + shnum);
    System.out.printf("\n" + shstrndx);
    
    switch (cla){
      case "01 ": 
        ei_class = 1;
        break;
      case "02 ":
        ei_class = 2;
        break;
      default:
        ei_class = 0;
        break;
    }
    switch (data){
      case "01 ": 
        ei_data = 1;
        break;
      case "02 ":
        ei_data = 2;
        break;
      default:
        ei_data = 0;
        break;
    }
    ei_version = Byte.parseByte(ei_ver.trim());
    switch (osabi){
      case "00 ":
        ei_osabi = "System V";
        break;
      case "01 ":
        ei_osabi = "HP-UX";
        break;
      case "02 ":
        ei_osabi = "NetBSD";
        break;
      case "03 ":
        ei_osabi = "Linux";
        break;
      case "06 ":
        ei_osabi = "Solaris";
        break;
      case "07 ":
        ei_osabi = "AIX";
        break;
      case "08 ":
        ei_osabi = "IRIX";
        break;
      case "09 ":
        ei_osabi = "FreeBSD";
        break;
      case "0c ":
        ei_osabi = "OpenBSD";
        break;
      case "0d ":
        ei_osabi = "	OpenVMS";
        break;
      case "0e ":
        ei_osabi = "NSK operating system";
        break;
      case "0f ":
        ei_osabi = "AROS";
        break;
      case "10 ":
        ei_osabi = "Fenix OS";
        break;
      case "11 ":
        ei_osabi = "CloudABI";
        break;
      case "53 ":
        ei_osabi = "Sortix";
        break;
      default:
        ei_osabi = "unknow";
        break;
    }
    ei_abiver = Byte.parseByte(abiver.trim());
//    ei_pad = Byte.parseByte(pad.trim()); // unuse
    switch (type){
      case "01 00 ":
        e_type = "relocatable";
        break;
      case "02 00 ":
        e_type = "executable";
        break;
      case "03 00 ":
        e_type = "shared";
        break;
      case "04 00 ":
        e_type = "respectively";
        break;
    }
    switch (machine){
      case "00 00 " :
        e_machine = "No specific instruction set";
        break;
      case "02 00 ":
        e_machine = "SPARC";
        break;
      case "03 00 ":
        e_machine = "x86";
        break;
      case "08 00 ":
        e_machine = "MIPS";
        break;
      case "14 00 ":
        e_machine = "PowerPC";
        break;
      case "28 00 ":
        e_machine = "ARM";
        break;
      case "2a 00 ":
        e_machine = "SuperH";
        break;
      case "32 00 ":
        e_machine = "IA-64";
        break;
      case "3e 00 ":
        e_machine = "x86-64";
        break;
      case "b7 00 ":
        e_machine = "AArch64";
        break;
      default:
        e_machine = "unknow";
        break;
    }
    switch (elf_ver){
      case "01 00 00 00 ": 
        e_ver = 1;
        break;
      default:
        e_ver = 0;
        break;
    }
    e_entry = ("0x"+entry.replaceAll("\\s+","").trim());
    e_phoff = convertHex2IntLEB(phoff);
    e_shoff = convertHex2IntLEB(shoff);
    e_flags = ("0x"+flags.replaceAll("\\s+","").trim());
    e_ehsize = 52;
    e_phentsize = 32;
    e_phnum = convertHex2IntLEB(phnum);
    e_shentsize = 40;
    e_shnum = convertHex2IntLEB(shnum);
//
    System.out.printf("\n ===========================================");
    System.out.printf("\n" + ei_class);
    System.out.printf("\n" + ei_data);
    System.out.printf("\n" + ei_version);
    System.out.printf("\n" + ei_osabi);
    System.out.printf("\n" + ei_abiver);
    System.out.printf("\n" + ei_pad);
    System.out.printf("\n" + e_type);
    System.out.printf("\n" + e_machine);
    System.out.printf("\n" + e_ver);
    System.out.printf("\n ===========================================");
    System.out.printf("\n" + e_entry);
    System.out.printf("\n" + e_phoff);
    System.out.printf("\n" + e_shoff);
    System.out.printf("\n" + e_flags);
    System.out.printf("\n" + e_ehsize);
    System.out.printf("\n" + e_phentsize);
    System.out.printf("\n" + e_phnum);
    System.out.printf("\n" + e_shentsize);
    System.out.printf("\n" + e_shnum);
    
  }
  
  // program header process
  
  // section header process
  
  // process
  public void parse(String strElfInput){
    String strElfHeader = strElfInput.substring(0, constantElfHeaderLength*3);
    System.out.printf(strElfHeader);
    
    elfHeaderProc(strElfHeader);
  }
  
  private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
    //    test
    
    // TODO add your handling code here:
    JFileChooser openFile = new JFileChooser();
    openFile.showOpenDialog(null);
    File inputFile = openFile.getSelectedFile();
//    File inputFile = new File("C:\\Users\\Quoc\\Desktop\\text.o");
    
    String inputFilePath = inputFile.getAbsolutePath();
    String inputFileHex = toHex(inputFile);
    System.out.println(inputFileHex);
    txtaText.append(inputFileHex);
    parse(inputFileHex);
  }//GEN-LAST:event_btnOpenActionPerformed

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
      java.util.logging.Logger.getLogger(ElfParserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ElfParserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ElfParserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ElfParserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ElfParserMainForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAbout;
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnOpen;
  private javax.swing.JButton btnReset;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JPanel tabCapabilities;
  private javax.swing.JTabbedPane tabContain;
  private javax.swing.JPanel tabELFHeader;
  private javax.swing.JPanel tabOverview;
  private javax.swing.JPanel tabPHeaders;
  private javax.swing.JPanel tabSHeaders;
  private javax.swing.JPanel tabScoring;
  private javax.swing.JPanel tabSymbols;
  private javax.swing.JTextArea txtaText;
  // End of variables declaration//GEN-END:variables
}
