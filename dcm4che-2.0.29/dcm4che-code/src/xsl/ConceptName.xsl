<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml" indent="yes"/>
  <xsl:include href="code.xsl"/>
  <xsl:template match="/">
    <Codes>
      <xsl:apply-templates select="//tgroup[*/row[1]/entry[5]/para='Concept Name']/tbody/row"/>
    </Codes>
  </xsl:template>

</xsl:stylesheet>
