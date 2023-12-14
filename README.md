To run the EventimTicketBooking - add email.bpmn model, we implemented the service task setting in folder BPA_eventim/java/..

In folder BPA_eventim/java/src/main/java/io/camunda/getstarted/..
- ticket-sender -> deploy and generated an instance of the model
- EmailWorker.java -> define the details of the Jobworker
- ZeebeClientFactory.java -> setting of the Client credentials (name: ticket-sender)

Here are the steps to run the model:
1. run  **DeployAndStartInstance.java**
2. run **EmailWorker.java**
3. open the Camunda Web Modeler, run the model **EventimTicketBooking - add email.bpmn**; open the Tasklist to fullfill the user tasks.

------------------------
There is also a video recording of the whole process, please check **BPA_eventim_ticket_booking.mp4**
