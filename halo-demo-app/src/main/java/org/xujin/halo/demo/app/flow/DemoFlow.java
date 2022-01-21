package org.xujin.halo.demo.app.flow;

import org.xujin.halo.flow.annotation.flow.Flow;
import org.xujin.halo.flow.annotation.node.EndNode;
import org.xujin.halo.flow.annotation.node.NextNodeRoute;
import org.xujin.halo.flow.annotation.node.ProcessNode;
import org.xujin.halo.flow.annotation.node.StartNode;

@Flow(name = "demoFlow", desc = "演示流程")
public class DemoFlow {

    @StartNode(nextNodeRoute = {@NextNodeRoute(key = "success", nodeName = "runFirstNode")})
    public String start() {
        System.out.println("-----启动节点-------");
        return "success";
    }

    @ProcessNode(nextNodeRoute = {@NextNodeRoute(key = "success", nodeName = "runSecondNode")},
    name = "runFirstNode", handler = "firstNodeProcessor", desc = "第一个节点")
    public String runFirstNode(Boolean processResult) {
        System.out.println("-----第一个节点执行完毕-------");
        return "success";
    }

    @ProcessNode(nextNodeRoute = {@NextNodeRoute(key = "success", nodeName = "end")},
    name = "runSecondNode", handler = "secondNodeProcessor", desc = "第二个节点")
    public String runSecondNode(Boolean processResult) {
        System.out.println("-----第二个节点执行完毕-------");
        return "success";
    }

    /**
    * 结束节点
    */
    @EndNode
    public void end() {
    }

}