<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    
    <xsl:template match="/releve">
         <html>
             <head>
                 <title>Banking</title>
             </head>
             <body>
                 
                 
                 <h3>releve bancaire du Compte : <xsl:value-of select="@RIB"></xsl:value-of> </h3>
                 <h4>Date : <xsl:value-of select="dateReleve"/> </h4>

                 <table border="1" width="75%">
                     
                     <tr>
                         <th>date</th>
                         <th>Descritpion</th>
                         <th>DEBIT</th>
                         <th>CREDIT</th>
                        
                     </tr>
                     
                     <xsl:for-each select="operations/operation">
                         
                        <tr>
                            <td> <xsl:value-of select="@date"></xsl:value-of> </td>
                           
                            <td> <xsl:value-of select="@description"></xsl:value-of> </td>
                           
                            <td> <xsl:if test="@type='DEBIT'">
                                <xsl:value-of select="@montant"></xsl:value-of>
                            </xsl:if> </td>
                            <td> <xsl:if test="@type='CREDIT'">
                                <xsl:value-of select="@montant"></xsl:value-of>
                            </xsl:if> </td>
                            
                        </tr>
                         
                        
                     </xsl:for-each>
                     
                     <tr>
                         <td colspan="2">TOTAL DEBITS</td>
                         <td>
                             <b>
                             <xsl:value-of select="sum(operations/operation[@type='DEBIT']/@montant)"></xsl:value-of>
                             </b>
                         </td>
                         <td> - </td>
                     </tr>
                     
                     <tr>
                         <td colspan="2">TOTAL CREDITS</td>
                         <td> - </td>
                         <td>
                             <b>
                                 <xsl:value-of select="sum(operations/operation[@type='CREDIT']/@montant)" ></xsl:value-of>
                             </b> </td>
                     </tr>
                     
                     <tr>
                        <td colspan="2">Solde</td>
                         <td colspan="2">
                             
                             <xsl:value-of select="sum(operations/operation[@type='CREDIT']/@montant) - sum(operations/operation[@type='DEBIT']/@montant)" ></xsl:value-of>
                         </td>
                            
                     </tr>
                     
                  
                 </table>
            
             </body>
         </html>
    </xsl:template>
    
</xsl:stylesheet>  