package fr.spacefox.perftests.quarkus.data.entity8;

import fr.spacefox.perftests.quarkus.core.service8.model.Model8;

final class Mapper {
    private Mapper() {}

    public static Model8 of(Entity8 entity) {
        return new Model8(entity.getId(), entity.getField());
    }
}
