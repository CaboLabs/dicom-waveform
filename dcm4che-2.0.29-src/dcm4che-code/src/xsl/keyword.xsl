<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="xml" indent="yes"/>
  <xsl:variable name="lower">abcdefghijklmnopqrstuvwxyz</xsl:variable>
  <xsl:variable name="upper">ABCDEFGHIJKLMNOPQRSTUVWXYZ</xsl:variable>
  <xsl:template match="/Codes">
    <Codes>
      <xsl:apply-templates select="Code[not(preceding-sibling::*) or @value!=preceding-sibling::*[1]/@value]"/>
    </Codes>
  </xsl:template>
  <xsl:template match="Code">
    <xsl:variable name="keyword">
      <xsl:choose>
        <xsl:when test="text()='Exposure Time'">ExposureTime_<xsl:value-of select="@value"/>
        </xsl:when>
        <xsl:when test="@value='52' and @scheme='NCDR[2.0b]'">ProcedureDateTime_NCDR20b</xsl:when>
        <xsl:when test="@value='113064'">T2StarMap</xsl:when>
        <xsl:when test="@value='G-C2FE'">Shape_LesionAttribute</xsl:when>
        <xsl:when test="@value='D.3-RSR1'">RSR1TypeInV1OrV2</xsl:when>
        <xsl:when test="@value='D.3-PAC'">AtrialPrematureComplex2</xsl:when>
        <xsl:when test="@value='D.3-PVPCS'">PairedVentricularPrematureComplexes2</xsl:when>
        <xsl:when test="@value='D.3-RVPCS'">RunOfVentricularPrematureComplexes2</xsl:when>
        <xsl:when test="@value='D.3-PVC'">VentricularPrematureComplex2</xsl:when>
        <xsl:when test="@value='L-8061A'">SterlingPigBreed2</xsl:when>
        <xsl:when test="@value='L-8061F'">BlackSlavonianPigBreed2</xsl:when>
        <xsl:when test="@value='L-807E1'">BizanianHoundDogBreed2</xsl:when>
        <xsl:when test="@value='L-80B03'">RideauArcottSheepBreed2</xsl:when>
        <xsl:when test="@value='L-8BC44'">BeefaloBisonXCattleBreed2</xsl:when>
        <xsl:when test="@value='T-48340'">AzygosVein2</xsl:when>
        <xsl:when test="@value='T-48410'">CoronarySinus2</xsl:when>
        <xsl:when test="@value='T-48420'">GreatCardiacVein2</xsl:when>
        <xsl:when test="@value='T-9200B'">Prostate2</xsl:when>
        <xsl:when test="@value='A-11100'">CardiacPacemaker</xsl:when>
        <xsl:when test="@value='A-11101'">CardiacPacemaker2</xsl:when>
        <xsl:when test="text()='Social History'">SocialHistory_<xsl:value-of select="@scheme"/>
        </xsl:when>
        <xsl:when test="text()='Stage'">Stage_<xsl:value-of select="@scheme"/>
        </xsl:when>
        <xsl:otherwise>
          <xsl:variable name="keyword1">
            <xsl:call-template name="replace">
              <xsl:with-param name="val">
                <xsl:call-template name="replace">
                  <xsl:with-param name="val">
                    <xsl:call-template name="replace">
                      <xsl:with-param name="val">
                        <xsl:call-template name="replace">
                          <xsl:with-param name="val">
                            <xsl:call-template name="replace">
                              <xsl:with-param name="val">
                                <xsl:call-template name="replace">
                                  <xsl:with-param name="val">
                                    <xsl:call-template name="replace">
                                      <xsl:with-param name="val">
                                        <xsl:call-template name="replace">
                                          <xsl:with-param name="val">
                                            <xsl:call-template name="replace">
                                              <xsl:with-param name="val">
                                                <xsl:call-template name="replace">
                                                  <xsl:with-param name="val">
                                                    <xsl:choose>
                                                      <xsl:when test="substring(text(),2,1)=&quot;'&quot;">
                                                        <xsl:value-of select="substring(text(),1,1)"/>
                                                        <xsl:text>Derived</xsl:text>
                                                        <xsl:value-of select="substring(text(),3)"/>
                                                      </xsl:when>
                                                      <xsl:otherwise><xsl:value-of select="text()"/></xsl:otherwise>
                                                    </xsl:choose>
                                                  </xsl:with-param>
                                                  <xsl:with-param name="from">(s)</xsl:with-param>
                                                </xsl:call-template>
                                              </xsl:with-param>
                                              <xsl:with-param name="from">(+)</xsl:with-param>
                                              <xsl:with-param name="to">Plus</xsl:with-param>
                                            </xsl:call-template>
                                          </xsl:with-param>
                                          <xsl:with-param name="from">(-)</xsl:with-param>
                                          <xsl:with-param name="to">Minus</xsl:with-param>
                                        </xsl:call-template>
                                      </xsl:with-param>
                                      <xsl:with-param name="from">oesn't</xsl:with-param>
                                      <xsl:with-param name="to">oesnot</xsl:with-param>
                                    </xsl:call-template>
                                  </xsl:with-param>
                                  <xsl:with-param name="from">'s</xsl:with-param>
                                </xsl:call-template>
                              </xsl:with-param>
                              <xsl:with-param name="from">...</xsl:with-param>
                            </xsl:call-template>
                          </xsl:with-param>
                          <xsl:with-param name="from">%</xsl:with-param>
                          <xsl:with-param name="to">Percent</xsl:with-param>
                        </xsl:call-template>
                      </xsl:with-param>
                      <xsl:with-param name="from">&amp;</xsl:with-param>
                      <xsl:with-param name="to">And</xsl:with-param>
                    </xsl:call-template>
                  </xsl:with-param>
                  <xsl:with-param name="from">&lt;</xsl:with-param>
                  <xsl:with-param name="to">Lesser</xsl:with-param>
                </xsl:call-template>
              </xsl:with-param>
              <xsl:with-param name="from">&gt;</xsl:with-param>
              <xsl:with-param name="to">Greater</xsl:with-param>
            </xsl:call-template>
          </xsl:variable>
          <xsl:variable name="keyword2">
            <xsl:call-template name="skipSpaces">
              <xsl:with-param name="val" select="normalize-space(translate($keyword1,&quot;-/()[]&apos;&quot;,'       '))"/>
            </xsl:call-template>
          </xsl:variable>
          <xsl:call-template name="replaceStart">
            <xsl:with-param name="val" select="translate($keyword2,'.=:,;^*+# ','__')"/>
            <xsl:with-param name="meaning" select="text()"/>
          </xsl:call-template>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <Code value="{@value}" scheme="{@scheme}" keyword="{$keyword}">
      <xsl:value-of select="text()"/>
    </Code>
  </xsl:template>
  <xsl:template name="replace">
    <xsl:param name="val"/>
    <xsl:param name="from"/>
    <xsl:param name="to"/>
    <xsl:variable name="before" select="substring-before($val,$from)"/>
    <xsl:choose>
      <xsl:when test="starts-with($val,$from) or $before">
        <xsl:value-of select="$before"/>
        <xsl:value-of select="$to"/>
        <xsl:value-of select="substring($val,string-length($before)+string-length($from)+1)"/>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$val"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  <xsl:template name="skipSpaces">
    <xsl:param name="val"/>
    <xsl:value-of select="translate(substring($val,1,1),$lower,$upper)"/>
    <xsl:variable name="before" select="substring-before($val,' ')"/>
    <xsl:choose>
      <xsl:when test="$before">
        <xsl:value-of select="substring($before,2)"/>
        <xsl:call-template name="skipSpaces">
          <xsl:with-param name="val" select="normalize-space(substring($val,string-length($before)+2))"/>
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="substring($val,2)"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  <xsl:template name="replaceStart">
    <xsl:param name="val"/>
    <xsl:param name="meaning"/>
    <xsl:choose>
      <xsl:when test="contains('0123456789',substring($val,1,1))">
        <xsl:choose>
          <xsl:when test="substring($meaning,2,2)=' -' or substring($meaning,2,1)=':'">
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'1st')">
            <xsl:text>First</xsl:text>
            <xsl:value-of select="substring($val,4)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'2nd')">
            <xsl:text>Second</xsl:text>
            <xsl:value-of select="substring($val,4)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'3rd')">
            <xsl:text>Third</xsl:text>
            <xsl:value-of select="substring($val,4)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'5th')">
            <xsl:text>Fifth</xsl:text>
            <xsl:value-of select="substring($val,4)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'90th')">
            <xsl:text>Ninetieth</xsl:text>
            <xsl:value-of select="substring($val,5)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'95th')">
            <xsl:text>NinetyFifth</xsl:text>
            <xsl:value-of select="substring($val,5)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'10')">
            <xsl:text>Ten</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'11')">
            <xsl:text>Eleven</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'12')">
            <xsl:text>Twelve</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'15')">
            <xsl:text>Fifteen</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'30')">
            <xsl:text>Thirty</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'35')">
            <xsl:text>Thirtyfive</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'50')">
            <xsl:text>Fifty</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'60')">
            <xsl:text>Sixty</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'70')">
            <xsl:text>Seventy</xsl:text>
            <xsl:value-of select="substring($val,3)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'1')">
            <xsl:text>One</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'2')">
            <xsl:text>Two</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'3')">
            <xsl:text>Three</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'4')">
            <xsl:text>Four</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'5')">
            <xsl:text>Five</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'6')">
            <xsl:text>Six</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'7')">
            <xsl:text>Seven</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'8')">
            <xsl:text>Eight</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
          <xsl:when test="starts-with($val,'9')">
            <xsl:text>Nine</xsl:text>
            <xsl:value-of select="substring($val,2)"/>
          </xsl:when>
        </xsl:choose>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$val"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
</xsl:stylesheet>
