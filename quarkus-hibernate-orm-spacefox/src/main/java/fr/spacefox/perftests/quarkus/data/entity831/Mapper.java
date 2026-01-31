package fr.spacefox.perftests.quarkus.data.entity831;

import fr.spacefox.perftests.quarkus.core.service831.model.Model831;

final class Mapper {
    private Mapper() {}

    public static Model831 of(Entity831 entity) {
        return new Model831(entity.getId(), entity.getField());
    }
}
