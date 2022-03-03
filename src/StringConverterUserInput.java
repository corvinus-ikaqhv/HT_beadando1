import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringConverterUserInput
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";
        String encryptedString = "";
        char nextChar;

        try
        {
            userInput = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Integer userInputLength = userInput.length();
        Character[] userInputCharacthers = new Character[userInputLength];

        for (int i = 0; i < userInputLength; i++)
        {
            userInputCharacthers[i] = userInput.charAt(i);

            if (userInputCharacthers[i] == 'z')
            {
                nextChar = 'a';
            }
            else if (userInputCharacthers[i] == 'Z')
            {
                nextChar = 'A';
            }
            else
            {
                nextChar = (char) (((int) userInputCharacthers[i]) + 1);
            }
            encryptedString = encryptedString + nextChar;
        }
        System.out.println(encryptedString);
    }
}
