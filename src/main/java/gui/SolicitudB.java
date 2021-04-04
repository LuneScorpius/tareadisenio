/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.SolicitudClass;
import java.util.Date;

/**
 *
 * @author jagum
 */
public class SolicitudB extends Busqueda{
    
    final SolicitudClass solicitudClass;
    
    public SolicitudB(SolicitudClass solicitudClass) {
            this.solicitudClass = solicitudClass;
            matriculaTextB.setEnabled(true);
            matriculaTextB.setText("");
            programaTextB.setEnabled(true);
            programaTextB.setText("");
            materiaTextB.setEnabled(true);
            materiaTextB.setText("");
            grupoTextB.setEnabled(true);
            grupoTextB.setText("");
            observacionesTextB.setEnabled(true);
            observacionesTextB.setText("");
            movimientoComboB.setEnabled(true);
            fechaSpinnerB.setEnabled(true);
            fechaSpinnerB.setValue(new Date(solicitudClass.fecha));
            
}
    
}
