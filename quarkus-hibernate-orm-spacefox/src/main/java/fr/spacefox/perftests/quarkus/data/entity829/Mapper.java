package fr.spacefox.perftests.quarkus.data.entity829;

import fr.spacefox.perftests.quarkus.core.service829.model.Model829;

final class Mapper {
    private Mapper() {}

    public static Model829 of(Entity829 entity) {
        return new Model829(entity.getId(), entity.getField());
    }
}
