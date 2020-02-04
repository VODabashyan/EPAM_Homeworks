package university;

import university.exceptions.NullFacultyException;


public class University {
    private String name;
    private String address;
    private String website;
    private String phoneNumber;
    private Faculty[] faculties;

    public University(String name, String address, String website, String phoneNumber, Faculty[] faculties) throws NullFacultyException {
        setName(name);
        setFaculties(faculties);
        setAddress(address);
        setWebsite(website);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public void setFaculties(Faculty[] faculties) throws NullFacultyException {
        if (faculties.length == 0) {
            throw new NullFacultyException("There should be at least one faculty!");
        }

        if (faculties == null) {
            throw new NullFacultyException("A faculty cannot be null!");
        }

        if (faculties != null && faculties.length != 0) {
            for (Faculty faculty : faculties) {
                if (faculty == null) {
                    throw new NullFacultyException("Null faculty detected! A faculty cannot be null!");
                }
            }
        }
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
