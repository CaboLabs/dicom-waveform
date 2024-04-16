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
 * CID 3685 Conjunctive Terms.
 *
 * @author Gunter Zeilinger <gunterze@gmail.com>
 * @version $Rev: 13502 $ $Date:: 2010-06-09#$
 * @since Jun 2, 2010
 */
public class ConjunctiveTerms {

  /** (D.2.5-4-ALT, SCPECG[1.3], "alternating with") */
  public static final String AlternatingWith = "D.2.5-4-ALT\\SCPECG[1.3]";

  /** (D.2.5-1-AND, SCPECG[1.3], "and") */
  public static final String And = "D.2.5-1-AND\\SCPECG[1.3]";

  /** (D.2.5-3-CHG, SCPECG[1.3], "changed in comparison to previous ECG") */
  public static final String ChangedInComparisonToPreviousECG = "D.2.5-3-CHG\\SCPECG[1.3]";

  /** (D.2.5-3-DEC, SCPECG[1.3], "decreased in comparison to previous ECG") */
  public static final String DecreasedInComparisonToPreviousECG = "D.2.5-3-DEC\\SCPECG[1.3]";

  /** (D.2.5-3-DIS, SCPECG[1.3], "disappeared in comparison to previous ECG") */
  public static final String DisappearedInComparisonToPreviousECG = "D.2.5-3-DIS\\SCPECG[1.3]";

  /** (D.2.5-4-EXC, SCPECG[1.3], "exclude, rule out, or consider also") */
  public static final String ExcludeRuleOutOrConsiderAlso = "D.2.5-4-EXC\\SCPECG[1.3]";

  /** (D.2.5-1-XOR, SCPECG[1.3], "exclusive or") */
  public static final String ExclusiveOr = "D.2.5-1-XOR\\SCPECG[1.3]";

  /** (D.2.5-3-IMP, SCPECG[1.3], "improved (compared to)") */
  public static final String ImprovedComparedTo = "D.2.5-3-IMP\\SCPECG[1.3]";

  /** (D.2.5-3-INC, SCPECG[1.3], "increased in comparison to previous ECG") */
  public static final String IncreasedInComparisonToPreviousECG = "D.2.5-3-INC\\SCPECG[1.3]";

  /** (D.2.5-4-ASS, SCPECG[1.3], "is associated with") */
  public static final String IsAssociatedWith = "D.2.5-4-ASS\\SCPECG[1.3]";

  /** (D.2.5-4-SEC, SCPECG[1.3], "is secondary to") */
  public static final String IsSecondaryTo = "D.2.5-4-SEC\\SCPECG[1.3]";

  /** (D.2.5-1-NOT, SCPECG[1.3], "not") */
  public static final String Not = "D.2.5-1-NOT\\SCPECG[1.3]";

  /** (D.2.5-1-OR, SCPECG[1.3], "or") */
  public static final String Or = "D.2.5-1-OR\\SCPECG[1.3]";

  /** (D.2.5-3-REP, SCPECG[1.3], "replaced statement reported previously") */
  public static final String ReplacedStatementReportedPreviously = "D.2.5-3-REP\\SCPECG[1.3]";

  /** (D.2.5-4-RES, SCPECG[1.3], "results in, or causes") */
  public static final String ResultsInOrCauses = "D.2.5-4-RES\\SCPECG[1.3]";

  /** (D.2.5-3-SER, SCPECG[1.3], "serial changes of") */
  public static final String SerialChangesOf = "D.2.5-3-SER\\SCPECG[1.3]";

  /** (D.2.5-3-UNC, SCPECG[1.3], "unchanged in comparison to previous ECG") */
  public static final String UnchangedInComparisonToPreviousECG = "D.2.5-3-UNC\\SCPECG[1.3]";

  /** (D.2.5-4-WTH, SCPECG[1.3], "with") */
  public static final String With = "D.2.5-4-WTH\\SCPECG[1.3]";

  /** (D.2.5-3-WRS, SCPECG[1.3], "worse (compared to)") */
  public static final String WorseComparedTo = "D.2.5-3-WRS\\SCPECG[1.3]";
}
