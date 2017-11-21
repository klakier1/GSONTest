package pl.klakier.gson;

/**
 * Created by Łukasz on 2017-11-05.
 */

public final class TestJson {

    public static String mJSON = "{\"menu\": {\n"+
            "    \"header\": \"SVG Viewer\",\n"+
            "    \"items\": [\n"+
            "        {\"id\": \"OpenNew\", \"label\": \"Open New\"},\n"+
            "        {\"id\": \"ZoomIn\", \"label\": \"Zoom In\"},\n"+
            "        {\"id\": \"ZoomOut\", \"label\": \"Zoom Out\"},\n"+
            "        {\"id\": \"OriginalView\", \"label\": \"Original View\"},\n"+
            "        {\"id\": \"Find\", \"label\": \"Find...\"},\n"+
            "        {\"id\": \"FindAgain\", \"label\": \"Find Again\"},\n"+
            "        {\"id\": \"CopyAgain\", \"label\": \"Copy Again\"},\n"+
            "        {\"id\": \"CopySVG\", \"label\": \"Copy SVG\"},\n"+
            "        {\"id\": \"ViewSVG\", \"label\": \"View SVG\"},\n"+
            "        {\"id\": \"ViewSource\", \"label\": \"View Source\"},\n"+
            "        {\"id\": \"SaveAs\", \"label\": \"Save As\"},\n"+
            "        {\"id\": \"About\", \"label\": \"About Adobe CVG Viewer...\"}\n"+
            "    ]\n"+
            "}}";

    public static String mJSON2 = "{\"menu\": {\n"+
            "    \"header\": \"SVG Viewer\",\n"+
            "    \"items\": [\n"+
            "        {\"id\": \"Open\"},\n"+
            "        {\"id\": \"OpenNew\", \"label\": \"Open New\"},\n"+
            "        null,\n"+
            "        {\"id\": \"ZoomIn\", \"label\": \"Zoom In\"},\n"+
            "        {\"id\": \"ZoomOut\", \"label\": \"Zoom Out\"},\n"+
            "        {\"id\": \"OriginalView\", \"label\": \"Original View\"},\n"+
            "        null,\n"+
            "        {\"id\": \"Quality\"},\n"+
            "        {\"id\": \"Pause\"},\n"+
            "        {\"id\": \"Mute\"},\n"+
            "        null,\n"+
            "        {\"id\": \"Find\", \"label\": \"Find...\"},\n"+
            "        {\"id\": \"FindAgain\", \"label\": \"Find Again\"},\n"+
            "        {\"id\": \"Copy\"},\n"+
            "        {\"id\": \"CopyAgain\", \"label\": \"Copy Again\"},\n"+
            "        {\"id\": \"CopySVG\", \"label\": \"Copy SVG\"},\n"+
            "        {\"id\": \"ViewSVG\", \"label\": \"View SVG\"},\n"+
            "        {\"id\": \"ViewSource\", \"label\": \"View Source\"},\n"+
            "        {\"id\": \"SaveAs\", \"label\": \"Save As\"},\n"+
            "        null,\n"+
            "        {\"id\": \"Help\"},\n"+
            "        {\"id\": \"About\", \"label\": \"About Adobe CVG Viewer...\"}\n"+
            "    ]\n"+
            "}}";
}
