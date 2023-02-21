# jenkins-build-on-docker-host

Runs a jenkins in docker (using docker-compose) that is able to run builds in docker containers. 

This is done by accessing the host's docker socket. **This can be a security issue!**

For a production use you should you dind (docker-in-docker)! 
