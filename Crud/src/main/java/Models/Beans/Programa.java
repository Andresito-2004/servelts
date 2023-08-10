package Models.Beans;

public class Programa {
    private Integer Identification_program;
    private String Name_program;
    private String State_program;

    public Programa() {
    }

    public Programa(Integer identification_program, String name_program, String state_program) {
        Identification_program = identification_program;
        Name_program = name_program;
        State_program = state_program;
    }

    public Integer getIdentification_program() {
        return Identification_program;
    }

    public void setIdentification_program(Integer identification_program) {
        Identification_program = identification_program;
    }

    public String getName_program() {
        return Name_program;
    }

    public void setName_program(String name_program) {
        Name_program = name_program;
    }

    public String getState_program() {
        return State_program;
    }

    public void setState_program(String state_program) {
        State_program = state_program;
    }
}
