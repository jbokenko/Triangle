This project was built using: <br>
<li>Eclipse Neon version 4.6
<li>Java 1.8 version 1.8.0_20
<li>Apache Tomcat version 8.0.24

<H2>To install the program</H2>
<li>Download the zip file and unzip it into a directory of your choosing (to be known as the <B>Installation Directory</B>).

<H2>How to Run the Program</H2>
Once you download the project, there are 4 ways to run program (assuming you have Java properly installed):
<ol>
<li><h3>Command Line - With a runnable JAR file</h3>
<br>A. cd (change directory) to &lt;Installation Directory&gt;/Triangle-master/Triangle/build.
<br>B. execute the jar file: "java -jar Triangle.jar &lt;side1&gt; &lt;side2&gt; &lt;side3&gt;".  
<br>For example: if the 3 sides of the triangle are 4 5 6, then type the following
<br>&nbsp;&nbsp;&nbsp;&nbsp;<b>java -jar Triangle.jar 4 5 6</B>

<li><h3>Command Line - Executing the main class </h3>
<br>A. cd (change directory) to &lt;Installation Directory&gt;/Triangle-master/Triangle/build/classes.
<br>B. execute the main class: "java com.triangle.TriangleClassification &lt;side1&gt; &lt;side2&gt; &lt;side3&gt;".
<br>For example, if the 3 sides of the triangle are 3.5, 4.5, 5.5, then type the following:
<br>&nbsp;&nbsp;&nbsp;&nbsp;<b>java com.triangle.TriangleClassification 3.5 4.5 5.5</b>
		
<li><h3>Browser</h3>
<br>A. I put a war file in &lt;directory where you installed project&gt;/Triangle-master/Triangle/build/Triangle.war
<br>B. Install the war on your favorite server
<br>C. Once the server is up and running, you should be able to access the war by the following URL:
<br>&nbsp;&nbsp;&nbsp;&nbsp;<b> http://host:port/Triangle/index.jsp </b>

<li><h3>Eclipse</h3> 
</ol>
<br>A. Import existing project into workspace. In Eclipse, go to file-import-General-Existing Projects into Workspace, browse to &lt;Installation Directory&gt;/Triangle-master/Triangle/, Finish.
<br>B. Or Import the war file: In Eclipse, go to file-import-web-WAR file, browse to &lt;Installation Directory&gt;/Triangle-master/Triangle/build/Triangle.war, Finish.
<br><h4>Eclipse Notes:</h4>
<br>I am assuming you have some knowledge of Eclipse and how to move around.
<br>You will need to have a server installed (like Apache Tomcat).  Go to server tab and create new server.
<br>Project Facets: Right click on Triangle project and to go properties-Project Facets. Make sure the following are clicked:
<li>Dynamic Web Module (3.0)
<li>Java (1.8)
<li>Runtimes-"your server" (in my case it was Apache Tomcat).
<br>Make sure the Triangle project is configured on your server.  Right click on your server in the server tab. Add and remove: Add Triangle to the Configured side.
<br>Build: Project-clean-clean all projects.
<br>Start the server
<br>URL should be: &nbsp;&nbsp;&nbsp;&nbsp;<b> http://host:port/Triangle/index.jsp </b>


		
