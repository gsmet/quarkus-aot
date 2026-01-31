package fr.spacefox.perftests.quarkus.data.entity814;

import fr.spacefox.perftests.quarkus.core.service814.model.Model814;

final class Mapper {
    private Mapper() {}

    public static Model814 of(Entity814 entity) {
        return new Model814(entity.getId(), entity.getField());
    }
}
