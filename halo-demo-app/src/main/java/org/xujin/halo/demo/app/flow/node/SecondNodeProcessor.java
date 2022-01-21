package org.xujin.halo.demo.app.flow.node;

import org.xujin.halo.flow.annotation.processor.Processor;
import org.xujin.halo.flow.engine.FlowHandleContext;
import org.xujin.halo.flow.interfaces.NodeProcessor;

@Processor
public class SecondNodeProcessor implements NodeProcessor<String, Boolean> {

   @Override
   public Boolean execute(FlowHandleContext<String> flowHandleContext) {
       return true;
    }

}