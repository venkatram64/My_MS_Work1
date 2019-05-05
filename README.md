This project has  multiple module, those are micro services


storing all the config information in git repository.
this repository is linked with the spring config cloud server

step 1: create git-local-repo
git init
step 2: create limits-service.properties
add properties of limits-service

git add -A
git -m "init commit" commit

step 3: start the myspring-config-cloud-server
step 4: http://localhost:8888/limits-service/default
step 5: start the limits-service
step 6: http://localhost:8080/limits

after changing in git repo properties(commit), run the following command in postman -> post request
http://localhost:8080/application/refresh
http://localhost:8080/bus/refresh

step 7: add two more properties qa and dev in git-local-repo
step 8: start the myspring-config-cloud-server

step 9: http://localhost:8888/limits-service/dev

step 10: http://localhost:8888/limits-service/qa






to open the h2-console:
http://localhost:8001/h2-console
use: jdbc:h2:mem:testdb



http://localhost:8001/currency-exchange/from/AUD/to/INR

http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/109

Run the following, we are running with respect to the zuul

http://localhost:8765/currency-exchange-service/currency-exchange/from/AUD/to/INR

http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/109

http://localhost:8765/currency-conversion-service/currency-converter-feign/from/EUR/to/INR/quantity/109

After integrating with api gateway, we can run the following url directly
http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/109
http://localhost:8765/currency-exchange-service/currency-exchange/from/AUD/to/INR
http://localhost:8765/currency-conversion-service/currency-converter-feign/from/EUR/to/INR/quantity/109


step1: After installing rabbitmq, run the following command

rabbitmq-plugins enable rabbitmq_management

http://localhost:15672/