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
 * CID 3770 Problem Status.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ProblemStatus {

  /** (R-42501, SRT, "Active problem") */
  public static final String ActiveProblem = "R-42501\\SRT";

  /** (G-A270, SRT, "Chronic") */
  public static final String Chronic = "G-A270\\SRT";

  /** (R-42502, SRT, "Inactive problem") */
  public static final String InactiveProblem = "R-42502\\SRT";

  /** (G-A397, SRT, "Intermittent") */
  public static final String Intermittent = "G-A397\\SRT";

  /** (G-A46B, SRT, "Known absent") */
  public static final String KnownAbsent = "G-A46B\\SRT";

  /** (F-04B88, SRT, "Problem resolved") */
  public static final String ProblemResolved = "F-04B88\\SRT";

  /** (G-A39A, SRT, "Recurrent") */
  public static final String Recurrent = "G-A39A\\SRT";

  /** (G-A47B, SRT, "Suspected") */
  public static final String Suspected = "G-A47B\\SRT";

  /** (P0-30450, SRT, "Well controlled") */
  public static final String WellControlled = "P0-30450\\SRT";
}
