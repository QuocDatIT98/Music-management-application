/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import DTO.BaiHat;
/**
 *
 * @author Quoc Dat
 */
public class LoaiNhacDTO {
    private int id;
    private String name;
    private ArrayList<BaiHat> arrBaiHat = new ArrayList<>();

    public LoaiNhacDTO() {
    }

    public LoaiNhacDTO(int id, String name, ArrayList<BaiHat> arrBaiHat) {
        this.id = id;
        this.name = name;
        this.arrBaiHat = arrBaiHat;
    }
    public LoaiNhacDTO(int id, String name) {
        this.id = id;
        this.name = name;      
    }
    public LoaiNhacDTO(String name) {
        this.name = name;      
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArrBaiHat(ArrayList<BaiHat> arrBaiHat) {
        this.arrBaiHat = arrBaiHat;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<BaiHat> getArrBaiHat() {
        return arrBaiHat;
    }
    
}
