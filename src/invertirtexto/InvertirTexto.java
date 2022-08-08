/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertirtexto;

/**
 *
 * @author m_mur
 */
public class InvertirTexto {
    
    public static void inv(char s[], int l, int r)
    {
        for (int i = l; i < r / 2; i++) {
            char temp = s[i];
            s[i] = s[r - 1 - i];
            s[r - 1 - i] = temp;
        }
    }
    public static void invertir(char s[])
    {
        char[] temp = new char[s.length];
        int x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                || s[i] >= 'A' && s[i] <= 'Z') {
                
                temp[x] = s[i];
                x++;
            }
        }
        inv(temp, 0, x);
        x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'|| s[i] >= 'A' && s[i] <= 'Z') {
                s[i] = temp[x];
                x++;
            }
        }
        String invert = new String(s);
        System.out.println("la cadena a invertir es: a-bC-dEf=ghlj!!");
        System.out.println("La cadena invertida es: " + invert);
    }
    
    public static void main(String[] args) {
    String str = "a-bC-dEf=ghlj!!";
        char[] charArray = str.toCharArray();
        invertir(charArray);
    }
}
       