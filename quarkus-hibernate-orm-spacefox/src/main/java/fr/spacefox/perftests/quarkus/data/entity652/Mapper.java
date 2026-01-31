package fr.spacefox.perftests.quarkus.data.entity652;

import fr.spacefox.perftests.quarkus.core.service652.model.Model652;

final class Mapper {
    private Mapper() {}

    public static Model652 of(Entity652 entity) {
        return new Model652(entity.getId(), entity.getField());
    }
}
