<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output omit-xml-declaration="yes" indent="yes"/>
    <xsl:strip-space elements="*"/>
    <xsl:param name="uuid"/>
<!--     <xsl:param name="idtransaccion"/> -->
<!--     <xsl:param name="cunidadnegocio"/> -->
<!--     <xsl:param name="nit_proveedortecnologico"/> -->
<!--     <xsl:param name="url_proveedortecnologico"/> -->
<!--     <xsl:param name="usr_proveedortecnologico"/> -->
<!--     <xsl:param name="psswd_proveedortecnologico"/> -->
<!--     <xsl:param name="tt_operabilidad"/> -->
<!--     <xsl:param name="tt_xslt"/> -->
<!--     <xsl:param name="prueba"/> -->
<!--     <xsl:param name="prueba"/> -->

    <xsl:template match="node()|@*">
        <xsl:copy>
            <xsl:apply-templates select="node()|@*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/uuid[. = '']">
        <uuid><xsl:value-of select="uuid"/></uuid>
    </xsl:template>
<!--     <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/idtransaccion[. = '']"> -->
<!--         <idtransaccion><xsl:value-of select="idtransaccion"/></idtransaccion> -->
<!--     </xsl:template> -->
<!--     <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/cunidadnegocio[. = '']"> -->
<!--         <cunidadnegocio><xsl:value-of select="cunidadnegocio"/></cunidadnegocio> -->
<!--     </xsl:template> -->
<!--     <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/nit_proveedortecnologico[. = '']"> -->
<!--         <nit_proveedortecnologico><xsl:value-of select="nit_proveedortecnologico"/></nit_proveedortecnologico> -->
<!--     </xsl:template> -->
<!--     <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/url_proveedortecnologico[. = '']"> -->
<!--         <url_proveedortecnologico><xsl:value-of select="url_proveedortecnologico"/></url_proveedortecnologico> -->
<!--     </xsl:template> -->
<!--     <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/usr_proveedortecnologico[. = '']"> -->
<!--         <usr_proveedortecnologico><xsl:value-of select="usr_proveedortecnologico"/></usr_proveedortecnologico> -->
<!--     </xsl:template> -->
<!--     <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/psswd_proveedortecnologico[. = '']"> -->
<!--         <psswd_proveedortecnologico><xsl:value-of select="psswd_proveedortecnologico"/></psswd_proveedortecnologico> -->
<!--     </xsl:template> -->
<!--     <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/tt_operabilidad[. = '']"> -->
<!--         <tt_operabilidad><xsl:value-of select="tt_operabilidad"/></tt_operabilidad> -->
<!--     </xsl:template> -->
<!--     <xsl:template match="//tt_xmlrespuestafactura/tt_xmlrespuestafacturaRow/tt_xslt[. = '']"> -->
<!--         <tt_xslt><xsl:value-of select="tt_xslt"/></tt_xslt> -->
<!--     </xsl:template> -->
</xsl:stylesheet>