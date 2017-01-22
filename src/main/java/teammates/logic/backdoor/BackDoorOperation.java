package teammates.logic.backdoor;

public enum BackDoorOperation {
    
    OPERATION_DELETE_ACCOUNT,
    OPERATION_DELETE_COURSE,
    OPERATION_DELETE_FEEDBACK_QUESTION,
    OPERATION_DELETE_FEEDBACK_RESPONSE,
    OPERATION_DELETE_FEEDBACK_SESSION,
    OPERATION_DELETE_INSTRUCTOR,
    OPERATION_DELETE_STUDENT,
    OPERATION_EDIT_FEEDBACK_QUESTION,
    OPERATION_EDIT_FEEDBACK_SESSION,
    OPERATION_EDIT_STUDENT,
    OPERATION_EDIT_STUDENT_PROFILE_PICTURE,
    OPERATION_GET_ACCOUNT_AS_JSON,
    OPERATION_GET_COURSE_AS_JSON,
    OPERATION_GET_ENCRYPTED_KEY_FOR_INSTRUCTOR,
    OPERATION_GET_ENCRYPTED_KEY_FOR_STUDENT,
    OPERATION_GET_FEEDBACK_QUESTION_AS_JSON,
    OPERATION_GET_FEEDBACK_QUESTION_FOR_ID_AS_JSON,
    OPERATION_GET_FEEDBACK_RESPONSE_AS_JSON,
    OPERATION_GET_FEEDBACK_RESPONSES_FOR_GIVER_AS_JSON,
    OPERATION_GET_FEEDBACK_RESPONSES_FOR_RECEIVER_AS_JSON,
    OPERATION_GET_FEEDBACK_SESSION_AS_JSON,
    OPERATION_GET_INSTRUCTOR_AS_JSON_BY_ID,
    OPERATION_GET_INSTRUCTOR_AS_JSON_BY_EMAIL,
    OPERATION_GET_STUDENT_AS_JSON,
    OPERATION_GET_STUDENTPROFILE_AS_JSON,
    OPERATION_IS_PICTURE_PRESENT_IN_GCS,
    OPERATION_PERSIST_DATABUNDLE,
    OPERATION_PUT_DOCUMENTS,
    OPERATION_REMOVE_AND_RESTORE_DATABUNDLE,
    OPERATION_REMOVE_DATABUNDLE;
    
    public static final String PARAMETER_BACKDOOR_KEY = "PARAMETER_BACKDOOR_KEY";
    public static final String PARAMETER_BACKDOOR_OPERATION = "PARAMETER_BACKDOOR_OPERATION";
    public static final String PARAMETER_COURSE_ID = "PARAMETER_COURSE_ID";
    public static final String PARAMETER_DATABUNDLE_JSON = "PARAMETER_DATABUNDLE_JSON";
    public static final String PARAMETER_FEEDBACK_QUESTION_ID = "PARAMETER_FEEDBACK_QUESTION_ID";
    public static final String PARAMETER_FEEDBACK_QUESTION_NUMBER = "PARAMETER_FEEDBACK_QUESTION_NUMBER";
    public static final String PARAMETER_FEEDBACK_SESSION_NAME = "PARAMETER_FEEDBACK_SESSION_NAME";
    public static final String PARAMETER_GIVER_EMAIL = "PARAMETER_GIVER_EMAIL";
    public static final String PARAMETER_GOOGLE_ID = "PARAMETER_GOOGLE_ID";
    public static final String PARAMETER_INSTRUCTOR_EMAIL = "PARAMETER_INSTRUCTOR_EMAIL";
    public static final String PARAMETER_INSTRUCTOR_ID = "PARAMETER_INSTRUCTOR_ID";
    public static final String PARAMETER_JSON_STRING = "PARAMETER_JSON_STRING";
    public static final String PARAMETER_PICTURE_DATA = "PARAMETER_PICTURE_DATA";
    public static final String PARAMETER_PICTURE_KEY = "PARAMETER_PICTURE_KEY";
    public static final String PARAMETER_RECIPIENT = "PARAMETER_RECIPIENT";
    public static final String PARAMETER_STUDENT_EMAIL = "PARAMETER_STUDENT_EMAIL";
    
}