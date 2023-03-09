# spring-rest-demo
Minimalist Spring Rest Demo with Cors enabled, Internal Database and multiple URI terminators for easier connection.

Two entities defined to test parent/child relationships, the repository already has test data.

# To install
Clone the repository and run the gradle project,  enabled endpoints are:

Hello and Ping
/

GET
/rest/user_account
/rest/user_account/
/rest/user_account/{id}
/rest/user_account/{id}/
POST
/rest/user_account
/rest/user_account/
PUT
/rest/user_account/{id}
/rest/user_account/{id}/
DELETE
/rest/user_account/{id}
/rest/user_account/{id}/

GET
/rest/user_message
/rest/user_message/
/rest/user_message/{id}
/rest/user_message/{id}/
POST
/rest/user_message
/rest/user_message/
PUT
/rest/user_message/{id}
/rest/user_message/{id}/
DELETE
/rest/user_message/{id}
/rest/user_message/{id}/
