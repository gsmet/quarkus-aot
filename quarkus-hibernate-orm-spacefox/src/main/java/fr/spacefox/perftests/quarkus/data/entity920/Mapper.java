package fr.spacefox.perftests.quarkus.data.entity920;

import fr.spacefox.perftests.quarkus.core.service920.model.Model920;

final class Mapper {
    private Mapper() {}

    public static Model920 of(Entity920 entity) {
        return new Model920(entity.getId(), entity.getField());
    }
}
