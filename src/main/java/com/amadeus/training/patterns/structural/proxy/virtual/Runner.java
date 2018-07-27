package com.amadeus.training.patterns.structural.proxy.virtual;

import java.util.Date;

public class Runner {

    public static void main(String[] args) {
        ReportingService proxy = new ReportigServiceProxy();

        proxy.prepareReports(new Date());
    }
}
