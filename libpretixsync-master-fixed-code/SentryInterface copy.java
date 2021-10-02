package eu.pretix.libpretixsync;
//NEF: unnecessary import removed here
//codestyle

public interface SentryInterface {
	//removed unnecessarymodifer: codestyle
    void addHttpBreadcrumb(String url, String method, int statusCode);
    //NEF fixed code style shortvarible:codestyle
    void addBreadcrumb(String url, String methodName);

    void captureException(Throwable t);

    void captureException(Throwable t, String message);
}
