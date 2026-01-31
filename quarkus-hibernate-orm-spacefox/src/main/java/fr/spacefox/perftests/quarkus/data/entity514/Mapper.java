package fr.spacefox.perftests.quarkus.data.entity514;

import fr.spacefox.perftests.quarkus.core.service514.model.Model514;

final class Mapper {
    private Mapper() {}

    public static Model514 of(Entity514 entity) {
        return new Model514(entity.getId(), entity.getField());
    }
}
