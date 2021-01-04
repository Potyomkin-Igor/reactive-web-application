# README #

Micro-service architecture contains 3 services. First is abstract layer to discover services (clients).
Other two it's our clients (sender and receiver). 
The sender service request to receiver to start high-loaded task for counting from 1 to 1000. 
When the tack have been done, the receiver service sending an answer to sender. 

### How do I start? ###

* Firstly, start server application (port is 8761). 
* Then start sender and receiver services. Their ports will be randomly selected by spring boot. 
* You can check registered services on http://localhost:8761 .
* Open sender service with http://localhost:8092/count . It will send request to the receiver service
  and will start high-loaded task.  
