package fr.spacefox.perftests.quarkus.data.entity581;

import fr.spacefox.perftests.quarkus.core.service581.model.Model581;

final class Mapper {
    private Mapper() {}

    public static Model581 of(Entity581 entity) {
        return new Model581(entity.getId(), entity.getField());
    }
}
