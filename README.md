# Web Service Exercise

This project involves creating and testing a web service using JAX-WS, SOAP, and Spring Boot. The main functionality of the web service is to convert an amount from Euro (EUR) to Moroccan Dirham (MAD), retrieve account details, and provide a list of accounts.

## Features

1. **Currency Conversion:** Convert an amount from Euro to Moroccan Dirham (DH).
2. **Account Lookup:** Retrieve the details of a specific account.
3. **List of Accounts:** Fetch a list of all accounts.
4. **SOAP Web Service:** Expose the services via SOAP.
5. **Multiple Clients:** Create and deploy clients in Java, .NET, and PHP.
6. **Deployment on Apache Server:** Deploy the service on a web server using Apache for PHP.

## Architecture Overview

The architecture includes the following components:
- **JAX-WS Web Service:** The server exposes the functionality as a SOAP web service.
- **SOAP Clients:** Clients in Java, .NET, and PHP consume the web service.
- **Spring Boot:** The web service is integrated into a Spring Boot application for deployment.
- **SOAP Protocol:** All interactions between the client and the server are done via SOAP.

### Diagram
![Architecture Diagram](path/to/your/screenshot.png)

## Web Service Endpoints

- **WSDL:** You can access the WSDL file by navigating to:  
  `GET /BanqueWS?wsdl`

### Available Operations

- **conversion(double mt):** Converts a given amount in Euro to Moroccan Dirham.
- **getCompte():** Retrieves the details of a specific account.
- **getComptes():** Retrieves a list of all accounts.

## Steps to Deploy and Test

### 1. **Deploy the Web Service on JAX-WS**
   - The web service is implemented using JAX-WS.
   - The server exposes the necessary operations (`conversion`, `getCompte`, `getComptes`).
   
### 2. **Access the WSDL**
   - Open a browser and go to the following URL to access the WSDL:
     `GET /BanqueWS?wsdl`
   - Example URL: `http://localhost:8080/BanqueWS?wsdl`

### 3. **Test the Web Service with SoapUI or Oxygen**
   - Import the WSDL into SoapUI or Oxygen.
   - Test each of the operations (`conversion`, `getCompte`, `getComptes`) by sending SOAP requests.

### 4. **Create SOAP Clients**
   - **Java Client:** Create a Java client using the SOAP proxy generated from the WSDL.
   - **.NET Client:** Create a .NET SOAP client that can consume the web service.
   - **PHP Client:** Create a PHP client that interacts with the SOAP web service.

### 5. **Deploy the Web Service in Spring Boot**
   - Package and deploy the JAX-WS web service in a Spring Boot application.
   - Ensure that the service is accessible and functional.

## Architecture Details

The web service operates with a **stub-skeleton** architecture:
1. The **client** sends a SOAP request to the **stub**.
2. The **stub** forwards the request to the **skeleton**.
3. The **skeleton** calls the appropriate method on the web service.
4. The **web service** processes the request and returns the result.
5. The **skeleton** sends the result back to the **stub**.
6. The **stub** returns the result to the client.

### Client Request Flow:
- The client invokes the `conversion(12)` method on the stub.
- The stub sends a SOAP request to the skeleton.
- The skeleton calls the web service method to convert the amount.
- The result is returned to the skeleton via SOAP and then passed back to the client.

## Technologies Used
- **JAX-WS** for SOAP-based web services
- **Spring Boot** for deployment
- **SOAP** for communication
- **Apache Web Server** for deploying the PHP client
- **SoapUI / Oxygen** for testing the SOAP web service
- **Java, .NET, PHP** for client-side implementations

## Screenshots
Add relevant screenshots for each step of the process, such as:
- WSDL URL
- SoapUI testing results
- Java Client code and response
- PHP Client code and response

### Example Screenshot:
![SoapUI Test](path/to/your/screenshot.png)

## Conclusion

This project demonstrates the creation and testing of a SOAP web service with clients in multiple languages, including Java, .NET, and PHP. The web service is integrated into a Spring Boot project and deployed on an Apache server for the PHP client.
