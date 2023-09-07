# engine-value-resolver

POC

- Create a folder called engine-lib in the Standalone.
- Build this project and add the .jar to the created folder.
- Download Rhino 1.7.14 (https://repo1.maven.org/maven2/org/mozilla/rhino/1.7.14/rhino-1.7.14.jar) and also add the .jar to the created folder too.
- In mule-scheduler-service, make a checkout to branch (https://github.com/mulesoft/mule-scheduler-service/tree/W-12421141).
- Build the service and replace it in the Standalone.
- Run the Mule.
- Verify with Yourkit that no references to the EngingeClassLoader instance are kept and that the GC collects it.
