
# Montoya-API

Montoya-API is a Burp Suite extension that connects the Burp Model Context Protocol (MCP) server to an AI model. This enables Burp Suite to leverage AI-powered analysis, automation, or custom workflows by integrating with external AI services.


## Features
- Acts as a bridge between Burp Suite's MCP server and an external AI model
- Enables AI-driven security analysis and automation within Burp Suite
- Built as a Java extension using the Montoya API

## Project Structure

```
Montoya-API/
├── LICENSE
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Montoya.java
│   │   │   └── org/example/Main.java
│   │   └── resources/
│   └── test/
│       └── java/
├── target/
│   ├── classes/
│   │   ├── Montoya.class
│   │   └── org/example/Main.class
│   └── generated-sources/
│       └── annotations/
```


## Getting Started

### Prerequisites
- Java 8 or higher
- Maven 3.6+
- Burp Suite (Community or Professional)

### Build the Extension
Run the following command in the project root directory:

```sh
mvn clean package
```

This will generate a JAR file in the `target/` directory.

### Install in Burp Suite
1. Open Burp Suite
2. Go to the Extender tab
3. Click "Add" and select the generated JAR file
4. Configure the extension to connect to your MCP server and AI model as needed


## Project Files
- `pom.xml`: Maven configuration file
- `src/main/java`: Extension source code
- `src/test/java`: Test source code
- `src/main/resources`: Resource files


## License
This project is licensed under the terms of the LICENSE file in the root directory.


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.


## Contact
For questions or support, please contact jagadishtripathyforyou@gmail.com
