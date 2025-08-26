package com.raksh.Builder.singelton;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationManager {
    private static volatile ConfigurationManager configurationManager;
    private final String dbUrl;
    private final int maxConnections;
    private final int timeout;
    private final Type loggingLevel;
    private final List<String> featureToggles;
    private final boolean cacheEnabled;
    private ConfigurationManager(Builder builder) {
        this.dbUrl=builder.dbUrl;
        this.maxConnections= builder.maxConnections;
        this.timeout= builder.timeout;
        this.loggingLevel=builder.loggingLevel;
        this.featureToggles=builder.featureToggles;
        this.cacheEnabled=builder.cacheEnabled;
    }
    public String getDbUrl() {
        return dbUrl;
    }
    public int getMaxConnections() {
        return maxConnections;
    }
    public int getTimeout() {
        return timeout;
    }
    public Type getLoggingLevel() {
        return loggingLevel;
    }
    public List<String> getFeatureToggles() {
        return featureToggles;
    }
    public boolean isCacheEnabled() {
        return cacheEnabled;
    }

    @Override
    public String toString() {
        return "ConfigurationManager{" +
                "dbUrl='" + dbUrl + '\'' +
                ", maxConnections=" + maxConnections +
                ", timeout=" + timeout +
                ", loggingLevel=" + loggingLevel +
                ", featureToggles=" + featureToggles +
                ", cacheEnabled=" + cacheEnabled +
                '}';
    }

    public static class Builder{
        private String dbUrl;
        private int maxConnections;
        private int timeout;
        private Type loggingLevel;
        private List<String> featureToggles;
        private boolean cacheEnabled;
        public Builder dbUrl(String dburl){
            if(dburl==null || dburl.isEmpty()){
                throw new IllegalArgumentException("Database Url cannot be empty or null");
            }
            this.dbUrl=dburl;
            return this;
        }
        public Builder maxConnections(int maxConnections){
            if(maxConnections<=0){
                throw new IllegalArgumentException("Max connections must be greater than 0");
            }
            this.maxConnections=maxConnections;
            return this;
        }
        public Builder timeout(int timeout){
            if(timeout<1000){
                throw new IllegalArgumentException("Timeout must be greater than 1ms");
            }
            this.timeout=timeout;
            return this;
        }
        public Builder loggingLevel(Type loggingLevel){
            this.loggingLevel=loggingLevel;
            return this;
        }
        public Builder featureToggles(List<String> featureToggles){
            if(featureToggles==null){
                throw new IllegalArgumentException("Feature Toggles cannot be null");
            }
            this.featureToggles=new ArrayList<>(featureToggles);
            return this;
        }
        public Builder cacheEnabled(boolean cacheEnabled){
            this.cacheEnabled=cacheEnabled;
            return this;
        }
        public ConfigurationManager build(){
            if(configurationManager==null){
                synchronized (ConfigurationManager.class){
                    if(configurationManager==null){
                        if(this.featureToggles==null){
                            this.featureToggles=new ArrayList<>();
                        }
                        if(this.loggingLevel==null){
                            this.loggingLevel=Type.INFO;
                        }
                        configurationManager=new ConfigurationManager(this);
                    }
                }
            }
            return configurationManager;
        }
    }
}
