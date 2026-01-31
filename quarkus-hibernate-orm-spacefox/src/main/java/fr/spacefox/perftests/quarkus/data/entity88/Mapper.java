package fr.spacefox.perftests.quarkus.data.entity88;

import fr.spacefox.perftests.quarkus.core.service88.model.Model88;

final class Mapper {
    private Mapper() {}

    public static Model88 of(Entity88 entity) {
        return new Model88(entity.getId(), entity.getField());
    }
}
