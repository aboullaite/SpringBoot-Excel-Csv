# Spring Boot Export to Excel, CSV, and PDF.

This is a very simple project that showcases export to Excel (using `AbstractXlsView`), CSV (by extending `AbstractView`) and PDF. 

This project favors file extensions (xls/csv/pdf) to resolve views.

I'm using:

- iText for PDF generation (AGPL license. From iText page: "As soon as you want to use iText in a closed source, proprietary environment, you have to purchase an iText commercial license of one of the types discussed above.")
- Apache POI for Excel generation
- Super CSV for CSV generation
