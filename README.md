Views are located in the srsc/main/resources/templates folder.
Model is localed in src/main/java/MVP



Instructions for importing a project into IntelliJ:

1. Select on Import Project
2. Select the build.gradle file

The application.properties file needs to have a application-dev.properties file in the same directory otherwise it won't load. You have to create this yourself.

Instructions for setting up the application-dev.properties (this is the dev profile used)
Copy and paste the following:


spring.datasource.url=jdbc:postgresql://Enter IP-address of database/enter database name
spring.datasource.username=
spring.datasource.password=
flyway.baseline-on-migrate=true
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect
