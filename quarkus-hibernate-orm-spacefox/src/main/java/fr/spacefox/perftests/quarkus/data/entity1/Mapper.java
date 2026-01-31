package fr.spacefox.perftests.quarkus.data.entity1;

import fr.spacefox.perftests.quarkus.core.service1.model.Model1;

final class Mapper {
    private Mapper() {}

    public static Model1 of(Entity1 entity) {
        return new Model1(entity.getId(), entity.getField());
    }
}
