public class ComprovanteCpf implements ComprovanteMatricula {
     String studentName;
     String cpf;
     String courseName;

    public ComprovanteCpf(String studentName, String cpf, String courseName) {
        this.studentName = studentName;
        this.cpf = cpf;
        this.courseName = courseName;
    }

    @Override
    public String describe() {
        return "Comprovante de matrícula: " + studentName + " | CPF: " + cpf + " | Curso: " + courseName;
    }
}
