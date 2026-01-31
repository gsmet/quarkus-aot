package fr.spacefox.perftests.quarkus.data.entity260;

import fr.spacefox.perftests.quarkus.core.service260.model.Model260;

final class Mapper {
    private Mapper() {}

    public static Model260 of(Entity260 entity) {
        return new Model260(entity.getId(), entity.getField());
    }
}
