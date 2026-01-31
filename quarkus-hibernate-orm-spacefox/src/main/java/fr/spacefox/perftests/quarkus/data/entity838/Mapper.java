package fr.spacefox.perftests.quarkus.data.entity838;

import fr.spacefox.perftests.quarkus.core.service838.model.Model838;

final class Mapper {
    private Mapper() {}

    public static Model838 of(Entity838 entity) {
        return new Model838(entity.getId(), entity.getField());
    }
}
