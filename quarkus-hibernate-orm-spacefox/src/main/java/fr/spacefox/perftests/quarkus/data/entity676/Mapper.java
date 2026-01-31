package fr.spacefox.perftests.quarkus.data.entity676;

import fr.spacefox.perftests.quarkus.core.service676.model.Model676;

final class Mapper {
    private Mapper() {}

    public static Model676 of(Entity676 entity) {
        return new Model676(entity.getId(), entity.getField());
    }
}
