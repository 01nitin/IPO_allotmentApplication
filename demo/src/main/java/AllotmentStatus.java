import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AllotmentStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long familyMemberId;
    private Long ipoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFamilyMemberId() {
        return familyMemberId;
    }

    public void setFamilyMemberId(Long familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public Long getIpoId() {
        return ipoId;
    }

    public void setIpoId(Long ipoId) {
        this.ipoId = ipoId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSharesAllotted() {
        return sharesAllotted;
    }

    public void setSharesAllotted(Integer sharesAllotted) {
        this.sharesAllotted = sharesAllotted;
    }

    private String status;
    private Integer sharesAllotted;

    // Getters and Setters
}