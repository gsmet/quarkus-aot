package fr.spacefox.perftests.quarkus.data.entity893;

import fr.spacefox.perftests.quarkus.core.service893.model.Model893;

final class Mapper {
    private Mapper() {}

    public static Model893 of(Entity893 entity) {
        return new Model893(entity.getId(), entity.getField());
    }
}
