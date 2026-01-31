package fr.spacefox.perftests.quarkus.data.entity100;

import fr.spacefox.perftests.quarkus.core.service100.model.Model100;

final class Mapper {
    private Mapper() {}

    public static Model100 of(Entity100 entity) {
        return new Model100(entity.getId(), entity.getField());
    }
}
