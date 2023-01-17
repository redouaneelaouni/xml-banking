<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    
    <xsl:template match="/releve">
        <html>
            <head>
                <title>Banking</title>
            </head>
            <body>
                
                
                <h3>releve bancaire (CREDIT) du Compte : <xsl:value-of select="@RIB"></xsl:value-of> </h3>
                <h4>Date : <xsl:value-of select="dateReleve"/> </h4>
                
                <table border="1" width="75%">
                    
                    <tr>
                        <th>date</th>
                        <th>Descritpion</th>
                        <th>montant</th>
                        
                        
                    </tr>
                    
                    <xsl:for-each select="operations/operation[@type='CREDIT']">
                        
                        <tr>
                            <td> <xsl:value-of select="@date"></xsl:value-of> </td>
                            
                            <td> <xsl:value-of select="@description"></xsl:value-of> </td>
                          
                            <td> 
                                <xsl:value-of select="@montant"></xsl:value-of>
                             </td>
                            
                        </tr>
                        
                        
                    </xsl:for-each>
                    
                    <tr>
                        <td colspan="2">TOTAL</td>
                       
                        <td>
                            <b>
                                <xsl:value-of select="sum(operations/operation[@type='CREDIT']/@montant)" ></xsl:value-of>
                            </b> </td>
                    </tr>

                </table>
                
            </body>
        </html>
    </xsl:template>
    
</xsl:stylesheet>  