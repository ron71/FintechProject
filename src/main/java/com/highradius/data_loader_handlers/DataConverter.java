package com.highradius.data_loader_handlers;

import com.highradius.models.Invoice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class DataConverter {

    static final String FILEPATH = "C:"+ File.separator +"Users"+ File.separator +"nEW u"+ File.separator +"Desktop"+ File.separator+
            "HiRadius"+ File.separator +"Fintech"+ File.separator +"SampleDataset.csv";



   static public ArrayList<Invoice> getDataFromCSV() {
        File file = new File(FILEPATH);
        ArrayList<Invoice> invoices = new ArrayList<Invoice>();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fileInputStream);

        sc.nextLine();
        while(sc.hasNextLine()){
            String values[] = sc.nextLine().split(",");
            Invoice invoice = new Invoice();

            if(values[0].isEmpty()){
                invoice.setAccount_id(-1);
            }else{
                invoice.setAccount_id(Long.parseLong(values[0]));
            }

            if(!values[1].isEmpty() && !values[1].equals("\\N"))
                invoice.setDocument_number_norm(values[1]);

            if(!values[2].isEmpty() && !values[2].equals("\\N"))
                invoice.setCompany_code(values[2]);

            if(!values[3].isEmpty()&& !values[3].equals("\\N"))
                invoice.setFiscal_year(values[3]);


            if(!values[4].isEmpty()&& !values[4].equals("\\N"))
                invoice.setBranch(values[4]);

            if(!values[5].isEmpty() && !values[5].equals("\\N"))
                invoice.setCustomer_number_norm(values[5]);

            if(values[6].isEmpty() || values[6].equals("\\N")){
                invoice.setFk_customer_map_id(-1);
            }else{
                invoice.setFk_customer_map_id(Long.parseLong(values[6]));
            }

            //for Date
            if(!values[7].isEmpty() && !values[7].equals("\\N"))
                invoice.setDocument_date_norm(Date.valueOf(values[7]));

            if(!values[8].isEmpty() && !values[8].equals("\\N"))
                invoice.setBaseline_date_norm(Date.valueOf(values[8]));

            if(!values[9].isEmpty() && !values[9].equals("\\N"))
                invoice.setDue_date_norm(Date.valueOf(values[9]));

            if(!values[10].isEmpty() && !values[10].equals("\\N"))
                invoice.setInvoice_number_norm(values[10]);


            if(values[11].isEmpty() || values[11].equals("\\N")){
                invoice.setOpen_amount_norm(-1);
            }else{
                invoice.setOpen_amount_norm(Double.parseDouble(values[11]));
            }

            if(!values[12].isEmpty() && !values[12].equals("\\N"))
                invoice.setPayment_terms(values[12]);

            //for Date
            if(!values[13].isEmpty()&& !values[13].equals("\\N")){
                invoice.setClearing_date_norm(Date.valueOf(values[13]));
            }

            if(values[14].isEmpty() || values[14].equals("\\N")){
                invoice.setIsOpen(-1);
            }else {
                invoice.setIsOpen(Integer.parseInt(values[14]));
            }

            if(!values[15].isEmpty() && !values[15].equals("\\N"))
                invoice.setOrder_type(values[15]);

            //For Date
            if(!values[16].isEmpty() && !values[16].equals("\\N"))
                invoice.setOrder_date(Date.valueOf(values[16]));

            if(!values[17].isEmpty()&& !values[17].equals("\\N"))
                invoice.setBusiness_area(values[17]);

            //For Date
            if(!values[18].isEmpty() && !values[18].equals("\\N"))
                invoice.setShip_date(Date.valueOf(values[18]));

            if(values[19].isEmpty() || values[19].equals("\\N")){
                invoice.setJob_id(-1);
            }else{
                invoice.setJob_id(Long.parseLong(values[19]));
            }

            if(values[20].isEmpty() || values[20].equals("\\N")){
                invoice.setTax_amt(-1);
            }else{
                invoice.setTax_amt(Double.parseDouble(values[20]));
            }

            if(values[21].isEmpty() || values[21].equals("\\N")){
                invoice.setCurrent_disput_amount(-1);
            }else{
                invoice.setCurrent_disput_amount(Double.parseDouble(values[21]));
            }

            if(!values[22].isEmpty() && !values[22].equals("\\N"))
                invoice.setShip_to(values[22]);

            if(values[23].isEmpty() || values[23].equals("\\N")){
                invoice.setDocument_id(-1);
            }else {
                invoice.setDocument_id(Long.parseLong(values[23]));
            }

            //For Date
            if(!values[24].isEmpty() && !values[24].equals("\\N"))
                invoice.setDocument_date(Date.valueOf(values[24]));

            if(values[25].isEmpty() || values[25].equals("\\N")){
                invoice.setActual_open_amount(-1);
            }else {
                invoice.setActual_open_amount(Double.parseDouble(values[25]));
            }

            //For Date
            if(!values[26].isEmpty() && !values[26].equals("\\N"))
                invoice.setDue_date(Date.valueOf(values[26]));

            if(values[27].isEmpty() || values[27].equals("\\N")){
                invoice.setInvoice_age(-1);
            }else {
                invoice.setInvoice_age(Long.parseLong(values[27]));
            }

            if(values[28].isEmpty() || values[28].equals("\\N")){
                invoice.setIsvalid_dispute(-1);
            }else{
                invoice.setIsvalid_dispute(Integer.parseInt(values[28]));
            }

            if(values[29].isEmpty() || values[29].equals("\\N")){
                invoice.setRetainage_amount(-1);
            }else{
                invoice.setRetainage_amount(Double.parseDouble(values[29]));
            }

            if(!values[30].isEmpty() && !values[30].equals("\\N"))
                invoice.setPosting_key(values[30]);

            if(values[31].isEmpty() || values[31].equals("\\N")){
                invoice.setStrategy_id(-1);
            }else{
                invoice.setStrategy_id(Long.parseLong(values[31]));
            }

            if(!values[32].isEmpty() && !values[32].equals("\\N"))
                invoice.setCurrency(values[32]);

            if(!values[33].isEmpty() && !values[33].equals("\\N"))
                invoice.setDebit_credit_indicator(values[33]);


            if(values[34].isEmpty() || values[34].equals("\\N")){
                invoice.setValid_open_amount(-1);
            }else{
                invoice.setValid_open_amount(Double.parseDouble(values[34]));
            }

            if(values.length>35){
                if(!values[35].isEmpty() && !values[35].equals("\\N"))
                    invoice.setCustomer_name(values[35]);
            }

            invoices.add(invoice);

        }

        return invoices;
    }
}
