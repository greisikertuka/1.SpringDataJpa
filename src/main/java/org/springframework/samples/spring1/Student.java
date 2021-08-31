package org.springframework.samples.spring1;

import javax.persistence.*;

@Entity(name = "Student")
@Table(
	name="student",
	uniqueConstraints = {
		@UniqueConstraint(name="student_email_unique",columnNames = "email")
	}
)
public class Student {
	@Id
	@SequenceGenerator(
		name="student-sequence",
		sequenceName = "student_sequence",
		allocationSize = 1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "student_sequence"
	)

	@Column(
		name = "id",
		updatable = false
	)
	private Long id;

	@Column(
		name = "first_name",
		nullable = false,
		columnDefinition = "TEXT"
	)
	private String fistname;

	@Column(
		name = "last_name",
		nullable = false,
		columnDefinition = "TEXT"
	)
	private String lastName;

	@Column(
		name = "email",
		nullable = false,
		columnDefinition = "TEXT"
	)
	private String email;

	@Column(
		name = "age",
		nullable = false
	)
	private int age;

	public Student(String fistname, String lastName, String email, int age) {
		this.fistname = fistname;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public Student() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
			"id=" + id +
			", fistname='" + fistname + '\'' +
			", lastName='" + lastName + '\'' +
			", email='" + email + '\'' +
			", age=" + age +
			'}';
	}
}
