package domain;

public class Configuration {

    private String url;

    private int port;

    private String username;

    private String password;

    private boolean useSSL;

    private Configuration(ConfigurationBuilder builder){

        this.url = builder.url;
        this.port = builder.port;
        this.username = builder.username;
        this.password = builder.password;
        this.useSSL = builder.useSSL;
    }

    public static class ConfigurationBuilder{

        private String url;

        private int port;

        private String username;

        private String password;

        private boolean useSSL;

        public ConfigurationBuilder(String url, int port){
            this.url = url;
            this.port = port;
        }

        public ConfigurationBuilder withUsername(String username){
            this.username = username;
            return this;
        }

        public ConfigurationBuilder withPassword(String password){
            this.password = password;
            return this;
        }

        public ConfigurationBuilder useSSL(boolean useSSL){
            this.useSSL = useSSL;
            return this;
        }

        public Configuration build(){
            return new Configuration(this);
        }

        public String toString(){
            return "Configuration [url= " + url + ", port=" + port + ", username=" + username
                    + ", password=" + password  + ", useSSL=" + useSSL + "]";
        }


    }
}
