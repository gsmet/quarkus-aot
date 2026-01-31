package fr.spacefox.perftests.quarkus.data.entity645;

import fr.spacefox.perftests.quarkus.core.service645.model.Model645;

final class Mapper {
    private Mapper() {}

    public static Model645 of(Entity645 entity) {
        return new Model645(entity.getId(), entity.getField());
    }
}
