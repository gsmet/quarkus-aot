package fr.spacefox.perftests.quarkus.data.entity630;

import fr.spacefox.perftests.quarkus.core.service630.model.Model630;

final class Mapper {
    private Mapper() {}

    public static Model630 of(Entity630 entity) {
        return new Model630(entity.getId(), entity.getField());
    }
}
