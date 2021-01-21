# FireMap_API
API REST with Spring boot to manage the mobile application 

operations : 

GET :
- get all fireworks
https://firemap-api-rest.herokuapp.com/fireworks/

- get one firework whith id
https://firemap-api-rest.herokuapp.com/fireworks/{id}


POST :

- post firework
https://firemap-api-rest.herokuapp.com/fireworks/

DELETE : 

- delete firework with id
https://firemap-api-rest.herokuapp.com/fireworks/{id}


Curl : 
getFireworks : curl -X GET http://localhost:8080/fireworks

newFirework :  curl -X POST -H "Content-Type: application/json" -d '{"longitude":3.172488,"latitude":50.638002,"address":"Université de Lille","date":"2021-01-18T15:45:26.333+00:00","price":0,"handicapAccess":true,"duration":"Middle","crowded":"High","fireworker":[{"id":2,"name":"Bob","note":4.4}],"parking":[{"id":0,"name":"Parking du lac du hÃ©ron","price":0.0}]}' http://localhost:8080/fireworks

geFireworkById : curl -X GET http://localhost:8080/fireworks/1

deleteFirework : curl -X DELETE http://localhost:8080/fireworks/1

replaceFirework : curl -X PUT 'http://localhost:8080/fireworks/2?price=5&accessHandicap=true&duration=Low&crowed=Medium'

addParking : curl -X PUT 'http://localhost:8080/fireworks/addParking/2?name=newParking'

findFireworkByFilter : curl -X GET 'http://localhost:8080/fireworks/filter?note=0&crowed=Low&accessHandicap=true&price=2&duration='




