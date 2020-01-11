package university;

import university.exceptions.NullGroupException;

public class Faculty {
    private String facultyName;
    private String deanName;
    private Group[] groupNames;

    public Faculty(String facultyName, Group[] groupNames) throws NullGroupException {
        setFacultyName(facultyName);
        setGroupNames(groupNames);
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    public Group[] getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(Group[] groupNames) throws NullGroupException {
        if(groupNames.length == 0) {
            throw new NullGroupException();
        }
        this.groupNames = groupNames;
    }
}
