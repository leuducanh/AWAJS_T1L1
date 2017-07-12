/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SanPham;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author anh.leuduc.sv
 */
public class SanPhamAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        List<SanPham> dssp = new ArrayList<>();
        String action = request.getParameter("action");
        String page = "";
        if(action.equals("dssp")){
        dssp.add(new SanPham("1", "abc", 1123, 2));
        dssp.add(new SanPham("2", "abc", 1123, 2));
        dssp.add(new SanPham("3", "abc", 1123, 2));
        dssp.add(new SanPham("4", "abc", 1123, 2));
        dssp.add(new SanPham("5", "abc", 1123, 2));
                request.setAttribute("dssp", dssp);
        page = "success";
        }else{
            page = "Chitiet";
            request.setAttribute("sp", request.getParameter("masp"));
        }
        return mapping.findForward(page);
    }
}
