<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="text"/>
  <xsl:template match="/Codes">
    <xsl:apply-templates select="Code[(@value=following-sibling::*[1]/@value and text()!=following-sibling::*[1]/text()) or (@value=preceding-sibling::*[1]/@value and text()!=preceding-sibling::*[1]/text())]"/>
  </xsl:template>
  <xsl:template match="Code">
    <xsl:text>(</xsl:text>
    <xsl:value-of select="@value"/>
    <xsl:text>, </xsl:text>
    <xsl:value-of select="@scheme"/>
    <xsl:text>, "</xsl:text>
    <xsl:value-of select="text()"/>
    <xsl:text>")
</xsl:text>
  </xsl:template>
</xsl:stylesheet>
