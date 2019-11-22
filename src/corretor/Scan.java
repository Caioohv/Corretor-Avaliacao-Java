package corretor;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class Scan {
	public static ArrayList<String> getPaths(){

        final JFileChooser fileDialog = new JFileChooser();
        String filenames = "", fileName = "";
        String g = "";
        ArrayList<String> listPaths = new ArrayList<String>();
		String[] paths = null, ras = null;
       
        fileDialog.setMultiSelectionEnabled(true);
        int option = fileDialog.showOpenDialog(null);
        if(option == JFileChooser.APPROVE_OPTION) 
        {
            File file1 = fileDialog.getSelectedFile();
            fileName = file1.getName();
            //System.out.println(fileName); 
            if(fileDialog.isMultiSelectionEnabled())
            {
                
                final File[] files = fileDialog.getSelectedFiles();
                if (files != null && files.length > 0){
                    paths = new String[files.length];
                    ras = new String[files.length];
                    //System.out.println("Arquivos selecionados:");
                    for (int x = 0; x < files.length; x++)
                    { 
                        //System.out.println(files[x].getName()+" - Path: "+files[x].getPath());
                        paths[x] = files[x].getPath();
                        ras[x] = files[x].getName();
                    //    System.out.println("Reading...");
                        listPaths.add(paths[x]);
                        //dtm.addRow(new Object[]{files[x].getName(), files[x].getPath()});
                        
                    }

                    }
                //for(String s: listPaths) {
                //	System.out.println(s);
                //}
            }
         } else if (option == JFileChooser.CANCEL_OPTION){
             System.out.println("Operação Cancelada.");  
         }
        
        //System.out.println("\n\n\n\n\n\n\n\n\nInserção de:\n\n");
        System.out.println("\n------------\n\nResult:");
        
        for(String p: listPaths) {
        	System.out.println(p);
        }
        System.out.println("\n------------\n\n");
        
        
		return listPaths;

	}
	
	public static void main(String[] args) {
		
		ArrayList<String> a = getPaths();
		for(String s: a) {
			System.out.println("path: "+s);
		}
		
}
}