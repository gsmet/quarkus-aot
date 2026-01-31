package fr.spacefox.perftests.quarkus.data.entity622;

import fr.spacefox.perftests.quarkus.core.service622.model.Model622;

final class Mapper {
    private Mapper() {}

    public static Model622 of(Entity622 entity) {
        return new Model622(entity.getId(), entity.getField());
    }
}
