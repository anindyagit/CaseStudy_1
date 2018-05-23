Project Name : TgtCAseStudy 1

Instruction for Deployment and Run :

This project is using spring boot with maven and hosted mongo db at mlab. Just download the source code , build and install dependencies from maven
and start spring boot application from TgtCaseStudy1Application.java .

Instruction For Testing :

Once the app is running the below services are running . 

{localhost}:8888/products/{id} for GET
{localhost}:8888/products/{id} for PUT

if the GET yields a result then a json is returned with HTTP 200 status , if there is no result or other exception
HTTP 204 is returned with no result.

For put , if aproduct exists and update is successful a json is returned with HTTP 200 status , otherwise 
HTTP 400 is returned with no data

Format of the JSON  for PUT and returned JSON in both scenario would be below  where id is any product id :
{
    "id": "13860428",
    "name": "Blu-ray BIG LEBOWSKI, THE Movies",
    "currentprice": {
        "value": 15.72,
        "currencyCd": "USD"
    }
}
