import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Course {

    private String name;
    private String courseID;
    private String profInCharge;
    private SortedMap<Integer, Student> studentsList;
    private ArrayList<Component> components;
    private Map<String, Tutorial> tutGroups;
    private Map<String, Lab> labGroups;
    private int vacancy;

    public Course(String name, String courseID, String profInCharge, int vacancy) {
        this.name = name;
        this.courseID = courseID;
        this.profInCharge = profInCharge;
        this.vacancy = vacancy;
        this.components = new ArrayList<>();
        this.studentsList = new TreeMap<>();
        this.tutGroups= new TreeMap<>();
        this.labGroups = new TreeMap<>();
    }

    public Course(String name, String courseID, String profInCharge, SortedMap<Integer, Student> studentsList, ArrayList<Component> components, Map<String, Tutorial> tutGroups, Map<String, Lab> labGroups, int vacancy) {
        this.name = name;
        this.courseID = courseID;
        this.profInCharge = profInCharge;
        this.studentsList = studentsList;
        this.components = components;
        this.tutGroups = tutGroups;
        this.labGroups = labGroups;
        this.vacancy = vacancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getProfInCharge() {
        return profInCharge;
    }

    public void setProfInCharge(String profInCharge) {
        this.profInCharge = profInCharge;
    }

    public SortedMap<Integer, Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(SortedMap<Integer, Student> studentsList) {
        this.studentsList = studentsList;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

    public Map<String, Tutorial> getTutGroups() {
        return tutGroups;
    }

    public void setTutGroups(Map<String, Tutorial> tutGroups) {
        this.tutGroups = tutGroups;
    }

    public Map<String, Lab> getLabGroups() {
        return labGroups;
    }

    public void setLabGroups(Map<String, Lab> labGroups) {
        this.labGroups = labGroups;
    }

    public int getVacancy() {
        return vacancy;
    }

    public void setVacancy(int vacancy) {
        this.vacancy = vacancy;
    }
}


