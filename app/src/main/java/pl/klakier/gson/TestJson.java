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

    public  static String mJSONcars = "{\n"+
            "\n"+
            "   \"items\":[\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Abarth\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Abarth-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Acura\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Acura-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Alfa-Romeo\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Alfa-Romeo-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"AMG\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/AMG-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Aston-Martin\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Aston-Martin-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Audi\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Audi-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Bentley\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Bentley-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"BMW\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/BMW-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"BMW-M\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/BMW-M-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Bridgestone\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Bridgestone-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Brilliance\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Brilliance-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Bugatti\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Bugatti-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Buick\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Buick-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"BYD\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/BYD-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Cadillac\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Cadillac-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Changan\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Changan-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Chevrolet\",\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Chevrolet-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Chrysler\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Chrysler-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Continental\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Continental-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Dodge\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Dodge-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Dunlop\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Dunlop-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"FAW\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/FAW-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Ferrari\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Ferrari-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Fiat\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Fiat-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Ford\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Ford-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Foton\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Foton-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Geely\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Geely-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"General-Motors\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/General-Motors-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Goodyear\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Goodyear-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Great-Wall\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Great-Wall-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Honda\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Honda-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Hyundai\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Hyundai-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Infiniti\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Infiniti-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Iveco\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Iveco-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Jaguar\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Jaguar-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Jeep\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Jeep-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Lamborghini\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Lamborghini-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Lancia\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Lancia-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Land-Rover\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Land-Rover-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Lexus\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Lexus-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Lotus\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Lotus-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Luxgen\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Luxgen-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Maserati\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Maserati-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Maybach\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Maybach-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Mazda\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Mazda-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"McLaren\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/McLaren-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Mercedes-Benz\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Mercedes-Benz-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"MG\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/MG-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Michelin\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Michelin-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Mini\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Mini-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Mitsubishi\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Mitsubishi-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Nissan\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Nissan-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Opel\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Opel-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Pagani\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Pagani-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Pininfarina\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Pininfarina-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Pirelli\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Pirelli-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Porsche\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Porsche-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Ram\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Ram-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Roewe\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Roewe-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Rolls-Royce\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Rolls-Royce-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"SAIC-Motor\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/SAIC-Motor-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Smart\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Smart-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Subaru\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Subaru-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Suzuki\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Suzuki-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Tesla\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Tesla-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Toyota\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Toyota-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Vauxhall\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Vauxhall-logo.png\"\n"+
            "\n"+
            "      },\n"+
            "\n"+
            "      {\n"+
            "\n"+
            "         \"name\":\"Volkswagen\",\n"+
            "\n"+
            "         \"url\":\"http://klakier.000webhostapp.com/logos/Volkswagen-logo.png\"\n"+
            "\n"+
            "      }\n"+
            "\n"+
            "   ]\n"+
            "\n"+
            "}";
}
