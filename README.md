<h1>Entity Mapping in Hibernate</h1>

<p>
This repository demonstrates <b>Hibernate ORM entity mapping</b> using Java and XML-based Hibernate configuration.
It focuses on how different types of entity relationships are mapped and managed using Hibernate with a MySQL database.
</p>

<p>
The project is intended as a <b>learning and reference resource</b> for understanding Hibernate configuration
and entity relationships.
</p>

<h2>Hibernate Configuration Overview</h2>

<p>
The project uses an XML-based Hibernate configuration (<code>hibernate.cfg.xml</code>) to define database
connectivity, Hibernate behavior, and entity mappings.
</p>

<h3>Database Configuration</h3>
<ul>
  <li>Database: MySQL</li>
  <li>JDBC Driver: <code>com.mysql.cj.jdbc.Driver</code></li>
  <li>Hibernate Dialect: <code>MySQL8Dialect</code></li>
  <li>Database is created automatically if it does not exist</li>
  <li>Table schema is updated automatically using Hibernate</li>
</ul>

<p>
Hibernate is configured to:
</p>
<ul>
  <li>Auto-create or update tables using <code>hibernate.hbm2ddl.auto=update</code></li>
  <li>Display formatted SQL queries in the console</li>
</ul>

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

<h2>Technologies Used</h2>
<ul>
  <li>Java</li>
  <li>Hibernate ORM</li>
  <li>MySQL</li>
  <li>Maven</li>
  <li>JDBC</li>
</ul>

<h2>Project Purpose</h2>
<ul>
  <li>Understand Hibernate XML configuration</li>
  <li>Learn entity relationship mappings</li>
  <li>Practice ORM concepts with a relational database</li>
  <li>Use as a reference for common Hibernate mappings</li>
</ul>

<h2>Configuration &amp; Security</h2>
<p>
Sensitive information such as database credentials is <b>not committed</b> to the repository.
</p>
<ul>
  <li>Database username and password must be configured locally</li>
  <li>Environment-specific configuration files are excluded using <code>.gitignore</code></li>
</ul>

<h2>How to Run the Project</h2>
<ol>
  <li>Clone the repository</li>
  <li>Install and start MySQL</li>
  <li>Update database credentials in your local configuration file</li>
  <li>Run the application to observe table creation and mappings</li>
</ol>

<h2>Learning Outcome</h2>
<ul>
  <li>Understand Hibernate XML configuration structure</li>
  <li>Integrate MySQL with Hibernate</li>
  <li>Implement different entity relationships</li>
  <li>Observe automatic table creation and updates</li>
</ul>

<h2>Disclaimer</h2>
<p>
This project is intended for <b>educational purposes</b> and is not a production-ready application.
</p>
