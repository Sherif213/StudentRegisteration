package reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import model.CourseInfo;
import model.CourseInstance;
import model.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Class for reading information about students from files
 */
public class StudentDataReader {

    private ObjectMapper objectMapper = new ObjectMapper();
    {
        objectMapper.registerModule(new JavaTimeModule());
    }

    /**
     * @return list of bachelor students
     */
    public Student[] readBachelorStudentData() throws IOException {
        return objectMapper.readValue(new File("src/resources/bachelorStudents.json"), Student[].class);
    }
    public CourseInfo[] readCourseInfoData() throws IOException {
        return objectMapper.readValue(new File("src/resources/courseInfos.json"), CourseInfo[].class);
    }
    public CourseInstance[] readCourseInstanceData() throws IOException {
        return objectMapper.readValue(new File("src/resources/courseInstances.json"), CourseInstance[].class);
    }

    public Student[] readRegisteredStudent() throws IOException {
        return objectMapper.readValue(new File("src/resources/registeredStudents.json"), Student[].class);
    }
    public void writeRegisteredStudent(String name) throws IOException {
        objectMapper.writeValue(new File("src/resources/registeredStudents.json"), name);
    }
    public void addNewData(List<Student> newData) throws IOException {
        // Read existing data
        Student[] existingData = readRegisteredStudent();

        // Create a new array combining existing data and new data
        Student[] updatedDataArray = Arrays.copyOf(existingData, existingData.length + newData.size());
        System.arraycopy(newData.toArray(), 0, updatedDataArray, existingData.length, newData.size());

        // Write the updated data back to the file
        objectMapper.writeValue(new File("src/resources/registeredStudents.json"), updatedDataArray);
    }
    /**
     * @return list of master students
     */
    public Student[] readMasterStudentData() throws IOException {
        return objectMapper.readValue(new File("src/resources/masterStudents.json"), Student[].class);
    }

}
