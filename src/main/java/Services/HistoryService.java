package Services;

import jakarta.servlet.http.HttpSession;
import org.example.demo1.Calculation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistoryService {
    public void addToHistory(HttpSession session, Calculation calc) {
        List<Calculation> history = (List<Calculation>) session.getAttribute("history");
        if (history == null) {
            history = new ArrayList<>();
        }
        history.add(calc);
        session.setAttribute("history", history);
    }

    public List<Calculation> getHistory(HttpSession session) {
        return session.getAttribute("history") != null ?
                (List<Calculation>) session.getAttribute("history") :
                Collections.emptyList();
    }
}
