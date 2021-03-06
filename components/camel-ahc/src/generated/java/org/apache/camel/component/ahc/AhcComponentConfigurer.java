/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ahc;

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
public class AhcComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AhcComponent target = (AhcComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": target.setAllowJavaSerializedObject(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "binding": target.setBinding(property(camelContext, org.apache.camel.component.ahc.AhcBinding.class, value)); return true;
        case "client": target.setClient(property(camelContext, org.asynchttpclient.AsyncHttpClient.class, value)); return true;
        case "clientconfig":
        case "clientConfig": target.setClientConfig(property(camelContext, org.asynchttpclient.AsyncHttpClientConfig.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("allowJavaSerializedObject", boolean.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("binding", org.apache.camel.component.ahc.AhcBinding.class);
        answer.put("client", org.asynchttpclient.AsyncHttpClient.class);
        answer.put("clientConfig", org.asynchttpclient.AsyncHttpClientConfig.class);
        answer.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("useGlobalSslContextParameters", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AhcComponent target = (AhcComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowjavaserializedobject":
        case "allowJavaSerializedObject": return target.isAllowJavaSerializedObject();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "binding": return target.getBinding();
        case "client": return target.getClient();
        case "clientconfig":
        case "clientConfig": return target.getClientConfig();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        default: return null;
        }
    }
}

