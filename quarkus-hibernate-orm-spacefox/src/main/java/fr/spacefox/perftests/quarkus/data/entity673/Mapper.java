package fr.spacefox.perftests.quarkus.data.entity673;

import fr.spacefox.perftests.quarkus.core.service673.model.Model673;

final class Mapper {
    private Mapper() {}

    public static Model673 of(Entity673 entity) {
        return new Model673(entity.getId(), entity.getField());
    }
}
