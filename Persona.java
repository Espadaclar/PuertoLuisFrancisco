
/**
 *franciscoJavier
 */
class Persona {
    private String name;
    private String id;

    public Persona(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String datos = "";
        datos += name +"\n";
        datos += id +"\n";
       return datos;
    }
    
}