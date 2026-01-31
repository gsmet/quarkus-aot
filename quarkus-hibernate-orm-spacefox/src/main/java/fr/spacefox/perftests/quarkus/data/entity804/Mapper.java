package fr.spacefox.perftests.quarkus.data.entity804;

import fr.spacefox.perftests.quarkus.core.service804.model.Model804;

final class Mapper {
    private Mapper() {}

    public static Model804 of(Entity804 entity) {
        return new Model804(entity.getId(), entity.getField());
    }
}
