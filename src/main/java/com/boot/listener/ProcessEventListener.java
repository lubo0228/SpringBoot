package com.boot.listener;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.activiti.engine.delegate.event.ActivitiEventType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by L on 2019/2/26.
 */
public class ProcessEventListener implements ActivitiEventListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessEventListener.class);

    @Override
    public void onEvent(ActivitiEvent activitiEvent) {
        ActivitiEventType eventType = activitiEvent.getType();
        if (ActivitiEventType.ACTIVITY_STARTED.equals(eventType)) {
            LOGGER.info("activitiEvent.type = {}", "ACTIVITY_STARTED");
        } else if (ActivitiEventType.ACTIVITY_COMPLETED.equals(eventType)) {
            LOGGER.info("activitiEvent.type = {}", "ACTIVITY_COMPLETED");
        }
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }
}
