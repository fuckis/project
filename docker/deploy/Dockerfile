FROM 127.0.0.1:5000/docker-jdk-mvn-git:latest
WORKDIR /
COPY deploy.sh deploy.sh
RUN chmod 777 deploy.sh
CMD ["./deploy.sh"]