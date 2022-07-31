# counter-maven-plugin
Custoom Maven Plugin


Usage 

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
