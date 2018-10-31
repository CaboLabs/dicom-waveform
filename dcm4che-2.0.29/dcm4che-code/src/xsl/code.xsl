<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="row">
    <xsl:variable name="entry5" select="normalize-space(entry[5]/para)"/>
    <xsl:variable name="code">
      <xsl:choose>
        <xsl:when test="starts-with($entry5,'DT') or starts-with($entry5,'EV')">
          <xsl:value-of select="normalize-space(substring($entry5,3))"/>
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$entry5"/>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:if test="starts-with($code,'(')">
      <xsl:variable name="value" select="normalize-space(substring(substring-before($code,','),2))"/>
      <xsl:variable name="scheme" select="translate(substring-before(substring-after($code,','),','),' ','')"/>
      <xsl:variable name="meaning" select="normalize-space(substring-before(substring-after($code,'&quot;'),'&quot;'))"/>
      <Code value="{$value}" scheme="{$scheme}">
        <xsl:value-of select="$meaning"/>
      </Code>
    </xsl:if>
  </xsl:template>
  <xsl:template match="row" mode="DCM">
    <xsl:call-template name="code">
      <xsl:with-param name="scheme">DCM</xsl:with-param>
      <xsl:with-param name="value" select="normalize-space(entry[1]/para)"/>
      <xsl:with-param name="meaning" select="normalize-space(entry[2]/para)"/>
    </xsl:call-template>
  </xsl:template>
  <xsl:template match="row" mode="novers">
    <xsl:call-template name="code">
      <xsl:with-param name="scheme" select="normalize-space(entry[1]/para)"/>
      <xsl:with-param name="value" select="normalize-space(entry[2]/para)"/>
      <xsl:with-param name="meaning" select="normalize-space(entry[3]/para)"/>
    </xsl:call-template>
  </xsl:template>
  <xsl:template match="row" mode="withvers">
    <xsl:call-template name="code">
      <xsl:with-param name="scheme">
        <xsl:value-of select="normalize-space(entry[1]/para)"/>
        <xsl:variable name="vers" select="normalize-space(entry[2]/para)"/>
        <xsl:if test="$vers">
          <xsl:text>[</xsl:text>
          <xsl:value-of select="$vers"/>
          <xsl:text>]</xsl:text>
        </xsl:if>
      </xsl:with-param>
      <xsl:with-param name="value" select="normalize-space(entry[3]/para)"/>
      <xsl:with-param name="meaning" select="normalize-space(entry[4]/para)"/>
    </xsl:call-template>
  </xsl:template>
  <xsl:template name="code">
    <xsl:param name="scheme"/>
    <xsl:param name="value"/>
    <xsl:param name="meaning"/>
    <xsl:if test="$value and $value!='...' and not(starts-with($value,'Code'))">
      <Code value="{$value}" scheme="{$scheme}">
        <xsl:value-of select="$meaning"/>
      </Code>
    </xsl:if>
  </xsl:template>
</xsl:stylesheet>
