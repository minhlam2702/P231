/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dr.p231;

/**
 *
 * @author minhdo
 */
public class MasterFile {

    public MasterFile(String proName, String type, String owner, String status) {
        this.proName = proName;
        this.type = type;
        this.owner = owner;
        this.status = status;
    }
    
    private String proName, type, owner, status;

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
