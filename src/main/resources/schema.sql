-- Create GeoLocation table
CREATE TABLE geo_location (
                              id INT PRIMARY KEY,
                              latitude DECIMAL(10, 4),
                              longitude DECIMAL(10, 4)
);

-- Create package table
CREATE TABLE package (
                         id INT PRIMARY KEY,
                         consignment_number VARCHAR(255),
                         consignee_name VARCHAR(255),
                         delivery_address_id INT,
                         FOREIGN KEY (delivery_address_id) REFERENCES geo_location(id)
);