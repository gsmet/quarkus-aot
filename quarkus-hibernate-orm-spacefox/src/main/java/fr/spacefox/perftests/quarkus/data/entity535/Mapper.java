package fr.spacefox.perftests.quarkus.data.entity535;

import fr.spacefox.perftests.quarkus.core.service535.model.Model535;

final class Mapper {
    private Mapper() {}

    public static Model535 of(Entity535 entity) {
        return new Model535(entity.getId(), entity.getField());
    }
}
