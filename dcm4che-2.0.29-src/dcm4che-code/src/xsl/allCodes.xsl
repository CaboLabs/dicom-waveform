<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" indent="yes"/>
  <xsl:include href="code.xsl"/>
  <xsl:template match="/">
    <Codes>
      <xsl:apply-templates select="//tgroup[*/row[1]/entry[5]/para='Concept Name']/tbody/row"/>
       <xsl:apply-templates select="//tgroup/tbody[starts-with(row[1]/entry[1]/para,'Code Value')]/row[position()>1]" mode="DCM"/>
      <xsl:apply-templates select="//tgroup/tbody[starts-with(row[1]/entry[2]/para,'Code Value')]/row[position()>1]" mode="novers"/>
      <xsl:apply-templates select="//tgroup/tbody[starts-with(row[1]/entry[3]/para,'Code Value')]/row[position()>1]" mode="withvers"/>
    </Codes>
  </xsl:template>
  
</xsl:stylesheet>
