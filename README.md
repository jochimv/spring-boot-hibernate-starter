# Spring boot + hibernate + postgres starter project

You can run the server with 
`mvn spring-boot:run`

Also, postgres database is needed. 
1. `docker pull postgres`
2. `docker run --name my-postgres -e POSTGRES_PASSWORD=example -p 5432:5432 -d postgres`

If you want to test the API with Postman, you need to set the <strong>Content-Type</strong> to <strong>application/json</strong>. (PUT, POST).
Just deselect the auto generated header and add a new one.
