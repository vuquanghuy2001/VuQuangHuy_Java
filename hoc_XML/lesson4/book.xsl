<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="/Book">
        <body>
            <h1 align="center">
                <xsl:value-of select="ISBN" />
                <xsl:text>,</xsl:text>
                <xsl:value-of select="Title" />
            </h1>
            <h2 align="center">
                <xsl:text>by </xsl:text>
                <xsl:value-of select="Author/FirstName" />
                <xsl:text></xsl:text>
                <xsl:value-of select="Author/LastName" />
            </h2>
            <table border="1">
                <tr>
                    <td align="right">
                        <xsl:text>Preface </xsl:text>
                        <xsl:value-of select="Chapters/Preface/Number" />
                    </td>
                    <td>
                        <xsl:value-of select="Chapters/Preface/Name" />
                        <xsl:text> ( </xsl:text>
                        <xsl:value-of select="Chapters/Preface/Pages" />
                        <xsl:text> pages) </xsl:text>
                    </td>
                </tr>
                <xsl:for-each select="Chapters/Chapter">
                    <xsl:sotr select="Number" order="ascending" />
                    <tr>
                        <td align="right">
                            <xsl:text>Chapter </xsl:text>
                            <xsl:value-of select="Number" />
                        </td>
                        <td>
                            <xsl:value-of select="Name" />
                            <xsl:text> ( </xsl:text>
                            <xsl:value-of select="Pages" />
                            <xsl:text> pages)</xsl:text>
                        </td>
                    </tr>
                </xsl:for-each>
            </table>
        </body>
    </xsl:template>
</xsl:stylesheet>