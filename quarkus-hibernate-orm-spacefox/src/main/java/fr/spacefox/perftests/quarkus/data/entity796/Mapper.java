package fr.spacefox.perftests.quarkus.data.entity796;

import fr.spacefox.perftests.quarkus.core.service796.model.Model796;

final class Mapper {
    private Mapper() {}

    public static Model796 of(Entity796 entity) {
        return new Model796(entity.getId(), entity.getField());
    }
}
