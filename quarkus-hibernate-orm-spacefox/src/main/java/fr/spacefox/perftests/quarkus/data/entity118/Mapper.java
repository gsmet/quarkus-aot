package fr.spacefox.perftests.quarkus.data.entity118;

import fr.spacefox.perftests.quarkus.core.service118.model.Model118;

final class Mapper {
    private Mapper() {}

    public static Model118 of(Entity118 entity) {
        return new Model118(entity.getId(), entity.getField());
    }
}
