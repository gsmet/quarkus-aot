package fr.spacefox.perftests.quarkus.data.entity475;

import fr.spacefox.perftests.quarkus.core.service475.model.Model475;

final class Mapper {
    private Mapper() {}

    public static Model475 of(Entity475 entity) {
        return new Model475(entity.getId(), entity.getField());
    }
}
