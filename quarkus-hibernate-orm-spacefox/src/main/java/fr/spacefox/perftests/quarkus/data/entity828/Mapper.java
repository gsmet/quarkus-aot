package fr.spacefox.perftests.quarkus.data.entity828;

import fr.spacefox.perftests.quarkus.core.service828.model.Model828;

final class Mapper {
    private Mapper() {}

    public static Model828 of(Entity828 entity) {
        return new Model828(entity.getId(), entity.getField());
    }
}
