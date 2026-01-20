# 🚀 Getting Started

Follow these steps to run the project locally.

---

# 🔽 1. Clone the Repository

```bash
git clone https://github.com/meSanika07/springboot-security-jwt.git
cd springboot-security-jwt
```

---

# 🛠 2. Configure Database

## Create PostgreSQL Database

```sql
CREATE DATABASE dbName;
```

Ensure PostgreSQL is running on port **5432**.

---

## Configure Application Properties

Navigate to:

```
src/main/resources/
```

Copy the example file:

```bash
cp application.properties.example application.properties
```

Update `application.properties` with your values:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/dbName
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

⚠️ **Never commit `application.properties` to GitHub**

---

# ▶️ 3. Run the Application

## Using Maven

```bash
mvn spring-boot:run
```

## OR Using IDE

- Open the project in **IntelliJ / Eclipse**
- Run `SpringSecExApplication.java`

---

# 🌐 Application URL

```
http://localhost:8080
```
