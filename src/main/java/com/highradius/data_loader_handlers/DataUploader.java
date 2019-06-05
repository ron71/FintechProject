package com.highradius.data_loader_handlers;

import com.highradius.databasehandlers.DatabaseHelper;
import com.highradius.models.Invoice;
import com.highradius.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

public class DataUploader {

    Connection connection;
    PreparedStatement preparedStatement;

    String paramQuery = "INSERT INTO acct_doc_header(" +
            "account_id,document_number_norm,company_code,fiscal_year,branch,customer_number_norm,fk_customer_map_id," +
            "document_date_norm,baseline_date_norm,due_date_norm,invoice_number_norm,open_amount_norm,payment_terms," +
            "clearing_date_norm,isopen,order_type,order_date,business_area,ship_date,job_id,tax_amt," +
            "current_disput_amount,ship_to,document_id,document_date,actual_open_amount,due_date,invoice_age," +
            "isvalid_dispute,retainage_amount,posting_key,strategy_id,currency,debit_credit_indicator," +
            "valid_open_amount,customer_name) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public DataUploader() {

        connection = DatabaseHelper.connectAndOpenDatabase();

    }

    public User uploadUser(User user) {
        String mail = user.getEmail();
        String userId = mail.substring(0, mail.indexOf("@"));
        try {
            preparedStatement = connection.prepareStatement(paramQuery);
        } catch (SQLException e) {
            System.err.println("Prepared Statement ERROR : " + e.toString());
            return null;
        }

        paramQuery = "INSERT INTO employee VALUES (?,?,?,?,?,?);";

        try {
            preparedStatement = connection.prepareStatement(paramQuery);
            preparedStatement.setString(1, userId);
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getGender() + "");
            preparedStatement.setString(6, user.getAddress());

            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println("Prepared Statement ERROR : " + e.toString());
            return null;
        }

        return user;
    }



    public void uploadInvoices(ArrayList<Invoice> invoices) {

        try {
            preparedStatement = connection.prepareStatement(paramQuery);
        } catch (SQLException e) {
            System.err.println("Prepared Statement ERROR : " + e.toString());
            return;
        }
        for (Invoice invoice : invoices) {
            try {
                if (invoice.getAccount_id() == -1)
                    preparedStatement.setNull(1, Types.INTEGER);
                else
                    preparedStatement.setLong(1, invoice.getAccount_id());

                if (invoice.getDocument_number_norm() == null)
                    preparedStatement.setNull(2, Types.VARCHAR);
                else
                    preparedStatement.setString(2, invoice.getDocument_number_norm());

                if (invoice.getCompany_code() == null)
                    preparedStatement.setNull(3, Types.VARCHAR);
                else
                    preparedStatement.setString(3, invoice.getCompany_code());

                if (invoice.getFiscal_year() == null)
                    preparedStatement.setNull(4, Types.VARCHAR);
                else
                    preparedStatement.setString(4, invoice.getFiscal_year());

                if (invoice.getBranch() == null)
                    preparedStatement.setNull(5, Types.VARCHAR);
                else
                    preparedStatement.setString(5, invoice.getBranch());

                if (invoice.getCustomer_number_norm() == null)
                    preparedStatement.setNull(6, Types.VARCHAR);
                else
                    preparedStatement.setString(6, invoice.getCustomer_number_norm());

                if (invoice.getFk_customer_map_id() == -1)
                    preparedStatement.setNull(7, Types.INTEGER);
                else
                    preparedStatement.setLong(7, invoice.getFk_customer_map_id());

                if (invoice.getDocument_date_norm() == null)
                    preparedStatement.setNull(8, Types.DATE);
                else
                    preparedStatement.setDate(8, invoice.getDocument_date_norm());

                if (invoice.getBaseline_date_norm() == null)
                    preparedStatement.setNull(9, Types.DATE);
                else
                    preparedStatement.setDate(9, invoice.getBaseline_date_norm());

                if (invoice.getDue_date_norm() == null)
                    preparedStatement.setNull(10, Types.DATE);
                else
                    preparedStatement.setDate(10, invoice.getDue_date_norm());

                if (invoice.getInvoice_number_norm() == null)
                    preparedStatement.setNull(11, Types.VARCHAR);
                else
                    preparedStatement.setString(11, invoice.getInvoice_number_norm());

                if (invoice.getOpen_amount_norm() == -1)
                    preparedStatement.setNull(12, Types.DECIMAL);
                else
                    preparedStatement.setDouble(12, invoice.getOpen_amount_norm());

                if (invoice.getPayment_terms() == null)
                    preparedStatement.setNull(13, Types.VARCHAR);
                else
                    preparedStatement.setString(13, invoice.getPayment_terms());

                if (invoice.getClearing_date_norm() == null)
                    preparedStatement.setNull(14, Types.DATE);
                else
                    preparedStatement.setDate(14, invoice.getClearing_date_norm());

                if (invoice.getIsOpen() == -1)
                    preparedStatement.setNull(15, Types.TINYINT);
                else
                    preparedStatement.setInt(15, invoice.getIsOpen());

                if (invoice.getOrder_type() == null)
                    preparedStatement.setNull(16, Types.VARCHAR);
                else
                    preparedStatement.setString(16, invoice.getOrder_type());

                if (invoice.getOrder_date() == null)
                    preparedStatement.setNull(17, Types.DATE);
                else
                    preparedStatement.setDate(17, invoice.getOrder_date());

                if (invoice.getBusiness_area() == null)
                    preparedStatement.setNull(18, Types.VARCHAR);
                else
                    preparedStatement.setString(18, invoice.getBusiness_area());

                if (invoice.getShip_date() == null)
                    preparedStatement.setNull(19, Types.DATE);
                else
                    preparedStatement.setDate(19, invoice.getShip_date());

                if (invoice.getJob_id() == -1)
                    preparedStatement.setNull(20, Types.INTEGER);
                else
                    preparedStatement.setLong(20, invoice.getJob_id());

                if (invoice.getTax_amt() == -1)
                    preparedStatement.setNull(21, Types.DECIMAL);
                else
                    preparedStatement.setDouble(21, invoice.getTax_amt());

                if (invoice.getCurrent_disput_amount() == -1)
                    preparedStatement.setNull(22, Types.DECIMAL);
                else
                    preparedStatement.setDouble(22, invoice.getCurrent_disput_amount());

                if (invoice.getShip_to() == null)
                    preparedStatement.setNull(23, Types.VARCHAR);
                else
                    preparedStatement.setString(23, invoice.getShip_to());

                if (invoice.getDocument_id() == -1)
                    preparedStatement.setNull(24, Types.INTEGER);
                else
                    preparedStatement.setLong(24, invoice.getDocument_id());

                if (invoice.getDocument_date() == null)
                    preparedStatement.setNull(25, Types.DATE);
                else
                    preparedStatement.setDate(25, invoice.getDocument_date());

                if (invoice.getActual_open_amount() == -1)
                    preparedStatement.setNull(26, Types.DECIMAL);
                else
                    preparedStatement.setDouble(26, invoice.getActual_open_amount());

                if (invoice.getDue_date() == null)
                    preparedStatement.setNull(27, Types.DATE);
                else
                    preparedStatement.setDate(27, invoice.getDue_date());

                if (invoice.getInvoice_age() == -1)
                    preparedStatement.setNull(28, Types.INTEGER);
                else
                    preparedStatement.setLong(28, invoice.getInvoice_age());

                if (invoice.getIsvalid_dispute() == -1)
                    preparedStatement.setNull(29, Types.TINYINT);
                else
                    preparedStatement.setInt(29, invoice.getIsvalid_dispute());

                if (invoice.getRetainage_amount() == -1)
                    preparedStatement.setNull(30, Types.DECIMAL);
                else
                    preparedStatement.setDouble(30, invoice.getRetainage_amount());

                if (invoice.getPosting_key() == null)
                    preparedStatement.setNull(31, Types.VARCHAR);
                else
                    preparedStatement.setString(31, invoice.getPosting_key());

                if (invoice.getStrategy_id() == -1)
                    preparedStatement.setNull(32, Types.INTEGER);
                else
                    preparedStatement.setLong(32, invoice.getStrategy_id());

                if (invoice.getCurrency() == null)
                    preparedStatement.setNull(33, Types.VARCHAR);
                else
                    preparedStatement.setString(33, invoice.getCurrency());

                if (invoice.getDebit_credit_indicator() == null)
                    preparedStatement.setNull(34, Types.VARCHAR);
                else
                    preparedStatement.setString(34, invoice.getDebit_credit_indicator());

                if (invoice.getValid_open_amount() == -1)
                    preparedStatement.setNull(35, Types.DECIMAL);
                else
                    preparedStatement.setDouble(35, invoice.getValid_open_amount());

                if (invoice.getCustomer_name() == null)
                    preparedStatement.setNull(36, Types.VARCHAR);
                else
                    preparedStatement.setString(36, invoice.getCustomer_name());

            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                preparedStatement.addBatch();
                // int x =  preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.err.println("BATCH ERROR : " + e.toString());
                e.printStackTrace();

            }

        }

        try {
            int[] res = preparedStatement.executeBatch();
            System.out.println("One Batch Executed SIZE : " + res.length);
        } catch (SQLException e) {
            System.err.println("EXCUTE ERROR : " + e.toString());
            e.printStackTrace();
        }

    }


    public void closeAllConnections() {
        try {
            connection.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
