package fr.spacefox.perftests.quarkus.data.entity104;

import fr.spacefox.perftests.quarkus.core.service104.model.Model104;

final class Mapper {
    private Mapper() {}

    public static Model104 of(Entity104 entity) {
        return new Model104(entity.getId(), entity.getField());
    }
}
