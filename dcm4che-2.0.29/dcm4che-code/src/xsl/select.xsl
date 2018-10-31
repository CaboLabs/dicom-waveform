<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" indent="yes"/>
  <xsl:param name="pos">453</xsl:param>
  <xsl:param name="mode">novers</xsl:param>
  <xsl:include href="code.xsl"/>
  <xsl:template match="/">
    <Codes>
      <xsl:apply-templates select="//informaltable"/>
    </Codes>
  </xsl:template>
  <xsl:template match="informaltable">
    <xsl:call-template name="informaltable">
      <xsl:with-param name="pos1" select="$pos"/>
      <xsl:with-param name="mode1" select="$mode"/>
    </xsl:call-template>
  </xsl:template>
  <xsl:template name="informaltable">
    <xsl:param name="pos1"/>
    <xsl:param name="mode1"/>
    <xsl:variable name="pos2" select="substring-after($pos1,',')"/>
    <xsl:variable name="pos0">
      <xsl:choose>
        <xsl:when test="$pos2">
          <xsl:value-of select="substring-before($pos1,',')"/>
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$pos1"/>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:choose>
      <xsl:when test="position()=$pos0">
        <xsl:variable name="mode0">
          <xsl:choose>
            <xsl:when test="$pos2">
              <xsl:value-of select="substring-before($mode1,',')"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="$mode1"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:choose>
          <xsl:when test="$mode0='novers'">
            <xsl:apply-templates select="tgroup/tbody/row" mode="novers"/>
          </xsl:when>
          <xsl:when test="$mode0='withvers'">
            <xsl:apply-templates select="tgroup/tbody/row" mode="withvers"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:apply-templates select="tgroup/tbody/row" mode="DCM"/>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:when>
      <xsl:when test="$pos2 and position()&gt;$pos0">
        <xsl:call-template name="informaltable">
          <xsl:with-param name="pos1" select="$pos2"/>
          <xsl:with-param name="mode1" select="substring-after($mode1,',')"/>
        </xsl:call-template>
      </xsl:when>
    </xsl:choose>
  </xsl:template>
</xsl:stylesheet>
