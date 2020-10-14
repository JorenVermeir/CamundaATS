package menu;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.util.logging.Logger;

public class FoodReady implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("ats");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Food is ready");
    }
}
