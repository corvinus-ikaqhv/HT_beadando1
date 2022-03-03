import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringConverterTextFile
{
        public static void main(String[] args) throws IOException
        {
            FileBrowser fbIn = new FileBrowser();
            String SourceFilePath = fbIn.BrowseForFile("Choose input file");

            FileBrowser fbOut = new FileBrowser();
            String OutFilePath = fbIn.BrowseForFile("Choose output file");

            BufferedReader inFile = new BufferedReader(new FileReader(SourceFilePath));
            FileWriter outFile = new FileWriter(OutFilePath);

            char nextChar;
            String line = inFile.readLine();
            String encryptedString = "";
            Integer lineLength = 0;
            Character lineCharacters;

            while (line != null)
            {
                lineLength = line.length();
                encryptedString = "";
                for (int i = 0; i < lineLength; i++)
                {
                    lineCharacters = line.charAt(i);
                    if (lineCharacters == 'z')
                    {
                        nextChar = 'a';
                    }
                    else if (lineCharacters == 'Z')
                    {
                        nextChar = 'A';
                    }
                    else
                    {
                        nextChar = (char) (((int) lineCharacters) + 1);
                        encryptedString = encryptedString + nextChar;
                    }
                }
                line = inFile.readLine();
                System.out.println(encryptedString);
                outFile.write(encryptedString + "\n");
            }
            inFile.close();
            outFile.flush();
            outFile.close();
        }
}
