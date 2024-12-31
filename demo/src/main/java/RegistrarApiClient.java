import org.springframework.stereotype.Service;

@Service
public class RegistrarApiClient {
    public AllotmentStatus fetchStatus(Long ipoId, FamilyMember member) {
        // Simulate API call or web scraping
        AllotmentStatus status = new AllotmentStatus();
        status.setFamilyMemberId(member.getId());
        status.setIpoId(ipoId);
        status.setStatus("Not Allotted");
        status.setSharesAllotted(0);
        return status;
    }
}