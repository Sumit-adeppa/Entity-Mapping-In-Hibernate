<h1>Entity Mapping in Hibernate</h1>

<p>
This repository demonstrates <b>Hibernate ORM entity mapping</b> using Java and XML-based Hibernate configuration.
It focuses on mapping Java classes to relational database tables and implementing different types of
entity relationships using Hibernate with a MySQL database.
</p>

<p>
This project is intended as a <b>learning and reference resource</b> for understanding
Object-Relational Mapping (ORM) fundamentals.
</p>

<hr>

<h2>Hibernate Configuration Overview</h2>

<p>
The project uses an XML-based Hibernate configuration file
(<code>hibernate.cfg.xml</code>) to define database connectivity,
Hibernate behavior, and entity mappings.
</p>

<h3>Database Configuration</h3>
<ul>
    <li>Database: MySQL</li>
    <li>JDBC Driver: <code>com.mysql.cj.jdbc.Driver</code></li>
    <li>Hibernate Dialect: <code>org.hibernate.dialect.MySQL8Dialect</code></li>
    <li>Database is created automatically if it does not exist</li>
    <li>Tables are automatically updated by Hibernate</li>
</ul>

<p>
Hibernate is configured to:
</p>
<ul>
    <li>Auto-create or update tables using <code>hibernate.hbm2ddl.auto=update</code></li>
    <li>Display formatted SQL queries in the console</li>
</ul>

<hr>

<h2>Entity Relationships Implemented</h2>

<h3>One-to-One</h3>
<ul>
    <li>Student</li>
    <li>Address</li>
</ul>

<h3>One-to-Many</h3>
<ul>
    <li>Kodneststudent</li>
    <li>Course</li>
</ul>

<h3>Many-to-One</h3>
<ul>
    <li>Village</li>
    <li>House</li>
</ul>

<h3>Many-to-Many</h3>
<ul>
    <li>KodStudent</li>
    <li>Club</li>
</ul>

<hr>

<h2>Technologies Used</h2>
<ul>
    <li>Java</li>
    <li>Hibernate ORM</li>
    <li>MySQL</li>
    <li>Maven</li>
    <li>JDBC</li>
</ul>

<hr>

<h2>Important Note for Users</h2>

<p>
This repository <b>does not include</b> the <code>hibernate.cfg.xml</code> file
for security reasons.
</p>

<p>
Anyone cloning this repository must create their own
<code>hibernate.cfg.xml</code> file locally by referring to
<code>Configurationfile.txt</code>.
</p>

<h3>Required File Location</h3>

<p>
The <code>hibernate.cfg.xml</code> file <b>must</b> be placed at the following path:
</p>

<pre>
src/main/java/hibernate.cfg.xml
</pre>

<p>
Before running the project, update the database name, username,
and password according to your local MySQL configuration.
</p>

<hr>

<h2>How to Run the Project</h2>
<ol>
    <li>Clone the repository</li>
    <li>Install and start MySQL</li>
    <li>Create <code>hibernate.cfg.xml</code> using <code>Configurationfile.txt</code> as reference</li>
    <li>Place the file at <code>src/main/java/hibernate.cfg.xml</code></li>
    <li>Update database credentials</li>
    <li>Run the application to observe table creation and entity mappings</li>
</ol>

<hr>

<h2>Learning Outcome</h2>
<ul>
    <li>Understand Hibernate XML configuration structure</li>
    <li>Integrate MySQL with Hibernate</li>
    <li>Implement One-to-One, One-to-Many, Many-to-One, and Many-to-Many mappings</li>
    <li>Understand automatic schema creation and updates</li>
</ul>

<hr>

<h2>Disclaimer</h2>
<p>
This project is intended for <b>educational purposes only</b>
and is not a production-ready application.
</p>
