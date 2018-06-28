package com.example.scottsmith.weatherapp.Api_Calls;

import com.google.gson.annotations.SerializedName;

public class GoogleAddress {

    @SerializedName("results")
    private List<Results> results;

    public List<Results> getResults() {
        return results;
    }
    class Results {
        @SerializedName("formatted_address")
        private String addressName;

        @SerializedName("geometry")
        private Geometry geometry;

        public String getAddressName() {
            return addressName;
        }

        public Geometry getGeometry() {
            return geometry;
        }


        class Geometry {

            @SerializedName("location")
            private GoogleLocation location;

            public GoogleLocation getLocation() {
                return location;
            }

            class GoogleLocation {

                @SerializedName("lat")
                private double litude

                @SerializedName("lng")
                private double longitude;
            }
        }
    }
}
