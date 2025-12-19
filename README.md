<h1>Entity Mapping in Hibernate</h1>

<p>
This repository demonstrates <b>Hibernate ORM entity mapping concepts</b> using Java and JPA annotations.
It focuses on how Java objects are mapped to relational database tables and how relationships between entities
are defined and managed.
</p>

<p>
The project is designed as a <b>learning and reference resource</b> for understanding the fundamentals of
Object-Relational Mapping (ORM) with Hibernate.
</p>

<h2>Features</h2>
<ul>
  <li>Entity mapping using <code>@Entity</code> and <code>@Table</code></li>
  <li>Primary key configuration with <code>@Id</code> and <code>@GeneratedValue</code></li>
  <li>Column mapping using <code>@Column</code></li>
  <li>Entity relationships:
    <ul>
      <li>One-to-One</li>
      <li>One-to-Many</li>
      <li>Many-to-One</li>
      <li>Many-to-Many</li>
    </ul>
  </li>
  <li>Cascade types and fetch strategies</li>
  <li>Annotation-based Hibernate configuration</li>
</ul>

<h2>Technologies Used</h2>
<ul>
  <li>Java</li>
  <li>Hibernate (JPA)</li>
  <li>Maven</li>
  <li>Relational Database (MySQL)</li>
</ul>

<h2>Project Structure</h2>
<ul>
  <li><b>entity</b> – Hibernate entity classes</li>
  <li><b>config</b> – Hibernate configuration</li>
  <li><b>main / test</b> – Code to test mappings and relationships</li>
</ul>

<p>
The structure is kept simple to focus purely on entity mapping concepts.
</p>

<h2>Configuration &amp; Security</h2>
<p>
Sensitive configuration files such as database credentials are <b>not included</b> in this repository.
</p>
<ul>
  <li>Environment-specific configuration files are excluded using <code>.gitignore</code></li>
  <li>Local configuration must be added separately for execution</li>
</ul>

<h2>Who This Repository Is For</h2>
<ul>
  <li>Java developers learning Hibernate ORM</li>
  <li>Beginners understanding entity relationships</li>
  <li>Students preparing for Java / Hibernate interviews</li>
  <li>Developers needing a clean ORM reference project</li>
</ul>

<h2>Usage</h2>
<ol>
  <li>Clone the repository</li>
  <li>Configure your local database</li>
  <li>Add your local configuration file</li>
  <li>Run the project to observe entity mappings</li>
</ol>

<h2>Learning Outcome</h2>
<p>
By exploring this repository, you will gain a clear understanding of:
</p>
<ul>
  <li>How Hibernate maps Java classes to database tables</li>
  <li>How entity relationships work in ORM</li>
  <li>Best practices for writing clean entity mappings</li>
</ul>

<h2>Disclaimer</h2>
<p>
This project is intended for <b>educational purposes</b> and does not represent a production-ready application.
</p>
