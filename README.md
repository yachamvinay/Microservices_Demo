# Microservices_Demo

**The Project is Sample Demo for how Microservices is works**
- In this project we have different services i.e., Payment Service,Order Service and we have a Server as Shopping Cart Server.
- And we have one Project as SpringCloudGateWay this is used for to run all services using this SpringCloudGateWay port i.e., 8989.
- So if we want to access the services of Payment,Order we no need to specify the port numbers of this servers instead for this reason we have created a cloud gateway.
- In order to run the Project we need to first run the ShoppingCartServer and then we need to run Services like Payment service, Order service and then after run the SPringCloudGateWay project.
- After running all the services and server and then go to browser and then type url as below


     http://localhost:8761/
- And in order to test the application we will use Postman and pass some sample url as below 

    http://localhost:8989/payement/paynow
    
    
    
    http://localhost:8989/order/ordernow/1
