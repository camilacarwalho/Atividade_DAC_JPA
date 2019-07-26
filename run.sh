docker build -t atividade/bd ./postgres
docker run -p 5433:5432 --name bd -d atividade/bd





