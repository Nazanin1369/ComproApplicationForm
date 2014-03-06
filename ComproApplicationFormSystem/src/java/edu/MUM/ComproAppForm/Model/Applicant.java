/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.MUM.ComproAppForm.Model;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nazanin
 */
@Entity
@Table(name = "applicant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Applicant.findAll", query = "SELECT a FROM Applicant a"),
    @NamedQuery(name = "Applicant.findById", query = "SELECT a FROM Applicant a WHERE a.id = :id"),
    @NamedQuery(name = "Applicant.findByFirstName", query = "SELECT a FROM Applicant a WHERE a.firstName = :firstName"),
    @NamedQuery(name = "Applicant.findByMiddleName", query = "SELECT a FROM Applicant a WHERE a.middleName = :middleName"),
    @NamedQuery(name = "Applicant.findByLastName", query = "SELECT a FROM Applicant a WHERE a.lastName = :lastName"),
    @NamedQuery(name = "Applicant.findByBirthDate", query = "SELECT a FROM Applicant a WHERE a.birthDate = :birthDate"),
    @NamedQuery(name = "Applicant.findByHomephone", query = "SELECT a FROM Applicant a WHERE a.homephone = :homephone"),
    @NamedQuery(name = "Applicant.findByMobilephone", query = "SELECT a FROM Applicant a WHERE a.mobilephone = :mobilephone"),
    @NamedQuery(name = "Applicant.findByWorkphone", query = "SELECT a FROM Applicant a WHERE a.workphone = :workphone"),
    @NamedQuery(name = "Applicant.findByEmail", query = "SELECT a FROM Applicant a WHERE a.email = :email")})
public class Applicant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Size(max = 50)
    @Column(name = "firstName")
    private String firstName;
    @Size(max = 50)
    @Column(name = "middleName")
    private String middleName;
    @Size(max = 50)
    @Column(name = "lastName")
    private String lastName;
    @Size(max = 25)
    @Column(name = "birthDate")
    private String birthDate;
    @Size(max = 25)
    @Column(name = "homephone")
    private String homephone;
    @Size(max = 25)
    @Column(name = "mobilephone")
    private String mobilephone;
    @Size(max = 25)
    @Column(name = "workphone")
    private String workphone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;

    public Applicant() {
    }

    public Applicant(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getWorkphone() {
        return workphone;
    }

    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Applicant)) {
            return false;
        }
        Applicant other = (Applicant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.MUM.ComproAppForm.Model.Applicant[ id=" + id + " ]";
    }
    
}
