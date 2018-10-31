<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="text"/>
  <xsl:template match="/">
    <xsl:apply-templates select="//informaltable"/>
    <xsl:text>
</xsl:text>
  </xsl:template>
  <xsl:template match="informaltable">
    <xsl:if test="starts-with(preceding-sibling::para[2],'Context ID 7470')">
      <xsl:value-of select="position()"/>      
    </xsl:if>    
  </xsl:template>
</xsl:stylesheet>
