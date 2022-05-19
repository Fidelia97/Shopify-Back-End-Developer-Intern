# Shopify-Back-End-Developer-Intern
The inventory program created was for a fictional company by the name Logistics Co. All the classes, three classes, are coded in Java and they make up the backend of the program. The class, Inventory Class 1, introduces the attributes that will be used in the program.  An ArrayList is used to store the company's inventory and getters and setters are also used to encapsulate the attributes. 

The second class, Inventory Class 2, has all the main code of the program. The main functions included are: adding, updating, deleting, viewing and exiting the program.
In the first function, add inventory, the program asks the user to enter: the name of the warehouse(string), a unique identifier(int) for each warehouse and number of inventory(int). A boolean, boolean successful, is added to in order to inform the users whether the function they are trying to fulfil has been completed or not. If it wasn't then the try/catch blocks will catch the error, making it simpler to debug the program also. 

The method, delete_inventory, shows a menu of all the warehouses and their inventory before asking a user what option they would like to delete, by picking the number of the warehouse on the list. The boolean instance is lso used to confirm the success or failure of executing the "delete_inventory" command. 

In order to modify the list that has already been created, an option must be picked. The list will be displayed as in the latter case and the user shall be requested to enter the warehouse whose details need modification, the record shall be deleted and the new update stored. 

The fourth method, view_inventory, has a for each loop to print out the list of warehouses that have been created or updated. 

In the third class, which is the driver class, there is a while loop to ensure the menu is iterated through until an exit button is initiated(switch case #5). The user shall pick one of the options and in turn, the respective switch case is invoked and the appropriate method called. 

