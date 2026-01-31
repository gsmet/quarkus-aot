package fr.spacefox.perftests.quarkus.data.entity575;

import fr.spacefox.perftests.quarkus.core.service575.model.Model575;

final class Mapper {
    private Mapper() {}

    public static Model575 of(Entity575 entity) {
        return new Model575(entity.getId(), entity.getField());
    }
}
