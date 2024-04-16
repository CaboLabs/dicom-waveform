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
 * CID 3335 ECG Annotations.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ECGAnnotations {

  /** (5.7.1-3, SCPECG[1.3], "Fiducial point") */
  public static final String FiducialPoint = "5.7.1-3\\SCPECG[1.3]";

  /** (D.4.1-J, SCPECG[1.3], "J point") */
  public static final String JPoint = "D.4.1-J\\SCPECG[1.3]";

  /** (D.4.1-ST20, SCPECG[1.3], "J point + 20 msec") */
  public static final String JPoint20Msec = "D.4.1-ST20\\SCPECG[1.3]";

  /** (D.4.1-ST60, SCPECG[1.3], "J point + 60 msec") */
  public static final String JPoint60Msec = "D.4.1-ST60\\SCPECG[1.3]";

  /** (D.4.1-ST80, SCPECG[1.3], "J point +80 msec") */
  public static final String JPoint80Msec = "D.4.1-ST80\\SCPECG[1.3]";

  /** (5.10.1.2, SCPECG[1.3], "Pacemaker spike, suppressed") */
  public static final String PacemakerSpikeSuppressed = "5.10.1.2\\SCPECG[1.3]";

  /** (D.4.1-PR, SCPECG[1.3], "PR segment (isoelectric point)") */
  public static final String PRSegmentIsoelectricPoint = "D.4.1-PR\\SCPECG[1.3]";

  /** (5.10.3-2, SCPECG[1.3], "P wave end") */
  public static final String PWaveEnd = "5.10.3-2\\SCPECG[1.3]";

  /** (5.10.3-1, SCPECG[1.3], "P wave onset") */
  public static final String PWaveOnset = "5.10.3-1\\SCPECG[1.3]";

  /** (D.4.1-P, SCPECG[1.3], "P wave peak") */
  public static final String PWavePeak = "D.4.1-P\\SCPECG[1.3]";

  /** (5.10.3-4, SCPECG[1.3], "QRS end") */
  public static final String QRSEnd = "5.10.3-4\\SCPECG[1.3]";

  /** (5.10.3-3, SCPECG[1.3], "QRS onset") */
  public static final String QRSOnset = "5.10.3-3\\SCPECG[1.3]";

  /** (D.4.1-Q, SCPECG[1.3], "Q wave") */
  public static final String QWave = "D.4.1-Q\\SCPECG[1.3]";

  /** (D.4.1-R2, SCPECG[1.3], "R' peak") */
  public static final String RDerivedPeak = "D.4.1-R2\\SCPECG[1.3]";

  /** (D.4.1-R, SCPECG[1.3], "R wave peak") */
  public static final String RWavePeak = "D.4.1-R\\SCPECG[1.3]";

  /** (D.4.1-S2, SCPECG[1.3], "S' wave") */
  public static final String SDerivedWave = "D.4.1-S2\\SCPECG[1.3]";

  /** (D.4.1-S, SCPECG[1.3], "S wave") */
  public static final String SWave = "D.4.1-S\\SCPECG[1.3]";

  /** (5.10.3-5, SCPECG[1.3], "T wave end") */
  public static final String TWaveEnd = "5.10.3-5\\SCPECG[1.3]";

  /** (D.4.1-STE, SCPECG[1.3], "T wave onset") */
  public static final String TWaveOnset = "D.4.1-STE\\SCPECG[1.3]";

  /** (D.4.1-T, SCPECG[1.3], "T wave peak") */
  public static final String TWavePeak = "D.4.1-T\\SCPECG[1.3]";

  /** (D.4.1-U, SCPECG[1.3], "U wave peak") */
  public static final String UWavePeak = "D.4.1-U\\SCPECG[1.3]";
}
