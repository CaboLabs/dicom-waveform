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
 * CID 3201 Indications for Stress Test.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class IndicationsForStressTest {

  /** (F-38002, SRT, "Abnormal ECG") */
  public static final String AbnormalECG = "F-38002\\SRT";

  /** (F-00103, SRT, "Abnormal exercise tolerance test") */
  public static final String AbnormalExerciseToleranceTest = "F-00103\\SRT";

  /** (D3-13012, SRT, "Angina pectoris") */
  public static final String AnginaPectoris = "D3-13012\\SRT";

  /** (D3-30000, SRT, "Arrhythmia") */
  public static final String Arrhythmia = "D3-30000\\SRT";

  /** (F-37000, SRT, "Chest Pain") */
  public static final String ChestPain = "F-37000\\SRT";

  /** (D3-13040, SRT, "Coronary Artery Disease") */
  public static final String CoronaryArteryDisease = "D3-13040\\SRT";

  /** (F-201B3, SRT, "Dyspnea") */
  public static final String Dyspnea = "F-201B3\\SRT";

  /** (F-03C97, SRT, "Heart disease risk factors") */
  public static final String HeartDiseaseRiskFactors = "F-03C97\\SRT";

  /** (D3-16000, SRT, "Heart failure") */
  public static final String HeartFailure = "D3-16000\\SRT";

  /** (G-03A5, SRT, "History of CABG") */
  public static final String HistoryOfCABG = "G-03A5\\SRT";

  /** (G-03AA, SRT, "History of Myocardial Infarction") */
  public static final String HistoryOfMyocardialInfarction = "G-03AA\\SRT";

  /** (D3-02000, SRT, "Hypertension") */
  public static final String Hypertension = "D3-02000\\SRT";

  /** (D3-33120, SRT, "Left bundle branch block") */
  public static final String LeftBundleBranchBlock = "D3-33120\\SRT";

  /** (P7-00044, SRT, "Occupational requirement") */
  public static final String OccupationalRequirement = "P7-00044\\SRT";

  /** (F-37150, SRT, "Palpitations") */
  public static final String Palpitations = "F-37150\\SRT";

  /** (R-00357, SRT, "Post PTCA") */
  public static final String PostPTCA = "R-00357\\SRT";

  /** (R-413C5, SRT, "Pre-operative") */
  public static final String PreOperative = "R-413C5\\SRT";

  /** (D3-31290, SRT, "Supraventricular tachycardia") */
  public static final String SupraventricularTachycardia = "D3-31290\\SRT";

  /** (D3-00006, SRT, "Syncope") */
  public static final String Syncope = "D3-00006\\SRT";

  /** (D3-10800, SRT, "Valvular heart disease") */
  public static final String ValvularHeartDisease = "D3-10800\\SRT";
}
