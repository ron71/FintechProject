package com.highradius.models;

import java.sql.Date;

public class Invoice {

    private long account_id;
    private String document_number_norm;
    private String company_code;
    private String fiscal_year;
    private String branch;
    private String customer_number_norm;
    private long fk_customer_map_id;
    private Date document_date_norm;
    private Date baseline_date_norm;
    private Date due_date_norm;
    private String invoice_number_norm;
    private double open_amount_norm;
    private String payment_terms;
    private Date clearing_date_norm;
    private int isOpen;
    private String order_type;
    private Date order_date;
    private String business_area;
    private Date ship_date;
    private long job_id;
    private double tax_amt;
    private double current_disput_amount;
    private String ship_to;
    private long document_id;
    private Date document_date;
    private double actual_open_amount;
    private Date due_date;
    private long invoice_age;
    private int isvalid_dispute;
    private double retainage_amount;
    private String posting_key;
    private long strategy_id;
    private String currency;
    private String debit_credit_indicator;
    private double valid_open_amount;
    private String customer_name;


    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }

    public String getDocument_number_norm() {
        return document_number_norm;
    }

    public void setDocument_number_norm(String document_number_norm) {
        this.document_number_norm = document_number_norm;
    }

    public String getCompany_code() {
        return company_code;
    }

    public void setCompany_code(String company_code) {
        this.company_code = company_code;
    }

    public String getFiscal_year() {
        return fiscal_year;
    }

    public void setFiscal_year(String fiscal_year) {
        this.fiscal_year = fiscal_year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCustomer_number_norm() {
        return customer_number_norm;
    }

    public void setCustomer_number_norm(String customer_number_norm) {
        this.customer_number_norm = customer_number_norm;
    }

    public long getFk_customer_map_id() {
        return fk_customer_map_id;
    }

    public void setFk_customer_map_id(long fk_customer_map_id) {
        this.fk_customer_map_id = fk_customer_map_id;
    }

    public Date getDocument_date_norm() {
        return document_date_norm;
    }

    public void setDocument_date_norm(Date document_date_norm) {
        this.document_date_norm = document_date_norm;
    }

    public Date getBaseline_date_norm() {
        return baseline_date_norm;
    }

    public void setBaseline_date_norm(Date baseline_date_norm) {
        this.baseline_date_norm = baseline_date_norm;
    }

    public Date getDue_date_norm() {
        return due_date_norm;
    }

    public void setDue_date_norm(Date due_date_norm) {
        this.due_date_norm = due_date_norm;
    }

    public String getInvoice_number_norm() {
        return invoice_number_norm;
    }

    public void setInvoice_number_norm(String invoice_number_norm) {
        this.invoice_number_norm = invoice_number_norm;
    }

    public double getOpen_amount_norm() {
        return open_amount_norm;
    }

    public void setOpen_amount_norm(double open_amount_norm) {
        this.open_amount_norm = open_amount_norm;
    }

    public String getPayment_terms() {
        return payment_terms;
    }

    public void setPayment_terms(String payment_terms) {
        this.payment_terms = payment_terms;
    }

    public Date getClearing_date_norm() {
        return clearing_date_norm;
    }

    public void setClearing_date_norm(Date clearing_date_norm) {
        this.clearing_date_norm = clearing_date_norm;
    }

    public int getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(int isOpen) {
        this.isOpen = isOpen;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getBusiness_area() {
        return business_area;
    }

    public void setBusiness_area(String business_area) {
        this.business_area = business_area;
    }

    public Date getShip_date() {
        return ship_date;
    }

    public void setShip_date(Date ship_date) {
        this.ship_date = ship_date;
    }

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public double getTax_amt() {
        return tax_amt;
    }

    public void setTax_amt(double tax_amt) {
        this.tax_amt = tax_amt;
    }

    public double getCurrent_disput_amount() {
        return current_disput_amount;
    }

    public void setCurrent_disput_amount(double current_disput_amount) {
        this.current_disput_amount = current_disput_amount;
    }

    public String getShip_to() {
        return ship_to;
    }

    public void setShip_to(String ship_to) {
        this.ship_to = ship_to;
    }

    public long getDocument_id() {
        return document_id;
    }

    public void setDocument_id(long document_id) {
        this.document_id = document_id;
    }

    public Date getDocument_date() {
        return document_date;
    }

    public void setDocument_date(Date document_date) {
        this.document_date = document_date;
    }

    public double getActual_open_amount() {
        return actual_open_amount;
    }

    public void setActual_open_amount(double actual_open_amount) {
        this.actual_open_amount = actual_open_amount;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public long getInvoice_age() {
        return invoice_age;
    }

    public void setInvoice_age(long invoice_age) {
        this.invoice_age = invoice_age;
    }

    public int getIsvalid_dispute() {
        return isvalid_dispute;
    }

    public void setIsvalid_dispute(int isvalid_dispute) {
        this.isvalid_dispute = isvalid_dispute;
    }

    public String getPosting_key() {
        return posting_key;
    }

    public void setPosting_key(String posting_key) {
        this.posting_key = posting_key;
    }

    public long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(long strategy_id) {
        this.strategy_id = strategy_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDebit_credit_indicator() {
        return debit_credit_indicator;
    }

    public void setDebit_credit_indicator(String debit_credit_indicator) {
        this.debit_credit_indicator = debit_credit_indicator;
    }

    public double getValid_open_amount() {
        return valid_open_amount;
    }

    public void setValid_open_amount(double valid_open_amount) {
        this.valid_open_amount = valid_open_amount;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public double getRetainage_amount() {
        return retainage_amount;
    }

    public void setRetainage_amount(double retainage_amount) {
        this.retainage_amount = retainage_amount;
    }
}

