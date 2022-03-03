import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileBrowser {
    public String file = null;

    public static void main(String[] args)
    {

    }

    public String BrowseForFile(String str)
    {
    JFileChooser fileopen = new JFileChooser();
    FileFilter filter = new FileNameExtensionFilter(".txt", "txt");
    fileopen.addChoosableFileFilter(filter);
    int ret = fileopen.showDialog(null, str);
    if(ret ==JFileChooser.APPROVE_OPTION)
    {
    file = String.valueOf(fileopen.getSelectedFile());
    //System.out.println(file);
    }
    return file;
    }
}