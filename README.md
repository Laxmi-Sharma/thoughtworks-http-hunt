# thoughtworks-http-hunt-game
* This application is built by using Spring Boot framework.
* To run the project we need to do following steps : 
 - clone the repo
 - do "mvn clean install" to create a jar file 
 - run the jar by using command - java -jar <file-name>
 - Call the POST API by using link - Base Url + /challenge/output
- For example if you are running the jar on local and calling the POST API by using Postman, - select the POST method and  just call "localhost:8080/challenge/output" and provide the required input in follwoing format -
  {"input": {
            "text": "Hello World !!"
        }
        }
  It will give you the output in following format - {
    "output": {
        "count": 14
    }
}

* To get a sample input I have used a get call - https://http-hunt.thoughtworks-labs.net/challenge/input by providing my userId in header.
