package fr.spacefox.perftests.quarkus.data.entity176;

import fr.spacefox.perftests.quarkus.core.service176.model.Model176;

final class Mapper {
    private Mapper() {}

    public static Model176 of(Entity176 entity) {
        return new Model176(entity.getId(), entity.getField());
    }
}
