/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), hosted at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Gunter Zeilinger, Huetteldorferstr. 24/10, 1150 Vienna/Austria/Europe.
 * Portions created by the Initial Developer are Copyright (C) 2002-2005
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See listed authors below.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */
package org.dcm4che2.iod.module.general;

import org.dcm4che2.data.BasicDicomObject;
import org.dcm4che2.data.DicomElement;
import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.data.VR;
import org.dcm4che2.iod.module.Module;
import org.dcm4che2.iod.module.macro.SOPInstanceReference;

/**
 * @author Gunter Zeilinger<gunterze@gmail.com>
 * @version $Revision: 720 $ $Date: 2006-11-26 18:40:54 +0100 (So, 26 Nov 2006) $
 * @since 05.07.2006
 */

public class SeriesAndInstanceReference extends Module {

    public SeriesAndInstanceReference(DicomObject dcmobj) {
        super(dcmobj);
    }

    public SeriesAndInstanceReference() {
        this(new BasicDicomObject());
    }

    public static SeriesAndInstanceReference[]
        toSeriesAndInstanceReferences(DicomElement sq) {
        if (sq == null || !sq.hasItems()) {
            return null;
        }
        SeriesAndInstanceReference[] a = new SeriesAndInstanceReference[sq.countItems()];
        for (int i = 0; i < a.length; i++) {
            a[i] = new SeriesAndInstanceReference(sq.getDicomObject(i));
        }
        return a;
    }   
    
    public String getSeriesInstanceUID() {
        return dcmobj.getString(Tag.SeriesInstanceUID);
    }

    public void setSeriesInstanceUID(String uid) {
        dcmobj.putString(Tag.SeriesInstanceUID, VR.UI, uid);
    }

    public SOPInstanceReference[] getReferencedInstances() {
        return SOPInstanceReference.toSOPInstanceReferences(dcmobj
                .get(Tag.ReferencedInstanceSequence));
    }

    public void setSOPInstanceReference(SOPInstanceReference[] sops) {
        updateSequence(Tag.ReferencedInstanceSequence, sops);
    }
}
