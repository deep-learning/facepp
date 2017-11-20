package com.deeplearning.facepp.api.acuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class GreetingHealthIndicator implements HealthIndicator {

  @Override
  public Health health() {
    return Health.up()
        .withDetail("count", 1)
        .withDetail("status", "bad")
        .withException(new ArithmeticException("boom"))
        .build();
  }
}
