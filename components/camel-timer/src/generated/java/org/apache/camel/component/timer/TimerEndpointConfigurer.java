/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.timer;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TimerEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TimerEndpoint target = (TimerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "daemon": target.setDaemon(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fixedrate":
        case "fixedRate": target.setFixedRate(property(camelContext, boolean.class, value)); return true;
        case "includemetadata":
        case "includeMetadata": target.setIncludeMetadata(property(camelContext, boolean.class, value)); return true;
        case "pattern": target.setPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "period": target.setPeriod(property(camelContext, long.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "time": target.setTime(property(camelContext, java.util.Date.class, value)); return true;
        case "timer": target.setTimer(property(camelContext, java.util.Timer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("daemon", boolean.class);
        answer.put("delay", long.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("fixedRate", boolean.class);
        answer.put("includeMetadata", boolean.class);
        answer.put("pattern", java.lang.String.class);
        answer.put("period", long.class);
        answer.put("repeatCount", long.class);
        answer.put("synchronous", boolean.class);
        answer.put("time", java.util.Date.class);
        answer.put("timer", java.util.Timer.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        TimerEndpoint target = (TimerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "daemon": return target.isDaemon();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "fixedrate":
        case "fixedRate": return target.isFixedRate();
        case "includemetadata":
        case "includeMetadata": return target.isIncludeMetadata();
        case "pattern": return target.getPattern();
        case "period": return target.getPeriod();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "synchronous": return target.isSynchronous();
        case "time": return target.getTime();
        case "timer": return target.getTimer();
        default: return null;
        }
    }
}

