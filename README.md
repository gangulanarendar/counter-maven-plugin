# counter-maven-plugin
Custoom Maven Plugin
# counter-maven-plugin
Custoom Maven Plugin


Usage - FIRST DO maven clean install on this project then this will get loaded in to local repository , then target project can use that as dependency as this
resides in the local repo

counter-maven-plugin


	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
			<plugin>
				<groupId>org.naren</groupId>
				<artifactId>counter-maven-plugin</artifactId>
				<version>0.0.1-SNAPSHOT</version>
				<configuration>
					<!-- optional, the command parameter can be changed here too -->
					<scope>test</scope>
				</configuration>
				<executions>
					<execution>
					<phase>
					install
					</phase>
						<goals>
							<goal>dependency-counter</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
	
	
	Output in used project mvn clean install

[INFO] --- counter-maven-plugin:0.0.1-SNAPSHOT:dependency-counter (default) @ naren-receipe-app ---
[INFO] dependency : compile
[INFO] dependency : compile
[INFO] dependency : compile
[INFO] dependency : compile
[INFO] dependency : runtime
[INFO] dependency : runtime
[INFO] dependency : test
[INFO] Project Name getArtifactId: naren-receipe-app
[INFO] scope: test
[INFO] Number of dependencies: 7
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS



