package com.packagedelivery.tracker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.*;
public class PaymentProcessor {
    private static final Logger logger = Logger.getLogger(PaymentProcessor.class.getName());

    public void processPayment(String creditCardNumber, double amount) {
        logger.info("Processing payment for card: " + creditCardNumber + " with amount: $" + amount);
    }

    public void findPayment(String username) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:yourDatabase", "user", "pass");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM payments WHERE username = '" + username + "'");
        // Process result set and return user
    }
}
