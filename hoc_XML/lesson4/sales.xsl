<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="PurchaseOrder">
        <xsl:apply-templates select="People1" />
        <xsl:apply-templates select="People2" />
        <xsl:apply-templates select="People3" />
        <xsl:apply-templates select="People4" />
    </xsl:template>

    <xsl:template match="People1">
        <P color="red">
            NAME: 
            <xsl:value-of select="Name"/>
            AGE:
            <xsl:value-of select="Age"/>
            Your Commision is:
            <xsl:value-of select="Price"/>
        </P>
    </xsl:template>
    <xsl:template match="People2">
        <P color="blue">
            NAME: 
            <xsl:value-of select="Name"/>
            AGE:
            <xsl:value-of select="Age"/>
            Your Commision is:
            <xsl:value-of select="Price"/>
        </P>
    </xsl:template>
    <xsl:template match="People3">
        <P color="black">
            NAME: 
            <xsl:value-of select="Name"/>
            AGE:
            <xsl:value-of select="Age"/>
            Your Commision is:
            <xsl:value-of select="Price"/>
        </P>
    </xsl:template>
    <xsl:template match="People4">
        <P color="blue">
            NAME: 
            <xsl:value-of select="Name"/>
            AGE:
            <xsl:value-of select="Age"/>
            Your Commision is:
            <xsl:value-of select="Price"/>
        </P>
    </xsl:template>
</xsl:stylesheet>