import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrar() {
        return registrar;
    }

    public IPO(Long id, String name, String registrar) {
        this.id = id;
        this.name = name;
        this.registrar = registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    private String name;
    private String registrar;

    // Getters and Setters
}