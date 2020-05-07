<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="/PurchaseOrder">
        <xsl:apply-templates select="PONumber" />
        <xsl:apply-templates select="PODate" />
        <xsl:apply-templates select="Seller" />
        <xsl:apply-templates select="Buyer" />
        <xsl:apply-templates select="DeliveryDate" />
        <xsl:apply-templates select="ShipTo" />
        <xsl:apply-templates select="BillTo" />
        <xsl:apply-templates select="Products" />
        <xsl:apply-templates select="Instructions" />
    </xsl:template>

    <xsl:template match="PONumber">
        <h1 align="center">David Enterprises Inc. Carolina West , USA</h1>
        Purchase Order Number:
        <xsl:value-of select="." />
        <br />
    </xsl:template>
    <xsl:template match="PODate">
        Purchase Order Date:
        <xsl:value-of select="." />
        <br />
    </xsl:template>
    <xsl:template match="Seller">
        Seller:
        <xsl:value-of select="." />
        <br />
    </xsl:template>
    <xsl:template match="Buyer">
        Buyer:
        <xsl:value-of select="." />
        <br />
    </xsl:template>
    <xsl:template match="DeliveryDate">
        Delivery Date:
        <xsl:value-of select="." />
        <br />
    </xsl:template>
    <xsl:template match="ShipTo">
        <h3>Shipping Details</h3>
        Company Name:
        <xsl:value-of select="Name" />
        <br />
        Street:
        <xsl:value-of select="Street" />
        <br />
        CityZip:
        <xsl:value-of select="CityZip" />
        <br />
        Country:
        <xsl:value-of select="Country" />
    </xsl:template>
    <xsl:template match="BillTo">
        <h3>Billing Details</h3>
        Company Name:
        <xsl:value-of select="Name" />
        <br />
        Street:
        <xsl:value-of select="Street" />
        <br />
        CityZip:
        <xsl:value-of select="CityZip" />
        <br />
        Country:
        <xsl:value-of select="Country" />
        <br />
        <h3>Product Details</h3>
    </xsl:template>
    <xsl:template match="Product">
        <xsl:value-of select="Name" />
        <xsl:value-of select="Quantity" />
        <xsl:value-of select="Price" />
        <br />
    </xsl:template>
    <xsl:template match="Instruction">
        <br />
        <xsl:value-of select="." />
    </xsl:template>
</xsl:stylesheet>