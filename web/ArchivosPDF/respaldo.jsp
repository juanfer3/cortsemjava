<%-- 
    Document   : respaldo
    Created on : 18/07/2017, 11:10:12 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <?xml version="1.0" encoding="UTF-8"?>
    <jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="null" language="java" pageWidth="595" pageHeight="842" columnWidth="535" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" uuid="9139b16e-6c98-49fd-a287-f1a10c343fbf">
        <parameter name="id" class="java.lang.Integer">
            <defaultValueExpression><![CDATA[]]></defaultValueExpression>
        </parameter>
        <queryString>
            <![CDATA[SELECT
            pedidos_detallados.`id` AS pedidos_detallados_id,
            pedidos_detallados.`pedido_id` AS pedidos_detallados_pedido_id,
            pedidos_detallados.`prenda` AS pedidos_detallados_prenda,
            pedidos_detallados.`telas_id` AS pedidos_detallados_telas_id,
            pedidos_detallados.`talla` AS pedidos_detallados_talla,
            pedidos_detallados.`cantidad` AS pedidos_detallados_cantidad,
            pedidos_detallados.`valor_unitario` AS pedidos_detallados_valor_unitario,
            pedidos_detallados.`valor_total` AS pedidos_detallados_valor_total,
            pedidos_detallados.`habilitado` AS pedidos_detallados_habilitado
            FROM
            `pedidos_detallados` pedidos_detallados
            where
            pedido_id=$P{id};]]>
        </queryString>
        <field name="pedidos_detallados_id" class="java.lang.Integer"/>
        <field name="pedidos_detallados_pedido_id" class="java.lang.Integer"/>
        <field name="pedidos_detallados_prenda" class="java.lang.String"/>
        <field name="pedidos_detallados_telas_id" class="java.lang.Integer"/>
        <field name="pedidos_detallados_talla" class="java.lang.String"/>
        <field name="pedidos_detallados_cantidad" class="java.lang.Integer"/>
        <field name="pedidos_detallados_valor_unitario" class="java.lang.Float"/>
        <field name="pedidos_detallados_valor_total" class="java.lang.Float"/>
        <field name="pedidos_detallados_habilitado" class="java.lang.String"/>
        <background>
            <band/>
        </background>
        <title>
            <band height="72">
                <frame>
                    <reportElement mode="Opaque" x="-20" y="-20" width="595" height="92" backcolor="#006699" uuid="23fdd1a3-b114-40bf-ab5a-5120ea96a6c0"/>
                    <staticText>
                        <reportElement x="20" y="20" width="234" height="43" forecolor="#FFFFFF" uuid="b41579db-9b09-4efe-ac50-0b5ca6c74787"/>
                        <textElement>
                            <font size="34" isBold="true"/>
                        </textElement>
                        <text><![CDATA[TITLE]]></text>
                    </staticText>
                    <staticText>
                        <reportElement x="395" y="43" width="180" height="20" forecolor="#FFFFFF" uuid="60f295e9-ec3e-4430-9e02-f7bc021e9f3a"/>
                        <textElement textAlignment="Right">
                            <font size="14" isBold="false"/>
                        </textElement>
                        <text><![CDATA[Add a description here]]></text>
                    </staticText>
                </frame>
            </band>
        </title>
        <pageHeader>
            <band height="13"/>
        </pageHeader>
        <columnHeader>
            <band height="21">
                <line>
                <reportElement x="-20" y="20" width="595" height="1" forecolor="#666666" uuid="4d029f69-d0ea-4124-acdf-a224a1d2952a"/>
                </line>
                <staticText>
                    <reportElement mode="Opaque" x="0" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="dd72c3f8-8b13-441b-9beb-a94d6d9ca5ba"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_id]]></text>
                </staticText>
                <staticText>
                    <reportElement mode="Opaque" x="61" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="1e7ffa74-efab-4858-8adb-fe619a5dccb6"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_pedido_id]]></text>
                </staticText>
                <staticText>
                    <reportElement mode="Opaque" x="122" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="bf60a22f-029b-4596-9b55-4f78647f2816"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_prenda]]></text>
                </staticText>
                <staticText>
                    <reportElement mode="Opaque" x="183" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="07863bc4-899e-451e-a4a3-6c677ad9796b"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_telas_id]]></text>
                </staticText>
                <staticText>
                    <reportElement mode="Opaque" x="244" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="c4b48e3f-64ff-445c-80dc-3150a77dbe16"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_talla]]></text>
                </staticText>
                <staticText>
                    <reportElement mode="Opaque" x="305" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="79e44940-ff2c-4db0-8372-9a7dd8433d53"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_cantidad]]></text>
                </staticText>
                <staticText>
                    <reportElement mode="Opaque" x="366" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="e52ada37-d910-4e80-b58d-cf651e16a789"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_valor_unitario]]></text>
                </staticText>
                <staticText>
                    <reportElement mode="Opaque" x="427" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="6be18104-8667-4332-83b2-6726fb384e45"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_valor_total]]></text>
                </staticText>
                <staticText>
                    <reportElement mode="Opaque" x="488" y="0" width="61" height="20" forecolor="#006699" backcolor="#E6E6E6" uuid="c2735bd4-3722-4a3d-9347-f92f6601f38d"/>
                    <textElement textAlignment="Center">
                        <font size="14" isBold="true"/>
                    </textElement>
                    <text><![CDATA[pedidos_detallados_habilitado]]></text>
                </staticText>
            </band>
        </columnHeader>
        <detail>
            <band height="20">
                <line>
                <reportElement positionType="FixRelativeToBottom" x="0" y="19" width="555" height="1" uuid="27eff601-7836-4984-a75d-07556e5496cd"/>
                </line>
                <textField isStretchWithOverflow="true">
                    <reportElement x="0" y="0" width="61" height="20" uuid="48171bf3-acc5-464d-a5cd-13e006d38812"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_id}]]></textFieldExpression>
                </textField>
                <textField isStretchWithOverflow="true">
                    <reportElement x="61" y="0" width="61" height="20" uuid="919639ea-76e0-4e30-a48e-c9029ebf7ae4"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_pedido_id}]]></textFieldExpression>
                </textField>
                <textField isStretchWithOverflow="true">
                    <reportElement x="122" y="0" width="61" height="20" uuid="cf9fbff6-b324-4473-a58b-7600c3b1990b"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_prenda}]]></textFieldExpression>
                </textField>
                <textField isStretchWithOverflow="true">
                    <reportElement x="183" y="0" width="61" height="20" uuid="f3589a3e-f87a-4be4-a88b-34d736d865b6"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_telas_id}]]></textFieldExpression>
                </textField>
                <textField isStretchWithOverflow="true">
                    <reportElement x="244" y="0" width="61" height="20" uuid="6daa64e3-b7aa-42ed-b266-a05f4e220685"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_talla}]]></textFieldExpression>
                </textField>
                <textField isStretchWithOverflow="true">
                    <reportElement x="305" y="0" width="61" height="20" uuid="2918052a-887e-43e3-9a8f-f36244853b43"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_cantidad}]]></textFieldExpression>
                </textField>
                <textField isStretchWithOverflow="true">
                    <reportElement x="366" y="0" width="61" height="20" uuid="8d2b4502-a9e0-4477-8c03-e772229cf3ca"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_valor_unitario}]]></textFieldExpression>
                </textField>
                <textField isStretchWithOverflow="true">
                    <reportElement x="427" y="0" width="61" height="20" uuid="fe359417-2028-48aa-8837-e83707dc656b"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_valor_total}]]></textFieldExpression>
                </textField>
                <textField isStretchWithOverflow="true">
                    <reportElement x="488" y="0" width="61" height="20" uuid="1431919f-e884-427a-92a3-861523085796"/>
                    <textElement>
                        <font size="14"/>
                    </textElement>
                    <textFieldExpression><![CDATA[$F{pedidos_detallados_habilitado}]]></textFieldExpression>
                </textField>
            </band>
        </detail>
        <columnFooter>
            <band/>
        </columnFooter>
        <pageFooter>
            <band height="17">
                <textField>
                    <reportElement mode="Opaque" x="0" y="4" width="515" height="13" backcolor="#E6E6E6" uuid="103cf4c1-c41a-48b1-bf41-81c253a92e73"/>
                    <textElement textAlignment="Right"/>
                    <textFieldExpression><![CDATA["Page "+$V{PAGE_NUMBER}+" of"]]></textFieldExpression>
                </textField>
                <textField evaluationTime="Report">
                    <reportElement mode="Opaque" x="515" y="4" width="40" height="13" backcolor="#E6E6E6" uuid="cb5275c1-57f9-48b0-b9f8-2c143f6796e4"/>
                    <textFieldExpression><![CDATA[" " + $V{PAGE_NUMBER}]]></textFieldExpression>
                </textField>
                <textField pattern="EEEEE dd MMMMM yyyy">
                    <reportElement x="0" y="4" width="100" height="13" uuid="5779598a-ae04-4091-807d-ccbc60ad42d1"/>
                    <textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>
                </textField>
            </band>
        </pageFooter>
        <summary>
            <band/>
        </summary>
    </jasperReport>

</body>
</html>
