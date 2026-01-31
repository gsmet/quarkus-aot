package fr.spacefox.perftests.quarkus.data.entity747;

import fr.spacefox.perftests.quarkus.core.service747.model.Model747;

final class Mapper {
    private Mapper() {}

    public static Model747 of(Entity747 entity) {
        return new Model747(entity.getId(), entity.getField());
    }
}
