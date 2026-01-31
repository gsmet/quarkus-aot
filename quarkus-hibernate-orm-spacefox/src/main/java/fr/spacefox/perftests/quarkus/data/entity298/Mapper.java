package fr.spacefox.perftests.quarkus.data.entity298;

import fr.spacefox.perftests.quarkus.core.service298.model.Model298;

final class Mapper {
    private Mapper() {}

    public static Model298 of(Entity298 entity) {
        return new Model298(entity.getId(), entity.getField());
    }
}
