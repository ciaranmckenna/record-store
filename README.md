# record-store
App to query an H2 Database on record and artist information

Getting Started
---------------

These instructions will get you a copy of the project up and running on
your local machine for development and testing purposes.

### Prerequisites

Ensure you have Java 8 or higher installed on your machine. To check,
run the following on the command line:

`java --version`8

If you do not have Java installed, you should get a prompt to do so.
Once installed,

you should also have access to `javac`. You can check this by running:

`javac --version`8

### Up and Running Options

From the terminal run the following `./record-store-app-0.0.1-SNAPSHOT.jar`

From Intellij right click and run `RecordStoreApplication` 

Alternative terminal launch, within the structure of `record-store-app` run the following `./mvnw spring-boot:run`

Run `mvn spring-boot:run`

### Interaction with Postman is needed for calling APIs

Generating of data using postman is done with the following http POST request API call 

GET /records 			        - Get all records

GET /records/{id}		      - Get record by ID

GET /records{id}/artist	  - Get record by ID with artist information

GET /records/artist		    - Get all records with artist information


