EV Station API
This is a RESTful API for managing electric vehicle (EV) charging stations. It allows users to create, read, update, and delete (CRUD) EV charging stations.

Technologies Used
Spring Boot
Spring Data JPA
MySQL
API Endpoints
The following endpoints are available:

GET /api/stations: Retrieve a list of all EV charging stations.
GET /api/stations/{id}: Retrieve information about a specific EV charging station.
POST /api/stations: Create a new EV charging station.
PUT /api/stations/{id}: Update information about a specific EV charging station.
DELETE /api/stations/{id}: Delete a specific EV charging station.
Running the Application
Make sure you have MySQL installed on your machine and create a database with the name ev_station.
Clone this repository to your local machine.
Open the project in your preferred IDE.
Modify the application.properties file with your database credentials.
Build and run the application.
