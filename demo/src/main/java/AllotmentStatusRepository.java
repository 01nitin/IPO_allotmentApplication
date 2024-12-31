import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AllotmentStatusRepository extends JpaRepository<AllotmentStatus, Long> {
    List<AllotmentStatus> findByFamilyMemberIdAndIpoId(Long familyMemberId, Long ipoId);
}
