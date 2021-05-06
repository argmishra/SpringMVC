# SpringMVC - This repo consists of code for the essentials functionality of Spring MVC.

## Spring MVC
It is a java framework that is used to develop a web application based on the Model-View-Controller design pattern. Below are the major components of the MVC framework:

1. **Model** - This component is responsible for data handling through the database, files etc generally with help of POJOs.
2. **View** - This renders the data from the model and shows it in the browser.
3. **Controller** - It is responsible to process requests and maintain communication between the model and view components.
4. **Front Controller** - THe DispatcherServlet is often called the front controller as it is responsible for data flow in the Spring MVC framework.

The working of MVC is as follows:
a. HTTP request is handled by DispatcherServlet.
b. DispatcherServlet passes it to handler mapping which defines which controller to call. And again request object is passed to DispatcherServlet.
c. Now DispatcherServlet passes to the respective controller which renders the data and passes view name to DispatcherServlet.
d. Based on view name, DispatcherServlet passes request object to view resolver to find correct view to send to DispatcherServlet.
e. DispatcherServlet takes a view and passes it to the response object which indeed shows data on the browser to the end-user.

## Advantages Spring MVC
1. In this framework, every component has predefined roles and responsibilities.
2. Automatic validation available for applications.
3. This is a secure framework and support fast or parallel development.
4. Usage of Java Beans makes it easy to test.
5. It provides reusable business code by allowing the use of existing objects rather than creating new ones.
6. It can be deployed on a lightweight servlet container.
7. It supports flexible mapping by having specific annotations
8. It provides a robust and powerful configuration to framework and referencing across contexts.
9. It is a view agnostic framework.

## Code Samples

1. Redirect to next page by click on a link.
2. Redirect to next pages by click on a link.
3. Login success and failure scenario.
4. User registration with validation.
5. File upload.
