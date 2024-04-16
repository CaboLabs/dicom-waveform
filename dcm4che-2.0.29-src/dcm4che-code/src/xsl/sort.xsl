<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/Codes">
    <Codes>
      <xsl:for-each select="Code">
        <xsl:sort select="@scheme"/>
        <xsl:sort select="@value"/>
        <xsl:sort select="text()"/>
        <xsl:copy-of select="."/>
      </xsl:for-each>
    </Codes>
  </xsl:template>
</xsl:stylesheet>
