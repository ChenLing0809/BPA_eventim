package io.camunda.getstarted;

import io.camunda.zeebe.client.ZeebeClient;

public class ZeebeClientFactory {

  public static ZeebeClient getZeebeClient() {
    return ZeebeClient.newCloudClientBuilder()
        .withClusterId("a26cb4a6-e0c0-40b1-ae07-fe15ea1baf5c")
        .withClientId("13TyhjtRdi4X6-iW8POdXZ~MIbR5IIST")
        .withClientSecret("x.0w1bddVrpyGG.~~gj4exyUrc97e19UfNUtYnxODru~ff9L5r.S734s5p5Q-H8v")
        .withRegion("bru-2")
        .build();
  }

}
