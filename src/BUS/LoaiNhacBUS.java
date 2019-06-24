/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DAO.LoaiNhacDAO;
import DTO.LoaiNhacDTO;

/**
 *
 * @author Quoc Dat
 */
public class LoaiNhacBUS {
    LoaiNhacDAO lnDAO = new LoaiNhacDAO();
    LoaiNhacDTO lnDTO = new LoaiNhacDTO();
    
    public LoaiNhacDTO addLNBUS(String name){ 
        lnDTO = lnDAO.addLNDAO(name);
        return lnDTO;
    }
    public LoaiNhacDTO xoaLNBUS(String name){
        lnDTO = lnDAO.xoaLNDAO(name);
        return lnDTO;
    }
    public LoaiNhacDTO getDichVuByNameBUS(String name){
        lnDTO = lnDAO.getDichVuByName(name);
        return lnDTO;
    }
}
