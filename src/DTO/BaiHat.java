/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Quoc Dat
 */
public class BaiHat {
    private int id;
    private String name;
    private String lyric;
    private boolean banQuyen;

    public BaiHat() {
    }

    public BaiHat(int id, String name, String lyric, boolean banQuyen) {
        this.id = id;
        this.name = name;
        this.lyric = lyric;
        this.banQuyen = banQuyen;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public void setBanQuyen(boolean banQuyen) {
        this.banQuyen = banQuyen;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLyric() {
        return lyric;
    }

    public boolean isBanQuyen() {
        return banQuyen;
    }
    
}
