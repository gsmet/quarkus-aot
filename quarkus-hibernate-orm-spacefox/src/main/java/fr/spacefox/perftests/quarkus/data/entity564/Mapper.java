package fr.spacefox.perftests.quarkus.data.entity564;

import fr.spacefox.perftests.quarkus.core.service564.model.Model564;

final class Mapper {
    private Mapper() {}

    public static Model564 of(Entity564 entity) {
        return new Model564(entity.getId(), entity.getField());
    }
}
