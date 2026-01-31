package fr.spacefox.perftests.quarkus.data.entity809;

import fr.spacefox.perftests.quarkus.core.service809.model.Model809;

final class Mapper {
    private Mapper() {}

    public static Model809 of(Entity809 entity) {
        return new Model809(entity.getId(), entity.getField());
    }
}
