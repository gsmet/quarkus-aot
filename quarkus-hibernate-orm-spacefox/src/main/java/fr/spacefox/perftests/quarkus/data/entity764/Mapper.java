package fr.spacefox.perftests.quarkus.data.entity764;

import fr.spacefox.perftests.quarkus.core.service764.model.Model764;

final class Mapper {
    private Mapper() {}

    public static Model764 of(Entity764 entity) {
        return new Model764(entity.getId(), entity.getField());
    }
}
