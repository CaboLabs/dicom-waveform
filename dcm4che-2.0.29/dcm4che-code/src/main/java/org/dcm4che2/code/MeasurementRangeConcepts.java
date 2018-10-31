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
 * CID 221 Measurement Range Concepts.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class MeasurementRangeConcepts {

  /** (R-00397, SRT, "5th Percentile Value of population") */
  public static final String FifthPercentileValueOfPopulation = "R-00397\\SRT";

  /** (R-00317, SRT, "Mean Value of population") */
  public static final String MeanValueOfPopulation = "R-00317\\SRT";

  /** (R-00319, SRT, "Median Value of population") */
  public static final String MedianValueOfPopulation = "R-00319\\SRT";

  /** (R-00338, SRT, "90th Percentile Value of population") */
  public static final String NinetiethPercentileValueOfPopulation = "R-00338\\SRT";

  /** (R-00337, SRT, "95th Percentile Value of population") */
  public static final String NinetyFifthPercentileValueOfPopulation = "R-00337\\SRT";

  /** (R-00347, SRT, "1 Sigma Lower Value of population") */
  public static final String OneSigmaLowerValueOfPopulation = "R-00347\\SRT";

  /** (R-00346, SRT, "1 Sigma Upper Value of population") */
  public static final String OneSigmaUpperValueOfPopulation = "R-00346\\SRT";

  /** (121414, DCM, "Standard deviation of population") */
  public static final String StandardDeviationOfPopulation = "121414\\DCM";

  /** (R-00377, SRT, "10th Percentile Value of population") */
  public static final String TenthPercentileValueOfPopulation = "R-00377\\SRT";

  /** (121417, DCM, "2 Sigma deviation of population") */
  public static final String TwoSigmaDeviationOfPopulation = "121417\\DCM";

  /** (R-00388, SRT, "2 Sigma Lower Value of population") */
  public static final String TwoSigmaLowerValueOfPopulation = "R-00388\\SRT";

  /** (R-00387, SRT, "2 Sigma Upper Value of population") */
  public static final String TwoSigmaUpperValueOfPopulation = "R-00387\\SRT";
}
