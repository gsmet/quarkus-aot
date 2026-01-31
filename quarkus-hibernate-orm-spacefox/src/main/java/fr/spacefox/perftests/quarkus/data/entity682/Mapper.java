package fr.spacefox.perftests.quarkus.data.entity682;

import fr.spacefox.perftests.quarkus.core.service682.model.Model682;

final class Mapper {
    private Mapper() {}

    public static Model682 of(Entity682 entity) {
        return new Model682(entity.getId(), entity.getField());
    }
}
