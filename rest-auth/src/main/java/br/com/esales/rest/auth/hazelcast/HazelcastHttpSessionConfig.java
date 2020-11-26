//package com.example.rest.auth.hazelcast;
//
//import com.hazelcast.config.Config;
//import com.hazelcast.config.MapAttributeConfig;
//import com.hazelcast.config.MapIndexConfig;
//import com.hazelcast.core.Hazelcast;
//import com.hazelcast.core.HazelcastInstance;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.session.hazelcast.HazelcastIndexedSessionRepository;
//import org.springframework.session.hazelcast.PrincipalNameExtractor;
//import org.springframework.session.hazelcast.config.annotation.web.http.EnableHazelcastHttpSession;
//
//@EnableHazelcastHttpSession
//@Configuration
//public class HazelcastHttpSessionConfig {
//
//    @Bean
//    public HazelcastInstance hazelcastInstance() {
//        final Config config = new Config();
//
//        final MapAttributeConfig attributeConfig = new MapAttributeConfig()
//                .setName(HazelcastIndexedSessionRepository.PRINCIPAL_NAME_ATTRIBUTE)
//                .setExtractor(PrincipalNameExtractor.class.getName());
//
//        config.getMapConfig(HazelcastIndexedSessionRepository.DEFAULT_SESSION_MAP_NAME)
//                .addMapAttributeConfig(attributeConfig)
//                .addMapIndexConfig(new MapIndexConfig(HazelcastIndexedSessionRepository.PRINCIPAL_NAME_ATTRIBUTE, false));
//
//        return Hazelcast.newHazelcastInstance(config);
//    }
//
//}
