package br.com.zallpy.technicalevaluation.model.enums;

public enum Profile {

    ADMIN(1, "ROLE_ADMIN"),
    USER(2, "ROLE_USER");

    private Integer id;
    private String description;

    private Profile(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static Profile getProfileType(Integer paymentTypeId) {

        if (paymentTypeId == null) {
            return null;
        }

        for (Profile paymentState : Profile.values()) {
            if (paymentState.getId() == paymentTypeId) {
                return paymentState;
            }
        }

        throw new IllegalArgumentException("invalid Id: " + paymentTypeId);
    }

}
