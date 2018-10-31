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
 * CID 42 Numeric Value Qualifier.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class NumericValueQualifier {

  /** (114008, DCM, "Calculation failure") */
  public static final String CalculationFailure = "114008\\DCM";

  /** (114003, DCM, "Divide by zero") */
  public static final String DivideByZero = "114003\\DCM";

  /** (114006, DCM, "Measurement failure") */
  public static final String MeasurementFailure = "114006\\DCM";

  /** (114007, DCM, "Measurement not attempted") */
  public static final String MeasurementNotAttempted = "114007\\DCM";

  /** (114001, DCM, "Negative Infinity") */
  public static final String NegativeInfinity = "114001\\DCM";

  /** (114000, DCM, "Not a number") */
  public static final String NotANumber = "114000\\DCM";

  /** (114005, DCM, "Overflow") */
  public static final String Overflow = "114005\\DCM";

  /** (114002, DCM, "Positive Infinity") */
  public static final String PositiveInfinity = "114002\\DCM";

  /** (114004, DCM, "Underflow") */
  public static final String Underflow = "114004\\DCM";

  /** (114011, DCM, "Value indeterminate") */
  public static final String ValueIndeterminate = "114011\\DCM";

  /** (114009, DCM, "Value out of range") */
  public static final String ValueOutOfRange = "114009\\DCM";

  /** (114010, DCM, "Value unknown") */
  public static final String ValueUnknown = "114010\\DCM";
}
