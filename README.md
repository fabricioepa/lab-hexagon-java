# lab-hexagon-java

This is a starter project based on:

* Java 
* Spring Framework
* Maven multi-module structure

Inspired by the patterns:

* Hexagonal Architecture
* CQRS
* Domain event

The Hexagonal pattern is described by Alistair Cockburn in his blog:

*“Allow an application to equally be driven by users, programs, automated test or batch scripts, and to be developed and tested in isolation from its eventual run-time devices and databases"* 

You can find o better information about the design of this solution in the presentation [Hexagonal Architecture ](http://fabricioepa.wordpress.com/2015/02/04/hexagonal-architecture)

# The project structure

### 1. ticketapp (/pom.xml)
 Main parent maven project aggregates all project modules

### 2. ticketapp-core-api (/core/api/pom.xml)
 This module plays the role **PORT** for the hexagon architecture. 
 
 Service port definition -> All service interfaces and API objects to acccess the **CORE** application. 

### 3. ticketapp-core-application (/core/application/pom.xml)
 This modules plays the **CORE** role in the hexagonal pattern:
 Implementation of the application services, event handlers, domain model entities and repositories.

### 4. ticketapp-adapter-rest  (/integration/rest-adapter/pom.xml)
 The RESTful API **ADAPTER** for the application service **PORT** (core-api)

# My professional experience using this technique
 It was very simple to create a decoupled REST adapter from the core application, it also should
 be simple to create another kind of adapter too.
 However, if the application domain is quite BIG or there are many ports and adapters, you will have some overhead to maintain different domains translated from the original application core domain.
  
 This is one of the reasons the pattern as often been applied to microservices architecture, because 
 it works nice for system integrations and also for small/medium sized application domains.


Feel free to bring up your ideas  ;)
