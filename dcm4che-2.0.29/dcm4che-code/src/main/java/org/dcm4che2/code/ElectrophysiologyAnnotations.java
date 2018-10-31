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
 * Java(TM), available at http://sourceforge.net/projects/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * Agfa HealthCare.
 * Portions created by the Initial Developer are Copyright (C) 2010
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

package org.dcm4che2.code;

/**
 * CID 3339 Electrophysiology Annotations.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ElectrophysiologyAnnotations {

  /** (109038, DCM, "Ablation off") */
  public static final String AblationOff = "109038\\DCM";

  /** (109039, DCM, "Ablation on") */
  public static final String AblationOn = "109039\\DCM";

  /** (109040, DCM, "HIS bundle wave") */
  public static final String HISBundleWave = "109040\\DCM";

  /** (109041, DCM, "P wave") */
  public static final String PWave = "109041\\DCM";

  /** (109042, DCM, "Q wave") */
  public static final String QWave = "109042\\DCM";

  /** (109043, DCM, "R wave") */
  public static final String RWave = "109043\\DCM";

  /** (109045, DCM, "Start of atrial contraction") */
  public static final String StartOfAtrialContraction = "109045\\DCM";

  /** (109046, DCM, "Start of atrial contraction (subsequent)") */
  public static final String StartOfAtrialContractionSubsequent = "109046\\DCM";

  /** (109047, DCM, "Stimulation at rate 1 interval") */
  public static final String StimulationAtRate1Interval = "109047\\DCM";

  /** (109048, DCM, "Stimulation at rate 2 interval") */
  public static final String StimulationAtRate2Interval = "109048\\DCM";

  /** (109049, DCM, "Stimulation at rate 3 interval") */
  public static final String StimulationAtRate3Interval = "109049\\DCM";

  /** (109050, DCM, "Stimulation at rate 4 interval") */
  public static final String StimulationAtRate4Interval = "109050\\DCM";

  /** (109044, DCM, "S wave") */
  public static final String SWave = "109044\\DCM";

  /** (109051, DCM, "T wave") */
  public static final String TWave = "109051\\DCM";

  /** (109052, DCM, "V wave") */
  public static final String VWave = "109052\\DCM";

  /** (109053, DCM, "V wave of next beat") */
  public static final String VWaveOfNextBeat = "109053\\DCM";
}
