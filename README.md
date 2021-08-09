# Student-SpringBoot-AWSLamda
Some Dependencies to add-

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-function-adapter-aws</artifactId>
        </dependency>
        <dependency>
            <groupId>com.amazonaws</groupId>
            <artifactId>aws-lambda-java-events</artifactId>
            <version>3.9.0</version>
        </dependency>
        <dependency>
            <groupId>com.amazonaws</groupId>
            <artifactId>aws-lambda-java-core</artifactId>
            <version>1.2.1</version>
        </dependency>
        
 Plugins that will help you to get your executable JAR file for AWS-console
 
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-deploy-plugin</artifactId>
                <configuration>
                    <skip>true</skip>
                </configuration>
            </plugin>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				 <dependencies>
                    <dependency>
                        <groupId>org.springframework.boot.experimental</groupId>
                        <artifactId>spring-boot-thin-layout</artifactId>
                        <version>1.0.27.RELEASE</version>
                    </dependency>
                </dependencies>
			</plugin>
			 <plugin>
                <groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-shade-plugin</artifactId>
				<configuration>
					<createDependencyReducedPom>false</createDependencyReducedPom>
					<shadedArtifactAttached>true</shadedArtifactAttached>
					<shadedClassifierName>aws</shadedClassifierName>
				</configuration>
				
				
After creating spring boot application, open aws account and search for lamda> Create Function>  Author from Sratch >fill basic info function name, runtime as java 8> create function

Edit runtime settings> Handler(package_name.classHandleName) and upload JAR file
![Capture1](https://user-images.githubusercontent.com/84781683/128701260-fac43f7c-0146-44fb-80a3-7682eef05dbd.PNG)

Go to configuration> Enviornment Variable and add the function name
![Capture2](https://user-images.githubusercontent.com/84781683/128701981-2c5af09c-bcb8-41ae-b5af-0be7c7afc492.PNG)

Now go to test add Name and test it
![Capture3](https://user-images.githubusercontent.com/84781683/128702369-19904f87-c093-4eec-b18a-f230aa737031.PNG)

![Capture4](https://user-images.githubusercontent.com/84781683/128702383-c46b23d2-04f2-46d5-a778-e1de6ca43a81.PNG)

Thats it!

Also to call different functions just go to config> edit enviornment variable and test it.

