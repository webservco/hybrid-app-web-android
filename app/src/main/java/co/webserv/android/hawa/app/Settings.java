package co.webserv.android.hawa.app;

import co.webserv.android.hawa.library.WsSettings;

public class Settings extends WsSettings {

    @Override
    public String getAppUrl() {
        return "https://github.com/webservco/hawa";
    }

    @Override
    public boolean getIgnoreSslErrors() {
        return super.getIgnoreSslErrors();
    }

    @Override
    public boolean getLogDebug() {
        return super.getLogDebug();
    }
}
