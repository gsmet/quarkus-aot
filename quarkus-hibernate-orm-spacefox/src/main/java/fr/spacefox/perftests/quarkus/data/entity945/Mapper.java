package fr.spacefox.perftests.quarkus.data.entity945;

import fr.spacefox.perftests.quarkus.core.service945.model.Model945;

final class Mapper {
    private Mapper() {}

    public static Model945 of(Entity945 entity) {
        return new Model945(entity.getId(), entity.getField());
    }
}
