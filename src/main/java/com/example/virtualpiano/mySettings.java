package com.example.virtualpiano;


import javafx.scene.input.KeyCode;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mySettings {
    public static int streak = 0;
    public static String Username = "";
    public static String Password = "";
    public static int MAXCODE = 1000;
    public static int MAXKEYS = 70;
    public static int darkMode = 1;
    public static Date lastLog;
    public static int X = 1280;
    public static int Y = 720;
    public static boolean LoggedIn = false;
    public static int[] buttonToCode = new int[MAXKEYS];
    public static int[] codeToButton = new int[MAXCODE];
    public static char[] intCodeToChar = new char[MAXCODE];
    public static int[] charToIntCode = new int[MAXCODE];

    public static String iconPath = "C:\\Users\\LENOVO\\Desktop\\VirtualPiano\\src\\main\\resources\\com\\example\\img\\logo.png";

    public static String folderPath = "C:\\Users\\LENOVO\\Desktop\\VirtualPiano\\recordings";

    public static void openFolder(String folderPath) {
        if (Desktop.isDesktopSupported()) {
            try {
                File folder = new File(folderPath);
                Desktop.getDesktop().open(folder);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Desktop is not supported");
        }
    }
    public static char generateChar(KeyCode k, boolean shift)
    {
        if(k.equals(KeyCode.DIGIT1) && !shift) return '1';
        else if(k.equals(KeyCode.DIGIT1)) return '!';
        else if(k.equals(KeyCode.DIGIT2) && !shift) return '2';
        else if(k.equals(KeyCode.DIGIT2)) return '@';
        else if(k.equals(KeyCode.DIGIT3) && !shift) return '3';
        else if(k.equals(KeyCode.DIGIT3)) return '#';
        else if(k.equals(KeyCode.DIGIT4) && !shift) return '4';
        else if(k.equals(KeyCode.DIGIT4)) return '$';
        else if(k.equals(KeyCode.DIGIT5) && !shift) return '5';
        else if(k.equals(KeyCode.DIGIT5)) return '%';
        else if(k.equals(KeyCode.DIGIT6) && !shift) return '6';
        else if(k.equals(KeyCode.DIGIT6)) return '^';
        else if(k.equals(KeyCode.DIGIT7) && !shift) return '7';
        else if(k.equals(KeyCode.DIGIT7)) return '&';
        else if(k.equals(KeyCode.DIGIT8) && !shift) return '8';
        else if(k.equals(KeyCode.DIGIT8)) return '*';
        else if(k.equals(KeyCode.DIGIT9) && !shift) return '9';
        else if(k.equals(KeyCode.DIGIT9)) return '(';
        else if(k.equals(KeyCode.DIGIT0) && !shift) return '0';
        else if(k.equals(KeyCode.DIGIT0)) return ')';
        else if(k.equals(KeyCode.MINUS) && !shift) return '-';
        else if(k.equals(KeyCode.MINUS)) return '_';
        else if(k.equals(KeyCode.EQUALS) && !shift) return '=';
        else if(k.equals(KeyCode.EQUALS)) return '+';


        else if(k.equals(KeyCode.Q) && !shift) return 'q';
        else if(k.equals(KeyCode.Q)) return 'Q';
        else if(k.equals(KeyCode.W) && !shift) return 'w';
        else if(k.equals(KeyCode.W)) return 'W';
        else if(k.equals(KeyCode.E) && !shift) return 'e';
        else if(k.equals(KeyCode.E)) return 'E';
        else if(k.equals(KeyCode.R) && !shift) return 'r';
        else if(k.equals(KeyCode.R)) return 'R';
        else if(k.equals(KeyCode.T) && !shift) return 't';
        else if(k.equals(KeyCode.T)) return 'T';
        else if(k.equals(KeyCode.Y) && !shift) return 'y';
        else if(k.equals(KeyCode.Y)) return 'Y';
        else if(k.equals(KeyCode.U) && !shift) return 'u';
        else if(k.equals(KeyCode.U)) return 'U';
        else if(k.equals(KeyCode.I) && !shift) return 'i';
        else if(k.equals(KeyCode.I)) return 'I';
        else if(k.equals(KeyCode.O) && !shift) return 'o';
        else if(k.equals(KeyCode.O)) return 'O';
        else if(k.equals(KeyCode.P) && !shift) return 'p';
        else if(k.equals(KeyCode.P)) return 'P';
        else if(k.equals(KeyCode.OPEN_BRACKET) && !shift) return '[';
        else if(k.equals(KeyCode.OPEN_BRACKET)) return '{';
        else if(k.equals(KeyCode.CLOSE_BRACKET) && !shift) return ']';
        else if(k.equals(KeyCode.CLOSE_BRACKET)) return '}';
        else if(k.equals(KeyCode.BACK_SLASH) && !shift) return '\\';
        else if(k.equals(KeyCode.BACK_SLASH)) return '|';
        else if(k.equals(KeyCode.A) && !shift) return 'a';
        else if(k.equals(KeyCode.A)) return 'A';
        else if(k.equals(KeyCode.S) && !shift) return 's';
        else if(k.equals(KeyCode.S)) return 'S';
        else if(k.equals(KeyCode.D) && !shift) return 'd';
        else if(k.equals(KeyCode.D)) return 'D';
        else if(k.equals(KeyCode.F) && !shift) return 'f';
        else if(k.equals(KeyCode.F)) return 'F';
        else if(k.equals(KeyCode.G) && !shift) return 'g';
        else if(k.equals(KeyCode.G)) return 'G';
        else if(k.equals(KeyCode.H) && !shift) return 'h';
        else if(k.equals(KeyCode.H)) return 'H';
        else if(k.equals(KeyCode.J) && !shift) return 'j';
        else if(k.equals(KeyCode.J)) return 'J';
        else if(k.equals(KeyCode.K) && !shift) return 'k';
        else if(k.equals(KeyCode.K)) return 'K';
        else if(k.equals(KeyCode.L) && !shift) return 'l';
        else if(k.equals(KeyCode.L)) return 'L';
        else if(k.equals(KeyCode.SEMICOLON) && !shift) return ';';
        else if(k.equals(KeyCode.SEMICOLON)) return ':';
        else if(k.equals(KeyCode.QUOTE) && !shift) return '\'';
        else if(k.equals(KeyCode.QUOTE)) return '"';
        else if(k.equals(KeyCode.Z) && !shift) return 'z';
        else if(k.equals(KeyCode.Z)) return 'Z';
        else if(k.equals(KeyCode.X) && !shift) return 'x';
        else if(k.equals(KeyCode.X)) return 'X';
        else if(k.equals(KeyCode.C) && !shift) return 'c';
        else if(k.equals(KeyCode.C)) return 'C';
        else if(k.equals(KeyCode.V) && !shift) return 'v';
        else if(k.equals(KeyCode.V)) return 'V';
        else if(k.equals(KeyCode.B) && !shift) return 'b';
        else if(k.equals(KeyCode.B)) return 'B';
        else if(k.equals(KeyCode.N) && !shift) return 'n';
        else if(k.equals(KeyCode.N)) return 'N';
        else if(k.equals(KeyCode.M) && !shift) return 'm';
        else if(k.equals(KeyCode.M)) return 'M';
        else if(k.equals(KeyCode.COMMA) && !shift) return ',';
        else if(k.equals(KeyCode.COMMA)) return '<';
        else if(k.equals(KeyCode.PERIOD) && !shift) return '.';
        else if(k.equals(KeyCode.PERIOD)) return '>';
        else if(k.equals(KeyCode.SLASH) && !shift) return '/';
        else if(k.equals(KeyCode.SLASH)) return '?';
        return '\0';
    }
    public static String generateCurrentDateTime() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        String formattedDate = myDateObj.format(myFormatObj);
//        System.out.println("Current date and time: " + formattedDate);
        return formattedDate;
    }
    public static int KeycodeToInt(KeyCode a, boolean b)
    {
        int ret = 500 * (b ? 1 : 0) + a.getCode();
        if(ret >= 0 && ret < MAXCODE) {
            intCodeToChar[ret] = generateChar(a, b);
            charToIntCode[generateChar(a, b)] = ret;
        }
        return ret;
    }

    public static void revertKeysToDefault()
    {
        // '1'
        codeToButton[KeycodeToInt(KeyCode.DIGIT1, false)] = 1;
        buttonToCode[1] = KeycodeToInt(KeyCode.DIGIT1, false);

        // '!'
        codeToButton[KeycodeToInt(KeyCode.DIGIT1, true)] = 2;
        buttonToCode[2] = KeycodeToInt(KeyCode.DIGIT1, true);

// '2'
        codeToButton[KeycodeToInt(KeyCode.DIGIT2, false)] = 3;
        buttonToCode[3] = KeycodeToInt(KeyCode.DIGIT2, false);

// '@'
        codeToButton[KeycodeToInt(KeyCode.DIGIT2, true)] = 4;
        buttonToCode[4] = KeycodeToInt(KeyCode.DIGIT2, true);

// '3'
        codeToButton[KeycodeToInt(KeyCode.DIGIT3, false)] = 5;
        buttonToCode[5] = KeycodeToInt(KeyCode.DIGIT3, false);

// '4'
        codeToButton[KeycodeToInt(KeyCode.DIGIT4, false)] = 6;
        buttonToCode[6] = KeycodeToInt(KeyCode.DIGIT4, false);

// '$'
        codeToButton[KeycodeToInt(KeyCode.DIGIT4, true)] = 7;
        buttonToCode[7] = KeycodeToInt(KeyCode.DIGIT4, true);

// '5'
        codeToButton[KeycodeToInt(KeyCode.DIGIT5, false)] = 8;
        buttonToCode[8] = KeycodeToInt(KeyCode.DIGIT5, false);

// '%'
        codeToButton[KeycodeToInt(KeyCode.DIGIT5, true)] = 9;
        buttonToCode[9] = KeycodeToInt(KeyCode.DIGIT5, true);

// '6'
        codeToButton[KeycodeToInt(KeyCode.DIGIT6, false)] = 10;
        buttonToCode[10] = KeycodeToInt(KeyCode.DIGIT6, false);

// '^'
        codeToButton[KeycodeToInt(KeyCode.DIGIT6, true)] = 11;
        buttonToCode[11] = KeycodeToInt(KeyCode.DIGIT6, true);

// '7'
        codeToButton[KeycodeToInt(KeyCode.DIGIT7, false)] = 12;
        buttonToCode[12] = KeycodeToInt(KeyCode.DIGIT7, false);

// '8'
        codeToButton[KeycodeToInt(KeyCode.DIGIT8, false)] = 13;
        buttonToCode[13] = KeycodeToInt(KeyCode.DIGIT8, false);

// '*'
        codeToButton[KeycodeToInt(KeyCode.DIGIT8, true)] = 14;
        buttonToCode[14] = KeycodeToInt(KeyCode.DIGIT8, true);

// '9'
        codeToButton[KeycodeToInt(KeyCode.DIGIT9, false)] = 15;
        buttonToCode[15] = KeycodeToInt(KeyCode.DIGIT9, false);

// '('
        codeToButton[KeycodeToInt(KeyCode.DIGIT9, true)] = 16;
        buttonToCode[16] = KeycodeToInt(KeyCode.DIGIT9, true);

// '0'
        codeToButton[KeycodeToInt(KeyCode.DIGIT0, false)] = 17;
        buttonToCode[17] = KeycodeToInt(KeyCode.DIGIT0, false);

        // 'q'
        codeToButton[KeycodeToInt(KeyCode.Q, false)] = 18;
        buttonToCode[18] = KeycodeToInt(KeyCode.Q, false);
// 'Q'
        codeToButton[KeycodeToInt(KeyCode.Q, true)] = 19;
        buttonToCode[19] = KeycodeToInt(KeyCode.Q, true);
// 'w'
        codeToButton[KeycodeToInt(KeyCode.W, false)] = 20;
        buttonToCode[20] = KeycodeToInt(KeyCode.W, false);
// 'W'
        codeToButton[KeycodeToInt(KeyCode.W, true)] = 21;
        buttonToCode[21] = KeycodeToInt(KeyCode.W, true);
// 'e'
        codeToButton[KeycodeToInt(KeyCode.E, false)] = 22;
        buttonToCode[22] = KeycodeToInt(KeyCode.E, false);
// 'E'
        codeToButton[KeycodeToInt(KeyCode.E, true)] = 23;
        buttonToCode[23] = KeycodeToInt(KeyCode.E, true);
// 'r'
        codeToButton[KeycodeToInt(KeyCode.R, false)] = 24;
        buttonToCode[24] = KeycodeToInt(KeyCode.R, false);
// 't'
        codeToButton[KeycodeToInt(KeyCode.T, false)] = 25;
        buttonToCode[25] = KeycodeToInt(KeyCode.T, false);
// 'T'
        codeToButton[KeycodeToInt(KeyCode.T, true)] = 26;
        buttonToCode[26] = KeycodeToInt(KeyCode.T, true);
// 'y'
        codeToButton[KeycodeToInt(KeyCode.Y, false)] = 27;
        buttonToCode[27] = KeycodeToInt(KeyCode.Y, false);
// 'Y'
        codeToButton[KeycodeToInt(KeyCode.Y, true)] = 28;
        buttonToCode[28] = KeycodeToInt(KeyCode.Y, true);
// 'u'
        codeToButton[KeycodeToInt(KeyCode.U, false)] = 29;
        buttonToCode[29] = KeycodeToInt(KeyCode.U, false);

        // 'i'
        codeToButton[KeycodeToInt(KeyCode.I, false)] = 30;
        buttonToCode[30] = KeycodeToInt(KeyCode.I, false);
// 'I'
        codeToButton[KeycodeToInt(KeyCode.I, true)] = 31;
        buttonToCode[31] = KeycodeToInt(KeyCode.I, true);
// 'o'
        codeToButton[KeycodeToInt(KeyCode.O, false)] = 32;
        buttonToCode[32] = KeycodeToInt(KeyCode.O, false);
// 'O'
        codeToButton[KeycodeToInt(KeyCode.O, true)] = 33;
        buttonToCode[33] = KeycodeToInt(KeyCode.O, true);
// 'p'
        codeToButton[KeycodeToInt(KeyCode.P, false)] = 34;
        buttonToCode[34] = KeycodeToInt(KeyCode.P, false);
// 'P'
        codeToButton[KeycodeToInt(KeyCode.P, true)] = 35;
        buttonToCode[35] = KeycodeToInt(KeyCode.P, true);
// 'a'
        codeToButton[KeycodeToInt(KeyCode.A, false)] = 36;
        buttonToCode[36] = KeycodeToInt(KeyCode.A, false);
        // 's'
        codeToButton[KeycodeToInt(KeyCode.S, false)] = 37;
        buttonToCode[37] = KeycodeToInt(KeyCode.S, false);
// 'S'
        codeToButton[KeycodeToInt(KeyCode.S, true)] = 38;
        buttonToCode[38] = KeycodeToInt(KeyCode.S, true);
// 'd'
        codeToButton[KeycodeToInt(KeyCode.D, false)] = 39;
        buttonToCode[39] = KeycodeToInt(KeyCode.D, false);

        // 'D'
        codeToButton[KeycodeToInt(KeyCode.D, true)] = 40;
        buttonToCode[40] = KeycodeToInt(KeyCode.D, true);

// 'f'
        codeToButton[KeycodeToInt(KeyCode.F, false)] = 41;
        buttonToCode[41] = KeycodeToInt(KeyCode.F, false);
        // 'g'
        codeToButton[KeycodeToInt(KeyCode.G, false)] = 42;
        buttonToCode[42] = KeycodeToInt(KeyCode.G, false);
// 'G'
        codeToButton[KeycodeToInt(KeyCode.G, true)] = 43;
        buttonToCode[43] = KeycodeToInt(KeyCode.G, true);
// 'h'
        codeToButton[KeycodeToInt(KeyCode.H, false)] = 44;
        buttonToCode[44] = KeycodeToInt(KeyCode.H, false);
// 'H'
        codeToButton[KeycodeToInt(KeyCode.H, true)] = 45;
        buttonToCode[45] = KeycodeToInt(KeyCode.H, true);
// 'j'
        codeToButton[KeycodeToInt(KeyCode.J, false)] = 46;
        buttonToCode[46] = KeycodeToInt(KeyCode.J, false);
// 'J'
        codeToButton[KeycodeToInt(KeyCode.J, true)] = 47;
        buttonToCode[47] = KeycodeToInt(KeyCode.J, true);
// 'k'
        codeToButton[KeycodeToInt(KeyCode.K, false)] = 48;
        buttonToCode[48] = KeycodeToInt(KeyCode.K, false);
        // l
        codeToButton[KeycodeToInt(KeyCode.L, false)] = 49;
        buttonToCode[49] = KeycodeToInt(KeyCode.L, false);
        //L
        codeToButton[KeycodeToInt(KeyCode.L, true)] = 50;
        buttonToCode[50] = KeycodeToInt(KeyCode.L, true);

// z
        codeToButton[KeycodeToInt(KeyCode.Z, false)] = 51;
        buttonToCode[51] = KeycodeToInt(KeyCode.Z, false);
        //Z
        codeToButton[KeycodeToInt(KeyCode.Z, true)] = 52;
        buttonToCode[52] = KeycodeToInt(KeyCode.Z, true);
        // 'x'
        codeToButton[KeycodeToInt(KeyCode.X, false)] = 53;
        buttonToCode[53] = KeycodeToInt(KeyCode.X, false);
        // 'c'
        codeToButton[KeycodeToInt(KeyCode.C, false)] = 54;
        buttonToCode[54] = KeycodeToInt(KeyCode.C, false);

// 'C'
        codeToButton[KeycodeToInt(KeyCode.C, true)] = 55;
        buttonToCode[55] = KeycodeToInt(KeyCode.C, true);

// 'v'
        codeToButton[KeycodeToInt(KeyCode.V, false)] = 56;
        buttonToCode[56] = KeycodeToInt(KeyCode.V, false);

// 'V'
        codeToButton[KeycodeToInt(KeyCode.V, true)] = 57;
        buttonToCode[57] = KeycodeToInt(KeyCode.V, true);

// 'b'
        codeToButton[KeycodeToInt(KeyCode.B, false)] = 58;
        buttonToCode[58] = KeycodeToInt(KeyCode.B, false);

// 'B'
        codeToButton[KeycodeToInt(KeyCode.B, true)] = 59;
        buttonToCode[59] = KeycodeToInt(KeyCode.B, true);
        // 'n'
        codeToButton[KeycodeToInt(KeyCode.N, false)] = 60;
        buttonToCode[60] = KeycodeToInt(KeyCode.N, false);
        // 'm'
        codeToButton[KeycodeToInt(KeyCode.M, false)] = 61;
        buttonToCode[61] = KeycodeToInt(KeyCode.M, false);
    }
}
