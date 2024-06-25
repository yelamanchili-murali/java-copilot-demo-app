# OpenAPI Coding Conventions Document

## General Structure

- **Versioning:** Use OpenAPI 3.0.3 or above for all API specifications to ensure the use of the latest features and improvements.
- **Info Object:** Must include the `title` and `version` of the API for clear identification.

## Paths

- **Endpoint Naming:**
    - Use plural nouns (e.g., `invoices`) to represent collections.
    - Resource identifiers (e.g., `{invoice_no}`) should be enclosed in curly braces and be descriptive.
- **HTTP Methods:**
    - Use HTTP `GET` for retrieving resources.
- **Summaries:** Provide a concise summary for each operation to describe its purpose.

## Responses

- **Status Codes:**
    - Use `200` for successful operations.
    - Use `502` for system errors.
- **Descriptions:** Include a description for each response to explain its meaning.
- **Content Type:**
    - Only use `application/json` for responses to ensure API consistency.

## Components

- **Schema Definitions:**
    - Define commonly used objects in the `components/schemas` section for reuse.
- **Data Types:**
    - Use appropriate data types (e.g., `string`, `number`, `object`) and formats (e.g., `float` for decimals) for schema properties.
    - geo-location data should be represented as an object with `latitude` and `longitude` properties.

### Schemas

- **Naming Conventions:** Schema names should be PascalCase and clearly describe the resource (e.g., `Invoice`, `Error`).
- **Object Properties:**
    - Use snake_case for property names (e.g., `invoice_no`, `vendor_address`).
    - Group related properties under a single object (e.g., `latitude` and `longitude` under `vendor_address`).

### Error Handling

- **Error Schema:** Use a generic `Error` schema for error responses with a `message` property to describe the error.

## Parameters

- **Parameter Placement:** Clearly specify the location of parameters (`in: path`, `in: query`, etc.).
- **Required Parameters:** Mark required parameters explicitly to ensure API consumers provide necessary data.

## Best Practices

- **Consistency:** Adhere to these conventions for all API specifications to maintain consistency across different APIs.
- **Documentation:** Provide detailed documentation for each endpoint, including descriptions, parameters, request bodies, and responses.
- **Version Control:** Use version control systems (e.g., Git) to manage changes in API specifications.

---

