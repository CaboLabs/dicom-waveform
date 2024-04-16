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
 * CID 3230 ECG Findings.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ECGFindings {

  /** (D3-31520, SRT, "Atrial Fibrillation") */
  public static final String AtrialFibrillation = "D3-31520\\SRT";

  /** (D3-30A03, SRT, "Atrial premature contraction") */
  public static final String AtrialPrematureContraction = "D3-30A03\\SRT";

  /** (D3-33200, SRT, "Bifascicular Block") */
  public static final String BifascicularBlock = "D3-33200\\SRT";

  /** (F-380B3, SRT, "Early repolarization") */
  public static final String EarlyRepolarization = "F-380B3\\SRT";

  /** (D3-30001, SRT, "First degree Atrioventricular block") */
  public static final String FirstDegreeAtrioventricularBlock = "D3-30001\\SRT";

  /** (D3-33122, SRT, "Incomplete Left bundle branch block") */
  public static final String IncompleteLeftBundleBranchBlock = "D3-33122\\SRT";

  /** (D3-33112, SRT, "Incomplete Right bundle branch block") */
  public static final String IncompleteRightBundleBranchBlock = "D3-33112\\SRT";

  /** (D3-33000, SRT, "Intraventricular conduction disturbance") */
  public static final String IntraventricularConductionDisturbance = "D3-33000\\SRT";

  /** (D3-33140, SRT, "Left anterior fascicular block") */
  public static final String LeftAnteriorFascicularBlock = "D3-33140\\SRT";

  /** (D3-33120, SRT, "Left bundle branch block") */
  public static final String LeftBundleBranchBlock = "D3-33120\\SRT";

  /** (D3-33150, SRT, "Left posterior fascicular block") */
  public static final String LeftPosteriorFascicularBlock = "D3-33150\\SRT";

  /** (F-38794, SRT, "Nonspecific ST-T abnormality") */
  public static final String NonspecificSTTAbnormality = "F-38794\\SRT";

  /** (D3-31710, SRT, "Non-sustained ventricular tachycardia") */
  public static final String NonSustainedVentricularTachycardia = "D3-31710\\SRT";

  /** (F-000B7, SRT, "Normal") */
  public static final String Normal = "F-000B7\\SRT";

  /** (D3-33110, SRT, "Right bundle branch block") */
  public static final String RightBundleBranchBlock = "D3-33110\\SRT";

  /** (F-38793, SRT, "Secondary ST-T abnormality") */
  public static final String SecondarySTTAbnormality = "F-38793\\SRT";

  /** (R-F81AE, SRT, "Second degree Atrioventricular block") */
  public static final String SecondDegreeAtrioventricularBlock = "R-F81AE\\SRT";

  /** (F-38278, SRT, "ST depression") */
  public static final String STDepression = "F-38278\\SRT";

  /** (F-38277, SRT, "ST elevation") */
  public static final String STElevation = "F-38277\\SRT";

  /** (D3-31290, SRT, "Supraventricular Tachycardia") */
  public static final String SupraventricularTachycardia = "D3-31290\\SRT";

  /** (D3-32102, SRT, "Third degree Atrioventricular block") */
  public static final String ThirdDegreeAtrioventricularBlock = "D3-32102\\SRT";

  /** (D3-31720, SRT, "Ventricular fibrillation") */
  public static final String VentricularFibrillation = "D3-31720\\SRT";

  /** (D3-31351, SRT, "Ventricular pre-excitation") */
  public static final String VentricularPreExcitation = "D3-31351\\SRT";

  /** (D3-31740, SRT, "Ventricular premature contraction") */
  public static final String VentricularPrematureContraction = "D3-31740\\SRT";

  /** (D3-31700, SRT, "Ventricular tachycardia") */
  public static final String VentricularTachycardia = "D3-31700\\SRT";
}
