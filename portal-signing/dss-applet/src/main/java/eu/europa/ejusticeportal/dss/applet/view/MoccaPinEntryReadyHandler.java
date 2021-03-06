/*******************************************************************************
 * Digital Signature Applet
 * 
 *  Copyright (C) 2014 European Commission, Directorate-General for Justice (DG  JUSTICE), B-1049 Bruxelles/Brussel
 * 
 *  Developed by: ARHS Developments S.A. (rue Nicolas Bové 2B, L-1253 Luxembourg)  
 * 
 *  http://www.arhs-developments.com
 * 
 *  This file is part of the "Digital Signature Applet" project.
 * 
 *  Licensed under the EUPL, version 1.1 or – as soon they are approved by the European  Commission - subsequent versions of the EUPL (the "Licence"). 
 *  You may not use this  work except in compliance with the Licence. You may obtain a copy of the Licence at:
 * 
 *  http://ec.europa.eu/idabc/eupl.html
 * 
 *  Unless required by applicable law or agreed to in writing, software distributed under   the Licence is distributed on  
 *  an "AS IS" basis, WITHOUT WARRANTIES OR   CONDITIONS OF ANY KIND, either  express or implied. 
 * 
 *  See the Licence for the  specific language governing permissions and limitations under the Licence.
 ******************************************************************************/
package eu.europa.ejusticeportal.dss.applet.view;

import eu.europa.ejusticeportal.dss.applet.event.MoccaPinEntryReady;

/**
 * 
 * Handles the UI event indicating that the Mocca PIN entry is ready.
 *  
 * <p>DISCLAIMER: Project owner DG-JUSTICE.</p>
 * 
 * @version $Revision: 1210 $ - $Date: 2013-03-20 10:06:46 +0100 (Wed, 20 Mar 2013) $
 * @author <a href="mailto:ejustice.project-dss@arhs-developments.com">ARHS Developments</a>
 */
public class MoccaPinEntryReadyHandler implements UIEventListenerDelegate{    
    /**
     * Handle the event
     * @param event the event to handle
     */
    public void doHandle(Object event) {
        
        MoccaPinEntryReady mper = (MoccaPinEntryReady)event;
        
        if (mper.getBadPinEntry()){
            UI.showMoccaPinPadWrongPin();
        } else { 
            UI.showMoccaPinPadReady();
        }
    }

}
