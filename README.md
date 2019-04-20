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

step 7: add two more properties qa and dev in git-local-repo
step 8: start the myspring-config-cloud-server

step 9: http://localhost:8888/limits-service/dev

step 10: http://localhost:8888/limits-service/qa






to open the h2-console:
http://localhost:8001/h2-console
use: jdbc:h2:mem:testdb
