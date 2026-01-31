package fr.spacefox.perftests.quarkus.data.entity699;

import fr.spacefox.perftests.quarkus.core.service699.model.Model699;

final class Mapper {
    private Mapper() {}

    public static Model699 of(Entity699 entity) {
        return new Model699(entity.getId(), entity.getField());
    }
}
