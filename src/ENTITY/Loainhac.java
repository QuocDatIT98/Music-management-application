/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTITY;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Quoc Dat
 */
@Entity
@Table(name = "loainhac")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loainhac.findAll", query = "SELECT l FROM Loainhac l"),
    @NamedQuery(name = "Loainhac.findById", query = "SELECT l FROM Loainhac l WHERE l.id = :id"),
    @NamedQuery(name = "Loainhac.findByName", query = "SELECT l FROM Loainhac l WHERE l.name = :name")})
public class Loainhac implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public Loainhac() {
    }

    public Loainhac(Integer id) {
        this.id = id;
    }
    public Loainhac(String name) {        
        this.name = name;
    }
    public Loainhac(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loainhac)) {
            return false;
        }
        Loainhac other = (Loainhac) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ENTITY.Loainhac[ id=" + id + " ]";
    }
    
}
