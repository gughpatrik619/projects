package com.jdbc.entity;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    public Course()
    {
        //
    }

    public Course(String title)
    {
        this.title = title;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public Instructor getInstructor()
    {
        return instructor;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setInstructor(Instructor instructor)
    {
        this.instructor = instructor;
    }

    @Override
    public String toString()
    {
        return "Course {" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
