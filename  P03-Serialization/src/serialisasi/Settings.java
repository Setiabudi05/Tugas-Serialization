/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author ACER
 */

public class Settings implements Serializable {

    private static final long serialVersionUID = 1L;

    private int fontSize;
    private String theme;

    public Settings(int fontSize, String theme) {
        this.fontSize = fontSize;
        this.theme = theme;
    }

    // Getter dan setter untuk fontSize
    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    // Getter dan setter untuk theme
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
