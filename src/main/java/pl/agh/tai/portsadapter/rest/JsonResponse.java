package pl.agh.tai.portsadapter.rest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class JsonResponse<T> {
    private static final String SUCCESS_MESSAGE = "Success";
    private final boolean wasSuccessful;
    private final Iterable<T> data;
    private final String message;

    @JsonCreator
    public JsonResponse(@JsonProperty("wasSuccessful") boolean wasSuccessful,
                        @JsonProperty("data") Iterable<T> data,
                        @JsonProperty("message") String message) {
        this.wasSuccessful = wasSuccessful;
        this.data = data;
        this.message = message;
    }

    public static <T> JsonResponse<T> ofSuccess(Iterable<T> iterableData) {
        return new JsonResponse<>(true, iterableData, SUCCESS_MESSAGE);
    }

    public static <T> JsonResponse<T> ofSuccess(T singleData) {
        return ofSuccess(singletonList(singleData));
    }

    public static <T> JsonResponse<T> ofSuccess() {
        return ofSuccess(emptyList());
    }

    public static <T> JsonResponse<T> ofException(Exception ex) {
        return new JsonResponse<>(false, emptyList(), ex.getMessage());
    }

    public boolean wasSuccessful() {
        return wasSuccessful;
    }

    public Iterable<T> data() {
        return data;
    }

    public String message() {
        return message;
    }
}
