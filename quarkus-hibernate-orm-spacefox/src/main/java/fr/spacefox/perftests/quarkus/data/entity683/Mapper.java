package fr.spacefox.perftests.quarkus.data.entity683;

import fr.spacefox.perftests.quarkus.core.service683.model.Model683;

final class Mapper {
    private Mapper() {}

    public static Model683 of(Entity683 entity) {
        return new Model683(entity.getId(), entity.getField());
    }
}
