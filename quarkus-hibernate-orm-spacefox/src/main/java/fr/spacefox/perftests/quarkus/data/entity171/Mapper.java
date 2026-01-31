package fr.spacefox.perftests.quarkus.data.entity171;

import fr.spacefox.perftests.quarkus.core.service171.model.Model171;

final class Mapper {
    private Mapper() {}

    public static Model171 of(Entity171 entity) {
        return new Model171(entity.getId(), entity.getField());
    }
}
