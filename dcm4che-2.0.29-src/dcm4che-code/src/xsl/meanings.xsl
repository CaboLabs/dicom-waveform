<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="text"/>
  <xsl:template match="/Codes">
    <xsl:apply-templates select="Code"/>
  </xsl:template>
  <xsl:template match="Code">
    <xsl:call-template name="escape">
      <xsl:with-param name="val">
        <xsl:call-template name="escape">
          <xsl:with-param name="val" select="@value"/>
          <xsl:with-param name="ch">=</xsl:with-param>
        </xsl:call-template>
      </xsl:with-param>
      <xsl:with-param name="ch">:</xsl:with-param>
    </xsl:call-template>
    <xsl:text>\\</xsl:text>
    <xsl:call-template name="escape">
      <xsl:with-param name="val">
        <xsl:call-template name="escape">
          <xsl:with-param name="val" select="@scheme"/>
          <xsl:with-param name="ch">=</xsl:with-param>
        </xsl:call-template>
      </xsl:with-param>
      <xsl:with-param name="ch">:</xsl:with-param>
    </xsl:call-template>
    <xsl:text>=</xsl:text>
    <xsl:value-of select="text()"/>
    <xsl:text>
</xsl:text>
  </xsl:template>
  <xsl:template name="escape">
    <xsl:param name="val"/>
    <xsl:param name="ch"/>
    <xsl:variable name="before" select="substring-before($val,$ch)"/>
    <xsl:choose>
      <xsl:when test="$before">
        <xsl:value-of select="$before"/>
        <xsl:text>\</xsl:text>
        <xsl:value-of select="substring($val,string-length($before)+1)"/>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$val"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
</xsl:stylesheet>
