    public static Object toCharCode = (java.util.function.Function<Object, Object>) (c) ->
        (int) ((String) c).charAt(0);

    public static Object fromCharCode = (java.util.function.Function<Object, Object>) (c) ->
        String.valueOf((char) ((Integer) c).intValue());
