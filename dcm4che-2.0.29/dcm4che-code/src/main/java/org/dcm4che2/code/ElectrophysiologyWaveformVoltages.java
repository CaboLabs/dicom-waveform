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
 * CID 3688 Electrophysiology Waveform Voltages.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ElectrophysiologyWaveformVoltages {

  /** (5.13.5-63, SCPECG[1.3], "Amplitude at the J-Point plus 1/16 average R-R") */
  public static final String AmplitudeAtTheJPointPlus116AverageRR = "5.13.5-63\\SCPECG[1.3]";

  /** (5.13.5-65, SCPECG[1.3], "Amplitude at the J-Point plus 1/8 average R-R") */
  public static final String AmplitudeAtTheJPointPlus18AverageRR = "5.13.5-65\\SCPECG[1.3]";

  /** (5.13.5-33, SCPECG[1.3], "J Point Amplitude") */
  public static final String JPointAmplitude = "5.13.5-33\\SCPECG[1.3]";

  /** (5.13.5-37, SCPECG[1.3], "P(-) Amplitude") */
  public static final String PMinusAmplitude = "5.13.5-37\\SCPECG[1.3]";

  /** (5.13.5-35, SCPECG[1.3], "P(+) Amplitude") */
  public static final String PPlusAmplitude = "5.13.5-35\\SCPECG[1.3]";

  /** (5.13.5-23, SCPECG[1.3], "Q Amplitude") */
  public static final String QAmplitude = "5.13.5-23\\SCPECG[1.3]";

  /** (5.13.5-25, SCPECG[1.3], "R Amplitude") */
  public static final String RAmplitude = "5.13.5-25\\SCPECG[1.3]";

  /** (5.13.5-29, SCPECG[1.3], "R' Amplitude") */
  public static final String RDerivedAmplitude = "5.13.5-29\\SCPECG[1.3]";

  /** (5.13.5-27, SCPECG[1.3], "S Amplitude") */
  public static final String SAmplitude = "5.13.5-27\\SCPECG[1.3]";

  /** (5.13.5-31, SCPECG[1.3], "S' Amplitude") */
  public static final String SDerivedAmplitude = "5.13.5-31\\SCPECG[1.3]";

  /** (5.13.5-57, SCPECG[1.3], "ST Amplitude at the J-Point plus 20 ms") */
  public static final String STAmplitudeAtTheJPointPlus20Ms = "5.13.5-57\\SCPECG[1.3]";

  /** (5.13.5-59, SCPECG[1.3], "ST Amplitude at the J-Point plus 60 ms") */
  public static final String STAmplitudeAtTheJPointPlus60Ms = "5.13.5-59\\SCPECG[1.3]";

  /** (5.13.5-61, SCPECG[1.3], "ST Amplitude at the J-Point plus 80 ms") */
  public static final String STAmplitudeAtTheJPointPlus80Ms = "5.13.5-61\\SCPECG[1.3]";

  /** (5.13.5-41, SCPECG[1.3], "T(-) Amplitude") */
  public static final String TMinusAmplitude = "5.13.5-41\\SCPECG[1.3]";

  /** (5.13.5-39, SCPECG[1.3], "T(+) Amplitude") */
  public static final String TPlusAmplitude = "5.13.5-39\\SCPECG[1.3]";
}
