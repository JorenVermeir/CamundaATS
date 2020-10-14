package menu;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.util.logging.Logger;

public class PrepareFood implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("ats");
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        for (int i = 0; i < 10; i++) {
            LOGGER.info("Preparing food");
        }
    }
}
