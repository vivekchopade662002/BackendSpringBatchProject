# Spring Boot Backend Application

A simple Spring Boot application for managing products.

## Flow Diagram
```
[Login Page] -> [Authentication] -> [Product Management]
```

## Application Flow

1. **User Authentication**
   - Login with username and password
   - Default credentials: user/user

2. **Product Operations**
   - View all products
   - Add new product
   - Search product by ID
   - Delete product

## Technical Stack
- Spring Boot
- MySQL Database
- JPA/Hibernate
- Spring Security

## API Endpoints
- `POST /login` - User authentication
- `GET /products` - Get all products
- `POST /products` - Add new product
- `GET /products/{id}` - Get product by ID
- `DELETE /products/{id}` - Delete product
