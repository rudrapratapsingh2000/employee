# Employee-Address 
Created a simple application using Spring Initializer With required depencdencies that manages Employees and Addresses i.e., An User can perform some operation such as add, update, get ALL, and delete etc.

## Frame Work And Language
* Spring Boot 
* Java-17

# Data Flow 
 ## Model
   * ### Employee
        * #### Id
        * #### firstName
        * #### lastName
        * #### @OneToOne -> Address
   * ### Address
        * #### Id
        * #### street
        * #### city
        * #### state
        * #### zipcode 
## Controller
  * ### Employee Controller
    * #### get all employees
    * #### get an employee by id
    * #### create a new employee
    * #### update an employee by id
    * #### delete an employee by id
  * ### Address Controller
    * #### get all address
    * #### get an address by id
    * #### create a new address
    * #### update an address by id
    * #### delete an address by id        
                
## Service
  * ### Employee Service
    * #### get all employees
    * #### get an employee by id
    * #### create a new employee
    * #### update an employee by id
    * #### delete an employee by id
  * ### Address Service
    * #### get all address
    * #### get an address by id
    * #### create a new address
    * #### update an address by id
    * #### delete an address by id
  
## Data Structure
* String
* int
* long 

## Authors

- [@Rudra Pratap Singh](https://github.com/rudrapratapsingh2000)

