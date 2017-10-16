/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dr.p231;

import java.util.Date;

/**
 *
 * @author minhdo
 */
public class DailyReport extends MasterFile{

    public DailyReport(Date planComDate, Date dateReport, String proManager, String statusComplete, String sqe, 
            float perComplete, float uiReview, float stpValReport, 
            int totalDefFound, int totalDefRe, int curOpenDef, int givBudget, int estBudget, int conHours, int estToCompleteHours, int estToCompleteFirstRunHours, int resources,
            String proName, String type, String owner, String status) {
        super(proName, type, owner, status);
        this.planComDate = planComDate;
        this.dateReport = dateReport;
        this.proManager = proManager;
        this.statusComplete = statusComplete;
        this.sqe = sqe;
        this.perComplete = perComplete;
        this.uiReview = uiReview;
        this.stpValReport = stpValReport;
        this.totalDefFound = totalDefFound;
        this.totalDefRe = totalDefRe;
        this.curOpenDef = curOpenDef;
        this.givBudget = givBudget;
        this.estBudget = estBudget;
        this.conHours = conHours;
        this.estToCompleteHours = estToCompleteHours;
        this.estToCompleteFirstRunHours = estToCompleteFirstRunHours;
        this.resources = resources;
    }
    
    
    private Date planComDate, dateReport;
    private String proManager, statusComplete,sqe;
    private float perComplete, uiReview, stpValReport;
    private int totalDefFound, totalDefRe, curOpenDef, givBudget, estBudget, conHours, estToCompleteHours, estToCompleteFirstRunHours, resources;

    public DailyReport(String proName, String type, String owner, String status) {
        super(proName, type, owner, status);                                                 
    }

    public Date getPlanComDate() {
        return planComDate;
    }

    public void setPlanComDate(Date planComDate) {
        this.planComDate = planComDate;
    }

    public Date getDateReport() {
        return dateReport;
    }

    public void setDateReport(Date dateReport) {
        this.dateReport = dateReport;
    }

    public String getProManager() {
        return proManager;
    }

    public void setProManager(String proManager) {
        this.proManager = proManager;
    }

    public String getStatusComplete() {
        return statusComplete;
    }

    public void setStatusComplete(String statusComplete) {
        this.statusComplete = statusComplete;
    }

    public String getSqe() {
        return sqe;
    }

    public void setSqe(String sqe) {
        this.sqe = sqe;
    }

    public float getPerComplete() {
        return perComplete;
    }

    public void setPerComplete(float perComplete) {
        this.perComplete = perComplete;
    }

    public float getUiReview() {
        return uiReview;
    }

    public void setUiReview(float uiReview) {
        this.uiReview = uiReview;
    }

    public float getStpValReport() {
        return stpValReport;
    }

    public void setStpValReport(float stpValReport) {
        this.stpValReport = stpValReport;
    }

    public int getTotalDefFound() {
        return totalDefFound;
    }

    public void setTotalDefFound(int totalDefFound) {
        this.totalDefFound = totalDefFound;
    }

    public int getTotalDefRe() {
        return totalDefRe;
    }

    public void setTotalDefRe(int totalDefRe) {
        this.totalDefRe = totalDefRe;
    }

    public int getCurOpenDef() {
        return curOpenDef;
    }

    public void setCurOpenDef(int curOpenDef) {
        this.curOpenDef = curOpenDef;
    }

    public int getGivBudget() {
        return givBudget;
    }

    public void setGivBudget(int givBudget) {
        this.givBudget = givBudget;
    }

    public int getEstBudget() {
        return estBudget;
    }

    public void setEstBudget(int estBudget) {
        this.estBudget = estBudget;
    }

    public int getConHours() {
        return conHours;
    }

    public void setConHours(int conHours) {
        this.conHours = conHours;
    }

    public int getEstToCompleteHours() {
        return estToCompleteHours;
    }

    public void setEstToCompleteHours(int estToCompleteHours) {
        this.estToCompleteHours = estToCompleteHours;
    }

    public int getEstToCompleteFirstRunHours() {
        return estToCompleteFirstRunHours;
    }

    public void setEstToCompleteFirstRunHours(int estToCompleteFirstRunHours) {
        this.estToCompleteFirstRunHours = estToCompleteFirstRunHours;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }
    
    
    
    
}
