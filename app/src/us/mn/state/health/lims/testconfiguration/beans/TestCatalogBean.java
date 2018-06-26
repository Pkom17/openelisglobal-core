/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations under
 * the License.
 *
 * The Original Code is OpenELIS code.
 *
 * Copyright (C) ITECH, University of Washington, Seattle WA.  All Rights Reserved.
 */

package us.mn.state.health.lims.testconfiguration.beans;

import us.mn.state.health.lims.common.util.validator.GenericValidator;

import java.util.List;

public class TestCatalogBean {
	private String id;
    private String englishName;
    private String frenchName;
    private String englishReportName;
    private String frenchReportName;
    private String testUnit;
    private String sampleType;
    private String panel;
    private String resultType;
    private String uom = "n/a";
    private String significantDigits = "n/a";
    private String loinc;
    private String active;
    private String orderable;
    private boolean hasDictionaryValues = false;
    private List<String> dictionaryValues;
    private List<String> dictionaryIds;
    private String referenceValue;
    private String referenceId;
    private boolean hasLimitValues = false;
    private List<ResultLimitBean> resultLimits;
    private int testSortOrder = Integer.MAX_VALUE;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getFrenchName() {
        return frenchName;
    }

    public void setFrenchName(String frenchName) {
        this.frenchName = frenchName;
    }

    public String getEnglishReportName() {
        return englishReportName;
    }

    public void setEnglishReportName(String englishReportName) {
        this.englishReportName = englishReportName;
    }

    public String getFrenchReportName() {
        return frenchReportName;
    }

    public void setFrenchReportName(String frenchReportName) {
        this.frenchReportName = frenchReportName;
    }

    public String getTestUnit() {
        return testUnit;
    }

    public void setTestUnit(String testUnit) {
        this.testUnit = testUnit;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getPanel() {
        return panel;
    }

    public void setPanel(String panel) {
        this.panel = panel;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = GenericValidator.isBlankOrNull(uom) ? "n/a" : uom;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getOrderable() {
        return orderable;
    }

    public void setOrderable(String orderable) {
        this.orderable = orderable;
    }
    
    public String getLoinc() {
        return loinc;
    }
    
    public void setLoinc(String loinc) {
    	this.loinc = loinc;
    }

    public String getSignificantDigits() {
        return significantDigits;
    }

    public void setSignificantDigits(String significantDigits) {
        this.significantDigits = significantDigits;
    }

    public boolean isHasDictionaryValues() {
        return hasDictionaryValues;
    }

    public void setHasDictionaryValues(boolean hasDictionaryValues) {
        this.hasDictionaryValues = hasDictionaryValues;
    }
    
    public List<String> getDictionaryValues() {
        return dictionaryValues;
    }

    public void setDictionaryValues(List<String> dictionaryValues) {
        this.dictionaryValues = dictionaryValues;
    }
    
    public List<String> getDictionaryIds() {
        return dictionaryIds;
    }

    public void setDictionaryIds(List<String> dictionaryIds) {
        this.dictionaryIds = dictionaryIds;
    }

    public String getReferenceValue() {
        return referenceValue;
    }

    public void setReferenceValue(String referenceValue) {
        this.referenceValue = referenceValue;
    }
    
    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public boolean isHasLimitValues() {
        return hasLimitValues;
    }

    public void setHasLimitValues(boolean hasLimitValues) {
        this.hasLimitValues = hasLimitValues;
    }

    public List<ResultLimitBean> getResultLimits() {
        return resultLimits;
    }

    public void setResultLimits(List<ResultLimitBean> resultLimits) {
        this.resultLimits = resultLimits;
    }

    public int getTestSortOrder() {
        return testSortOrder;
    }

    public void setTestSortOrder(int testSortOrder) {
        this.testSortOrder = testSortOrder;
    }
}
