/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author anh.leuduc.sv
 */
public class TongActionForm extends org.apache.struts.action.ActionForm {
    
    private int a;
    private int b;

    public TongActionForm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public TongActionForm() {
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

   
}
