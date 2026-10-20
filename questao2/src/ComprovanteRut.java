public class ComprovanteRut implements ComprovanteMatricula {
     String studentName;
     String rut;
     String courseName;

    public ComprovanteRut(String studentName, String rut, String courseName) {
        this.studentName = studentName;
        this.rut = rut;
        this.courseName = courseName;
    }

    @Override
    public String describe() {
        return "Comprovante= " + studentName + " ,RUT: " + rut + ",Curso: " + courseName;
    }
}
