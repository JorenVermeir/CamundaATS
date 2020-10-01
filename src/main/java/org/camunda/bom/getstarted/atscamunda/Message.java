package org.camunda.bom.getstarted.atscamunda;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Message implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("ats");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Sending a message");
    }
}
