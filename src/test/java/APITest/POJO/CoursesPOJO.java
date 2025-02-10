package APITest.POJO;

import java.util.List;

public class CoursesPOJO {

    private List<WebAutomation> webAutomation;
    private List<api> api;
    private List<mobile> mobile;

    // Getter and Setter for webAutomation
    public List<WebAutomation> getWebAutomation() {
        return webAutomation;
    }

    public void setWebAutomation(List<WebAutomation> webAutomation) {
        this.webAutomation = webAutomation;
    }

    // Getter and Setter for api
    public List<api> getApi() {
        return api;
    }

    public void setApi(List<api> api) {
        this.api = api;
    }

    // Getter and Setter for mobile
    public List<mobile> getMobile() {
        return mobile;
    }

    public void setMobile(List<mobile> mobile) {
        this.mobile = mobile;
    }
}
