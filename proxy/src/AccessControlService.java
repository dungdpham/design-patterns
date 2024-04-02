import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AccessControlService {
    private static AccessControlService instance;
    private HashMap<String, List<String>> accessTable;

    private AccessControlService() {
        accessTable = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }

        return instance;
    }

    public void grantAccess(IDocument document, User user) {
        if (!accessTable.containsKey(document.getUid())) {
            accessTable.put(document.getUid(), new ArrayList<>());
        }
        accessTable.get(document.getUid()).add(user.getUsername());
    }

    public boolean isAllowed(IDocument document, User user) {
        return accessTable.getOrDefault(document.getUid(), new ArrayList<>()).contains(user.getUsername());
    }
}
