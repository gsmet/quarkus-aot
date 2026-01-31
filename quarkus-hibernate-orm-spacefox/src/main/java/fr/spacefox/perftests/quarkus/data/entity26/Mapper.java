package fr.spacefox.perftests.quarkus.data.entity26;

import fr.spacefox.perftests.quarkus.core.service26.model.Model26;

final class Mapper {
    private Mapper() {}

    public static Model26 of(Entity26 entity) {
        return new Model26(entity.getId(), entity.getField());
    }
}
