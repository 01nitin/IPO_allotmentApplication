import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IPOService {
    @Autowired
    private RegistrarApiClient registrarApiClient;

    @Autowired
    private FamilyMemberRepository familyMemberRepository;

    public List<AllotmentStatus> checkAllotmentStatus(Long userId, Long ipoId) {
        List<FamilyMember> members = familyMemberRepository.findByUserId(userId);
        List<AllotmentStatus> statuses = new ArrayList<>();

        for (FamilyMember member : members) {
            AllotmentStatus status = registrarApiClient.fetchStatus(ipoId, member);
            statuses.add(status);
        }
        return statuses;
    }
}
