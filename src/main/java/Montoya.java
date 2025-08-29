import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.logging.Logging;

public class Montoya implements BurpExtension {
    @Override
    public void initialize(MontoyaApi api) {
        Logging logging = api.logging();
        api.extension().setName("Extension By Jagadish");
        api.logging().logToOutput("Hello from Montoya!");
        logging.raiseInfoEvent("Info Event");
    }
}