package fr.spacefox.perftests.quarkus.data.entity667;

import fr.spacefox.perftests.quarkus.core.service667.model.Model667;

final class Mapper {
    private Mapper() {}

    public static Model667 of(Entity667 entity) {
        return new Model667(entity.getId(), entity.getField());
    }
}
