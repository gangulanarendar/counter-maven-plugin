package org.naren.counter.maven.plugin;

import java.util.List;

import org.apache.maven.model.Dependency;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

/**
 * Goal which touches a timestamp file.
 *
 * @goal touch
 * 
 * @phase process-sources
 */
@Mojo(name = "dependency-counter", defaultPhase = LifecyclePhase.INITIALIZE)
public class MyMojo
    extends AbstractMojo
{
    /**
     * Location of the file.
     * @parameter expression="${project.build.directory}"
     * @required
     */
//CHECK THIS https://www.baeldung.com/maven-plugin
	//https://developer.okta.com/blog/2019/09/23/tutorial-build-a-maven-plugin
	@Parameter(property = "project",defaultValue = "${project}", required = true, readonly = true)
	private MavenProject project;
	
	@Parameter(property = "scope")
	String scope;
	
    public void execute()
        throws MojoExecutionException
    {
    	 List<Dependency> dependencies = project.getDependencies();
    	    long numDependencies = dependencies.size();
    	    
			/*
			 * numDependencies = dependencies.stream() .filter(d -> (scope == null ||
			 * scope.isEmpty()) || scope.equals(d.getScope())) .count();
			 */
    	    
    	    for(Dependency d :dependencies)
    	    	 getLog().info("dependency : " + d.getScope());
    	    getLog().info("Project Name getArtifactId: " + project.getArtifactId());
    	    getLog().info("scope: " + scope);
    	            
    	    getLog().info("Number of dependencies: " + numDependencies);
    	
    }
}
