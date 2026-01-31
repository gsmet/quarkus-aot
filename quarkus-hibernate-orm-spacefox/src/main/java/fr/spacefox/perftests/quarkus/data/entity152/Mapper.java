package fr.spacefox.perftests.quarkus.data.entity152;

import fr.spacefox.perftests.quarkus.core.service152.model.Model152;

final class Mapper {
    private Mapper() {}

    public static Model152 of(Entity152 entity) {
        return new Model152(entity.getId(), entity.getField());
    }
}
