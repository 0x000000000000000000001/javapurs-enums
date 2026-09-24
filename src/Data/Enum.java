    public static Object toCharCode = (java.util.function.Function<Object, Object>) (c) ->
        (int) ((Character) c);

    public static Object fromCharCode = (java.util.function.Function<Object, Object>) (c) ->
        (char) ((Integer) c).intValue();
