package in.co.rays.project_4.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 *
 * @author Danish Khan
 * @version 1.0
 * @Copyright (c) SunilOS
 *
 */
public class ApplicationException extends Exception {

    /**
     * @param msg
     *            : Error message
     */
    public ApplicationException(String msg) {
        super(msg);
    }
}