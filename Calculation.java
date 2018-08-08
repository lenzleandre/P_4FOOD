/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mcamelo
 */
@Entity
@Table(name = "Calculation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calculation.findAll", query = "SELECT c FROM Calculation c"),
    @NamedQuery(name = "Calculation.findById", query = "SELECT c FROM Calculation c WHERE c.id = :id"),
    @NamedQuery(name = "Calculation.findByNum1", query = "SELECT c FROM Calculation c WHERE c.num1 = :num1"),
    @NamedQuery(name = "Calculation.findByNum2", query = "SELECT c FROM Calculation c WHERE c.num2 = :num2"),
    @NamedQuery(name = "Calculation.findByResult", query = "SELECT c FROM Calculation c WHERE c.result = :result"),
    @NamedQuery(name = "Calculation.findByOperator", query = "SELECT c FROM Calculation c WHERE c.operator = :operator"),
    @NamedQuery(name = "Calculation.findByDate", query = "SELECT c FROM Calculation c WHERE c.date = :date")})
public class Calculation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num1")
    private int num1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num2")
    private int num2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "result")
    private int result;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "operator")
    private String operator;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Calculation() {
    }

    public Calculation(int num1, int num2, int result, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.operator = operator;
        this.date = new Date(System.currentTimeMillis());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        if (!(object instanceof Calculation)) {
            return false;
        }
        Calculation other = (Calculation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Calculation[ id=" + id + " ]";
    }
    
}
