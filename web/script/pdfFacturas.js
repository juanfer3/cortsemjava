function OpenPDF(){

  var doc= new jsPDF();

doc.setFontSize(20);
doc.setFont("times");
doc.setFontType("bold");


  doc.fromHTML($('#Facturas').get(0), 20, 20,{
                'width':200});
  doc.save('Factura.pdf');
}
