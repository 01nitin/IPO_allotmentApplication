import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FamilyMember {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FamilyMember(Long id, Long userId, String name, String pan, String dematId) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.pan = pan;
        this.dematId = dematId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getDematId() {
        return dematId;
    }

    public void setDematId(String dematId) {
        this.dematId = dematId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String name;
    private String pan;
    private String dematId;

    // Getters and Setters
}