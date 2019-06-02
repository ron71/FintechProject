package com.highradius;

import com.highradius.data_loader_handlers.DataConverter;
import com.highradius.data_loader_handlers.DataUploader;
import com.highradius.models.Invoice;

import java.util.ArrayList;

public class Fintech_Main {

    static void uploadToDatabase(ArrayList<Invoice> invoices){

        DataUploader uploader = new DataUploader();
        uploader.uploadInvoices(invoices);
        uploader.closeAllConnections();
    }

    public static void main(String[] args) {

        ArrayList<Invoice> invoices = DataConverter.getDataFromCSV();

        uploadToDatabase(invoices);




    }
}
