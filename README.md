# Introduction to Task 5
A simple SQL query as an extra challenge.

This task is the property of ERGO and can not be used, copied and shared outside.
## Description of task

Please find below two tables containing Contracts and Customers data respectively: <br><br>

<b>Table name: </b>Contracts<br>
<table border="1">
  <tr>
    <td ><b>Id (BIGINT)</b></td>
    <td><b>Category (VARCHAR 20)</b></td>
    <td><b>ObjectInsured (VARCHAR 100)</b></td>
    <td><b>CustomerId (BIGINT)</b></td>
  </tr>
  <tr>
    <td>1</td>
    <td>Car</td>
    <td>WA 12345</td>
    <td>1</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Home</td>
    <td>Street XYZ 123/45, Warsaw</td>
    <td>1</td>
  </tr>
  <tr>
    <td>3</td>
    <td>Car</td>
    <td>KR 67890</td>
    <td>2</td>
  </tr>
  <tr>
    <td>4</td>
    <td>Life</td>
    <td>Anna Nowak</td>
    <td>2</td>
  </tr>
  <tr>
    <td>5</td>
    <td>Life</td>
    <td>John Doe</td>
    <td>3</td>
  </tr>
</table><br>

<b>Table name: </b>Customers<br>
<table border="1">
  <tr>
    <td ><b>CustomerId (BIGINT)</b></td>
    <td><b>Name (VARCHAR 100)</b></td>
    <td><b>Age (INT)</b></td>
  </tr>
  <tr>
    <td>1</td>
    <td>Jan Kowalski</td>
    <td>32</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Anna Nowak</td>
    <td>27</td>
  </tr>
  <tr>
    <td>3</td>
    <td>John Doe</td>
    <td>54</td>
  </tr>
  <tr>
    <td>4</td>
    <td>Jane Doe</td>
    <td>21</td>
  </tr>
</table><br><br>

Please write a SQL query returning all the contracts (Table: Contracts), provided their owners (Table: Customers) are 30 years old or older.

## Goal
Your goal is to write down the solution in the Solution text file attached.

## Branches
Please create your own branch for the task.

### **The reference branch is branch: `exercise5`**
Please commit your changes on your feature branch (pull request is not needed).

# _Please feel free to ask question if you don't understand or something is unclear for you._
# **GOOD LUCK !!!**
