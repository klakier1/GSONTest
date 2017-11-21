package pl.klakier.gson;

import java.util.List;

/**
 * Created by Łukasz on 2017-11-07.
 */

public class ResponseCarJSON {


    private List<ItemsBean> items;

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * name : Abarth
         * url : http://klakier.000webhostapp.com/logos/Abarth-logo.png
         */

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
