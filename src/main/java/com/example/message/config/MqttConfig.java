package com.example.message.config;

//import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
//import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.integration.annotation.ServiceActivator;
//import org.springframework.integration.channel.DirectChannel;
//import org.springframework.integration.core.MessageProducer;
//import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
//import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
//import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
//import org.springframework.integration.mqtt.support.MqttHeaders;
//import org.springframework.messaging.MessageChannel;
//import org.springframework.messaging.MessageHandler;

@Configuration
public class MqttConfig {
//    private static final String MQTT_USERNAME = "username";
//    private static final String MQTT_PASSWORD = "password";
//
//    private static final String BROKER_URL = "tcp://localhost:1883";
//    private static final String MQTT_CLIENT_ID = MqttAsyncClient.generateClientId();
//    private static final String TOPIC_FILTER = "[PROTECT]";
//
//    private MqttConnectOptions connectOptions() {
//        MqttConnectOptions options = new MqttConnectOptions();
//        options.setCleanSession(true);
//        options.setUserName(MQTT_USERNAME);
//        options.setPassword(MQTT_PASSWORD.toCharArray());
//        return options;
//    }
//
//    //DefaultMqttPahoClientFactory를 통해 MQTT를 클라이언트를 등록한다
//    //MQTT 연결 정보(MqttConnectOptions)을 설정한 DefaultMqttPahoClientFactory를 빈으로 등
//    @Bean
//    public DefaultMqttPahoClientFactory defaultMqttPahoClientFactory() {
//        DefaultMqttPahoClientFactory clientFactory = new DefaultMqttPahoClientFactory();
//        clientFactory.setConnectionOptions(connectOptions());
//        return clientFactory;
//    }
//
//
//    @Bean
//    public MessageChannel mqttInputChannel() {
//        return new DirectChannel();
//    }
//
//    @Bean
//    public MessageProducer inboundChannel() {
//        MqttPahoMessageDrivenChannelAdapter adapter =
//                new MqttPahoMessageDrivenChannelAdapter(BROKER_URL, MQTT_CLIENT_ID, TOPIC_FILTER);
//        adapter.setCompletionTimeout(5000);
//        adapter.setConverter(new DefaultPahoMessageConverter());
//        adapter.setQos(1);
//        adapter.setOutputChannel(mqttInputChannel());
//        return adapter;
//    }
//
//    @Bean
//    @ServiceActivator(inputChannel = "mqttInputChannel")
//    public MessageHandler inboundMessageHandler() {
//        return message -> {
//            String topic = (String) message.getHeaders().get(MqttHeaders.RECEIVED_TOPIC);
//            System.out.println("Topic:" + topic);
//            System.out.println("Payload" + message.getPayload());
//        };
//    }
}
