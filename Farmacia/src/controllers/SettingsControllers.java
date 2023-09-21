/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SystemViews;

/**
 *
 * @author estar
 */
public class SettingsControllers implements MouseListener{
    
    private SystemViews views;

    public SettingsControllers(SystemViews views) {
        this.views = views;
        this.views.jLabelProducts.addMouseListener(this);
        this.views.jLabelPurchases.addMouseListener(this);
        this.views.jLabelCustomers.addMouseListener(this);
        this.views.jLabelEmployees.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCategories.addMouseListener(this);
        this.views.jLabelReports.addMouseListener(this);
        this.views.jLabelSettings.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(me.getSource() == views.jLabelProducts){
            views.jPanelProducts.setBackground(new Color(152, 202, 63));  
        }else if(me.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(152, 202, 63));
        }else if(me.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(152, 202, 63));
        }else if(me.getSource() == views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(152, 202, 63));
        }else if(me.getSource() == views.jLabelEmployees){
            views.jPanelEmployees.setBackground(new Color(152, 202, 63));
        }else if(me.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(152, 202, 63));
        }else if(me.getSource() == views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(152, 202, 63));
        }else if(me.getSource() == views.jLabelReports){
            views.jPanelReports.setBackground(new Color(152, 202, 63));
        }else if(me.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(152, 202, 63));
        }
        
       
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if(me.getSource() == views.jLabelProducts){
            views.jPanelProducts.setBackground(new Color(18, 45, 61));  
        }else if(me.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(18, 45, 61));
        }else if(me.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(18, 45, 61));
        }else if(me.getSource() == views.jLabelCustomers){
            views.jPanelCustomers.setBackground(new Color(18, 45, 61));
        }else if(me.getSource() == views.jLabelEmployees){
            views.jPanelEmployees.setBackground(new Color(18, 45, 61));
        }else if(me.getSource() == views.jLabelSuppliers){
            views.jPanelSuppliers.setBackground(new Color(18, 45, 61));
        }else if(me.getSource() == views.jLabelCategories){
            views.jPanelCategories.setBackground(new Color(18, 45, 61));
        }else if(me.getSource() == views.jLabelReports){
            views.jPanelReports.setBackground(new Color(18, 45, 61));
        }else if(me.getSource() == views.jLabelSettings){
            views.jPanelSettings.setBackground(new Color(18, 45, 61));
        }
        
        
    }
    
}
