# Spring Core Notes

## Constructor Injection - Behind the Scenes

### How Spring Processes your Application?

1. **Spring Container** is the heart of any Spring-based application. The container will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction. The Spring container uses DI to manage the components that make up an application.
2. The `org.springframework.context.ApplicationContext` interface represents the Spring IoC container and is responsible for instantiating, configuring, and assembling the beans. The container gets its instructions on what objects to instantiate, configure, and assemble by reading the configuration metadata provided.
3. The configuration metadata is generally provided in an XML file. Though it can be provided in other formats like annotations or Java code as well.
4. The `org.springframework.beans` and `org.springframework.core` packages are the basis for Spring Framework's IoC container.
5. The `BeanFactory` interface provides an advanced configuration mechanism capable of managing any type of object. `ApplicationContext` is a sub-interface of `BeanFactory`. It adds easier integration with Spring's AOP features, message resource handling (for use in internationalization), event propagation, and application-layer specific contexts such as the `WebApplicationContext` for use in web applications.
6. The `org.springframework.context.support.ClassPathXmlApplicationContext` is a class that loads the context definition from an XML file located in the classpath. The XML file contains the bean definitions and the container instantiates the beans and wires them together.
7. The `org.springframework.context.support.FileSystemXmlApplicationContext` is a class that loads the context definition from an XML file in the filesystem. The XML file contains the bean definitions and the container instantiates the beans and wires them together.
8. The `org.springframework.context.support.GenericXmlApplicationContext` is a class that loads the context definition from an XML file contained within the application JAR file. The XML file contains the bean definitions and the container instantiates the beans and wires them together.

- We have interface for Coach.
- Then CricketCoach implements Coach.
- Then we have DemoController
- The Spring Framework will perform operations behind the scenes for you.
- Construction Injection do the following:
  - Create a new object.
  - Inject the dependencies.
  - Set the properties.
  - Call the constructor.
  - Call the setter methods.
  - Example in this case `Coach theCoach = new CricketCoach();`
  - `DemoController demoController = new DemoController(theCoach);`

### Component Scanning - Overview

- **Component Scanning** is a feature of Spring Framework that automatically detects the classes that are annotated with `@Component`, `@Controller`, `@Service`, or `@Repository` annotations.
- Spring Framework automatically registers the beans in the Spring IoC container.
- The `@Component` annotation is a generic stereotype for any Spring-managed component.
- If your classes is not in the same package as the main application class, you can use the `basePackages` attribute.

### Setter Injection

### Constructor Injection vs Setter Injection, which one to use?

### what does `@Autowired` do?

### Field Injection - Now not recommended

### `@Qualifier` Annotation

### `@Primary` Annotation 
- Only one primary bean per type otherwise it will throw an exception

### which one to use `@Qualifier` or `@Primary`? - Priority

### What does @Lazy Annotation - Lazy Initialization, Advantages and Disadvantages, Use Cases

### Bean Life Cycle - Behind the Scenes

### Bean Scopes - What is a Bean Scope? Use Cases of Different Bean Scopes

### default bean scope - Singleton

### Bean Scopes - Prototype

### Bean Life Cycle methods - @PostConstruct and @PreDestroy

### Prototype Scope and Destroy lifecycle method - Special Note

### Java Config Bean

### @Bean Vs @Component - Which one to use? Use Cases