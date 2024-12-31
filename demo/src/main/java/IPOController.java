import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/ipo")
public class IPOController {
    @Autowired
    private IPOService ipoService;

    @GetMapping("/status")
    public ResponseEntity<List<AllotmentStatus>> getStatus(@RequestParam Long ipoId, @AuthenticationPrincipal User user) {
        List<AllotmentStatus> statusList = ipoService.checkAllotmentStatus(user.getId(), ipoId);
        return ResponseEntity.ok(statusList);
    }
}